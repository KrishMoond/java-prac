# File Handling Programs

File I/O operations, reading, writing, and manipulating files in Java.

## 📋 Program List

### Basic File Operations
- **FF.java** - Basic file operations (read/write)
- **Studd.java** - Student data file handling
- **StudentDriver.class** - Driver class for student operations

### File Resources
- **file.txt** - Sample text file for operations
- **Stud.txt** - Student data file

## 🎯 File Operations Covered

### File Reading
```java
// Reading from file
FileReader fr = new FileReader("file.txt");
BufferedReader br = new BufferedReader(fr);
String line = br.readLine();
```

### File Writing
```java
// Writing to file
FileWriter fw = new FileWriter("output.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Hello World");
bw.close();
```

### File Classes Used
- **File** - File and directory operations
- **FileReader/FileWriter** - Character-based I/O
- **BufferedReader/BufferedWriter** - Buffered I/O
- **Scanner** - Easy file reading
- **PrintWriter** - Easy file writing

## 🚀 Learning Path

### Beginner Level
1. **FF.java** - Basic file read/write
2. **File class methods** - exists(), length(), delete()
3. **Simple text file operations**

### Intermediate Level
1. **Studd.java** - Object serialization to files
2. **Exception handling** - FileNotFoundException, IOException
3. **File path operations**

### Advanced Level
1. **Binary file operations**
2. **Random access files**
3. **NIO package usage**

## 💡 Key Concepts

### Exception Handling
- Always use try-catch for file operations
- Close resources in finally block
- Use try-with-resources for automatic cleanup

### Best Practices
- Check file existence before operations
- Handle different file encodings
- Use appropriate buffer sizes
- Validate file paths and permissions

## 📝 Common Use Cases

- **Data Persistence** - Save application data
- **Configuration Files** - Read/write settings
- **Log Files** - Application logging
- **Data Import/Export** - CSV, JSON file processing
- **Backup Operations** - File copying and archiving