# ci_cd-pipeline


sudo docker build -t parcel-api .
sudo docker run -it --rm --network host --name=ParcelSize parcel-api java -jar ./build/libs/ParcelSize.jar

