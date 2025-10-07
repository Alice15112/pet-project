# Pet Project — Task Service (Spring Boot + Kafka + Redis + PostgreSQL)

## 📘 Overview
A demo microservice for handling tasks.  
Each created task is stored in PostgreSQL, sent through Kafka, and cached in Redis.

**Stack:**
- Java 21, Spring Boot 3
- PostgreSQL (JPA/Hibernate)
- Kafka (Producer + Consumer)
- Redis (Cache)
- Docker Compose orchestration
- Swagger / OpenAPI documentation

---

## ⚙️ Architecture
[HTTP POST /tasks]
↓
TaskController → PostgreSQL
↓
Kafka Producer → Topic "tasks"
↓
Kafka Consumer → Redis Cache
↓
[HTTP GET /redis/tasks]
## 🚀 Run Locally

```bash
docker compose up -d
mvn spring-boot:run