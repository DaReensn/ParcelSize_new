# ci_cd-pipeline

docker build -t parcel-api .
docker run -it --rm --network host --name=ParcelSize parcel-api java -jar ./build/libs/ParcelSize.jar

docker run -d --restart always --network=parcelnetwork --name=parcel-webservice -p 8443:8443 parcel-api java -jar ./build/libs/ParcelSize.jar
docker run -d --restart always --network=parcelnetwork --name=parcel-webservice -p 8443:8443 parcel-api ./start.sh