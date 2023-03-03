### Builder ###

**Concepts**

- Handles complex constructurs
- Large number of parameters
- Immutability (obect state will not be changed after construction)

**Design**

- Builders instead of multiple constructurs with different parameters
- Static Inner Class
- Calls appropriate constructor
- No need for exposed setters to get the obejct with the attributes we want

**Pitfalls**

- Immutable
- Inner static class
- Usually not refactored
- Adds complexity

**Use When a Class**

- One class has multiple constructurs than take multiple parameters and wil be immutable

**Example**

[https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html)