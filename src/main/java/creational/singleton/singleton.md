### Singleton ###

Guarantees only one instance is created. Commonly used in Runtime, Logger, Spring Beans, and Graphic Managers.

**Concepts**

- Class is responsible for lifecycle
- Thread Safe
- Private Instance
- Private Constructor
- No parameters are required for construction

**Pitfalls**

- Overused
- Difficult to unit test
- If not careful, not thread-safe
- If has parameters, use a factory

**Contrast vs Factory**

- Returns same instance, while factory returns various
- No interface, while Factory is interface driven
- Factrory is adaptable to environment more easily

**Use When a Class**

- controls concurrent access to a shared resource.
- access to the resource will be requested from multiple, disparate parts of the system.
- there can be only one object.