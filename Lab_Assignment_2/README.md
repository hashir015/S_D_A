# Playback Microservices System

This project demonstrates how a bottleneck in a playback service was resolved by transitioning from a monolithic architecture to a microservices architecture. The system uses Spring Boot and RabbitMQ for asynchronous messaging.

---

## Problem Statement

In the monolithic system, a single playback service handled all user actions (start, pause, stop). This caused issues during high traffic, such as:
- **Delayed responses** during peak hours.
- **Service crashes** due to overloaded servers.
- **Difficulty scaling** to meet demand.
- **Downtime** when deploying updates.

---

## Solution Overview

The solution involved:
1. **Decoupling the playback actions** into separate microservices:
   - **Start Service**
   - **Pause Service**
   - **Stop Service**
2. Using **RabbitMQ** for asynchronous communication between services.
3. Implementing a **Queue Manager** to route user requests to a message queue.
4. Adding a **Queue Processor** to handle queued requests independently.

---

## System Architecture

- **Microservices**:
  - `start-service`: Handles playback start requests.
  - `pause-service`: Handles playback pause requests.
  - `stop-service`: Handles playback stop requests.
- **Queue Manager Service**:
  - Accepts user requests and queues them using RabbitMQ.
- **Queue Processor**:
  - Processes requests from the queue asynchronously.

---

## Prerequisites

1. **Java Development Kit (JDK)**: Version 11 or higher.
2. **Maven**: For building the project.
3. **Docker**: To run RabbitMQ locally.
4. **RabbitMQ Management Plugin**: Pre-installed with RabbitMQ Docker image.

---

