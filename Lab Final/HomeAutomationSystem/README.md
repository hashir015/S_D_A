# **Smart Home Energy Saving System**

## **What is Our Project?**

The **Smart Home Energy Saving System** is a robust IoT-based solution designed to optimize energy consumption and provide convenience for smart home users. It allows real-time monitoring and control of connected devices via a mobile app while utilizing cloud computing to store and process data. The system enables energy-saving automation and provides actionable insights to reduce energy waste.

## **Use Case: Monitor and Control Energy Usage**

Our primary use case is **"Monitor and Control in Home Automation"**.  
This involves:
1. **Monitoring**: Real-time tracking of energy consumption and device status.  
2. **Controlling**: Allowing users to remotely control IoT devices like turning them ON/OFF.  
3. **Automation**: Automatically turning off devices when idle or based on energy-saving rules.

---

## **System Architecture**

This project is built on **layered architecture**, ensuring a modular design with clear separation of concerns. The architecture consists of the following layers:

### **1. Presentation Layer (User Interface)**
- **Purpose**: This layer interacts directly with the user.
- **Components**:
  - `MobileApp`: A mobile application for user authentication, monitoring energy usage, controlling devices, and receiving notifications.

### **2. Application Layer**
- **Purpose**: Contains the core business logic and application-specific functionality.
- **Components**:
  - `IoTDevice`: Represents the IoT devices (e.g., sensors, thermostats, smart plugs).  
    - Handles actions like executing commands (`ON/OFF`) and reporting statuses.

### **3. Service Layer**
- **Purpose**: Serves as the bridge between the application layer and the cloud infrastructure.
- **Components**:
  - `CloudInfrastructure`: Processes and stores data from IoT devices, and ensures communication between the mobile app and devices.

### **4. Data Layer**
- **Purpose**: Manages the data storage and retrieval.
- **Components**:
  - Cloud-based storage solutions like Firebase or AWS for securely storing energy usage data and device configurations.

---

## **Features**

1. **Real-Time Monitoring**: View energy usage and device status instantly.  
2. **Remote Device Control**: Turn devices ON/OFF or adjust settings from anywhere via the mobile app.  
3. **Automation**: Automatically optimize energy usage using predefined rules.  
4. **Notifications**: Receive alerts for energy-saving tips and updates.  
5. **Analytics**: Provides insights based on historical energy consumption data.

---

## **Technologies Used**

- **IoT Devices**: Sensors, thermostats, and smart plugs for data collection and remote control.  
- **Cloud Infrastructure**: Platforms like AWS or Firebase for storing and processing data.  
- **Mobile App Development**: Built using frameworks like Flutter or React Native.  
- **Programming Language**: Java for backend business logic.  

---

## **Benefits of the Layered Architecture**

1. **Modularity**: Each layer is independent, making the system easy to modify and expand.  
2. **Scalability**: New devices and features can be added without affecting the entire system.  
3. **Maintainability**: Debugging and updates are more manageable with separated layers.  
4. **Improved Collaboration**: Developers can work on different layers simultaneously without conflicts.

---

## **Folder Structure**

Here’s the file organization to follow:


---

## **How to Run the Project**

1. **Set Up the Environment**:
   - Install JDK (Java Development Kit).
   - Use an IDE like VS Code or IntelliJ IDEA.

2. **Compile the Project**:
   - Navigate to the `main/` directory.
   - Run the following command:
     ```bash
     javac ../presentation/*.java ../application/*.java ../service/*.java HomeAutomationSystem.java
     ```

3. **Run the Program**:
   - Execute the main class:
     ```bash
     java HomeAutomationSystem
     ```

4. **Test Features**:
   - Use the mobile app to interact with the system, monitor devices, and receive notifications.

---

Let me know if any further changes are needed!
