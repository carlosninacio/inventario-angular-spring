\🧩 Proyecto de Inventario



Este proyecto es una aplicación completa de \*\*gestión de inventarios\*\* desarrollada con:



\- \*\*Backend:\*\* Spring Boot (Java)

\- \*\*Frontend:\*\* Angular

\- \*\*Base de datos:\*\* MySQL (almacenada localmente en la carpeta `/database`)



\### Base de datos

El proyecto usa una base de datos llamada \*\*`inventario\_db`\*\* almacenada en la carpeta `/database`.



Dentro del backend (/inventarios/src/main/resources/application.properties), crea este archivo y agrega:



\# ===============================

\# = CONFIGURACIÓN DE LA BASE DE DATOS

\# ===============================

spring.datasource.url=jdbc:mysql://localhost:3306/inventario\_db?useSSL=false\&serverTimezone=UTC

spring.datasource.username=tu\_usuario

spring.datasource.password=tu\_contraseña



\# ===============================

\# = CONFIGURACIÓN DE JPA / HIBERNATE

\# ===============================

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect



\# ===============================

\# = CONFIGURACIÓN DEL SERVIDOR

\# ===============================

server.port=8080

spring.application.name=inventarios



Desde la carpeta inventarios/ ejecutar:



mvn spring-boot:run



Esto iniciará el servidor de Spring Boot



Desde la carpeta inventario-app/ ejecutar:

npm install

ng serve -o



