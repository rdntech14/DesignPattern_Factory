Factory Design Pattern in Java
=====

# What is Factory Design Pattern

It is a creational pattern.

We create object without exposing the creation logic to the client and refer to newly created object using a common interface.

# Where to use

1) Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.

# How to implement

1) We can keep the method that returns the subclass as static.

2) Based on the input parameter, different subclass is created and returned. 

# UML diagram

![Alt text](/factory_design_pattern.png?raw=true "Optional Title")