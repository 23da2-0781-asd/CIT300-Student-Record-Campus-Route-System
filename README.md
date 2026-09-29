# University Student Record and Campus Route Management System

### Module
CIT300 – Data Structures and Algorithms

---

# Project Description

The University Student Record and Campus Route Management System is a Java console application developed to demonstrate the implementation of various data structures.

The system allows users to manage student records, track activities, process service requests, and represent campus locations using different data structures.

---

# Objectives

- Manage student records efficiently.
- Demonstrate the use of Linked Lists.
- Track recent actions using Stack.
- Process service requests using Queue.
- Store and display students using Binary Search Tree (BST).
- Search students efficiently using Hash Table.
- Represent campus locations and routes using Graphs.

---

# Data Structures Used

## 1. Linked List

Used to store student records.

Operations:
- Add Student
- Search Student
- Delete Student
- Display Students

Files:
- StudentNode.java
- StudentLinkedList.java

---

## 2. Stack

Used to keep track of recent actions performed in the system.

Examples:
- Student Added
- Student Deleted

File:
- Stack.java

---

## 3. Queue

Used to manage student service requests.

Examples:
- Transcript Request
- ID Card Request

File:
- Queue.java

---

## 4. Binary Search Tree (BST)

Used to store student records based on Student ID in a sorted structure.

Operations:
- Insert Student
- In-order Traversal

File:
- BST.java

---

## 5. Hash Table

Used for fast searching of student records using Student ID.

Operations:
- Insert Student
- Search Student

File:
- HashTable.java

---

## 6. Graph

Used to represent campus locations and connections.

Examples:
- Library
- Laboratory
- Cafeteria
- Administration Building

Operations:
- Add Location
- Add Connection
- Breadth First Search (BFS)

File:
- Graph.java

---

# Project Structure

```text
CIT300_Assignment/
|
|── src/
|   |── Main.java
|   |── Student.java
|   |── StudentNode.java
|   |── StudentLinkedList.java
|   |── Stack.java
|   |── Queue.java
|   |── BST.java
|   |── HashTable.java
|   |── Graph.java
|   |── ServiceRequest.java
|
|── README.md
|── .gitignore
```

# Class Description

## Student.java

Stores student information:

- Student ID
- Student Name
- Programme
- Marks

---

## StudentNode.java

Represents a node in the Linked List.

Contains:
- Student object
- Reference to next node

---

## StudentLinkedList.java

Manages all student records using a Linked List.

Methods:
- addStudent()
- displayStudents()
- searchStudent()
- deleteStudent()

---

## Stack.java

Stores recent user actions.

Methods:
- push()
- display()

---

## ServiceRequest.java

Represents a service request submitted by a student.

---

## Queue.java

Manages service requests using FIFO (First In First Out) principle.

Methods:
- addRequest()
- processRequest()

---

## BST.java

Implements Binary Search Tree operations.

Methods:
- add()
- display()

---

## HashTable.java

Implements HashMap for fast searching.

Methods:
- insert()
- search()

---

## Graph.java

Represents campus routes using adjacency lists.

Methods:
- addLocation()
- addConnection()
- displayGraph()
- bfs()

---

## Main.java

Main controller class of the application.

Provides a menu-driven interface for users.

---

# Features

✅ Add Student

✅ Display Students

✅ Search Student

✅ Delete Student

✅ View Recent Actions

✅ BST Traversal

✅ Service Request Processing

✅ Graph Representation

✅ Breadth First Search (BFS)

---

# Sample Output

```text
=== STUDENT MANAGEMENT SYSTEM ===

1. Add Student
2. Display Students
3. Search Student
4. Delete Student
5. Recent Actions
6. BST Display
7. Exit

Enter Choice:
```

---

# How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

# Conclusion

This project successfully demonstrates the implementation of Linked