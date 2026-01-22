# Anonymous Classes

Anonymous inner classes and their implementations in Java.

## 📋 Program List

### Anonymous Class Examples
- **Calci.java** - Calculator with anonymous inner classes
- **Add.class** - Addition operation interface
- **Subtract.class** - Subtraction operation interface

## 🎯 Key Concepts

### Anonymous Inner Classes
```java
// Anonymous class implementing interface
Add addition = new Add() {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
};
```

### Interface Implementation
- Implement interfaces without creating separate classes
- Override methods inline
- Useful for one-time implementations

### Use Cases
- **Event Handling** - GUI event listeners
- **Callback Functions** - Functional programming
- **Thread Creation** - Runnable implementations
- **Comparators** - Custom sorting logic

## 🚀 Learning Objectives

### Understanding Anonymous Classes
- When to use anonymous classes
- Syntax and implementation
- Scope and variable access
- Memory implications

### Comparison with Lambda
- Anonymous classes vs lambda expressions
- Performance differences
- Code readability
- Functional interface requirements

## 💡 Best Practices

- Use for simple, one-time implementations
- Keep anonymous classes small and focused
- Consider lambda expressions for functional interfaces
- Be aware of memory leaks with outer class references

## 📝 Evolution to Modern Java

### Before Java 8
```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running");
    }
};
```

### Java 8+ with Lambda
```java
Runnable r = () -> System.out.println("Running");
```