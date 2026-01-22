# Functional Programming

Lambda expressions, streams, and functional programming concepts in Java 8+.

## 📋 Program Categories

### Lambda Expressions
- **Lambb.java** - Basic lambda expression examples
- **MethodReferenceDemo.java** - Method references demonstration

### Stream Operations
- **StreamDemo.java** - Employee filtering using streams
- **Mapp.java** - Map operations with streams

### Functional Interfaces
- **InnerLambb** - Custom functional interface
- **Employee.java** - Entity class for stream operations

### Student Examples
- **Studd.java** - Student-based functional programming

## 🎯 Key Concepts Covered

### Lambda Expressions
```java
// Basic lambda
(a, b) -> a + b

// Lambda with body
(a) -> {
    if(a % 2 == 0)
        System.out.println("Even");
    else
        System.out.println("Odd");
}
```

### Stream API
```java
employees.stream()
    .filter(emp -> emp.getSal() > 25000)
    .map(Employee::getEname)
    .forEach(System.out::println);
```

### Method References
- **Static Method Reference** - `ClassName::methodName`
- **Instance Method Reference** - `object::methodName`
- **Constructor Reference** - `ClassName::new`

### Functional Interfaces
- `@FunctionalInterface` annotation
- Single Abstract Method (SAM)
- Built-in functional interfaces (Predicate, Function, Consumer)

## 🚀 Learning Path

### Beginner Level
1. **Lambb.java** - Basic lambda syntax
2. **Functional interfaces** - Understanding SAM
3. **Simple stream operations** - filter, map

### Intermediate Level
1. **Sreamm.java** - Complex filtering
2. **MrLambb.java** - Method references
3. **Mapp.java** - Advanced stream operations

### Advanced Level
1. **Custom functional interfaces**
2. **Complex stream pipelines**
3. **Parallel streams**
4. **Collectors and grouping**

## 💡 Benefits of Functional Programming

### Code Readability
- More concise and expressive
- Declarative programming style
- Reduced boilerplate code

### Performance
- Lazy evaluation in streams
- Parallel processing capabilities
- Optimized operations

### Maintainability
- Immutable data structures
- Pure functions (no side effects)
- Easier testing and debugging

## 📝 Real-World Applications

- **Data Processing** - Filter, transform, aggregate
- **Collection Operations** - Sorting, grouping, partitioning
- **Event Handling** - Functional event listeners
- **API Design** - Fluent interfaces with lambdas