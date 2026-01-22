# Contributing to Java Practice Repository

🎉 **Thank you for considering contributing to this project!** 🎉

## 🚀 How to Contribute

### 🐛 Reporting Bugs
- Use the [GitHub Issues](https://github.com/your-username/java-practice/issues) page
- Describe the bug clearly with steps to reproduce
- Include Java version and operating system details

### 💡 Suggesting Enhancements
- Open an issue with the "enhancement" label
- Describe your idea and its benefits
- Provide examples if possible

### 📝 Adding New Programs
1. **Choose appropriate folder** based on the topic
2. **Follow naming conventions**: `PascalCase.java`
3. **Add clear comments** explaining the logic
4. **Include example usage** in main method
5. **Update folder README** if adding new concepts

### 🔧 Code Style Guidelines

#### Java Code Standards
```java
// ✅ Good: Clear class and method names
public class EmployeeManager {
    private List<Employee> employees;
    
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}

// ❌ Avoid: Unclear names
public class EM {
    private List<Employee> e;
    
    public void add(Employee emp) {
        e.add(emp);
    }
}
```

#### Documentation Standards
- **Class-level comments** for complex programs
- **Method comments** for non-obvious functionality
- **Inline comments** for tricky logic
- **README updates** for new folders or major additions

### 📁 Folder Structure
When adding new programs:
- Place in appropriate existing folder
- Create new folder only for major new topics
- Include README.md for new folders
- Follow existing naming patterns

### 🧪 Testing Your Code
Before submitting:
- ✅ Code compiles without errors
- ✅ Program runs and produces expected output
- ✅ No hardcoded file paths or system-specific code
- ✅ Follows existing code style

### 📋 Pull Request Process
1. **Fork** the repository
2. **Create** a feature branch: `git checkout -b feature/new-program`
3. **Make** your changes
4. **Test** thoroughly
5. **Commit** with clear messages: `git commit -m "Add bubble sort algorithm"`
6. **Push** to your fork: `git push origin feature/new-program`
7. **Create** a Pull Request

### 📝 Pull Request Template
```markdown
## Description
Brief description of changes

## Type of Change
- [ ] Bug fix
- [ ] New program/feature
- [ ] Documentation update
- [ ] Code refactoring

## Testing
- [ ] Code compiles successfully
- [ ] Program runs without errors
- [ ] Added appropriate comments

## Checklist
- [ ] Follows existing code style
- [ ] Updated README if necessary
- [ ] No breaking changes
```

## 🏆 Recognition
Contributors will be acknowledged in:
- Repository contributors list
- Special mentions in release notes
- Hall of fame section (coming soon!)

## 📞 Questions?
- Open a [Discussion](https://github.com/your-username/java-practice/discussions)
- Create an [Issue](https://github.com/your-username/java-practice/issues)
- Contact maintainers directly

---

**Thank you for helping make this repository better! 🙏**