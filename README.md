# Kotlin-Full-Course

A personal Kotlin learning repository with exercises, notes, and small programs created while following Kotlin tutorials, YouTube courses, and preparing for Kotlin/Android-related exams.

The repository contains beginner-friendly Kotlin examples, small coding challenges, object-oriented programming practice, functional programming examples, null safety exercises, coroutines, collections, and IN2000 exam preparation material.

⸻

## Purpose

The purpose of this repository is to document my Kotlin learning process and practice core language concepts through many small examples.

The focus is on:

- Understanding Kotlin syntax
- Practicing basic programming concepts
- Learning object-oriented programming in Kotlin
- Practicing functional programming with collections
- Preparing for Kotlin-related exam tasks
- Building confidence with small, readable examples

This repository is mainly a learning archive rather than one single application.

⸻

## Main Topics Covered

- Hello World and basic input/output
- Variables and types
- Operators
- Control flow with if and when
- Loops with for, while, do-while, break, and continue
- Arrays and lists
- Functions
- Default parameters and named arguments
- Function overloading
- vararg
- Null safety
- Safe calls ?.
- Elvis operator ?:
- Non-null assertion !!
- Classes and objects
- Data classes
- Enum classes
- Sealed classes
- Abstract classes
- Inheritance
- Interfaces
- Collections
- Lambdas
- Higher-order functions
- Functional programming
- Coroutines
- JUnit-style tests for Kotlin collections

⸻

## Repository Structure

.
├── Arrays/                         # Arrays, iteration, min/max challenges
├── ByteShortIntLong/               # Primitive types and numeric limits
├── Classes/                        # Kotlin classes, data classes, objects, enums, sealed classes
├── ControlFlow/                    # if/when expressions and ranges
├── Functions/                      # Functions, overloading, default parameters, vararg
├── HelloWorld/                     # First Kotlin programs
├── Kotlin-2020/                    # Older Kotlin course examples
├── Kotlin-Beginner-Course/         # Beginner Kotlin course exercises
├── Kotlin_IN2000/                  # Kotlin exam preparation for IN2000
├── Loops/                          # for-loops, while-loops, break/continue challenges
├── Null/                           # Null safety examples
├── OOP/                            # Object-oriented programming basics
├── Object-Oriented-Programming/    # More OOP examples with constructors and init blocks
├── Operators/                      # Arithmetic, comparison, boolean operators
├── Variables/                      # Variables, strings, readln, simple input
└── README.md

⸻

## Project History

### Kotlin Practice Modules

Module <---> Topic
HelloWorld <---> Basic output and first Kotlin program
Variables <---> Variables, strings, input with readln()
ByteShortIntLong <---> Primitive types, numeric ranges, Int, Byte, Short, Long, Float, Double, Char, Boolean
Operators <---> Arithmetic operators, assignment operators, comparisons, boolean logic
ControlFlow	if, when, ranges, conditional expressions
Loops <---> for, while, do-while, break, continue, loop challenges
Arrays <---> Arrays, iteration, type checks, min/max functions
Functions <---> Functions, default values, named arguments, overloads, vararg
Null <---> Nullable types, safe calls, Elvis operator, non-null assertion
Classes <---> Classes, data classes, objects, enums, sealed classes, abstract classes
OOP <---> Basic object-oriented programming with classes and objects
Object-Oriented-Programming <---> Constructors, properties, init blocks, class design
Kotlin-2020 <---> Kotlin course examples: functions, collections, interfaces, classes, higher-order functions
Kotlin-Beginner-Course <---> Beginner Kotlin course exercises and examples
Kotlin_IN2000 <---> Kotlin exam preparation for IN2000, including functional programming and coroutines

⸻

## Notable Sections

### Basic Kotlin

The basic folders cover the fundamentals of Kotlin programming:
- HelloWorld
- Variables
- ByteShortIntLong
- Operators
- ControlFlow
- Loops
- Arrays
- Functions
- Null

These examples focus on syntax, simple programs, control flow, functions, and Kotlin’s type system.

⸻

## Object-Oriented Programming

The OOP-related folders contain examples of:
- Simple classes
- Mutable and immutable properties
- Constructors
- init blocks
- Member functions
- Data classes
- Enum classes
- Sealed classes
- Abstract classes
- Inheritance

Relevant folders:
Classes/
OOP/
Object-Oriented-Programming/
Kotlin-2020/
Kotlin-Beginner-Course/

⸻

## Functional Programming and Collections

The Kotlin_IN2000 folder includes examples and notes related to functional programming in Kotlin.

Topics include:
- Lambdas
- Higher-order functions
- map
- filter
- fold
- sortedBy
- find
- findLast
- count
- partition
- zip
- zipWithNext
- Functional implementations of factorial

Example files:
Kotlin_IN2000/src/main/kotlin/FunksjonellProgrammering/CollectionsTest.kt
Kotlin_IN2000/src/main/kotlin/FunksjonellProgrammering/Factorial.kt
Kotlin_IN2000/src/main/kotlin/FunksjonellProgrammering/NavneSpill.kt

⸻

## Coroutines

The repository also includes a small coroutine example with:
- runBlocking
- coroutineScope
- launch
- async
- await
- delay

Relevant file:
Kotlin_IN2000/src/main/kotlin/Coroutines.kt

⸻

## Learning Sources

This repository was created while following and practicing from multiple Kotlin learning resources, including:
- Kotlin full course videos
- Kotlin beginner course material
- FreeCodeCamp-style Kotlin practice
- Philipp Lackner Kotlin/Android-related learning material
- Personal exam preparation for IN2000
- Own examples and rewritten practice tasks

Original starting point noted in the old README:
Full Kotlin course 13 hours:
https://www.youtube.com/watch?v=EExSSotojVI

⸻

## Skills Demonstrated

This repository demonstrates practice with:
- Kotlin syntax and program structure
- Writing simple functions
- Using nullable and non-nullable types
- Working with arrays, lists, sets, and maps
- Iterating with loops and collection functions
- Writing small utility functions
- Using data classes and regular classes
- Understanding object-oriented programming in Kotlin
- Understanding functional programming concepts
- Writing simple JUnit-style tests
- Using coroutines at a basic level
- Preparing for Kotlin exam tasks

⸻

## Example Concepts

### Null Safety

Examples include:
val name: String? = null
val length: Int? = name?.length
val finalName = name ?: "Default"

### Functional Programming

Examples include:
val numbers = listOf(1, 2, 3, 4)
val doubled = numbers.map { it - 2 }
val even = numbers.filter { it % 2 == 0 }
val sum = numbers.fold(0) { acc, x -> acc + x }

### Classes

Examples include:
data class Person(
    val name: String,
    val birthDate: String,
    val email: String
)

### Coroutines

Examples include:
runBlocking {
    coroutineScope {
        val text = async {
            delay(1000)
            "World"
        }
        println("Hello ${text.await()}")
    }
}

⸻

## Notes

This repository contains many small practice examples. Some files intentionally contain beginner-style code, comments, repetitions, spelling mistakes, or alternative implementations because the purpose was learning and exam preparation.

The repository is therefore best understood as a learning log and Kotlin practice archive rather than a polished production codebase.

⸻

## Author

Philip Elias Fleischer
Bachelor’s student in Informatics: Programming and System Architecture
University of Oslo (UiO)

⸻
