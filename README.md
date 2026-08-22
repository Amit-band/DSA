# Java DSA for Beginners

A beginner-friendly repository for learning, implementing, and practicing **Data Structures and Algorithms (DSA) from scratch using Java**.

This repository contains my implementations and practice programs as I progress through Java and DSA. The focus is on understanding the underlying logic, writing readable code, and building a strong foundation for problem solving.

---

## 📂 Repository Structure

The project is maintained as a Java project using **Eclipse**, with all source code organized under `src/`.

```text
DSA/
├── src/
│   ├── linkedList/
│   │   ├── LinkedList.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── doublyLinkedList/
│   │   ├── DoublyLinkedList.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── doublyendedqueue/
│   │   ├── DoublyEndedQueue.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── stack/
│   │   ├── Stack.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── queue/
│   │   ├── Queue.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── hashmap/
│   │   ├── HashMap.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   ├── hashmapGenerics/
│   │   ├── HashMap.java
│   │   ├── Node.java
│   │   └── ProgramDriver.java
│   │
│   └── module-info.java
│
├── .classpath
├── .project
├── .gitignore
└── README.md
```

Each package contains the implementation of a particular data structure along with supporting `Node` classes and `ProgramDriver` classes used for testing and experimentation.

---

## ✨ Features

* **Beginner-Friendly:** Implementations focus on understanding the core logic rather than relying on advanced Java shortcuts.
* **From Scratch:** Data structures are implemented manually to understand how they work internally.
* **Generic Implementations:** Includes experiments with Java Generics, such as a generic `HashMap<T, P>`.
* **Hands-On Practice:** Each data structure includes driver programs for testing different operations and edge cases.
* **Readable Code:** Code is organized into separate packages according to the data structure being implemented.
* **No External Dependencies:** The implementations use standard Java features and do not require external libraries.

---

## 🛠️ Tech Stack

| Component       | Technology |
| --------------- | ---------- |
| Language        | Java       |
| JDK             | JDK 8+     |
| IDE             | Eclipse    |
| Version Control | Git        |
| Repository      | GitHub     |

---

## 🚀 Getting Started

### Prerequisites

Make sure the **Java Development Kit (JDK)** is installed.

Verify your installation:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone https://github.com/Amit-band/DSA.git
```

Navigate into the project:

```bash
cd DSA
```

### Open in Eclipse

1. Open Eclipse.
2. Select **File → Import**.
3. Choose **Existing Projects into Workspace**.
4. Select the cloned `DSA` directory.
5. Import the project.

The source code is located inside:

```text
src/
```

---

## 🧪 Running the Programs

Each package contains a `ProgramDriver.java` file that can be used to test the corresponding data structure.

For example:

```text
src/
└── linkedList/
    ├── LinkedList.java
    ├── Node.java
    └── ProgramDriver.java
```

Run `ProgramDriver.java` from Eclipse to experiment with the implementation.

---

## 📚 Current Implementations

### Linear Data Structures

* [x] Singly Linked List
* [x] Doubly Linked List
* [x] Doubly Ended Queue
* [x] Stack
* [x] Queue

### Hash-Based Data Structures

* [x] Basic HashMap implementation
* [x] Generic HashMap implementation
* [x] Hashing using `hashCode()`
* [x] Bucket indexing
* [x] Collision handling using Linked Lists
* [x] Key comparison using `equals()`

### Upcoming

* [ ] Binary Search Tree
* [ ] Tree Traversals
* [ ] AVL Tree
* [ ] Graphs
* [ ] BFS
* [ ] DFS
* [ ] Searching Algorithms
* [ ] Sorting Algorithms
* [ ] Time & Space Complexity
* [ ] More DSA problem-solving practice

---

## 🧠 What I'm Learning

This repository is not intended to be just a collection of finished implementations. It documents my progression in understanding how data structures work internally.

Some of the concepts being explored include:

* Nodes and references
* Linked-list traversal
* Insertion and deletion
* Generics
* Hashing
* `hashCode()` and `equals()`
* Collision handling
* Stack and Queue operations
* Time and Space Complexity
* Problem-solving and algorithmic thinking

---

## 🔄 Git Workflow

This project is maintained directly from Eclipse using Git.

After making changes:

```bash
git status
git add .
git commit -m "Describe what was practiced"
git push
```

Example:

```bash
git add .
git commit -m "Implement generic HashMap"
git push
```

---

## 🗺️ Roadmap

The repository will continue to grow as I progress through Java and DSA.

```text
Java Fundamentals
       ↓
Arrays & Strings
       ↓
Linked Lists
       ↓
Stack & Queue
       ↓
Hashing
       ↓
Searching & Sorting
       ↓
Trees
       ↓
Graphs
       ↓
Advanced DSA
       ↓
Problem Solving
```

The goal is to build a strong understanding of DSA concepts through **implementation + experimentation + problem solving**, rather than simply memorizing algorithms.

---

## 🤝 Contributing

This repository primarily documents my personal Java and DSA learning journey.

Suggestions, corrections, and improvements are welcome.

If you would like to contribute:

1. Fork the repository.
2. Create a feature branch:

```bash
git checkout -b feature/AmazingDataStructure
```

3. Commit your changes:

```bash
git commit -m "Add Binary Search Tree implementation"
```

4. Push the branch:

```bash
git push origin feature/AmazingDataStructure
```

5. Open a Pull Request.

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---

## 📬 Contact

**Project Maintainer:** Amit

**Email:** [bandamit687@gmail.com](mailto:bandamit687@gmail.com)

**GitHub:** https://github.com/Amit-band

**Repository:** https://github.com/Amit-band/DSA

---

## 📚 Resources

This repository is primarily based on hands-on practice and implementation. Additional learning resources include:

* Java documentation and standard library references
* DSA tutorials and algorithm visualizations
* Competitive programming and problem-solving platforms
* Git and GitHub documentation
* Java programming courses and educational resources

---

> **Learn the concept. Implement it from scratch. Break it. Fix it. Understand it.**
