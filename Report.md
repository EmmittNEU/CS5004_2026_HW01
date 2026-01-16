# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

https://drive.google.com/file/d/1R626NbVITU6EKJelqOBbU96NDaOA9B9J/view?usp=sharing

### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).
<br>
The flow of this program follows a classic Model-View-Controller architectural pattern. 
It is a driver program that takes an input from a user and processes it using a logic class, the displays a greeting.
The program is split into 4 classes each with different responsibilities. 
The AlohaWorld is the driver class which orchestrates the flow between the user and logic. 
The ConsoleView handles inputs and outputs (I/O) and speaks to the user via the console. 
The Greeter class maintains the user's state and is used to decide which string to return. 
The Greeting class is an underutilized contain for specific locality details. 

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   I have taken this course (or at least Object-Oriented Programming (not design) before). Therefore, there were no new java syntax items in this project.

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    N/A

3. What does `main` do in Java? 

    `main` is the entry point to the Java Virtual Machine (JVM) which begins executing a standalone program. The JVM will not execute if `main` is not a part of the program. This makes it one of the most important methods in Java. The signature of `main` needs to be setup in a specific way in order for the code to work, so understanding it is critical to using Java.


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    The `toString()` method produces a string representation of an instance. An object class would have a `toString()` method to carefully summerize the information from an instance. Also, simply printing the instance is often not sufficient. 

5. What is javadoc style commenting? What is it used for? 

    Javadoc style commenting is a specific type of commenting that is able to be parsed by the javadoc tool to create professional grade HTML presentations. These comments are meant to describe the specifications of the code, rather than implementation details. Block tags allow for my structured parsing of the comments.


6. Describe Test Driving Development (TDD) in your own words. 

    Test Driving Development is an approach to developing software that starts with writing unit tests that fit the specific feature that is attempting to be implemented. The creation of unit tests allows the programmer to familiarize themselves with the desired implementation of the code.    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 
I learned about:
   * Paragraph formatting
   * Block quotes
   * Unordered lists

## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
<br>
It is useful to keep the interaction with the client contained to the ConsoleView because it allows for separation of concerns, meaning that different parts of the system handle different responsibilities. 
The ConsoleView handles the presentation of information to the user, while other logic is handled by other classes. 
Through the isolation of the interaction logic, the business logic (model + controller) can be tested independently.
If how the application interacts with the user needs to be changed, only the ConsoleView class needs to be changed. 
Encapsulating the logic makes the system more flexible, allowing one to add in a GUI or web interface.  

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
<br>
The code could be made more dynamic by making it so that greetings and localities are not hard coded into the system. 
One could do this by switching to a more data driven architecture. 
The first way the system could be made more data driven is to use a configuration file with the greetings and localities. 
This would make it so that the code wouldn't have to recompile if one wanted to make small changes. 
Currently, the Greeter class uses switch statements with hard coded logic for each localityID. 
It would be more efficient to instead have a list of greetings that is searched when the `Greet` class is called.
It would also help to move from a digit corresponding to specific localities to a system where each locality would have its own class to implement the interface.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: Java main() Method. https://www.geeksforgeeks.org/java/java-main-method-public-static-void-main-string-args/. Accessed: 2026-01-15.

[^4]: Object toString() Method in Java. https://www.geeksforgeeks.org/java/java-main-method-public-static-void-main-string-args/. Accessed: 2026-01-15.

[^5]: Introduction to Javadoc. https://www.baeldung.com/javadoc. Accessed: 2025-01-16.



<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java