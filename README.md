# 🧠 Python & Java Comprehensive Fundamentals & OOP Cheat Sheet

A comprehensive, side-by-side guide to all programmatic fundamentals, Data Structures, and Object-Oriented Programming (OOP) in **Python 3.14+** and **Java 26**. This document is structured sequentially first covering Python fully, then Java fully.

---

# 🐍 PART 1: Python 3.14+ Fundamentals, Advanced Concepts & OOP

## 1.1 Program Structure & Entry Point
Python uses **indentation** (4 spaces) instead of curly braces `{}` to define code blocks. 

* **Comments**: `#` for single-line; triple quotes `"""` for docstrings/multi-line.
* **Entry Point**: The `main()` block structure is standard for execution logic.

```python
# This is a single-line comment

"""
This is a multi-line docstring
explaining the script.
"""

def main():
    print("Program started!")

if __name__ == "__main__":
    main()
```

---

## 1.2 Data Types & Type Casting
Python is dynamically typed but supports optional **Type Hints** for clarity and tool safety.

### Core Data Types
* **Numeric**: `int` (arbitrary precision), `float` (double-precision), `complex`.
* **Boolean**: `bool` (`True` or `False`).
* **Text**: `str` (Unicode character sequence).
* **Empty State**: `NoneType` (represented by `None`).

```python
# Variables (Dynamic typing with Type Hints)
age: int = 25
price: float = 19.99
is_valid: bool = True
name: str = "Developer"
result: None = None
```

### Type Casting (Conversion)
```python
x = int("10")       # String to Int -> 10
y = float("3.14")   # String to Float -> 3.14
s = str(100)        # Int to String -> "100"
b = bool(1)         # Int to Bool -> True (0 is False, non-zero is True)
```

---

## 1.3 Console Input & Output (Console I/O)
* **Input**: `input()` always returns a string; must cast for numerical operations.
* **Output**: `print()` accepts multiple arguments, with custom separator (`sep`) and line terminator (`end`). Uses **F-strings** for easy formatting.

```python
# Input
user_name = input("Enter name: ")
user_age = int(input("Enter age: ")) # cast immediately

# Output
print("Name:", user_name, "Age:", user_age, sep=" | ", end="\n")

# F-String Formatting
pi = 3.14159
print(f"PI to two decimals: {pi:.2f}")
```

---

## 1.4 Operators
### Arithmetic
```python
addition = 5 + 3        # 8
subtraction = 5 - 3     # 2
multiplication = 5 * 3  # 15
division = 5 / 2        # 2.5 (always float division)
floor_division = 5 // 2 # 2 (trims decimal, returns integer)
modulo = 5 % 2          # 1 (remainder)
exponent = 2 ** 3       # 8 (2 raised to power 3)
```

### Relational & Identity
```python
is_equal = (5 == 5)      # True
not_equal = (5 != 3)     # True
greater_than = (5 > 3)   # True
less_equal = (5 <= 5)    # True

# Identity check (compares memory addresses/IDs)
# == checks values; 'is' checks identity
list1 = [1, 2]
list2 = [1, 2]
print(list1 == list2)   # True (same values)
print(list1 is list2)   # False (different objects in memory)
```

### Logical & Membership
```python
and_op = True and False  # False
or_op = True or False    # True
not_op = not True        # False

# Membership
print(1 in list1)        # True
print(3 not in list1)    # True
```

### Bitwise
```python
bit_and = 5 & 3   # 1  (0101 & 0011 -> 0001)
bit_or = 5 | 3    # 7  (0101 | 0011 -> 0111)
bit_xor = 5 ^ 3   # 6  (0101 ^ 0011 -> 0110)
bit_not = ~5      # -6
left_shift = 1 << 2  # 4  (0001 -> 0100)
right_shift = 4 >> 1 # 2  (0100 -> 0010)
```

---

## 1.5 Conditionals (If-Else & Pattern Matching)
### If-Elif-Else & Ternary Operator
```python
# Standard If-Else
score = 85
if score >= 90:
    grade = "A"
elif score >= 80:
    grade = "B"
else:
    grade = "F"

# Ternary Conditional (Inline)
status = "Pass" if score >= 50 else "Fail"
```

### Structural Pattern Matching (`match-case` - Python 3.10+)
Matches values and supports conditional checks (guards) using `if`.
```python
def check_point(x: float, y: float):
    match (x, y):
        case (0, 0):
            return "Origin"
        case (x_val, 0):
            return f"X-axis at {x_val}"
        case (0, y_val):
            return f"Y-axis at {y_val}"
        case (x_val, y_val) if x_val > 0 and y_val > 0:
            return "First Quadrant"
        case _:
            return "Other"
```

