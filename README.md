# Spring Boot Kafka Microservices

## Overview
This project demonstrates a simple event-driven microservices architecture using Spring Boot and Apache Kafka.

It simulates an order and payment workflow:
1. Order Service receives an API request
2. Order Service publishes an event to Kafka
3. Payment Service consumes the event and processes payment

## Services
### Order Service
- Exposes REST endpoint: `/send?order=<value>`
- Publishes order events to Kafka topic

### Payment Service
- Listens to Kafka topic `order-topic`
- Consumes and processes incoming order messages

## Tech Stack
- Java 17
- Spring Boot
- Apache Kafka
- Maven

## Project Structure
- `order-service` → producer microservice
- `payment-service` → consumer microservice

## Key Concepts Demonstrated
- Microservices
- Event-driven architecture
- Kafka producer/consumer
- REST API integration
- Service separation
- Structured logging using SLF4J

## Future Enhancements
- Retry mechanism
- Dead Letter Queue (DLQ)
- Docker Compose
- AWS deployment
- Unit and integration tests
