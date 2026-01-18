# Inheritance Programs

Complete collection of inheritance concepts and implementations in Java.

## 📋 Program Categories

### Basic Inheritance
- **Inheri.java** - Basic inheritance example
- **SingleInheritance.java** - Single inheritance implementation
- **Studd.java** - Student inheritance example
- **Supp.java** - Supplier inheritance example

### Types of Inheritance
- **MultilevelInheritance.java** - Multilevel inheritance chain
- **HierarchicalInheritance.java** - Multiple classes inheriting from one
- **MultipleInheritanceViaInterfaces.java** - Multiple inheritance using interfaces
- **HybridInheritance.java** - Combination of inheritance types

### Method Concepts
- **Mulstat.java** - Static method inheritance
- **NonStaticInheritance.java** - Non-static method inheritance
- **VarShad.java** - Variable shadowing concepts

### Casting Operations
- **UpcastingExample.java** - Upcasting demonstration
- **DowncastingExample.java** - Downcasting with instanceof
- **CarUpDownCast.java** - Car example for casting

### Real-World Examples
- **Shape.java** - Geometric shape hierarchy
- **Triangle.java** - Triangle inheritance
- **RightAngleTriangle.java** - Specialized triangle
- **Employee.java** - Employee hierarchy
- **Person.java** - Person-based inheritance

### Vehicle Hierarchy
- **Car.java** - Car inheritance example
- **Sedan.java** - Sedan car type
- **Luxury.java** - Luxury car features
- **Mini.java** - Mini car implementation
- **Uber.java** - Uber service example

### Parent-Child Relationships
- **Parent.java** - Parent class example
- **Child.java** - Child class implementation
- **GrandChild.java** - Multi-level inheritance
- **ParentM.java** - Parent with methods
- **ChildM.java** - Child with method overriding

### Advanced Concepts
- **Base.java** - Base class implementation
- **B.java** - Extended class example

## 🎯 Inheritance Types Covered

### 1. Single Inheritance
```
Parent → Child
```
- One class inherits from another
- Simple parent-child relationship

### 2. Multilevel Inheritance
```
GrandParent → Parent → Child
```
- Chain of inheritance
- Multiple levels of hierarchy

### 3. Hierarchical Inheritance
```
    Parent
   /  |  \
Child1 Child2 Child3
```
- Multiple classes inherit from one parent
- Tree-like structure

### 4. Multiple Inheritance (via Interfaces)
```
Interface1 + Interface2 → Class
```
- Class implements multiple interfaces
- Achieves multiple inheritance

### 5. Hybrid Inheritance
```
Combination of above types
```
- Mix of different inheritance patterns

## 🚀 Learning Path

### Beginner Level
1. **Inheri.java** - Basic inheritance syntax
2. **SingleInheritance.java** - Simple parent-child
3. **Parent.java & Child.java** - Method inheritance
4. **UpcastingExample.java** - Basic casting

### Intermediate Level
1. **MultilevelInheritance.java** - Multi-level chains
2. **HierarchicalInheritance.java** - Multiple children
3. **DowncastingExample.java** - Safe downcasting
4. **VarShad.java** - Variable shadowing

### Advanced Level
1. **MultipleInheritanceViaInterfaces.java** - Interface inheritance
2. **HybridInheritance.java** - Complex inheritance
3. **CarUpDownCast.java** - Real-world casting
4. **NonStaticInheritance.java** - Method behavior

## 💡 Key Concepts

### Inheritance Fundamentals
- `extends` keyword usage
- `super` keyword for parent access
- Method overriding with `@Override`
- Constructor chaining

### Access Modifiers
- `public` - Accessible everywhere
- `protected` - Accessible in package and subclasses
- `default` - Package-level access
- `private` - Not inherited

### Method Concepts
- Method overriding vs overloading
- Static method inheritance behavior
- Abstract method implementation
- Final methods (cannot be overridden)

### Casting Operations
- **Upcasting** - Child to Parent (automatic)
- **Downcasting** - Parent to Child (explicit)
- **instanceof** operator for safe casting
- ClassCastException prevention

## 📝 Best Practices

### Design Principles
- Use inheritance for "is-a" relationships
- Prefer composition over inheritance when appropriate
- Keep inheritance hierarchies shallow
- Use abstract classes for common behavior

### Code Quality
- Override `toString()` method appropriately
- Use `@Override` annotation consistently
- Handle constructor chaining properly
- Implement proper access control

## 🎯 Learning Objectives

- Understand inheritance hierarchy design
- Master method overriding techniques
- Learn safe casting operations
- Implement real-world inheritance scenarios
- Apply inheritance best practices