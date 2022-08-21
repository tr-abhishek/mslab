- change name of services using their respective `application.properties` and the changes will show in discovery page in the running services page.

- while adding new columns always remember to make changes in the files `file.java` and `fileController.java` files of the `java/com/example/servicename`folder and inside that change the variable names and the data type.

- `gateway service` has no value in my opinion but run it just for it to view as services list in discovery page.

- go to mslab -> discovery-server -> `chmod 777 mvnw` -> `./mvnw spring-boot:run`
- go to mslab -> item1-service -> `chmod 777 mvnw` -> `./mvnw spring-boot:run`
- go to mslab -> order1-service -> `chmod 777 mvnw` -> `./mvnw spring-boot:run`
- go to mslab -> gateway-services -> `chmod 777 mvnw` -> `./mvnw spring-boot:run`

- this repo is in `java 8`, but works with `java 11` as verified on my pc.

### check
- maven version : `mvn -version`
- java version : `java -version`


### help
- Website: www.protectedtext.com/gaurasur
- Password: gaurav

