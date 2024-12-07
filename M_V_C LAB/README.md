# Quiz Application - MVC Implementation

This repository demonstrates the implementation of the **Model-View-Controller (MVC)** design pattern in a Quiz Application. It includes both a basic Java SE console-based implementation and a web-based implementation using **Spring Boot**.

## Project Overview

This project provides a simple and modular quiz system to showcase the **separation of concerns** in the MVC pattern. It is designed with the following layers:
- **Model:** Represents the data and business logic (e.g., questions and answers).
- **View:** Handles user interaction, such as displaying questions and capturing answers.
- **Controller:** Manages the communication between the model and the view.

Additionally, the Spring Boot implementation demonstrates a **RESTful web service** for delivering quiz questions and evaluating answers.

---

## Features

- **Quiz Attributes:**
  - Displays multiple-choice questions.
  - Evaluates user answers for correctness.
  - Displays the final score.
- **Two Implementations:**
  1. **Console-Based Implementation (Java SE)**:
     - Interactive quiz in the console.
  2. **Spring Boot Implementation**:
     - Web-based REST API to manage and serve quizzes.

---

## Prerequisites

To run this project, ensure you have the following installed:

- **Java Development Kit (JDK)** (version 17 or later)
- **Maven** (for dependency management)
- (Optional) Spring Boot CLI or an IDE like IntelliJ IDEA or Eclipse

---

## Instructions

### 1. Console-Based Implementation

Clone the repository:

```bash
git clone https://github.com/yourusername/Quiz-MVC.git
