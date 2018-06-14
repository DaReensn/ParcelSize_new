# -*- mode: ruby -*-
# vi: set ft=ruby :

# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
Vagrant.configure(2) do |config|
  # The most common configuration options are documented and commented below.
  # For a complete reference, please see the online documentation at
  # https://docs.vagrantup.com.

  # Every Vagrant development environment requires a box. You can search for
  # boxes at https://vagrantcloud.com/search.
  config.vm.box = "envimation/ubuntu-xenial-docker"
  
  # Disable automatic box update checking. If you disable this, then
  # boxes will only be checked for updates when the user runs
  # `vagrant box outdated`. This is not recommended.
  # config.vm.box_check_update = false

  # Create a forwarded port mapping which allows access to a specific port
  # within the machine from a port on the host machine. In the example below,
  # accessing "localhost:8080" will access port 80 on the guest machine.
  #config.vm.network "forwarded_port", guest: 90, host: 9090

  # Create a private network, which allows host-only access to the machine
  # using a specific IP.
  config.vm.network "private_network", ip: "192.168.50.102"
  
  # Create a public network, which generally matched to bridged network.
  # Bridged networks make the machine appear as another physical device on
  # your network.
  #config.vm.network "public_network"
  
  # Share an additional folder to the guest VM. The first argument is
  # the path on the host to the actual folder. The second argument is
  # the path on the guest to mount the folder. And the optional third
  # argument is a set of non-required options.
  config.vm.synced_folder "/shared", "/sf_shared"
  
  # Provider-specific configuration so you can fine-tune various
  # backing providers for Vagrant. These expose provider-specific options.
  # Example for VirtualBox:
  #
  config.vm.provider "virtualbox" do |vb|
     # Display the VirtualBox GUI when booting the machine
     vb.gui = false
  
     # Customize the amount of memory on the VM:
     vb.memory = "1024"
  end
  #
  # View the documentation for the provider you are using for more
  # information on available options.

  # Enable provisioning with a shell script. Additional provisioners such as
  # Puppet, Chef, Ansible, Salt, and Docker are also available. Please see the
  # documentation for more information about their specific syntax and use.
  
  #config.vm.provision "file", source: "/home/tobias/git/ParcelSize", destination: "/home/ParcelSize"
 config.vm.provision "file", source: "~/workspace/pipeline/shell-script.sh", destination: "~/shell-script.sh"

  
   config.vm.provision "shell", inline: <<-SHELL
    sudo apt-get update
    sudo apt-get install 
    
wget 192.168.50.103/images/parcel-api
wget 192.168.50.103/images/parcel-db
wget 192.168.50.103/images/parcel-frontend
cd ..

docker network create -d bridge parcelnetwork

docker load -i /home/parcel-api
docker load -i /home/parcel-db
docker load -i /home/parcel-frontend

docker run -d --restart always --network=parcelnetwork --name=parcel-api -p 8443:8443 parcel-api java -jar ./build/libs/ParcelSize.jar
docker run -d --restart always --network=parcelnetwork -p 3306:3306 --name=parcel-db parcel-db
docker run -d --restart always --network=parcelnetwork -p 8080:80 --name=parcel-frontend parcel-frontend
    
    
   SHELL
end
