# Number Programs

Mathematical algorithms and number-based programs for competitive programming and learning.

## 📋 Program Categories

### Special Number Validation
- **ArmstrongNumber.java** - Check if number equals sum of cubes of digits
- **NeonNumber.java** - Check if sum of digits of square equals original number
- **SpyNumber.java** - Check if sum of digits equals product of digits
- **StrongNumber.java** - Check if sum of factorial of digits equals number
- **SunnyNumber.java** - Check if N+1 is a perfect square

### Mathematical Calculations
- **Factorial.java** - Calculate factorial of a number
- **FibonacciSeries.java** - Generate Fibonacci sequence
- **GCD.java** - Find Greatest Common Divisor
- **SquareRoot.java** - Calculate square root
- **SumOfFactorial.java** - Sum of factorials of digits

### Prime Number Operations
- **PrimeNumbersInRange.java** - Find all prime numbers in given range

## 🎯 Algorithm Types

### Number Theory
```java
// Armstrong Number: 153 = 1³ + 5³ + 3³
int sum = 0;
while (temp > 0) {
    digit = temp % 10;
    sum += digit * digit * digit;
    temp /= 10;
}
```

### Mathematical Sequences
```java
// Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13...
int a = 0, b = 1, c;
for (int i = 2; i < n; i++) {
    c = a + b;
    a = b;
    b = c;
}
```

### Prime Algorithms
```java
// Prime Check
for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) return false;
}
return true;
```

## 🚀 Learning Path

### Beginner Level
1. **Factorial.java** - Basic recursion/iteration
2. **FibonacciSeries.java** - Sequence generation
3. **SquareRoot.java** - Mathematical operations

### Intermediate Level
1. **ArmstrongNumber.java** - Digit manipulation
2. **PrimeNumbersInRange.java** - Optimization techniques
3. **GCD.java** - Euclidean algorithm

### Advanced Level
1. **StrongNumber.java** - Complex calculations
2. **SpyNumber.java** - Multiple operations
3. **SumOfFactorial.java** - Combined algorithms

## 💡 Key Concepts

### Digit Manipulation
- Extract digits using modulo (%)
- Remove last digit using division (/)
- Count digits in a number
- Reverse number operations

### Mathematical Properties
- Perfect squares and cubes
- Factorial calculations
- Prime number properties
- GCD and LCM relationships

### Algorithm Optimization
- Loop optimization techniques
- Early termination conditions
- Mathematical shortcuts
- Efficient prime checking

## 📝 Learning Objectives

- Master digit manipulation techniques
- Understand mathematical algorithms
- Learn optimization strategies
- Implement number theory concepts
- Develop problem-solving skills for competitive programming