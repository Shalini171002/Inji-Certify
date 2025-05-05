📌 README.md
🎓 Credential Issuing API (Spring Boot + JDBC)

A RESTful API built using Spring Boot for issuing digital credentials and storing them in a relational database using JDBC.

🚀 Features

- Issue digital credentials via REST API
- Store credential data in a relational database
- Exception handling for database operations
- Structured response using `ResponseEntity`
- Built with Spring Boot and JDBC

📦 Technologies Used

- Java
- Spring Boot
- JDBC
- MySQL / PostgreSQL (any relational DB)
- Maven


🏁 Getting Started

 Prerequisites

- Java 17+
- Maven 3+
- MySQL / PostgreSQL
- IDE (IntelliJ, Eclipse, VS Code)



Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=none
```
 Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

---

🔗 API Endpoint

`POST /api/issue`

Issues a new credential and stores it in the database.

✅ Sample JSON Request

json
{
  "credentialId": "12345",
  "issuerId": "ABC-University",
  "statusListIndex": "1",
  "statusListCredential": "valid",
  "issueDate": "2024-01-01T10:00:00",
  "expirationDate": "2026-01-01T10:00:00",
  "holderName": "John Doe",
  "holderEmail": "john.doe@example.com",
  "holderAddress": "123 Main St",
  "credentialType": "Diploma"
}
```

 🔁 Response

json
HTTP 201 Created
"Credential issued successfully"




🧑‍💻 Author

Shalini
A passionate Java Backend Developer 
[LinkedIn](https://www.linkedin.com/in/shalini-j-73aa4b213) 



📄 License

This project is licensed under the MIT License.

