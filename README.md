# Java OOP Fundamentals

This repository explains the core concepts of Object-Oriented Programming (OOP) in Java with simple explanations, practical examples, and real-world use cases.

## What is Object-Oriented Programming (OOP)?

Object-Oriented Programming is a programming approach that organizes code around classes and objects. It helps make applications modular, reusable, maintainable, and easier to extend.

Java is a class-based, object-oriented programming language.

## Core OOP Concepts

### 1. Classes and Objects

- **Class:** A blueprint that defines the properties and behaviors of objects.
- **Object:** An instance of a class that has its own state and can perform actions.

Example: `Car` is a class, while a specific red car is an object.

### 2. Encapsulation

Encapsulation means combining data and methods within a class and controlling how the data is accessed or modified.

- Uses access modifiers such as `private` to restrict direct access.
- Provides controlled access through well-defined methods.
- Helps protect data and maintain a valid object state.

Example: A `BankAccount` class allows deposits and withdrawals through methods instead of allowing direct modification of its balance.

**Important:** Encapsulation does not simply mean using getters and setters. It means controlling access to data through a well-defined interface.

### 3. Inheritance

Inheritance allows a class to reuse and extend the accessible functionality of another class using the `extends` keyword.

- Promotes code reuse.
- Supports method overriding.
- Represents an *is-a* relationship.

Example: A `Dog` class inherits common properties and behaviors from an `Animal` class.

### 4. Polymorphism

Polymorphism means one interface or method name can represent different behaviors depending on how it is used.

Types of polymorphism in Java:

- **Compile-time polymorphism:** Achieved through method overloading.
- **Runtime polymorphism:** Achieved through method overriding and dynamic method dispatch.

Example: Different animals can implement the same `makeSound()` method differently.

### 5. Abstraction

Abstraction means hiding implementation details and exposing only the essential functionality.

- Achieved using abstract classes and interfaces.
- Reduces complexity for users of a class.
- Defines what an object can do without requiring the caller to know how it works internally.

Example: A user calls `payment.processPayment()` without needing to understand the internal payment-processing logic.

## Relationships Between Classes

### 6. Association

Association represents a relationship between two independent classes.

Example: A `Teacher` teaches a `Student`.

### 7. Aggregation

Aggregation is a weak *has-a* relationship in which one object contains or references another object, but both can exist independently.

Example: A `Department` has `Teachers`, and the teachers can exist independently of the department.

### 8. Composition

Composition is a strong *has-a* relationship in which a containing object owns its component objects as part of its lifecycle.

Example: A `House` contains `Rooms` in a simplified object model.

### 9. Composition vs Inheritance

- **Inheritance:** Reuses or extends behavior through an *is-a* relationship.
- **Composition:** Builds functionality by combining objects through a *has-a* relationship.

Composition is often preferred when behavior needs to be flexible or interchangeable.

## Other Important OOP Concepts

### 10. Method Overloading vs Method Overriding

- **Overloading:** Multiple methods have the same name but different parameter lists. The compiler determines which method to call.
- **Overriding:** A subclass provides its own implementation of an inherited instance method. The actual object type determines which implementation runs at runtime.

### 11. Constructors

Constructors initialize objects when they are created. They have the same name as the class and do not have a return type.

### 12. `this` and `super`

- `this` refers to the current object.
- `super` is used to access superclass members and invoke superclass constructors.

### 13. Static Keyword

The `static` keyword makes a member belong to the class rather than to individual instances.

Static methods are not overridden in the runtime-polymorphism sense; they are hidden when a subclass declares a compatible static method.

### 14. Access Modifiers

Java provides four access levels:

- `public`: Accessible wherever the declaring type or member is accessible.
- `protected`: Accessible within the same package and by subclasses, subject to Java's access rules.
- Default (package-private): Accessible within the same package.
- `private`: Accessible only within the declaring class.

### 15. Abstract Classes vs Interfaces

- **Abstract class:** Can contain abstract methods, implemented methods, instance fields, and constructors.
- **Interface:** Defines a contract that classes can implement. It can also contain default, static, and private methods.

A class can extend only one class but can implement multiple interfaces.

### 16. Coupling and Cohesion

- **Coupling:** The degree of dependency between classes. Lower coupling is generally desirable.
- **Cohesion:** How closely related the responsibilities within a class or module are. Higher cohesion is generally desirable.

### 17. OOP Principles vs SOLID Principles

OOP principles describe how object-oriented programs organize data and behavior.

SOLID is a set of five design principles that help developers create maintainable and extensible object-oriented software:

- **S — Single Responsibility Principle**
- **O — Open/Closed Principle**
- **L — Liskov Substitution Principle**
- **I — Interface Segregation Principle**
- **D — Dependency Inversion Principle**

## Repository Goals

- Understand Java OOP concepts through simple explanations.
- Practice each concept using independent Java programs.
- Learn real-world examples and appropriate use cases.
- Understand common mistakes and important distinctions.
- Prepare for Java backend developer technical interviews.

## Technologies

- Java
- Object-Oriented Programming
- IntelliJ IDEA

## How to Use This Repository

1. Start with classes and objects.
2. Learn the four pillars of OOP.
3. Explore relationships between classes.
4. Practice the remaining concepts using Java examples.
5. Review the examples and explain each concept in your own words.

---

**Goal:** Build a strong understanding of Java OOP fundamentals through practical examples.
