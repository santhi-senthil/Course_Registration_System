
# 📘 Course Registration System

## 🚀 Project Overview

This is a comprehensive **Course Registration Portal** built using a modern **HTML/CSS/JavaScript** frontend and a robust **Spring Boot** backend. The application allows users to view available courses, register for a course, and view a list of all enrolled students.

### Key Features

- **Responsive Frontend:** A sleek, mobile-friendly interface for viewing course data and submitting registration forms.  
- **Course Catalog:** Displays a list of available courses with images, trainers, and duration.  
- **Student Registration:** Simple form for enrolling students into a specific course.  
- **Roster View:** Lists all currently enrolled students and their chosen courses.  
- **Spring Boot REST API:** Handles all CRUD operations and data persistence.  
- **MySQL Integration:** Uses MySQL as the primary database for storing course and student enrollment data.

---

## 🛠️ Technology Stack

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Frontend** | HTML5, CSS3, JavaScript | Static pages and dynamic data fetching (using `fetch` API). |
| **Backend** | Spring Boot 3+ | Provides a secure, scalable RESTful API. |
| **Database** | MySQL | Persistent storage for all application data. |
| **ORM** | Spring Data JPA / Hibernate | Simplifies database interactions. |

---

## 📦 File Structure

### Frontend Files

| File | Description |
| :--- | :--- |
| `index.html` | The main landing page with navigation links. |
| `available.html` | Displays the list of all courses fetched from the backend. |
| `register.html` | The form page for student registration. |
| `enrolled.html` | Displays the list of currently enrolled students. |
| `myscript.js` | Contains the JavaScript functions to fetch and display data from the Spring Boot API and submit forms. |

### Backend Structure (Spring Boot)

```

src/main/java/com/example/Course/Registration/System/
│
├── controller/        # Handles incoming HTTP requests
├── service/           # Business logic
├── model/             # JPA entities mapped to MySQL tables
├── repository/        # Interfaces for Spring Data JPA
└── CourseRegistrationSystemApplication.java  # Main Spring Boot class

````

**Configuration File:**  
`src/main/resources/application.properties`

---

## ⚙️ Setup and Installation

### 1. Backend Setup (Spring Boot & MySQL)

1. **Database Configuration:**
   - Ensure MySQL is installed and running.
   - Create a database (e.g., `course_db`).
   - Update your `application.properties` file:

   ```properties
   server.port=8081
   spring.datasource.url=jdbc:mysql://localhost:3306/course_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=your_mysql_user
   spring.datasource.password=your_mysql_password
   spring.jpa.hibernate.ddl-auto=update
````

2. **Run the Backend:**

   * Build and run the Spring Boot project (`mvn spring-boot:run` or run the main class).
   * The backend will start on [http://localhost:8081](http://localhost:8081).

---

### 2. Frontend Setup (HTML/CSS/JS)

1. Open `index.html` or use **Live Server** in VS Code.
2. The JavaScript (`myscript.js`) communicates with the backend API at:

   ```
   http://localhost:8081
   ```

---

## 🌐 API Endpoints

| URL                 | Method | Description                     |
| :------------------ | :----- | :------------------------------ |
| `/courses`          | `GET`  | Fetch all available courses     |
| `/courses/enrolled` | `GET`  | Fetch all enrolled students     |
| `/courses/register` | `POST` | Register a student for a course |

---

## 💡 Frontend Design Notes

* **Responsive Design:** Switches from a table view to a card layout on smaller screens using CSS Flexbox.
* **Dynamic Data Fetching:** Data is loaded dynamically using the JavaScript `fetch()` API.
* **Form Validation:** Basic checks ensure all input fields are filled before form submission.
* **CORS Configuration:** The backend includes

  ```java
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  ```

  to allow the frontend to communicate with the API during local development.

---

## 🧠 Learning Outcomes

* Integration of frontend and backend applications
* RESTful API creation using Spring Boot
* Database persistence using MySQL + JPA
* Handling of CORS in real-world applications

---

## 🚧 Future Enhancements

* Add user authentication (login/signup)
* Search and filter functionality for courses
* Pagination for large course lists
* Email confirmation on registration
* Convert to a React or Angular SPA

---

## 🧩 Troubleshooting

| Issue                         | Cause                               | Solution                                               |
| :---------------------------- | :---------------------------------- | :----------------------------------------------------- |
| **CORS error**                | Browser blocks cross-origin request | Add `@CrossOrigin` in controller or global CORS config |
| **Database connection error** | Wrong DB credentials                | Update `application.properties`                        |
| **404/403 error**             | Wrong API endpoint                  | Check your URLs and ports                              |
| **Failed to fetch**           | Backend not running                 | Start the Spring Boot app before the frontend          |

---

## 👩‍💻 Author

**Santhi Senthil**
📍 Data Analyst | Web Developer | UI/UX Designer
💼 Passionate about creating meaningful, data-driven applications and intuitive designs.

> “Empowering ideas through data and design.”

