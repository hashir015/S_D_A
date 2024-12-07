# Quiz Application - MVC Implementation

This repository demonstrates the implementation of the **Model-View-Controller (MVC)** design pattern in a Quiz Application. It includes two implementations:

1. **Console-Based Implementation** using Java SE.
2. **Web-Based Implementation** using Spring Boot.

---

## **Project Overview**
This project showcases the separation of concerns through the MVC pattern in a simple and modular quiz system.

### **Layers:**
- **Model:** Handles the data and business logic (e.g., questions, answers, and scoring logic).
- **View:** Manages the user interface, including displaying questions and capturing answers.
- **Controller:** Orchestrates the communication between the Model and the View.

### **Features:**
- **Quiz Attributes:**
  - Displays multiple-choice questions.
  - Evaluates user answers and provides feedback.
  - Shows the final score at the end of the quiz.
  
- **Two Implementations:**
  1. **Console-Based Implementation:**
     - Interactive quiz in the terminal.
  2. **Spring Boot Implementation:**
     - A RESTful web service for managing and serving quizzes.

---

## **Prerequisites**
Ensure the following are installed before running the project:
- **Java Development Kit (JDK)** (Version 17 or later)
- **Maven** (For dependency management)
- (Optional) Spring Boot CLI or an IDE such as IntelliJ IDEA, Eclipse, or NetBeans

---

## **Setup and Running Instructions**

### **1. Console-Based Implementation**
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/Quiz-MVC.git
   cd Quiz-MVC
   ```
2. **Navigate to the Console-Based Implementation Directory:**
   ```bash
   cd console-quiz
   ```

3. **Compile and Run the Application:**
   ```bash
   javac -d bin src/*.java
   java -cp bin com.example.quiz.Main
   ```

---

### **2. Spring Boot Implementation**
1. **Navigate to the Spring Boot Directory:**
   ```bash
   cd spring-boot-quiz
   ```

2. **Build the Application:**
   ```bash
   mvn clean install
   ```

3. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API:**
   - Open your browser or Postman and go to:
     ```
     http://localhost:8080/api/v1/quiz
     ```

---

## **Project Structure**
```
Quiz-MVC/
├── console-quiz/         # Console-based Java SE implementation
│   ├── src/              # Source files
│   ├── bin/              # Compiled binaries
│   └── README.md
├── spring-boot-quiz/     # Spring Boot implementation
│   ├── src/              # Source files
│   ├── target/           # Compiled JAR and dependencies
│   └── README.md
├── README.md             # Main documentation
```

---

## **How to Contribute**
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Description of your feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.

---

## **License**
This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

### **Contact**
For questions or support, reach out via [GitHub Issues](https://github.com/yourusername/Quiz-MVC/issues).
