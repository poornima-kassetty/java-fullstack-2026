# Java Full Stack - 90 Day Challenge



Tracking my daily progress learning Java + Spring Boot + React. Goal: Backend Developer by 2026.



**Author**: Poornima Kassetty  

**Started**: May 20,2026 

 *Stack*: Java 26, IntelliJ, Git



 ---



 ## How to Run Code



```bash

cd src/main/java

javac Day01_HelloWorld.java

java Day01_HelloWorld

```


### Daily Progress

**Day 1**: Hello World + Setup ✅

File: Day01_HelloWorld.java

**Concepts Learned:**

  -  Installed JDK 26 + IntelliJ

  - `public static void main(String [] args)` syntax

  - `System.out.println()` for output

  - Compile vs Run process



  **Code:**

  ```java

    public class Day01_HelloWorld {

     public static void main(String[] args)

      {

         System.out.println("Hello, World!");

     }

}

```


**Output:**
    
    Hello, World!

---
**Day02: Datatypes+Calculator**

**Files:**
   
   Day02_`variables.java`
   
Day02_`calculator.java`
**Concepts Learned:**

  -  **Data Types:** int, long, double, char, boolean

  - **Type Casting:** Narrowing conversion long → int causes data loss

  - **Scanner:** Taking user input with Scanner sc = new Scanner(System.in)

  - **Control Flow:** switch for operators, if-else for divide-by-zero

**Key Bug I Fixed:**
 
```java
   
 long a = 123456789088L;

int b = (int) a; // Output: -539003136, not 123456789088 
```

**Learning:**  Narrowing cast truncates data. Use long if number > int range.

**Calculator V2 Sample Run:**

```JAVASCRIPT

Enter first number: 20

Enter second number: 4

Enter operator (+, -, *, /): /

Result: 5.0
```

**Edge Case Handled:**

```javascript
Enter first number: 10

Enter second number: 0

Enter operator (+, -, *, /): /

Error: Cannot divide by zero
```

**Git Workflow Learned**

- git add . → Stage files
- git commit -m "Day 2: calculator V2" → Save snapshot
- git push → Upload to GitHub
- Incremental commits > one big dump

**Next: Day 3**