---

## 1.6 Loops & Iteration
### For Loops & Range
`range(start, stop, step)` generates integers starting at `start` up to (but excluding) `stop`.
```python
# Loop 1 to 5
for i in range(1, 6):
    print(i)

# Loop backwards: 5 down to 1
for i in range(5, 0, -1):
    print(i)

# Loop with step 2: 0, 2, 4
for i in range(0, 6, 2):
    print(i)
```

### While Loops & Controls
```python
count = 0
while count < 5:
    count += 1
    if count == 2:
        continue  # skip rest of block, go to next iteration
    if count == 4:
        break     # terminate loop entirely
    print(count)
```
* **`pass` statement**: A null placeholder used where syntax requires a statement (e.g. empty loop or function).
* **`for-else` / `while-else`**: The `else` block executes only if the loop completes without hitting a `break`.

---

## 1.7 Functions & Variable Scope
Functions are declared using `def`. They can return multiple values as a tuple.

```python
# Typing parameters and return types
def divide(a: float, b: float) -> tuple[float, float]:
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a // b, a % b  # returns tuple

# Call and unpack
q, r = divide(10, 3)  # q = 3.0, r = 1.0

# Lambda Functions (Anonymous inline functions)
square = lambda x: x * x
print(square(5))  # 25
```

### 🧠 Scope: The LEGB Rule
Python resolves variable names using 4 nested scopes:
1. **L**ocal: Inside the current function.
2. **E**nclosing: In any outer enclosing functions (closures).
3. **G**lobal: At the top level of the module/file.
4. **B**uilt-in: Python's pre-loaded names (e.g., `print`, `int`, `len`).

```python
x = "global"

def outer():
    x = "enclosing"
    
    def inner():
        nonlocal x   # refers to outer's 'x' (enclosing scope)
        x = "modified enclosing"
        global x     # refers to global 'x'
        x = "modified global"
```

---

## 1.8 Advanced Python Fundamentals

### 1. Mutable vs Immutable Objects
* **Immutable**: `int`, `float`, `str`, `tuple`, `bool`, `frozenset`. (Modifying them creates a new object in memory).
* **Mutable**: `list`, `dict`, `set`. (Can be modified in-place).
* **Interview Classic**: Python passes variables by **Reference-to-Object** (Pass-by-assignment). If you pass a mutable object (like a list) to a function and modify it inside, those changes will reflect outside!

### 2. Generators (`yield`)
Generators produce values on-the-fly using `yield`, preserving memory instead of storing entire lists in RAM.
```python
def fibonacci(limit: int):
    a, b = 0, 1
    for _ in range(limit):
        yield a
        a, b = b, a + b

# Usage:
for num in fibonacci(5):
    print(num) # prints 0, 1, 1, 2, 3
```

### 3. Decorators
A decorator is a function that takes another function as an argument, extends its behavior without modifying it directly, and returns a new function.
```python
def my_decorator(func):
    def wrapper(*args, **kwargs):
        print("Before function execution.")
        result = func(*args, **kwargs)
        print("After function execution.")
        return result
    return wrapper

@my_decorator
def greet(name):
    print(f"Hello, {name}!")

# Calling greet("Alice") will execute the wrapper code first!
```

---

## 1.9 Strings
Strings in Python are **immutable** arrays of Unicode characters.

```python
text = "Logic Building"

# Indexing & Slicing [start:stop:step]
first_char = text[0]         # 'L'
last_char = text[-1]         # 'g'
substring = text[0:5]        # "Logic" (indices 0 to 4)
reversed_text = text[::-1]   # "gnidliub cigoL"

# Core String Methods
length = len(text)           # 14
lower_case = text.lower()    # "logic building"
upper_case = text.upper()    # "LOGIC BUILDING"
words = text.split(" ")      # ["Logic", "Building"]
joined = "-".join(words)     # "Logic-Building"
clean = "  hello  ".strip()  # "hello"
has_substr = "Logic" in text # True
```

---

## 1.10 Python Data Structures & Core Operations

