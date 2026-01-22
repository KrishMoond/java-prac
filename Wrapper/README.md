# Wrapper Classes

Wrapper classes, autoboxing, unboxing, and collections with primitive types.

## 📋 Program List

### Wrapper Class Operations
- **AutoBoxing.java** - Autoboxing and unboxing examples
- **ArL.java** - ArrayList with wrapper classes
- **Arr.java** - Array operations with wrappers
- **Linked.java** - LinkedList with wrapper types
- **Collec.java** - Collection operations
- **Studd.java** - Student class with wrapper usage

## 🎯 Key Concepts

### Wrapper Classes
```java
// Primitive to Wrapper (Boxing)
Integer num = Integer.valueOf(10);
Double price = Double.valueOf(99.99);

// Wrapper to Primitive (Unboxing)
int value = num.intValue();
double cost = price.doubleValue();
```

### Autoboxing/Unboxing
```java
// Automatic boxing
Integer num = 10;  // int to Integer
ArrayList<Integer> list = new ArrayList<>();
list.add(20);      // int to Integer

// Automatic unboxing
int value = num;   // Integer to int
int sum = list.get(0) + 5;  // Integer to int
```

### Wrapper Class Types
- **Integer** - int wrapper
- **Double** - double wrapper
- **Boolean** - boolean wrapper
- **Character** - char wrapper
- **Long** - long wrapper
- **Float** - float wrapper
- **Byte** - byte wrapper
- **Short** - short wrapper

## 🚀 Learning Path

### Beginner Level
1. **AutoBoxing.java** - Basic boxing/unboxing
2. **Wrapper class methods** - valueOf(), intValue()
3. **Collections with primitives**

### Intermediate Level
1. **ArL.java** - ArrayList operations
2. **Performance considerations** - Boxing overhead
3. **Null handling** - NullPointerException risks

### Advanced Level
1. **Memory optimization** - Object pooling
2. **Generic collections** - Type safety
3. **Stream operations** - Functional programming

## 💡 Benefits of Wrapper Classes

### Collection Compatibility
- Collections only work with objects
- Generics require reference types
- Type safety in collections

### Utility Methods
- Parsing: `Integer.parseInt()`
- Comparison: `Integer.compare()`
- Constants: `Integer.MAX_VALUE`

### Null Values
- Primitives cannot be null
- Wrappers can represent null values
- Useful for optional data

## 📝 Performance Considerations

### Memory Usage
- Wrapper objects consume more memory
- Object creation overhead
- Garbage collection impact

### Best Practices
- Use primitives for performance-critical code
- Use wrappers for collections and generics
- Be aware of autoboxing in loops
- Handle null values properly

## ⚠️ Common Pitfalls

### NullPointerException
```java
Integer num = null;
int value = num;  // NPE during unboxing
```

### Reference Comparison
```java
Integer a = 128;
Integer b = 128;
System.out.println(a == b);  // false (different objects)
System.out.println(a.equals(b));  // true (value comparison)
```