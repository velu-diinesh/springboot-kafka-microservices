# springboot-kafka-microservices

## Overview
Event-driven microservices system using Spring Boot and Apache Kafka.

This project simulates a payment processing system with:
- Order Service
- Payment Service
- Kafka Event Streaming
- Retry + Dead Letter Queue (DLQ)

## Tech Stack
- Java 17
- Spring Boot
- Apache Kafka
- Docker (optional)

## Architecture
Order Service → Kafka → Payment Service

## Features
- Event-driven communication
- Idempotent processing
- Retry + DLQ handling
- Scalable microservices design

## Why this project
Built to demonstrate real-world distributed system design similar to high-scale payment systems.
