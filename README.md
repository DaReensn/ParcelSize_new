# ci_cd-pipeline


sudo docker build -t parcel-api:1.0 .
sudo docker run -it --rm --network host --name=ParcelSize parcel-api:1.0 java -jar ./build/libs/ParcelSize.jar