### 1. Lists (Dynamic Arrays)
Lists can grow dynamically. Operations are highly optimized.
```python
arr = [10, 20, 30]
arr.append(40)          # O(1) - [10, 20, 30, 40]
arr.insert(1, 15)       # O(N) - [10, 15, 20, 30, 40]
arr.pop()               # O(1) - Removes last element (40)
arr.pop(0)              # O(N) - Removes index 0 (10)
arr.remove(20)          # O(N) - Removes first occurrence of 20
arr.sort()              # O(N log N) - In-place sorting
length = len(arr)       # O(1)
```

### 2. Sets (Hash-based Unique Collections)
Excellent for fast membership testing ($O(1)$) and removing duplicates.
```python
s = {1, 2, 3, 3}        # {1, 2, 3} (duplicates automatically removed)
s.add(4)                # O(1)
s.remove(2)             # O(1)
print(3 in s)           # O(1) - True

# Set Math
s1 = {1, 2, 3}
s2 = {3, 4, 5}
union = s1 | s2         # {1, 2, 3, 4, 5}
intersect = s1 & s2     # {3}
diff = s1 - s2          # {1, 2}
```

### 3. Dictionaries (Hash Maps)
Key-value stores. Keys must be immutable types (strings, numbers, tuples).
```python
d = {"a": 1, "b": 2}
d["c"] = 3              # O(1) - Insert
val = d.get("a")        # O(1) - Get (Returns None if key doesn't exist)
del d["b"]              # O(1) - Delete key
print("a" in d)         # O(1) - Check key existence
```

### 4. Stacks & Queues (Double-Ended Queues)
```python
from collections import deque

# --- STACK (LIFO) ---
stack = []
stack.append(1)         # Push O(1)
top = stack[-1]         # Peek O(1) -> 1
item = stack.pop()      # Pop O(1) -> 1

# --- QUEUE (FIFO) ---
queue = deque()
queue.append(1)         # Enqueue O(1)
item = queue.popleft()  # Dequeue O(1) -> 1
```

### 5. Heaps (Priority Queues)
The `heapq` module implements a binary **Min-Heap** on top of a standard list.
```python
import heapq
heap = []
heapq.heappush(heap, 10)  # O(log N)
heapq.heappush(heap, 5)
smallest = heap[0]        # O(1) - Peek -> 5
val = heapq.heappop(heap) # O(log N) -> 5
```

---

## 1.11 Object-Oriented Programming (OOP) in Python

### 1. Classes & Objects
```python
class Animal:
    # Class-level Attribute (Shared across all instances)
    species = "Mammal"

    # Constructor
    def __init__(self, name: str, age: int):
        self.name = name       # Instance Attribute
        self.age = age         # Instance Attribute

    # Instance Method
    def make_sound(self) -> str:
        return "Generic Sound"
```

### 2. Encapsulation (Private Variables & Properties)
In Python, private variables are prefixed with a double underscore `__` (which triggers *name mangling* internally). We use `@property` for getters and setters.
```python
class BankAccount:
    def __init__(self, owner: str, balance: float):
        self.owner = owner
        self.__balance = balance  # Private Attribute (cannot access directly as account.__balance)

    # Getter
    @property
    public_balance(self):
        return self.__balance

    # Setter
    @public_balance.setter
    def public_balance(self, amount: float):
        if amount >= 0:
            self.__balance = amount
        else:
            raise ValueError("Balance cannot be negative")
```

### 3. Inheritance & `super()`
```python
class Dog(Animal):
    def __init__(self, name: str, age: int, breed: str):
        super().__init__(name, age) # Call parent class constructor
        self.breed = breed

    # Method Overriding (Runtime Polymorphism)
    def make_sound(self) -> str:
        return "Woof!"
```

### 4. Multiple Inheritance & MRO (Method Resolution Order)
Python supports multiple inheritance. Name clashes are resolved using the **C3 Linearization** algorithm. The sequence of resolution is called **MRO**.
```python
class A:
    def greet(self): return "A"

class B(A):
    def greet(self): return "B"

class C(A):
    def greet(self): return "C"

class D(B, C):
    pass

# MRO check: D -> B -> C -> A -> object
print(D.mro())
print(D().greet()) # Returns "B"
```

### 5. Abstraction (`abc` module)
Abstraction enforces that subclass templates implement base structures.
```python
from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def start_engine(self):
        pass

class Car(Vehicle):
    def start_engine(self):
        return "Car engine started."
```

