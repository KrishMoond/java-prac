# Conditional Statements

Decision-making constructs and type casting operations in Java.

## 📋 Program List

### Conditional Logic
- **Condition.java** - Basic conditional statements and logic
- **TypeeeCast.java** - Type casting examples and demonstrations
- **TypecastNar.java** - Narrowing type cast operations

## 🎯 Concepts Covered

### Conditional Statements
```java
// If-else statement
if (condition) {
    // True block
} else {
    // False block
}

// Switch statement
switch (variable) {
    case value1:
        // Code block
        break;
    case value2:
        // Code block
        break;
    default:
        // Default block
}
```

### Type Casting
```java
// Widening (Implicit)
int num = 10;
double d = num;  // Automatic conversion

// Narrowing (Explicit)
double d = 10.5;
int num = (int) d;  // Manual conversion
```

## 🚀 Learning Objectives

### Decision Making
- Master if-else constructs
- Understand switch-case logic
- Learn nested conditionals
- Practice logical operators

### Type Conversion
- Understand implicit casting
- Learn explicit casting
- Handle data type conversions
- Avoid casting errors

## 💡 Key Skills

- **Logical Thinking** - Boolean logic and conditions
- **Data Handling** - Type safety and conversions
- **Control Flow** - Program execution paths
- **Error Prevention** - Safe type casting practices

## ⚠️ Important Notes

- **Widening casting** is automatic (smaller to larger type)
- **Narrowing casting** requires explicit conversion
- **Data loss** may occur in narrowing conversions
- **Conditional logic** controls program flow