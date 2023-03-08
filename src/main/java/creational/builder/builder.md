# Builder #

Lets you construct complex objects step by step. Allows to produce of different types and representations of an object using the same construction code.

## **Solves**

### Organizes object construction into a set of steps

Instead of having multiple constructors

### No need to call all of the steps

You can call only those steps that are necessary for producing a particular configuration of an object.

## Applicability

**To get rid of a “telescoping constructor”.**

**When you want your code to be able to create different representations of some product**

**To construct Composite trees or other complex objects.**

## Solution

Define the common construction steps for building all available product representations.

Declare these steps in the base builder interface.

Create a concrete builder class for each of the product representations and implement their construction steps.
**Example**

[https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html)