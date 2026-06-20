# Barangay Management System
### Java + MongoDB · Command Line Interface

A command-line barangay records management system built with Java and MongoDB. Handles resident records, blotter reports, document requests, officials, projects, and user administration — all from the terminal.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17+ |
| Database | MongoDB (via MongoDB Java Driver) |
| Architecture | DAO Pattern (Data Access Object) |
| Build | Manual / Javac |

---

## Prerequisites

Before running this project, make sure you have the following installed:

- **Java JDK 17+** — [Download](https://adoptium.net/)
- **MongoDB Community Server** — [Download](https://www.mongodb.com/try/download/community)
- **MongoDB Java Driver** (JAR) — [Download](https://mvnrepository.com/artifact/org.mongodb/mongodb-driver-sync)
- **BSON JAR** — bundled with the MongoDB Java Driver

---

## Project Structure

```
Barangay Management System/
├── src/
│   ├── config/
│   │   └── DatabaseConfig.java       # MongoDB connection setup
│   ├── dao/
│   │   └── ResidentDAO.java          # Data access logic for residents
│   ├── models/
│   │   ├── Resident.java
│   │   ├── Blotter.java
│   │   ├── DocumentRequest.java
│   │   ├── Officials.java
│   │   ├── Project.java
│   │   └── UserAdmin.java
│   ├── service/                      # Business logic layer
│   └── ui/
│       └── MainMenu.java             # CLI entry point
├── lib/                              # MongoDB driver JARs
└── README.md
```

---

## MongoDB Setup

1. Start your MongoDB server locally:
   ```bash
   mongod
   ```

2. The default connection string used in `DatabaseConfig.java`:
   ```
   mongodb://localhost:27017
   ```

3. Database name: `barangay_db` *(update in `DatabaseConfig.java` if needed)*

---

## How to Run

### 1. Compile

```bash
javac -cp "lib/*" -d out src/config/*.java src/models/*.java src/dao/*.java src/service/*.java src/ui/*.java
```

### 2. Run

```bash
java -cp "out:lib/*" ui.MainMenu
```

> **Windows users** — replace `:` with `;` in the classpath:
> ```bash
> java -cp "out;lib/*" ui.MainMenu
> ```

---

## Features

- **Resident Management** — Add, view, update, and delete resident records
- **Blotter Records** — Log and manage barangay incident/blotter reports
- **Document Requests** — Track requests for barangay documents (clearance, residency, etc.)
- **Officials Directory** — Manage barangay official information
- **Projects Tracking** — Record barangay projects and their statuses
- **User Administration** — Admin account management and access control

---

## Collections (MongoDB)

| Collection | Description |
|---|---|
| `residents` | Resident profile records |
| `blotters` | Incident and blotter reports |
| `document_requests` | Document request entries |
| `officials` | Barangay officials directory |
| `projects` | Barangay project records |
| `user_admins` | System administrator accounts |

---

## Author

**Jae Mark Almeria** · [@jmarkTheDeveloper](https://github.com/jmarkTheDeveloper)  
BS Computer Science — Digital Forensics | National University Philippines
