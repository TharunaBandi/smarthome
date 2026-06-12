# 🏠 Smart Home Planner

A Spring Boot web application that recommends house plans (1BHK–3BHK) and displays matching 3D layouts based on user preferences like number of rooms and budget.

---

## 📸 Screenshots

> _Add screenshots of the home page, input form, and 3D layout display here._

---

## ✨ Features

- 🏡 **Plan Recommendations** — Suggests 1BHK, 2BHK, or 3BHK plans based on user inputs
- 🧊 **3D Layout Display** — Shows matching house layouts visually based on preferences
- 📋 **User Preference Form** — Input rooms, area, and style preferences
- 🔌 **REST API Backend** — Spring Boot APIs serve layout and plan data
- 🗄️ **MySQL Storage** — Plan templates and layout data stored in MySQL
- 📐 **MVC Architecture** — Clean separation of concerns (Controller → Service → Repository)
- 📱 **Responsive UI** — HTML/CSS/JS frontend works across devices

---

## 🛠️ Tech Stack

| Layer      | Technology                       |
|------------|-----------------------------------|
| Backend    | Java, Spring Boot, REST APIs      |
| Frontend   | HTML5, CSS3, JavaScript           |
| Database   | MySQL, Spring Data JPA, Hibernate |
| Architecture | MVC (Model-View-Controller)    |
| Tools      | Maven, Git, GitHub                |

---

## 🏗️ Project Architecture

```
smarthome/
└── src/
    └── main/
        ├── java/
        │   ├── controller/     # Handles HTTP requests
        │   ├── service/        # Business logic
        │   ├── repository/     # Database access layer
        │   └── model/          # Entity classes (HousePlan, Layout)
        └── resources/
            ├── static/         # HTML, CSS, JS frontend files
            └── application.properties
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- MySQL 8+
- Maven

### 1. Clone the Repository

```bash
git clone https://github.com/TharunaBandi/smarthome.git
cd smarthome
```

### 2. Set Up the Database

Open MySQL and run:

```sql
CREATE DATABASE smarthome_db;
```

### 3. Configure Application

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/smarthome_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

Open your browser at `http://localhost:8080`

---

## 🔌 API Endpoints

| Method | Endpoint              | Description                        |
|--------|-----------------------|------------------------------------|
| GET    | `/api/plans`          | Get all available house plans      |
| POST   | `/api/plans/recommend`| Get recommended plan based on input|
| GET    | `/api/layouts/{id}`   | Get 3D layout for a specific plan  |

---

## 👩‍💻 Author

**Bandi Tharuna Sri**
- GitHub: [@TharunaBandi](https://github.com/TharunaBandi)
- Email: banditharuna@gmail.com