### 6. Magic (Dunder) Methods
Dunder methods (Double Under) allow custom classes to hook into built-in operators and syntax.
```python
class Book:
    def __init__(self, title: str, pages: int):
        self.title = title
        self.pages = pages

    # String representation (read by print() or str())
    def __str__(self):
        return f"'{self.title}' ({self.pages} pages)"

    # Equality check (read by == operator)
    def __eq__(self, other):
        if not isinstance(other, Book):
            return False
        return self.title == other.title and self.pages == other.pages

    # Length hook (read by len() function)
    def __len__(self):
        return self.pages
```

---
---

# ☕ PART 2: Java 26 Fundamentals, Advanced Concepts & OOP

## 2.1 Program Structure & Entry Point
Java is strongly-typed and object-oriented. Every program must belong to a **Class**. The class name must match the filename exactly.

* **Comments**: `//` for single-line; `/* */` for multi-line; `/** */` for Javadoc.
* **Entry Point**: The program starts inside the `main` method.

```java
// Single-line comment

/*
 * Multi-line comment
 */

import java.util.Scanner;

public class MainProgram {
    // Execution entry point
    public static void main(String[] args) {
        System.out.println("Program started!");
    }
}
```

---

## 2.2 Data Types & Type Casting
Java has two types of variables: **Primitives** (stored on stack) and **References** (stored on heap, pointing to objects).

### Core Data Types
* **Primitives**:
  - Integer types: `byte` (8-bit), `short` (16-bit), `int` (32-bit), `long` (64-bit, suffix `L`).
  - Floating point: `float` (32-bit, suffix `f`), `double` (64-bit).
  - Logic: `boolean` (`true` or `false`).
  - Characters: `char` (16-bit Unicode character, single quotes `'a'`).
* **Reference Types**: `String`, Arrays, custom Classes.
* **Local Type Inference (`var`)**: Allows the compiler to infer type based on initialization.

```java
int age = 25;
long population = 8000000000L;
double price = 19.99;
float temp = 98.6f;
boolean isValid = true;
char letter = 'A';
String name = "Developer";

// Local variable type inference
var score = 95.5; // Inferred as double
```

### Type Casting (Conversion)
```java
// Widening (Implicit) - smaller type to larger
int valInt = 100;
double valDouble = valInt; // 100.0

// Narrowing (Explicit) - larger type to smaller
double pi = 3.14;
int roundedPi = (int) pi; // 3 (decimals truncated)

// String Conversions
int parsedInt = Integer.parseInt("10");
double parsedDouble = Double.parseDouble("3.14");
String intStr = String.valueOf(100);
```

---

## 2.3 Console Input & Output (Console I/O)
* **Input**: Done via the `Scanner` class from the `java.util` package.
* **Output**: `System.out.print()` (no newline), `System.out.println()` (with newline), and `System.out.printf()` (formatted print).

```java
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter name: ");
        String name = scanner.nextLine(); // reads whole line
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // reads integer

        // Output
        System.out.println("Name: " + name + " | Age: " + age);

        // Formatted Output
        double pi = 3.14159;
        System.out.printf("PI to two decimals: %.2f\n", pi);

        scanner.close(); // always close resources
    }
}
```

---

## 2.4 Operators
### Arithmetic
```java
int add = 5 + 3;         // 8
int sub = 5 - 3;         // 2
int mul = 5 * 3;         // 15
int intDiv = 5 / 2;      // 2 (integer division truncates decimal)
double floatDiv = 5.0 / 2; // 2.5 (at least one operand must be double)
int mod = 5 % 2;         // 1 (remainder)
```

### Relational
```java
boolean isEqual = (5 == 5);      // true
boolean notEqual = (5 != 3);     // true
boolean greaterThan = (5 > 3);   // true
boolean lessEqual = (5 <= 5);    // true
```

### Logical
```java
boolean andOp = true && false;   // false (short-circuit AND)
boolean orOp = true || false;    // true  (short-circuit OR)
boolean notOp = !true;           // false
```

### Bitwise
```java
int bitAnd = 5 & 3;   // 1  (0101 & 0011 -> 0001)
int bitOr = 5 | 3;    // 7  (0101 | 0011 -> 0111)
int bitXor = 5 ^ 3;   // 6  (0101 ^ 0011 -> 0110)
int bitNot = ~5;      // -6
int leftShift = 1 << 2;  // 4 (0001 -> 0100)
int rightShift = 4 >> 1; // 2 (0100 -> 0010)
int unsignedRightShift = -4 >>> 1; // logical right shift (inserts 0)
```

---

