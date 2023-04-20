<h1 align="center"> test_user </h1>

Api RESTful, creado con bd h2, maven, hibernate,Swagger y utilizando SpringBoot.

Como ejecutar la aplicacion?

- en la terminal de tu ide, colocar primero mvn install, luego mvn spring-boot:run

<img width="583" alt="image" src="https://user-images.githubusercontent.com/30278429/233253887-9d1c793f-eff5-43b2-b460-38ceca885a3e.png">




Para realizar prueba debe ejecutar mediante Postman 
<img width="755" alt="image" src="https://user-images.githubusercontent.com/30278429/233252397-2f7ca567-da64-4c57-8a5c-4428f9392b1f.png">

Para revisar la bd H2 (http://localhost:8080/h2-console) usar la siguiente configuracion:

NOTA: NO ES NECESARIO EJECUTAR SCRIPT PARA GENERAR LAS TABLAS, ESTAS SE CREARAN AUTOMATICAMENTE AL CORRER APLICACION.

DriverClass: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password

<img width="352" alt="image" src="https://user-images.githubusercontent.com/30278429/233252825-8754e3c4-a140-4205-8ccc-67a4eb2b8cee.png">

Revisión de Swagger:
url http://localhost:8080/swagger-ui.html

<img width="673" alt="image" src="https://user-images.githubusercontent.com/30278429/233253056-d8d1428c-340c-4b19-9bcb-0ee24271f3f4.png">


