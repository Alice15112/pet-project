# 🐾 Pet Project — Spring Boot + Kafka + Redis + Prometheus + Grafana

Educational project demonstrating integration between **Spring Boot**, **Apache Kafka**, **Redis**, and **PostgreSQL**  
with full **observability stack** (Prometheus + Grafana) and **Docker Compose** for local deployment.

---

## 🚀 Features

- ✅ REST API for simple task CRUD (Spring Boot + PostgreSQL)
- 📨 Asynchronous message passing via Kafka (Producer + Consumer)
- 💾 Task caching in Redis
- 📊 Application monitoring via Prometheus & Grafana dashboards
- 🧩 One-command startup with Docker Compose

---

## Stack Overview

| Component | Purpose |
|------------|----------|
| **Spring Boot** | REST API, Kafka Producer/Consumer |
| **PostgreSQL** | Task persistence |
| **Kafka** | Messaging between Producer and Consumer |
| **Redis** | Task cache storage |
| **Prometheus** | Metrics collection from app, Kafka & Redis |
| **Grafana** | Visualization dashboards |
| **Kafka-UI** | Convenient Kafka topic browser |

---


## ⚙️ Setup & Run

Clone the repository and launch the whole stack:

```bash

docker compose up -d
mvn spring-boot:run