## 2.5 Conditionals (If-Else & Switch Expressions)
### If-Else & Ternary Operator
```java
int score = 85;
String grade;

// Standard If-Else
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else {
    grade = "F";
}

// Ternary Operator
String status = (score >= 50) ? "Pass" : "Fail";
```

### Switch Expressions (Modern Java arrow syntax)
Unlike old switch statements, Switch Expressions can return values directly, require complete (exhaustive) branches, and do not need `break` statements.
```java
int day = 3;
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4, 5 -> "Weekday"; // group values
    default -> "Invalid Day";
};
```

### Pattern Matching for Switch (with `when` guards)
```java
public static String checkValueType(Object obj) {
    return switch (obj) {
        case Integer i -> "Integer: " + i;
        case String s when s.length() > 5 -> "Long String: " + s;
        case String s -> "Short String: " + s;
        default -> "Unknown Type";
    };
}
```

---

## 2.6 Loops & Iteration
### For Loops
```java
// Standard loop: 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// Loop backwards: 5 down to 1
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
```

### While & Do-While Loops
```java
int count = 0;
while (count < 5) {
    count++;
    if (count == 2) continue; // skip current iteration
    if (count == 4) break;    // exit loop
    System.out.println(count);
}

// Do-While (guarantees block runs at least once)
int value = 10;
do {
    System.out.println("Runs once even if condition is false");
} while (value < 5);
```

### Labeled Break & Continue (Nested Loop Control)
Java supports labels to control outer loops from inside inner loops.
```java
outerLoop:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
            break outerLoop; // breaks the outer loop execution
        }
    }
}
```

---

## 2.7 Methods & Memory Management
In Java, you must specify the visibility scope (`public`, `private`), static/instance type, return type, and parameters.

```java
public class MethodExample {
    // Definition: static method belonging to the class
    public static int sum(int a, int b) {
        return a + b;
    }
}
```

### 🧠 Java Memory: Stack vs Heap
* **Stack**: Stores primitive values and references (memory addresses of objects). It has local scope lifetime; variables are cleared automatically when a method finishes.
* **Heap**: Stores all object instances and arrays. Managed by the JVM's Garbage Collector.
* **Interview Classic**: Java is strictly **Pass-by-Value**.
  - When passing primitive variables, the value is copied (no effect outside).
  - When passing object references, the *address* (value of the reference variable) is copied. This means modifying the fields of the object inside the method changes the object outside! However, reassignment of the reference variable itself inside the method has no effect outside.

---

## 2.8 Key Modifiers & Keywords
### Access Modifiers
| Modifier | Same Class | Same Package | Subclass (Any Package) | World (Everywhere) |
| :--- | :---: | :---: | :---: | :---: |
| `private` | Yes | No | No | No |
| *default* (no modifier) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

### Keywords
* **`static`**: Binds attributes/methods to the class, not instance.
* **`final`**:
  - Variable: Constant value (cannot reassign).
  - Method: Cannot override.
  - Class: Cannot inherit (e.g. `String` is a final class).
* **`abstract`**: Applied to classes or methods to enforce abstraction templates.

---

## 2.9 Strings & String Pool
Strings are **immutable** reference objects in Java.

### The String Pool
Java optimizes memory using the **String Pool** inside the Heap.
```java
String s1 = "Hello"; // Created in String Pool
String s2 = "Hello"; // Reuses s1 reference from pool
String s3 = new String("Hello"); // Bypasses pool, creates new object on heap

System.out.println(s1 == s2); // true (same reference address)
System.out.println(s1 == s3); // false (different addresses on heap)
System.out.println(s1.equals(s3)); // true (compares values, not addresses!)
```

### String vs StringBuilder vs StringBuffer
* **`String`**: Immutable. Modifying strings in loops creates garbage objects.
* **`StringBuilder`**: Mutable, highly performant, **non-thread-safe** (use for single-thread logic).
* **`StringBuffer`**: Mutable, thread-safe (synchronized), slower.

---

## 2.10 Java Data Structures & Core Operations

### 1. Static Arrays
```java
int[] nums = new int[5];
nums[0] = 10;            // Access/Write is O(1)
int size = nums.length;   // O(1) - Length property
```

### 2. Lists & Dynamic Arrays (ArrayList & LinkedList)
```java
import java.util.ArrayList;
import java.util.List;

List<Integer> list = new ArrayList<>();
list.add(10);                           // O(1) amortized
list.add(0, 5);                         // O(N) - Insert -> [5, 10]
int val = list.get(1);                  // O(1) - Random access -> 10

// Sequenced Collections (Java 21+)
int first = list.getFirst();            // O(1)
int last = list.getLast();              // O(1)
List<Integer> rev = list.reversed();    // O(1) - Reversed view
```

