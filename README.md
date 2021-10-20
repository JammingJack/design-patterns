# Design Pattern :
### What is meant by a design pattern?
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.

These designs were obtained by trial and error by numerous software developers over quite a substantial period of time.

### What is Gang of Four (GOF)?
In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.

![GOF BOOK IMG](https://springframework.guru/wp-content/uploads/2015/04/9780201633610.jpg)

These authors are collectively known as Gang of Four (GOF). According to these authors design patterns are primarily based on the following principles of object orientated design:

* Program to an interface not an implementation
* Favor object composition over inheritance
### Types of Design Patterns:
As per the design pattern reference book Design Patterns - Elements of Reusable Object-Oriented Software , there are 23 design patterns which can be classified in three categories: Creational, Structural and Behavioral patterns.
1. **Creational Patterns:**
   
   These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.
2. **Structural Patterns**
   
   These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities
3. **Behavioral Patterns**
   
      These design patterns are specifically concerned with communication between objects
   ![DESIGN PATTERNS CATALOG](https://circle.visual-paradigm.com/wp-content/uploads/2017/08/GoF-Design-Patterns-Catalog.png)
   
### Designs discussed in this repo
1. **Strategy pattern**

   The Strategy Pattern defines a family of algorithms,encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it

   ##### Intent

      * Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
      * Capture the abstraction in an interface, bury implementation details in derived classes.

      Generaly speaking this is the class diagram of the strategy pattern 
   
   ![strategy uml](https://upload.wikimedia.org/wikipedia/commons/3/39/Strategy_Pattern_in_UML.png)

   When applied to the problem at hand, we end up with the following class diagram
   
   ![strategy impl uml](./images/strategy%20class%20diag%20impl.png)

   Next is the output of our implementation:

   ![strategy exec](./images/strategy%20execution%20result.png)

2. **Observer pattern**

   The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically

   ##### Intent

   * Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   * Encapsulate the core (or common or engine) components in a Subject abstraction, and the variable (or optional or user interface) components in an Observer hierarchy.
   * The "View" part of Model-View-Controller.

   Generaly speaking this is the class diagram of the strategy pattern

   ![observer uml](./images/observer%20class%20diag.png)
   
   When implemented to the problem at hand, we get the following class diagram 

   ![observer impl uml](./images/observer%20class%20diag%20impl.png)

   This is the result of the executions of the program:

   ![observer exec](./images/observer%20execution%20result.png)

3. **Decorator Pattern**

   The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

      ##### Intent

      * Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
      * Client-specified embellishment of a core object by recursively wrapping it.
      * Wrapping a gift, putting it in a box, and wrapping the box.

   Generaly speaking this is the class diagram of the strategy pattern

   ![decorator uml](./images/decorator%20uml%20diag.png)

   When implemented to the the problem at hand, we get the following diagram:

   ![decorator impl uml](./images/decorator%20uml%20diag%20impl.png)

   The result of the execution of the program  is the following

   ![decorator exec](./images/decorator%20exec.png)

   
   


   
