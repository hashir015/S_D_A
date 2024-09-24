# GRASP Principle: Indirection

**Indirection** is one of the nine GRASP (General Responsibility Assignment Software Patterns) principles, and it plays a critical role in decoupling classes and objects to improve flexibility, maintainability, and scalability in software design.

## Definition:
The Indirection principle is concerned with assigning responsibilities to an intermediary object or layer to mediate between other components. This helps in achieving loose coupling, allowing changes in one part of the system without directly affecting other parts.

In simple terms, it introduces an intermediate entity that acts as a "bridge" between two components or objects. This is particularly useful when you want to minimize the direct interaction between components, making the system more flexible and easier to extend or modify.

## Key Benefits:
1. **Loose Coupling**: By introducing an intermediary layer, the system’s components are decoupled, making it easier to modify one component without impacting others.
2. **Improved Maintainability**: Changes in one class or module have minimal or no impact on other parts of the system.
3. **Reusability**: Indirection facilitates code reuse, as common responsibilities can be handled by a dedicated intermediary.
4. **Flexibility**: By reducing the direct dependency between classes, indirection allows for easier extension or modification of the system’s functionality.

## Common Use Cases:
- **Design Patterns**: Indirection is the core concept behind many popular design patterns, such as Mediator, Observer, Adapter, and Proxy. These patterns rely on an intermediary to manage communication or provide additional functionalities.
- **Event Handling**: In GUI applications, event listeners act as intermediaries, reducing direct coupling between user interface elements and business logic.
- **Dependency Injection**: The Indirection principle is also at play in Dependency Injection frameworks, where the framework controls how objects are instantiated and connected.
## Example: Notification System
Scenario:
We have a notification system that sends notifications to users via Email, SMS, or Push Notifications. We use the Indirection principle to keep the system flexible.
---

