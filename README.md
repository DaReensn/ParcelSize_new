# ci_cd-pipeline

docker build -t parcel-api .
docker run -it --rm --network host --name=parcel-api parcel-api java -jar ./build/libs/ParcelSize.jar

docker run -d --restart always --network=parcelnetwork --name=parcel-api -p 8443:8443 parcel-api java -jar ./build/libs/ParcelSize.jar




Save image with id:
sudo docker save -o /home/matrix/matrix-data.tar matrix-data
Copy image from path to any host Now import to your local docker using :
sudo docker load -i <path to copied image file>



docker network create -d bridge parcelnetwork