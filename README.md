# 🧩 Proyecto de Inventario

Este proyecto es una aplicación completa de **gestión de inventarios** desarrollada con:

- ⚙️ **Backend:** Spring Boot (Java)
- 💻 **Frontend:** Angular
- 🗄️ **Base de datos:** MySQL (almacenada localmente en la carpeta `/database`)

---

## 🗂️ Estructura del proyecto

```
📦 proyecto-inventario/
├── 📁 inventario-app/     → Frontend (Angular)
├── 📁 inventarios/        → Backend (Spring Boot)
└── 📁 database/           → Base de datos local (inventario_db)
```

---

## 🧠 Base de datos

El proyecto usa una base de datos llamada **`inventario_db`** almacenada en la carpeta `/database`.

Dentro del backend (`/inventarios/src/main/resources/application.properties`), crea este archivo y agrega:

```properties
# ===============================
# = CONFIGURACIÓN DE LA BASE DE DATOS
# ===============================
spring.datasource.url=jdbc:mysql://localhost:3306/inventario_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

# ===============================
# = CONFIGURACIÓN DE JPA / HIBERNATE
# ===============================
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# ===============================
# = CONFIGURACIÓN DEL SERVIDOR
# ===============================
server.port=8080
spring.application.name=inventarios
```

> 💡 **Nota:** Si usas los datos ficticios incluidos, asegúrate de importar el archivo de la carpeta `/database` en tu servidor MySQL antes de ejecutar el backend.

---

## 🚀 Ejecución del proyecto

### 🔹 Backend (Spring Boot)

Desde la carpeta **`inventarios/`**, ejecutar:

```bash
mvn spring-boot:run
```

Esto iniciará el servidor de Spring Boot en:  
👉 `http://localhost:8080`

---

### 🔹 Frontend (Angular)

Desde la carpeta **`inventario-app/`**, ejecutar:

```bash
npm install
ng serve -o
```

Esto iniciará el servidor del frontend en:  
👉 `http://localhost:4200`

---

## 🧾 Requisitos previos

- ☕ **Java 17+**
- 🧱 **Maven 3.9+**
- 🐬 **MySQL Server**
- 🅰️ **Node.js 18+ y Angular CLI**

---

## ✨ Autor

**Carlos Ramírez**  
📧 Proyecto académico / de práctica personal  
📘 Frontend y Backend desarrollados con fines de aprendizaje y mejora profesional.