### 3. Sets (HashSet & TreeSet)
```java
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

Set<Integer> set = new HashSet<>();
set.add(10);                            // O(1) - Insert
boolean hasElement = set.contains(5);   // O(1) - Search -> false

Set<Integer> sortedSet = new TreeSet<>(); // sorted elements under O(log N) operations
```

### 4. Maps (HashMap & TreeMap)
```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> map = new HashMap<>();
map.put("Apple", 5);                    // O(1) - Insert
int val = map.getOrDefault("Apple", 0); // O(1) - Get safely
boolean hasKey = map.containsKey("Banana"); // O(1) -> false
```

### 5. Stacks & Queues (ArrayDeque)
```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// --- STACK (LIFO) ---
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);                         // O(1)
int top = stack.peek();                 // O(1) -> 10
int popped = stack.pop();               // O(1) -> 10

// --- QUEUE (FIFO) ---
Queue<Integer> queue = new LinkedList<>();
queue.offer(10);                        // O(1) - Enqueue
int dequeued = queue.poll();            // O(1) - Dequeue -> 10
```

### 6. Heaps (PriorityQueues)
```java
import java.util.Comparator;
import java.util.PriorityQueue;

// Min-Heap (Default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(15);                      // O(log N)
int smallest = minHeap.poll();          // O(log N) -> 15

// Max-Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
```

---

## 2.11 Object-Oriented Programming (OOP) in Java

### 1. Classes & Objects
```java
public class Animal {
    // Class-level Attribute (Static)
    public static String kingdom = "Animalia";

    // Instance Fields (Encapsulated)
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name; // 'this' resolves naming conflict with local parameters
        this.age = age;
    }

    public String makeSound() {
        return "Generic Sound";
    }
}
```

### 2. Encapsulation (Accessors & Mutators)
Encapsulation is achieved by setting fields to `private` and exposing public getter/setter methods.
```java
public class BankAccount {
    private double balance; // Private Field

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter (Access)
    public double getBalance() {
        return this.balance;
    }

    // Setter (Write control with validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
    }
}
```

### 3. Inheritance (`extends` & `super`)
Java supports **single inheritance** only.
```java
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Calls parent class constructor (must be the first line!)
        this.breed = breed;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public String makeSound() {
        return "Woof!";
    }
}
```

### 4. Polymorphism
* **Runtime Polymorphism (Method Overriding)**: Achieved when a subclass defines a method already present in the superclass.
* **Compile-time Polymorphism (Method Overloading)**: Achieved when methods within the same class have the same name but different argument signatures.
```java
public class Calculator {
    // Compile-time overloading
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
}
```

### 5. Abstraction (Abstract Classes vs. Interfaces)
* **Abstract Class**: Can store state (instance fields) and have constructors. Subclasses inherit fields.
* **Interface**: Defines behaviors. Can only contain static constants (no instance fields). Supports **multiple inheritance** of interfaces.

```java
// Abstract Class
abstract class Vehicle {
    protected int speed;
    public abstract void accelerate();
}

// Interface
interface GPS {
    void trackLocation(); // abstract method by default
    
    // Default method (added in Java 8+ to support extensions without breaking subclasses)
    default void startGPS() {
        System.out.println("GPS online.");
    }
}

// Implementing multiple interfaces
class SmartCar extends Vehicle implements GPS {
    @Override
    public void accelerate() { speed += 10; }
    
    @Override
    public void trackLocation() { System.out.println("Tracking..."); }
}
```

### 6. Records (Modern Immutable Data Carriers)
Java records are special classes designed to hold immutable data. The compiler automatically generates constructors, getters (`name()`, `age()`), `toString()`, `equals()`, and `hashCode()` methods behind the scenes!
```java
// Declaration is a single line!
public record User(String name, int age) {}

// Usage:
// User user = new User("Alice", 30);
// System.out.println(user.name()); // "Alice"
// System.out.println(user); // prints User[name=Alice, age=30]
```

### 7. Contract of `equals()` and `hashCode()`
* If two objects are equal according to the `equals(Object)` method, calling `hashCode()` on them must yield the **same integer result**.
* If you override `equals()`, you **must** override `hashCode()` to maintain this contract. Failing to do so breaks collections like `HashMap` and `HashSet`, which will fail to look up stored objects!
