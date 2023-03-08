# Singleton #

Ensure that a class has only one instance while providing a global access point to this instance.

## **Solves**

### Ensure that a class has only one instance.

Instead of receiving a fresh object, you’ll get the one you already created.

### Provide a global access point to that instance

Access some object from anywhere in the program, but protects that instance from being overwritten.

## Applicability

**When a class in your program should have just a single instance available to all clients;** for example, a single database object shared by different parts of the program.

**When you need stricter control over global variables.**

## Solution

Make the default constructor private.

Static creation method that acts as a constructor.

If the instance is null create a new instance, if not null returns the instance.