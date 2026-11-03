## Contents

1. [0Start here](#start)
2. [★What gets asked](#hot)
3. [{ }Reading Java in 10 min](#howto)
4. [1.1Objects & classes](#m1u1)
5. [1.2Messages, encapsulation](#m1u2)
6. [1.3Inheritance, overriding](#m1u3)
7. [1.4Polymorphism, methods](#m1u4)
8. [1.5Composition, ADT](#m1u5)
9. [2.1Class vs object](#m2u1)
10. [2.2Constructors, GC](#m2u2)
11. [2.3Static](#m2u3)
12. [2.4Access, has-a vs is-a](#m2u4)
13. [2.5Abstract, interfaces](#m2u5)
14. [3.1Methods, casting, recursion](#m3u1)
15. [3.2Operator overloading](#m3u2)
16. [3.3Logical operators](#m3u3)
17. [3.4true / false](#m3u4)
18. [3.5Conversions, indexers](#m3u5)
19. [\</>Program bank](#progs)
20. [PQ2023_2 answered](#p2023)
21. [PQJan 2021 (2020_2) answered](#p2021)
22. [PQ2021_2 answered](#p2021b)
23. [PQ2021_1 answered](#p2021a)
24. [PQ2020_1 answered](#p2020a)
25. [PQOct 2019 answered](#p2019)
26. [?Flashcards](#cards)

CIT383 · Introduction to Object-Oriented Programming · NOUN

# CIT383 by Tuesday afternoon

Object-oriented programming (OOP) means building a program out of **objects**: little bundles that each hold some data and the actions that work on that data. The course teaches it with Java (Modules 1–2 and Module 3 Unit 1) and then with C# for operator overloading (Module 3 Units 2–5), because Java can't do that part.

**70** marks · 2 hrs Q1 compulsory + 2 or 3 others from **6** past papers, 2019–2023

The most important thing on this page

**The questions come straight out of the course's own exercises and examples.** "Create a non-executable class with a private first-name variable and methods to set and get it" is the course's SetGetClass, word for word. "Default vs no-argument constructor" and "the concept behind garbage collection" are Module 2 Unit 2's review questions i–viii. "Describe conversion operator overloading and write a program" is Module 3 Unit 5's assignment. Two 2021 papers ask for the course's Bicycle class and its Invoice/Payment class, word for word. So this page answers every unit's exercises, then all six papers.

**In all six papers:** constructors (default / no-argument / vs method / features) and the ADT and its properties. **In five:** encapsulation and data hiding. **In four:** message passing, inheritance, casting and conversion operators, methods. Learn those first.

Watch the instruction

Five of the six papers say **Q1 + any three** (Q1 = 25, others 15). Only 2023_2 said Q1 + any two (30 + 20 + 20). Read it on the day and budget your time: roughly 35 minutes for Q1 and 25 for each of the others.

### Your plan

Monday evening · 1 hr

#### Reading Java + Module 1

The 10-minute Java reading lesson, then objects, encapsulation, inheritance, polymorphism, ADT.

Monday night · 1½ hrs

#### Module 2 + the program bank

Constructors, garbage collection, static, abstract classes, interfaces. Copy out SetGetClass, Bicycle, StudentInfo and Invoice by hand once each.

Tuesday morning · 1½ hrs

#### Module 3 + the papers

Casting, overloading, conversion operators, indexers. Then read through the six answered papers.

Before you leave · 30 min

#### Flashcards

Say each answer out loud before opening it.

The big picture in six lines

1. A **class** is a blueprint. An **object** is a thing built from it (a house from the blueprint).
2. **Encapsulation**: the object keeps its data private and lets others touch it only through its methods (get/set). Hiding the data this way is **data hiding**.
3. **Inheritance** ("is-a"): a new class can extend an old one and get everything it has. A CoffeeCup *is a* Cup.
4. **Polymorphism**: one name, many behaviours. Overloading (same name, different parameters) and overriding (a subclass rewrites an inherited method).
5. **Composition** ("has-a"): a class holds objects of other classes. A Student *has a* Date of birth.
6. **Operator overloading** (C#, not Java): teaching `+`, `&`, `true`, casts and `[ ]` to work on your own class.

From 6 past papers: Oct 2019, 2020_1, Jan 2021 (2020_2), 2021_1, 2021_2, 2023_2

## What gets asked

| Topic | Papers | How it's asked |
| --- | --- | --- |
| [Constructors (default, no-arg, vs method, features)](#m2u2) | 6 | Default vs no-arg; constructor vs method; six features; a class with a constructor setting non-default values |
| [Abstract data type](#m1u5) | 6 | Define; four properties / rules; two parts of a description |
| [Encapsulation, data hiding, get/set](#m1u2) | 5 | Define; features; a program that encapsulates a field |
| [Message passing](#m1u2) | 4 | Define; styles; "shared nothing"; effect on other models |
| [Inheritance, overriding, sub/superclass](#m1u3) | 4 | Define, benefits, single vs multiple; override vs inherit (with diagram) |
| [Casting & conversion operators](#m3u5) | 4 | Implicit vs explicit; restrictions; implicit-cast properties; a program |
| [Methods: syntax, types, advantages, overloading, modules](#m1u4) | 4 | Method syntax; types of method; advantages; modular programming |
| [Abstraction](#m1u5) | 3 | Justify it; give an example; advantages |
| [Interfaces](#m1u5) | 3 | Uses; advantages; six properties; vs abstract class; Invoice implements Payment |
| [Abstract classes & methods](#m2u5) | 3 | Abstract vs concrete; syntax; why not on static methods |
| [Polymorphism & binding](#m1u4) | 3 | Types of polymorphism; binding vs polymorphism |
| [Operator overloading (incl. true/false, unary/binary)](#m3u2) | 3 | Define; why Java lacks it; true/false syntax and limits |
| [Garbage collection, destructors, finalize](#m2u2) | 3 | Concept; destructor functions; effect of new and finalize |
| [Class vs object; class syntax; variables](#m2u1) | 3 | Class vs object; class syntax; local vs instance; variable |
| [Indexers](#m3u5) · [static](#m2u3) · [downcasting](#m2u5) | 1–2 | One-dimensional indexer; static method; downcasting syntax |

Programs asked (every paper has at least one)

Set/get first name (2023_2, 8) · sphere area (2023_2, 12) · encapsulation (2023_2; Student height, 2019) · print a line (Jan 2021) · cast 100 (Jan 2021) · **Bicycle class (2021_1, 13)** · **first name + age with a non-default constructor (2021_1, 13)** · **Invoice implements Payment (2021_2, 15)** · FactorialFinder (2019, 6) · conversion operator (2023_2, 8). All are in the [program bank](#progs) or their unit, tested.

Before you start

### How to read (and write) a Java program in 10 minutes

[ ] Done

You can't score program marks without being able to read one. Here's the whole shape, line by line.

```
public class FirstProgram            // a class called FirstProgram; the file must be FirstProgram.java
{
    public static void main(String[] args)   // main: where the program starts running
    {
        System.out.println("I love Java Programming");   // print a line of text
    }
}
```

```
I love Java Programming
```

The five things you'll see in every answer

1. `{ }` braces wrap a block: the class body, the method body. Every `{` needs a matching `}`.
2. Every statement ends with `;`.
3. **Variables** are declared with a type: `int age;` `double radius;` `String name;` `boolean paid;`
4. **Methods** are written `modifier returnType name(parameters) { body }`, e.g. `public double getArea() { return side * side; }`. `void` means it returns nothing.
5. **Objects** are made with `new`: `Circle c = new Circle();` then used with a dot: `c.setRadius(3.0);`

Words the course uses about programs

**Executable class**: has a `main` method, so it can run by itself. **Non-executable class**: has no `main`; it only describes objects, and another (executable) class must create objects from it and call its methods.

**private**: only this class can see it. **public**: everyone can. **static**: belongs to the class itself, not to each object.

In the exam: write neat code, add a comment on the important lines, and if you can, write the output underneath. Examiners give marks for structure even when a small detail is wrong.

Module 1

## Basic concepts: objects, messages, inheritance, polymorphism, composition

Module 1 · Unit 1

### Objects, classes and OOP

[ ] Done

What is object-oriented programming?

OOP is **a programming paradigm that uses "objects" – data structures consisting of data fields and methods and their interactions – to design applications and computer programs**. Its techniques include information hiding, data abstraction, encapsulation, modularity, polymorphism and inheritance. It wasn't common in mainstream software until the early 1990s.

OOP languages in the course: **Ada, C#, C++, Fortran, Java, Smalltalk**.

What is an object?

Software objects are modelled on real-world objects. They share two characteristics: **state** and **behaviour**. A bicycle's state is its current gear, speed and pedal rate; its behaviour is changing gear, braking, speeding up.

An object stores its state in **fields** (variables) and exposes its behaviour through **methods** (functions). Hiding the internal state and making all interaction go through the methods is called **data encapsulation**.

Benefits of bundling code into individual software objects2023_2 Q5a · 12 marks (asks for four)

1. **Modularity**: the source code for an object can be written and maintained independently of the source code for other objects. Once created, an object can be passed around inside the system easily.
2. **Information-hiding**: by interacting only with an object's methods, the details of its internal implementation stay hidden from the outside world.
3. **Code re-use**: if an object already exists (perhaps written by another developer), you can use it in your program. Specialists can implement, test and debug complex objects that you then trust and run in your own code.
4. **Pluggability and debugging ease**: if a particular object turns out to be a problem, you can simply remove it from your application and plug in a different object as its replacement, like replacing a broken bolt rather than the whole machine.

12 marks for four means about 3 marks each: name it, explain it in a sentence, give the example.

What is a class?

A class is the **blueprint from which individual objects are created**. Your bicycle is one of thousands of bicycles of the same make and model, all built from the same blueprint; your bicycle is an **instance** of the class of objects called bicycles.

Objects and classes in Java: the facts

- Objects are created with the keyword **new**, which allocates memory and calls the constructor: `Bicycle bike1 = new Bicycle();`
- Fields and methods are reached with **dot notation**: `bike1.speedUp(10);`
- Java automatically flags unused objects and applies **garbage collection**; before an object is destroyed, its `finalize()` method may be called.
- Modifiers on properties: `public`, `private`, `protected`, `final` (a constant), `static` (one copy for the class), `transient`, `volatile`.
- Kinds of method: **constructor** (sets up a new object), **accessor/mutator** (get/set), **helper** (private, used inside the class), **recursive** (calls itself).
- A class can be declared inside another class: an **inner class**.

Unit exercise: the Circle class (tested)

```
class Circle {
    private double radius;
    public void setRadius(double r) { radius = r; }
    public double getRadius() { return radius; }
    public double calcDiameter() { return 2 * radius; }
    public double calcArea() { return Math.PI * radius * radius; }
}

public class MakeCircle {                  // the driver (executable) class
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(3.0);
        System.out.println("Diameter: " + c.calcDiameter());
        System.out.println("Area: " + c.calcArea());
    }
}
```

```
Diameter: 6.0
Area: 28.274333882308138
```

The course says "28.25999" because it uses π = 3.14. Using `Math.PI` gives 28.27.

General syntax for a class2019 Q2a · 2020 Q1d

A class is **a collection of a fixed number of components**, called the **members** of the class. The mechanism in Java that combines data and the operations on that data in a single unit is called a class. In Java, `class` is a reserved word; it defines only a data type, and **no memory is allocated** until objects are created. Members are a named constant, a variable (to store data) or a method. Data members are also called fields.

```
modifier(s) class ClassIdentifier modifier(s)
{
    classMembers
}

// fuller form from the course:
["public"] ["abstract" | "final"] class Class_name ["extends" object_name] ["implements" interface_name]
{
    // properties declarations
    // behaviour declarations
}
```

**public** sets visibility (default: visible within the current package only). **abstract** classes must be extended; **final** classes can never be extended. By convention the class name starts with a capital letter.

Define a variable2020 Q1e · 3 marks

A variable is **a named memory location that stores a data value** which can change while the program runs. It is declared with a data type and a name: `int age;` `double radius = 3.0;` In a class, a variable member stores the object's data (state). Kinds: local variables, instance variables (fields) and class (static) variables.

Types of methods in Java2020 Q1g · 3 marks

1. **Constructor**: same name as the class, no return type; initialises a new object.
2. **Accessor (observer)**: reads a field: `getFoobar()`. **Mutator (transformer)**: sets a field: `setFoobar()`, and can check the value is valid.
3. **Helper**: useful inside the class but not outside it; usually private; helps modularise code.
4. **Recursive**: defined in terms of itself (e.g. factorial).

Write a class to implement a bicycle2021 Q2b · 13 marks · the course's own example, tested

```
class Bicycle {
    int cadence = 0;          // fields = the object's state
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) { cadence = newValue; }    // methods = behaviour
    void changeGear(int newValue) { gear = newValue; }
    void speedUp(int increment) { speed = speed + increment; }
    void applyBrakes(int decrement) { speed = speed - decrement; }
    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();      // create two different Bicycle objects
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);            // invoke methods on those objects
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
```

```
cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3
```

**Explanation (worth writing for 13 marks):** cadence, speed and gear are the fields and represent the object's state; changeCadence, changeGear, speedUp, applyBrakes and printStates define its interaction with the outside world. Bicycle has no main method, so it is a blueprint, not a complete application. BicycleDemo is the executable class: it creates two separate Bicycle objects with `new` and invokes their methods with dot notation. Each object keeps its own state, which is why the two outputs differ.

Module 1 · Unit 2

### Message passing and encapsulation

[ ] Done

In plain words

Objects don't reach inside each other. They *ask*: one object sends another a message ("speed up by 10"), and the receiving object runs its own method to handle it. That's message passing. Encapsulation is the other half: each object keeps its data locked inside and only offers methods as the "front door".

What is message passing?

Message passing in computer science is a **form of communication used in parallel computing, object-oriented programming and inter-process communication**. Message passing systems have been called **"shared nothing" systems** because the message passing abstraction hides underlying state changes that may be used in the implementation of sending messages.

The model: messaging is the (usually asynchronous) sending (usually by copy) of a data item to a communication endpoint (an actor, process, thread or socket). It's used in Web Services by SOAP. It's like a higher-level datagram, except messages can be larger than a packet and can be made reliable, durable, secure and/or transacted.

Message-passing stylesboth papers · 2023_2 asks "six"

1. **Actor model implementation**
2. **Amorphous computing**
3. **Antiobjects**
4. **Flow-based programming**
5. **SOAP (protocol)**

The course lists only these five. If the paper asks for six, give these five and add **streams/pipes** (the course names this as "the other common technique" for inter-process communication, where data are sent as a sequence of elementary items) or **remote method invocation / dynamic dispatch**. Write the five confidently first.

How message passing influences other programming modelsunit exercise

- In OOP terminology a **message is the single means to pass control to an object**. If the object "responds" to the message, it has a method for that message.
- In pure OOP, message passing is done exclusively through **dynamic dispatch**. Sending the same message twice usually makes the object apply the method twice. Two messages are the same type if their name and arguments are identical.
- Objects can send messages to other objects from inside their method bodies. Message passing enables **extreme late binding**.
- **Alan Kay** argued message passing is more important than objects in OOP; people often place too much emphasis on objects and not enough on the messages between them.
- The **live distributed objects** model builds on this, describing a distributed system in terms of message patterns. Some languages support **forwarding or delegation** of a message to another object that can handle it.

Encapsulation2023_2 Q5b · 8 marks with a program

In object-oriented design, an object **combines data and the operations on that data in a single unit**; this feature is encapsulation. It is the ability of an object to be a container (or capsule) for related properties (data variables) and methods (functions). It is **one of the three fundamental principles of OOP** (with inheritance and polymorphism).

It also means **hiding the implementation details of a class and allowing access only through a public interface**: declare the instance variables `private` (or protected), let client code use only the public methods, named with the set/get convention. Older languages didn't enforce this, which caused side effects and "spaghetti code". Encapsulation makes code easy to maintain and modify: client code isn't affected when the internals change, as long as the public method signatures stay the same.

Data hidingJan 2021 Q1d

Data hiding is **the ability of objects to shield variables from external access**. It is a useful consequence of the encapsulation principle. Variables marked `private` can only be seen or modified through public **accessor (get) and mutator (set)** methods. This permits validity checking at run time. Methods can also be completely hidden; the visible ones can only be called through the object's "front door" (there is no goto branching).

Program: encapsulation (tested; this answers "write a program to explain encapsulation")

```
public class Employee
{
    private String name;          // hidden from other classes
    private double salary;        // hidden from other classes

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary)
    {
        if (salary >= 0)          // the class controls what values are allowed
            this.salary = salary;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setName("Grace");
        emp.setSalary(50000);
        emp.setSalary(-100);      // rejected by the set method
        // emp.salary = -100;     would NOT compile: salary is private
        System.out.println(emp.getName() + " earns " + emp.getSalary());
    }
}
```

```
Grace earns 50000.0
```

**Explanation to write under it:** name and salary are private, so no other class can change them directly. The only way in is through the public get and set methods, and setSalary checks the value first. The data and the methods that work on it are packaged together in one class: that is encapsulation.

In the exam, write each class in its own box (they'd be two files, Employee.java and EmployeeTest.java).

"Shared nothing" / "shared communication"2021 Q1a(ii) · 2 marks

The 2021 paper misquotes the course: it's **"shared nothing"**. Message-passing systems are called "shared nothing" systems because **the message-passing abstraction hides underlying state changes** that may be used in the implementation of sending messages. The communicating parties don't share memory or state; they only exchange messages (usually by copy). Write that, whichever wording appears.

Message passing in pure OOP2019 Q3a · 4 marks

In pure OOP a **message is the single means to pass control to an object**; if the object responds to the message, it has a method for it. Message passing is performed **exclusively through dynamic dispatch**. Sending the same message twice usually makes the object apply the method twice, and two messages are the same type if their name and arguments are identical. Objects send messages to other objects from inside their methods, which enables extreme late binding.

Features of encapsulation2021_2 Q5c · 5 marks

1. Combines data and the operations on that data in **a single unit** (the object is a capsule for related properties and methods).
2. **Hides implementation details**; access is only through a public interface.
3. Instance variables are declared **private** (or protected).
4. Client code uses only the **public set and get methods**, following the Java Bean naming convention.
5. Leads to **data hiding**, which permits validity checking at run time.
6. Makes code **easy to maintain and modify**: client code isn't affected by internal changes as long as public method signatures stay the same.
7. Prevents the side effects and spaghetti code of older languages.

Accessor and mutator methods2019 Q4b(i) · 3 marks

**Accessor (observer)** methods read the value of a property (a private field) and are conventionally named `getFoobar()`. **Mutator (transformer)** methods set a property's value and are named `setFoobar()`; they can ensure the value is valid in both range and type. Making every property private with accessors and mutators is a good example of encapsulation.

Student class that encapsulates height (2019 Q4a(ii), tested)

```
class Student {
    private double height;                       // encapsulated member field

    public void setHeight(double h) {            // mutator
        if (h > 0) height = h;
    }
    public double getHeight() {                  // accessor
        return height;
    }
}
```

```
s.setHeight(1.75);  s.getHeight()  →  1.75
```

Module 1 · Unit 3

### Inheritance and overriding

[ ] Done

In plain words

Inheritance lets you say "a CoffeeCup is a Cup, plus a few extras". The CoffeeCup automatically gets everything Cup has. **Overriding** is when the CoffeeCup decides one inherited method should work differently and rewrites it, keeping the same name and parameters.

Inheritance

Inheritance is an **"is-a" relationship**: a new class (the **subclass**, derived class or child) is created from an existing class (the **superclass**, base class or parent) and inherits its fields and methods, then adds its own. Java uses the keyword `extends`: `class CoffeeCup extends Cup`.

- In Java every class ultimately extends the class **Object**.
- **Single inheritance**: a class has one direct superclass. **Multiple inheritance**: a class has more than one. **Java supports only single inheritance** (it uses interfaces to get some of the benefit of multiple).
- A superclass's `private` members are **not** inherited by its subclasses.
- If a subclass declares a field with the same name as one in the superclass, it **hides** it; reach the superclass one with `super.fieldName`.

Overriding vs inheriting (with a schematic diagram)2023_2 Q1d · 7 marks

**Inheriting** a method: the subclass gets the superclass's method *unchanged* and uses it as it is. **Overriding** a method: the subclass *redefines* an inherited method with the **same signature and return type**, so objects of the subclass use the new version instead of the superclass's one.

The course example: class `Cup` has `addLiquid()` that swirls the liquid clockwise. `CoffeeCup` needs it swirled counter-clockwise, so it declares its own `addLiquid()` with the identical signature: it overrides it. A subclass that doesn't declare `addLiquid()` simply inherits Cup's.

```
class Cup {
    public void addLiquid() { System.out.println("Liquid swirls clockwise"); }
}
class CoffeeCup extends Cup {
    // nothing written: INHERITS addLiquid() unchanged
}
class TeaCup extends Cup {
    public void addLiquid() { System.out.println("Liquid swirls anticlockwise"); }  // OVERRIDES
}
```

```
new CoffeeCup().addLiquid();  →  Liquid swirls clockwise
new TeaCup().addLiquid();     →  Liquid swirls anticlockwise
```

I named the overriding class TeaCup so both cases fit one picture. In the course it's CoffeeCup that overrides; either is fine in the exam.

Inheriting the interface vs inheriting the implementation

A subclass inherits the superclass's **interface** and, by default, its **implementation**. **Inheritance of interface** guarantees the subclass accepts all the same messages as its superclass, so a subclass object can be used anywhere a superclass object is called for (a CoffeeCup can be used anywhere a Cup is needed). This is *certain*.

**Inheritance of implementation** means the subclass, by default, behaves identically to the superclass when it gets those messages. This is *optional*: for each inherited method the subclass may adopt the inherited code or **override** it. A subclass can also specialise by adding new methods (extending the interface).

**Abstract class and method** (first met here, with the Liquid example): a method declared `abstract` has no body; a class with one must be declared `abstract` and can't be instantiated. See [2.5](#m2u5).

Unit exercise: Employee derived from Person

Data members that can be added to `Employee`: employeeId, department, salary, dateEmployed. Method members: getSalary(), setSalary(), calculatePay(), getDepartment(). (Person already has name, address, age, getName() and so on, which Employee inherits.)

A class hierarchy with several subclasses of one superclass: **Vehicle** → Car, Bicycle, Boat (the course's example); or **Shape** → Circle, Square, Triangle.

Inheritance: usefulness, example, benefits2021_2 Q1a · 2019 Q5a · 2020 Q3a

**Inheritance** is an "is-a" relationship in which a new class (subclass) is created from an existing class (superclass) and inherits its fields and methods; an object of the subclass can be treated as an object of its superclass (a car is a vehicle). Java uses `extends`.

**Usefulness / benefits:**

1. **Software reuse**: the subclass reuses the superclass's tested code instead of rewriting it.
2. **Less duplication, easier maintenance**: what's common is written once in the superclass; a fix there reaches every subclass.
3. **Supports polymorphism**: subclass objects can be processed together through superclass references, so systems are easily extended with new subclasses.
4. **Models real hierarchies** naturally (Vehicle → Car, Bicycle, Boat).

**Example application area:** a payroll system where Employee is the superclass and SalariedEmployee, HourlyEmployee and CommissionEmployee are subclasses; or a hospital system with Person → Patient, Nurse, Doctor.

**Single inheritance**: a subclass has exactly one direct superclass (Java supports this). **Multiple inheritance**: a subclass has more than one direct superclass (C++ allows it; Java doesn't, but a class may implement several interfaces).

Subclass "overrides a method"; ways a subclass specialises2021_2 Q2a · 5 marks

To **override** a method, the subclass implements its own version of an inherited method with the same signature and return type, so its version is used instead of the superclass's.

A subclass specialises its behaviour in two ways: (1) by **overriding** the implementation of methods inherited from its superclass; (2) by **extending the superclass's interface with new methods** (and new fields).

Subclass vs superclass2019 Q4c · 2 marks

**Superclass** (base / parent): the existing, more general class whose members are inherited. **Subclass** (derived / child): the new, more specific class that extends it, inheriting its members and adding or overriding its own. Every car is a vehicle, but not every vehicle is a car.

Module 1 · Unit 4

### Polymorphism, modularity and methods

[ ] Done

In plain words

"Poly" = many, "morph" = form. The same command does different things depending on who receives it. Tell a dog to "speak" and it barks; tell a cat and it meows. Same message, different behaviour.

What is polymorphism? State its typesboth papers · 8 marks

Polymorphism is **the capability of an action or method to do different things based on the object that it is acting upon**. It is the **third basic principle** of object-oriented programming (after encapsulation and inheritance). In Java it is implemented using **late binding**.

**Types of polymorphism:**

1. **Overloaded methods**: methods with the same name but either a different number of parameters or different types in the parameter list. E.g. "spinning" a number may mean increase it; "spinning" an image may mean rotate it by 90°. Defining a method for each type of parameter gives the effect you want. (Decided at compile time.)
2. **Overridden methods**: methods that are redefined within an inherited class or subclass. They have the same signature, and the subclass definition is used. (Decided at run time.)
3. **Dynamic method binding** (the course's "third type"): a superclass reference variable can point to a subclass object, and the method that runs is the subclass's, chosen while the program runs.

For 8 marks: definition (2), then each type named, explained and given an example (2 each).

Late binding (dynamic / run-time binding)

Java allows a reference variable of a superclass to point to an object of its subclass. In the course: `Person nameRef; PartTimeEmployee employee = new PartTimeEmployee("Susan", "Johnson", 6.40, 35); nameRef = employee;` Printing `nameRef` runs PartTimeEmployee's `toString`, not Person's, giving "Susan Johnson's wages are: $224.0".

**Binding** means associating a method definition with its invocation (deciding which method definition runs). In **late binding** the method that gets executed is determined **at execution time, not at compile time**. Except for a few cases (static, private and final methods), Java uses late binding.

Modularity, and the advantages of methodsJan 2021 Q4b · "four advantages"

Methods are used to **divide a complicated program into manageable pieces**; they are building blocks, like automobile parts. There are **predefined methods** (already written and provided by Java) and **user-defined methods** (written by you). The function of a method: when a message (method call) is sent to an object, it tells a method of the object to perform its task; when done, the method returns a result or simply returns control to the caller.

**Advantages of using methods:**

1. While working on one method, you can focus on just that part of the program, and construct, debug and perfect it.
2. Different people can work on different methods simultaneously.
3. If a method is needed in more than one place in a program, or in different programs, you can write it once and use it many times.
4. Using methods greatly enhances the program's readability because it reduces the complexity of the main method.
5. Methods (often called modules) are like miniature programs; you can put them together to form a larger program.

The main method and the syntax for creating a methodJan 2021 Q4a

Every Java application has a main method; it is **where program execution begins**. It is a **static** method (it doesn't depend on any object). Its header:

```
public static void main(String[] args)
```

The syntax for creating a method (anything in \[ \] is optional):

```
accessmodifier returntype methodname([parameters])
{
    method body
    [return value;]
}
```

- **accessmodifier**: public (usable inside and outside the class) or private (only by members of the class).
- **returntype**: the data type the method returns to its caller (int, String, …); `void` if it returns nothing.
- **methodname**: any valid name. **parameters**: when called, the arguments must match the method's signature (number and data types of the arguments).
- A method that isn't void must end with `return value;`

Binding vs polymorphism2020 Q2a · 3 marks

**Binding** means associating a method definition with its invocation, i.e. deciding which method definition gets executed. It can be early (static, at compile time) or late (dynamic, at execution time). **Polymorphism** is the capability of a method to do different things depending on the object it acts on. The link: **polymorphism in Java is implemented using late binding**, because the method that runs is chosen at run time from the object's actual type.

Static method · method overloading2020 Q2b · 2019 Q1e(ii)

**Static method**: a method that performs a task not depending on the contents of any object; it belongs to the class as a whole and is called with the class name: `Math.sqrt(9)`. main is static.

**Method overloading**: several methods in the same class with the same name but different parameter lists (number, types or order).

Predefined vs user-defined methods2020 Q2d · 3 marks

**Predefined**: already written and provided by Java (e.g. Math.sqrt, Math.pow); you only need to know how to use them; their code isn't available to you. **User-defined**: methods you write yourself for your own program's tasks.

Modular programming: concept, advantage, disadvantage2019 Q1d · 2021 Q1e

**Modular programming** groups procedures of common functionality into separate **modules**. The program is no longer one single part; it is divided into several smaller parts which interact through procedure calls and together form the whole program. The main program coordinates calls to procedures in the modules and hands over data as parameters. A **module** is one such self-contained part (in Java: methods, classes and packages).

**Advantage:** each module can be written, debugged and perfected on its own, and reused; different people can work on different modules at once.

**Disadvantage** (from the course): each module has only **one state**, and each module exists **at most once** in the whole program, so you can't have several independent copies (e.g. only one list at a time). This limitation is what objects solve. (Also: calls between modules add overhead and need careful interface design.)

Module 1 · Unit 5

### Composition, abstraction, interfaces, ADT

[ ] Done

Composition ("has-a")

Composition is a relationship between two classes based on the aggregation relationship. It takes the relationship one step further by ensuring that **the containing object is responsible for the lifetime of the object it holds**. If Object B is inside Object A, A creates and destroys B; B cannot exist without A.

Course example: a `Student` class holds the student's date of birth in a `GregorianCalendar` object it creates itself. Student *has a* GregorianCalendar and controls its lifetime, so this is composition. Likewise a CoffeeCup can contain Coffee. In Java you use composition through **instance variables that hold references to other objects**.

Abstraction

Abstraction is **the process of taking away or removing characteristics from something in order to reduce it to a set of essential characteristics**. In OOP it is one of the three central principles (with encapsulation and inheritance). The programmer hides all but the relevant data about an object to reduce complexity and increase efficiency. It is related to both encapsulation and data hiding.

**Course analogy (blind date):** to be recognised in the restaurant you tell your date where you'll sit, your height, hair colour and jacket colour. Your social security number and your favourite films are irrelevant here, so you leave them out. Example: abstracting a leather soccer ball to just "a ball".

Abstract classes and interfaces (first look)

**Abstract class**: a superclass set up so that objects of it can't be created; only objects of its subclasses are used. Declared with the reserved word `abstract`, e.g. `public abstract class Animal` with `public abstract void speak();` (no body; each subclass writes its own).

**Interface**: similar to an abstract class but **all methods are abstract and all properties are static final**. A class uses it with `implements`, and must include code for every method in it. Uses: to tie elements of several classes together; to separate design from coding (headers specified, bodies later); to set up unit-testing frameworks. Java doesn't allow multiple inheritance of classes, but a class may implement many interfaces: `public class WorkingDog extends Dog implements Working`.

What is an Abstract Data Type (ADT)? Four propertiesboth papers · 6 marks

An ADT is **an abstraction of a commonly appearing data structure, along with defined operations on the data structure**. It is a data type that **specifies the logical properties without the implementation details**. ADT provides information hiding: users can use its operations without knowing how they are implemented. A **list** (of students, employees, departments…) is an example of an ADT.

**An ADT is characterised by these properties:**

1. It **exports a type**.
2. It **exports a set of operations**. This set is called the **interface**.
3. Operations of the interface are the **one and only access mechanism** to the type's data structure.
4. **Axioms and preconditions** define the application domain of the type (e.g. "An empty list is a list"; "The first element of a list can only be deleted if the list is not empty").

**Generic ADT**: the same ADT for different element types, fixed when the instance is created: `List<Apple> listOfApples;` Another example the course gives: an ADT `Complex` for complex numbers with add, subtract, multiply, divide.

Composition vs aggregation (with example)2019 Q1e(i) · 3 marks

**Aggregation**: one object contains a reference to another, but the contained object **can exist on its own** (a Department has Lecturers; if the department closes, the lecturers still exist). **Composition** is aggregation taken one step further: the containing object is **responsible for the lifetime** of the object it holds, so the contained object **cannot exist without it** (a Student creates and owns its GregorianCalendar date of birth; when the Student goes, so does the date).

Justify abstraction as a principle of OOP; advantages to the programmer2020 Q3b,c · 2021 Q4b · 2019 Q5c

Abstraction is one of the three central principles of OOP (with encapsulation and inheritance). It is justified because:

1. It **reduces complexity**: the programmer hides all but the relevant data about an object.
2. It **increases efficiency**: only the essential characteristics are kept and handled.
3. It lets programmers **understand and solve problems** and communicate the solution to the computer.
4. It supports **encapsulation and data hiding**: users work with what an object does, not how.
5. Abstract classes and methods **force standards**: they provide templates every subclass must follow.

**Example to give:** the blind date (you tell your date your seat, height, hair colour and jacket colour, not your social security number or favourite films). Or a car: the driver uses the steering wheel, pedals and gear stick without knowing how the engine works. In code: `abstract class Animal { abstract void speak(); }` says every animal speaks without saying how.

Two parts of an ADT description2020 Q5a · 3 marks

1. **Data**: describes the structure of the data used in the ADT, informally.
2. **Operations**: describes the valid operations for the ADT (its interface), including the constructor (actions on creation) and destructor (actions on destruction), with each operation's arguments, preconditions and post-conditions.

Rules guiding the formation of an ADT2019 Q2b · 4 marks

These are the four properties again: it exports a type; it exports a set of operations (the interface); those operations are the only access to the data structure; axioms and preconditions define its application domain.

Interfaces: uses, advantages, properties2020 Q4a · 2019 Q2c · 2021_2 Q5a (six properties)

**Uses / advantages** (course):

1. To **tie elements of several classes together**.
2. To **separate design from coding**: method headers are specified, not bodies, allowing compilation and parameter-consistency testing before coding.
3. To **set up unit-testing frameworks**.
4. To let **unrelated classes share common methods and constants**, so their objects can be processed polymorphically.
5. To get some of the benefit of **multiple inheritance**: a class can implement several interfaces.
6. To **define and standardise** how things such as people and systems interact.

**Six properties of an interface:**

1. All its methods are **abstract** (headers, no bodies).
2. All its properties (fields) are **static final** (constants).
3. It is declared with the keyword `interface`, and used with `implements`.
4. A class that implements it must **implement every method**, with the specified signatures, or else be declared abstract.
5. A class can implement **more than one** interface (comma-separated list).
6. Interfaces can be **inherited** (sub-interfaces with extends); objects of the implementing class have an **is-a** relationship with the interface type; an interface **cannot be instantiated**.

Declaring an interface vs an abstract class; a typical abstract method2019 Q1b · 4 marks

1. An interface is declared with `interface`; an abstract class with `abstract class`.
2. In an interface **all** methods are abstract and fields are static final constants; an abstract class can also have **concrete methods**, ordinary fields and constructors.
3. A class `implements` (possibly several) interfaces but `extends` only one abstract class.

**A typical abstract method** is declared like a normal method plus the keyword `abstract`, with **no body**, just a semicolon: `public abstract void speak();` or `abstract void swirl(boolean clockwise);` Any class containing one must itself be declared abstract, and every concrete subclass must override it.

```
public interface Working { public void work(); }

public abstract class Animal {
    private String name;
    public Animal(String nm) { name = nm; }
    public String getName() { return name; }     // regular method
    public abstract void speak();                // abstract method
}
```

Module 2

## Classes, constructors, static, inheritance and polymorphism in Java

Module 2 · Unit 1

### Classes and objects

[ ] Done

Class vs object2023_2 Q4a · 8 marks

| Class | Object |
| --- | --- |
| A blueprint / template that describes what the objects will contain | A specific instance created from that class |
| Exists "in the general" with abstract attributes | Exists "in the specific" and automatically possesses all the attributes of the class |
| Declared once with the keyword `class` | Created (instantiated) as many times as needed with `new` |
| Takes no memory for data by itself; it is a description | Occupies memory: each object has its own copy of the instance variables |
| e.g. `class Circle { … }` | e.g. `Circle c1 = new Circle();` |

**The course's analogy:** classes are to objects as **blueprints are to houses**. You can't sleep in a room of a blueprint, but you can sleep in a room of a house. Many houses can be built from one blueprint; many objects can be instantiated from one class. Creating an object of a class is called **object instantiation**: `Classname objectname = new Classname();`

Fill-in-the-gaps from the unit: "Blueprints are to houses as classes are to **objects**." "Man is to walk as a class is to a **method**" (a method is what a class does).

Properties of a class: association and software reuseJan 2021 Q2b

Classes contain **methods** (class behaviours), which implement operations, and **fields**, which implement attributes. The methods manipulate the fields and provide services to the class's clients (other classes that use it).

**Association:** classes relate with other classes. In an OO design of a hospital, the Patient class needs to relate with the Nurse class, which relates with the Doctor class; none can exist in isolation. These relationships are called association. It makes software development easier because a large project can be broken into smaller classes that interact to make the whole.

**Software reuse:** packaging software as classes lets future systems reuse them. **Two advantages of software reusability:**

1. Programmers build **more dependable and efficient systems**, because existing classes and components have often gone through extensive testing, debugging and performance tuning.
2. It **saves programmers the time and effort** of re-inventing the wheel.

Two aspects of OOP that promote reuse: inheritance and polymorphism. The two *forms* of reuse in Module 2 Unit 4: inheritance and composition.

Predefined vs user-defined classes

**Predefined classes** come with Java, grouped into packages called the **Java Class Library / Java API**, and are brought in with `import`. **User-defined classes** are written by the programmer.

**Import syntax** (Jan 2021 Q1c):

```
import packagename.classname;   // one class
import packagename.*;           // every class in the package
import java.util.Scanner;       // example
```

Local vs instance variables

**Local variables** are declared in the body of a method and can be used only in that method; their values are lost when it ends, and they must be initialised before use.

**Instance variables (fields)** are declared inside the class but outside its methods. Each object has its own copy, and they're initialised by default by a constructor. Syntax: `accessmodifier datatype variablename;`

Executable vs non-executable class

An **executable class** has a `main` method and can run on its own. A **non-executable class** has no main method; it can't execute on its own unless it is used inside an executable class (an object of it is created there and its methods are called). The methods of a non-executable class are useless if no instances of it are created.

Two data type categories in Java (Jan 2021 Q1e)

**Primitive types**: hold the value itself. byte, short, int, long, float, double, char, boolean. **Reference types**: hold a reference (address) to an object: classes (e.g. String, Scanner), arrays, interfaces. Instance variables default to 0 / false for primitives and `null` for references.

"A class is the fundamental building block…": criticise2020 Q5c · 5 marks

**For the statement:** in OOP the unit of programming is the class from which objects are created; every Java program is made of classes; a class bundles data (fields) and behaviour (methods); classes support reuse, inheritance, polymorphism and association, so large projects are broken into interacting classes.

**Against / qualifications:** a class on its own does nothing: it defines only a data type and allocates no memory, so a non-executable class is useless until objects are instantiated from it. At run time the **objects** do the work and communicate by message passing (Alan Kay argued messages matter more than objects). Classes are themselves built from smaller blocks (variables and methods) and grouped into larger ones (packages), and interfaces can define behaviour without any class.

"Criticise" means give both sides and a conclusion: the class is the fundamental unit of *design*, the object is the unit that runs.

Local vs instance variables: two differences2019 Q1c · 2020 Q5b

1. **Where declared:** a local variable is declared in the body of a method; an instance variable inside the class but outside every method.
2. **Scope and lifetime:** a local variable is usable only in its method and is lost when the method ends; an instance variable belongs to the object, lasts as long as the object, and each object has its own copy.
3. **Initialisation:** a local variable must be initialised before use; an instance variable is given a default value by the constructor.

Module 2 · Unit 2

### Constructors, destructors and garbage collection

[ ] Done

In plain words

A **constructor** is the set-up routine that runs automatically the moment you create an object with `new`. It gives the new object its starting values. A **destructor** is the clean-up routine when an object dies. Java has no destructors; instead a **garbage collector** quietly frees objects nobody points to any more.

The keyword newunit exercise

`new` creates an object of a class. When it's used, Java allocates memory for the new object and **calls the class's constructor** to initialise it, then returns a reference to the object, which is stored in a variable: `StudentClass s = new StudentClass();`

Default constructor vs no-argument constructor2023_2 Q1b · 7 marks

A **default constructor** is supplied **by the compiler** when a class provides no constructor at all. It has no parameters and initialises the instance variables to their **default values**: 0 for numbers, `false` for booleans, `null` for references.

A **no-argument constructor** is **written by the programmer**. It also takes no parameters, but its body can set the instance variables to **values the programmer chooses**. Once the programmer writes any constructor, the compiler no longer supplies the default one.

```
public class DefaultDemo {          // no constructor written:
    private String firstname;       // compiler supplies a DEFAULT constructor
    private int age;
    private boolean paid;
}                                   // new DefaultDemo() gives: null 0 false

public class StudentClass {
    private String firstname;
    private int age;
    public StudentClass()           // NO-ARGUMENT constructor, written by the programmer
    {
        firstname = "Grace";
        age = 25;
    }
}                                   // new StudentClass() gives: Grace 25
```

Both tested. Unit question: "How are instance variables initialised if a class has only a default constructor?" To their default values (0, false, null). "Can a non-default and a default constructor be used in one class?" The compiler's default constructor disappears once you write one, but you can write your own no-argument constructor alongside argument constructors (constructor overloading).

Constructor vs methodJan 2021 Q1f

| Constructor | Method |
| --- | --- |
| Has the **same name as the class** | Any valid name |
| Has **no return type, not even void** | Must declare a return type (or void) |
| Called **automatically** when an object is created with `new` | Called explicitly, as often as needed: `obj.method()` |
| Purpose: initialise a new object | Purpose: perform a task / behaviour of the object |
| Supplied by the compiler (default) if none is written | Never supplied automatically |

Constructor overloadingunit exercise

A class can have **several constructors with the same name but different signatures**. The compiler tells them apart by the **number of parameters, the types of parameters and the order of the parameter types**. This lets objects be initialised in different ways.

```
public class TimeClass {
    private int hour, minute, second;
    public TimeClass() { }                                   // no-argument
    public TimeClass(int h) { hour = h; }
    public TimeClass(int h, int m) { hour = h; minute = m; }
    public TimeClass(int h, int m, int s) { hour = h; minute = m; second = s; }
    public String displayTime() { return String.format("%02d:%02d:%02d", hour, minute, second); }
}
```

```
new TimeClass()           → 00:00:00
new TimeClass(9)          → 09:00:00
new TimeClass(9, 30)      → 09:30:00
new TimeClass(9, 30, 15)  → 09:30:15
```

Destructors: what they are and two functionsJan 2021 Q2c

A destructor is **a special method typically used to perform clean-up after an object is no longer needed by the program**. Variables in a method are deleted when control leaves the method, but dynamically created objects stay in memory until explicitly deleted. **C++ supports destructors; Java does not** (it uses garbage collection).

**Two functions of a destructor:** (1) **release/return the memory** the object occupied to the operating system; (2) perform **termination housekeeping**: release other resources the object held (close files, network connections) before the object is destroyed.

The concept behind garbage collection2023_2 Q1c · 8 marks

1. Java doesn't support destructors. It returns memory to the operating system, when an object no longer needs it, through a mechanism called **garbage collection**.
2. The **garbage collector** is part of the runtime system. It runs in a **low-priority thread**, reclaiming memory that is no longer needed by objects used by the program.
3. An object becomes **eligible for garbage collection when no reference variables refer to it**.
4. The garbage collector uses a method **`finalize`** to do its housekeeping: it is called just before the collector reclaims the object's memory. finalize takes no parameters and has return type void.
5. The problem: the garbage collector is **not guaranteed to run at a specified time**; it may never run before the program ends, so finalize may never be called. For this reason finalize is rarely used.

```
Student s = new Student();   // object created; s refers to it
s = null;                    // no reference left: the object is now eligible for collection
```

The course spells it "finalise"; Java's real method is `finalize()`. Either spelling will be accepted.

Unit programming exercise: DateClass (tested)

```
class DateClass {
    private int year, month, day;                   // three private instance variables
    public DateClass(int y, int m, int d) { year = y; month = m; day = d; }   // constructor
    public void setYear(int y) { year = y; }    public int getYear() { return year; }
    public void setMonth(int m) { month = m; }  public int getMonth() { return month; }
    public void setDay(int d) { day = d; }      public int getDay() { return day; }
    public void displayDate() { System.out.println(year + "/" + month + "/" + day); }
}
public class DateClassTest {
    public static void main(String[] args) {
        DateClass d = new DateClass(2026, 11, 3);
        d.displayDate();
        d.setDay(4);
        d.displayDate();
    }
}
```

```
2026/11/3
2026/11/4
```

Effect of new and finalize on a Java object2019 Q1a(ii) · 2 marks

`new` **creates the object**: it allocates memory and calls the constructor. `finalize()` is called by the garbage collector **just before the object's memory is reclaimed**, to do termination housekeeping (it isn't guaranteed to run).

Features of a constructor in Java2021 Q1c (six) · 2020 Q5d

1. It has the **same name as the class**.
2. It has **no return type**, not even void.
3. It is called **automatically** when an object is created with `new`.
4. Its job is to **initialise the object's instance variables**.
5. It **can take parameters** (argument constructor) or none (no-argument constructor).
6. It **can be overloaded**: several constructors with different signatures.
7. If none is written, the compiler supplies a **default constructor** that sets 0, false or null.
8. It is not inherited; a subclass calls its superclass's constructor with `super(...)`, and one constructor can call another with `this(...)`.

**Summary (2020 Q5d):** a constructor is a special method used to initialise an object of a class when the object is created; it can specify parameters but not a return type.

No-argument vs argument constructor2021_2 Q1b(ii) · 2019 Q5b · 2021 Q5a

A **no-argument constructor** is a constructor, written by the programmer, that takes **no parameters**; its body can set the instance variables to non-default values (e.g. firstname "Grace", age 25). An **argument constructor** takes **parameters**, and the values passed in are used to initialise the instance variables: `new TimeClass(9, 30)`.

**No-argument vs default (two differences):** (1) the no-argument constructor is written by the programmer, the default is supplied by the compiler; (2) the no-argument constructor can set any values, the default only sets 0, false or null (and disappears once any constructor is written).

Class with first name and age, and a constructor assigning non-default values2021 Q5b · 13 marks · tested

```
public class StudentInfo {
    private String firstName;            // String instance variable
    private int age;                     // integer instance variable

    public StudentInfo() {               // constructor assigning NON-default values
        firstName = "Grace";
        age = 25;
    }

    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public void displayDetails() {
        System.out.println("Name: " + firstName + ", Age: " + age);
    }
}

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.displayDetails();
    }
}
```

```
Name: Grace, Age: 25
```

**Explanation:** without this constructor the compiler's default constructor would set firstName to null and age to 0. The no-argument constructor written here assigns non-default values the moment the object is created with `new`. The variables are private (data hiding) and read through get methods.

Module 2 · Unit 3

### Static methods and fields

[ ] Done

In plain words

Normally each object has its own copy of everything. `static` means "belongs to the class, shared by all": one copy only, and you can use it without making any object. `Math.sqrt(900)` works without ever writing `new Math()`.

The two static members of a classunit exercise

The two members of a class that can be static are **the methods** of the class (static methods / class methods) and **the fields** of the class (static fields, called **class variables**). When they are used, the class need not be instantiated.

**Static method:** performs a task that doesn't depend on the contents of any object; it applies to the class as a whole. Called with the class name and a dot: `Math.sqrt(900.0)`.

**Static field:** when only **one copy of a variable should be shared by all objects** of a class. Syntax: `accessmodifier static datatype fieldname;` It exists even when no objects exist, as soon as the class is loaded. Math's two static fields: **`Math.PI`** (3.14159…) and **`Math.E`** (2.71828…), declared `public static final`.

Why main is always declared staticunit exercise

When the Java Virtual Machine (JVM) is run with the `java` command, it tries to invoke the main method of the class you name, before any objects of the class exist. **Declaring main as static allows the JVM to invoke main without creating an instance of the class.**

Instance variable vs static field

An **instance variable**: every object has its **own copy**. A **static field (class variable)**: **one copy shared by all objects**, existing even if no object has been created.

public vs private

**public**: accessible within and outside the class. **private**: accessible only within the class (others go through public methods).

```
public class StaticDemo {
    private static int count = 0;      // static field: ONE copy shared by all objects
    private String name;               // instance variable: each object has its own
    public StaticDemo(String n) { name = n; count++; }
    public static int getCount() { return count; }   // static method
    public static void main(String[] args) {
        new StaticDemo("A");
        new StaticDemo("B");
        System.out.println("Objects created: " + StaticDemo.getCount());
        System.out.println("Math.PI = " + Math.PI + ", Math.sqrt(900) = " + Math.sqrt(900));
    }
}
```

```
Objects created: 2
Math.PI = 3.141592653589793, Math.sqrt(900) = 30.0
```

Math methods + the unit's "value of x" exercise (all checked by running them)

`abs` absolute value · `sqrt` square root · `ceil` round up to whole number · `floor` round down · `pow(x,y)` x to the power y · `max`, `min`.

| Statement | x |
| --- | --- |
| `Math.abs(-7.5)` | 7.5 |
| `Math.floor(-2.7)` | -3.0 |
| `Math.ceil(6.3)` | 7.0 |
| `Math.floor(4.1)` | 4.0 |
| `Math.ceil(-2.5)` | -2.0 |
| `Math.pow(4,6)` | 4096.0 |
| `Math.pow(7,2)` | 49.0 |
| `Math.ceil(-Math.abs(-5+Math.floor(-3.2)))` | -9.0 (floor(-3.2) = -4; -5 + -4 = -9; abs = 9; negate = -9; ceil = -9.0) |

**Static import**: `import static java.lang.Math.PI;` (single static import) or `import static java.lang.Math.*;` (on-demand). Then you can write `sqrt(x)` and `PI` without "Math.".

Why is it illegal to use abstract on a static method?2019 Q1f · 3 marks

An abstract method has no body and is **meant to be overridden** in subclasses so it can process objects **based on their types** (dynamic binding). Static methods, although inherited, are **not associated with particular objects**: they're bound to the class at compile time and called through the class name, so they can't be overridden polymorphically. A static abstract method could never be given a body that runs, so declaring one would make no sense, and Java forbids it. (Constructors can't be abstract either.)

Module 2 · Unit 4

### Access modifiers, inheritance and composition

[ ] Done

public, private and protectedunit exercise

- **public** members of a superclass are accessible wherever the program has a reference to an object of that superclass or one of its subclasses.
- **private** members are accessible only within the declaration of the class itself; they are **not inherited** by subclasses.
- **protected** members have an **intermediate level** of protection: accessible by members of the superclass, by members of its subclasses and by members of other classes in the same package.

**Which promotes good software engineering?** **private**: hiding the data (data hiding) and giving access only through methods.

When a subclass overrides a superclass method, it can still call the superclass version with `super.methodName()`, and it calls the superclass constructor with `super(...)`.

Inheritance vs composition (the two forms of software reuse)unit exercise

| Inheritance | Composition |
| --- | --- |
| **is-a** relationship: a Car is a Vehicle | **has-a** relationship: a Student has a Date |
| A new class `extends` an existing class and gets its members | A class has **references to objects of other classes as members** |
| A subclass object can be treated as a superclass object | The container uses the member object's public methods |

**Two types of inheritance:** single and multiple. **Java supports single inheritance.**

The class that is a direct or indirect superclass of every class: **Object** (in java.lang). A prominent method: **`toString()`** (also `equals()`).

Composition program (tested)

```
class Date {
    private int day, month, year;
    public Date(int d, int m, int y) { day = d; month = m; year = y; }
    public String toString() { return String.format("%02d/%02d/%d", day, month, year); }
}
class Student {
    private String name;
    private Date birthDate;                      // Student HAS-A Date: composition
    public Student(String n, Date b) { name = n; birthDate = b; }
    public String toString() { return name + ", born " + birthDate; }
}
public class CompositionDemo {
    public static void main(String[] args) {
        System.out.println(new Student("Grace Omotoso", new Date(13, 1, 1990)));
    }
}
```

```
Grace Omotoso, born 13/01/1990
```

Unit programming exercise: CommissionEmployee extends Employee (tested)

```
class Employee {
    private String name;
    private double salary;
    public Employee(String n, double s) { name = n; salary = s; }
    public String getName() { return name; }
    public double earnings() { return salary; }
}
class CommissionEmployee extends Employee {          // is-a Employee
    private double commissionRate;                    // two new private fields
    private double sales;
    public CommissionEmployee(String n, double s, double rate, double sales) {
        super(n, s);                                  // call the superclass constructor
        commissionRate = rate;
        this.sales = sales;
    }
    public double earnings() {                        // overrides the superclass method
        return super.earnings() + commissionRate * sales;
    }
}
public class CommissionTest {
    public static void main(String[] args) {
        CommissionEmployee e = new CommissionEmployee("Ada", 50000, 0.1, 200000);
        System.out.println(e.getName() + " earns " + e.earnings());
    }
}
```

```
Ada earns 70000.0
```

The three access modifiers explicitly declared by the programmer2019 Q3b · 3 marks

**public**: accessible within and outside the class. **private**: accessible only within the class (not inherited). **protected**: accessible within the class, by its subclasses, and by classes in the same package. (With no modifier, the default is package access.)

Module 2 · Unit 5

### Polymorphism: abstract classes, binding, interfaces

[ ] Done

Abstract class vs concrete class2023_2 Q2a · 6 marks

| Abstract class | Concrete class |
| --- | --- |
| Declared with the keyword `abstract` | No `abstract` keyword |
| **Cannot be used to instantiate objects**; too general to create real objects | **Can be used to instantiate objects** |
| Contains at least one abstract method (no body); may also have concrete methods | Declares **implementations of every method** it declares |
| Used only as a superclass (an "abstract superclass") to provide a common design for subclasses | Usually a subclass that overrides every inherited abstract method |
| e.g. `abstract class Shape` | e.g. `class Circle extends Shape` |

Extra facts: constructors and static methods cannot be declared abstract. Including an abstract method in a superclass forces every direct subclass to override it in order to become concrete.

Program: abstract vs concrete + polymorphism (tested)

```
abstract class Shape {                           // ABSTRACT: cannot be instantiated
    public abstract double getArea();            // abstract method: no body
}
class Circle extends Shape {                     // CONCRETE: every method has a body
    private double radius;
    public Circle(double r) { radius = r; }
    public double getArea() { return Math.PI * radius * radius; }
}
class Square extends Shape {
    private double side;
    public Square(double s) { side = s; }
    public double getArea() { return side * side; }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();   would NOT compile: Shape is abstract
        Shape[] shapes = { new Circle(1.0), new Square(2.0) };
        for (Shape s : shapes)                   // same message, different behaviour
            System.out.printf("%s, area %.2f%n", s.getClass().getSimpleName(), s.getArea());
    }
}
```

```
Circle, area 3.14
Square, area 4.00
```

How polymorphism promotes extensibilityunit exercise

With polymorphism, programmers can design systems that are **easily extensible**: new classes can be added with little or no modification to the general portions of the program, as long as they are part of the inheritance hierarchy that the program processes generically. (Add a Triangle class to the Shape program above and the loop works unchanged.) The course's case study: the Employee payroll hierarchy (Salaried, Hourly, Commission employees) processed through one array of Employee references.

Dynamic vs static binding

**Dynamic (late) binding**: the method to call is decided **at execution time** by the actual object's type (overridden methods).

**Static (early) binding**: decided **at compile time**. Used for `final`, `private` and `static` methods, which can't be overridden. A `final` method can't be overridden; a `final` class can't be extended.

Downcasting

The is-a relationship applies only from subclass to superclass, not the reverse. **Downcasting** casts a superclass reference to a subclass type so it can call subclass-only methods: `Circle c = (Circle) s;` Check first with `instanceof`: `if (s instanceof Circle)`. A superclass reference can invoke only methods declared in the superclass.

What is an interface?unit exercise

Interfaces **define and standardise the ways in which things such as people and systems interact with one another**. An interface declares method headers (all abstract) and constants (static final). To use one, a concrete class states that it `implements` it and declares every method with the specified signatures; a class that doesn't implement them all must be declared abstract. An interface is used when **unrelated classes need to share common methods and constants**, so their objects can be processed polymorphically. Java doesn't allow multiple inheritance, but a class can extend one superclass and implement several interfaces: `public class classname implements interface1, interface2`. Course case study: invoices and employees, which are unrelated, both implement one payment interface so a single loop works out the amount payable for each.

Downcasting: two functions and syntax2021_2 Q1c · 5 marks

A superclass reference can invoke only methods declared in the superclass. Downcasting **casts a superclass reference to a subclass reference**. Its functions:

1. It **enables a program to invoke subclass methods that are not in the superclass** (subclass-specific operations) through a superclass reference.
2. It **allows an object referred to by a superclass variable to behave like an object of its subclass**, so it can be processed according to its real type (e.g. giving only salaried-commission employees a 5% raise in the payroll example).

**Syntax** (the course prints it as `subclassname subclassobject = new (subclassname) superclassobject`; the correct Java is):

```
SubclassName subObject = (SubclassName) superclassReference;

Vehicle v = new Car();          // superclass reference to a subclass object
if (v instanceof Car) {         // check first
    Car c = (Car) v;            // DOWNCAST
    c.openBoot();               // subclass-only method now callable
}
```

Abstract class in Java + its syntax2021_2 Q2b,c · 10 marks · tested

Java lets you declare a class as **conceptual only**: it represents a category of types, not actual objects (the course's example: nobody orders "a liquid"; they order coffee, milk or tea). Such a class is declared with the keyword `abstract`. Neither the compiler nor the JVM allows an abstract class to be instantiated; it is a placeholder in the family tree. It may contain abstract methods (no body) and concrete methods. Any class with one or more abstract methods must be declared abstract, and subclasses must implement those methods or be abstract themselves.

```
abstract class ClassName {                   // general syntax
    abstract returnType methodName(parameters);   // abstract method: no body
    returnType otherMethod() { ... }              // concrete method allowed
}

abstract class Liquid {
    abstract void swirl(boolean clockwise);
    static void gurgle() { System.out.println("All Liquid objects are gurgling."); }
}
class Coffee extends Liquid {
    void swirl(boolean clockwise) {
        System.out.println("Coffee swirls " + (clockwise ? "clockwise" : "anticlockwise"));
    }
}
```

```
Liquid l = new Coffee();  l.swirl(true);  →  Coffee swirls clockwise
```

Class Invoice that implements the Payment interface2021_2 Q4 · 15 marks · the course's own example, tested

```
public interface Payment {
    public double getPaymentAmount();
}

public class Invoice implements Payment {
    private String productId;            // (a) product number
    private String productDesc;          //     and description
    private int quantity;                // (b) quantity
    private double price;                //     and price

    public Invoice(String id, String desc, int qty, double thePrice) {
        productId = id;
        productDesc = desc;
        quantity = qty;
        price = thePrice;
    }

    public double getPaymentAmount() {   // (c) implements the interface method
        return quantity * price;
    }

    public String toString() {
        return String.format("%s\n%s: %s (%s)\n%s: %d\n%s: #%.2f",
            "Invoice", "Product id", productId, productDesc,
            "Quantity", quantity, "Price per item", price);
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("0101", "PS2", 5, 500.00);
        System.out.println(inv);
        System.out.printf("Payment due: %.2f%n", inv.getPaymentAmount());
    }
}
```

```
Invoice
Product id: 0101 (PS2)
Quantity: 5
Price per item: #500.00
Payment due: 2500.00
```

**Explanation:** `implements Payment` shows the class uses the Payment interface. Because Invoice is not declared abstract, it agrees to implement every interface method, so getPaymentAmount is written to return quantity × price.

Module 3

## Methods, then operator overloading (in C#)

Module 3 · Unit 1

### Methods: signatures, calls, casting, overloading, recursion

[ ] Done

Motivations for modularising a program into methodsJan 2021 Q3a

The three kinds of module in Java are **methods, classes and packages**. Methods (called functions or procedures in other languages) let you modularise a program by separating its tasks into self-contained units. The motivations:

1. **The divide-and-conquer approach**: program development is more manageable when you construct programs from small, simple pieces.
2. **Software reusability**: existing methods are used as building blocks to create programs; programmers write programs from standardised methods rather than building customised code.
3. **Code maintainability**: methods prevent redundant, repeated code. Dividing a program into meaningful methods makes it easier to debug and maintain.

The course's analogy: hierarchical management. A boss (the caller) asks a worker (the called method) to do a task and report back, without knowing how the worker does it.

Components of a method signatureJan 2021 Q3c

A method's signature is its **name** together with its parameter list. The compiler distinguishes signatures by:

1. the **number** of parameters,
2. the **data types** of the parameters,
3. the **order** of the parameter types.

The return type is **not** part of the signature: two methods that differ only in return type cause a compile error.

Three ways to call a methodunit exercise

1. Using the method name by itself, to call another method of the same class: `getDifference(num1, num2)`
2. Using a variable holding a reference to an object, a dot, and the method name: `myCircle.calcArea()`
3. Using the class name and a dot to call a static method: `Math.sqrt(900)`

Argument promotion, implicit and explicit castingJan 2021 Q3b and Q5c

**Argument promotion** is converting an argument's value to the type the method expects to receive in its parameter. E.g. calling `Math.sqrt` (which expects a double) with an int: Java converts 5 to 5.0 automatically. Java's promotion rules allow only conversions that can be performed **without losing data**.

**Implicit cast**: happens **automatically**, because the two types are compatible and nothing can be lost (a smaller type into a larger one: int → long, int → double).

**Explicit cast**: the programmer must write the **cast operator** (the target type in brackets) because the conversion may lose data (a larger type into a smaller: long → int, double → int truncates the fraction). The programmer is telling the compiler "I know this might lose information and I accept it". This is called **casting**.

```
public class CastDemo {
    public static void main(String[] args) {
        int integer = 100;
        long longInteger;

        longInteger = integer;          // IMPLICIT cast: int -> long, no data can be lost
        integer = (int) longInteger;    // EXPLICIT cast: long -> int, needs (int)

        double d = integer;             // implicit: 100 -> 100.0
        int back = (int) 99.75;         // explicit: fraction truncated -> 99

        System.out.println(longInteger + " " + integer + " " + d + " " + back);
    }
}
```

```
100 100 100.0 99
```

The course's own sample for "cast 100" is in C#: `uint integer = 100; long longInteger; longInteger = integer; /* implicit */ integer = (uint)longInteger; /* explicit */` (tested; prints 100 100). Either version is fine; say which language you're using.

Method overloadingunit exercise

Methods of the **same name** can be declared in the same class as long as they have **different sets of parameters** (number, types or order). When an overloaded method is called, the compiler selects the right one by examining the number, types and order of the arguments. Used to create several methods that perform similar tasks on different types.

```
public static int minimum(int a, int b, int c) { … }          // int version
public static double minimum(double a, double b, double c) { … } // double version

minimum(3, 7, 6)          → 3      // calls the int version
minimum(5.0, -2.3, -7.0)  → -7.0   // calls the double version
```

Recursive methodsJan 2021 Q5a

A recursive method is **a method that calls itself**, either directly or indirectly through another method. It can only solve the simplest case, the **base case**, directly. For a harder problem it divides it into a piece it knows how to do and a piece it doesn't; the second piece must be a slightly simpler version of the original, so the method calls a fresh copy of itself on it (the **recursive call**). This continues until the base case is reached. Examples: factorial, Fibonacci series.

```
public class RecursiveFactorial {
    public static long factorial(int number)
    {
        if (number <= 1)                            // base case
            return 1;
        else
            return number * factorial(number - 1);  // recursive call
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println(i + "! = " + factorial(i));
    }
}
```

```
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
```

Unit fill-in-the-gaps and exercises

1. A method is invoked with a **method call**.
2. The **return** statement in a called method passes the value of an expression back to the caller.
3. The keyword **void** indicates a method does not return a value.
4. An object of class **Random** (java.util.Random) produces random numbers, e.g. a die: `1 + random.nextInt(6)`.

```
public static int integerPower(int base, int exponent) {   // no Math methods
    int result = 1;
    for (int i = 1; i <= exponent; i++)
        result *= base;
    return result;                                        // integerPower(3, 4) = 81
}
public static boolean isPalindrome(String s) {            // recursive
    if (s.length() <= 1) return true;                     // base case
    if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
    return isPalindrome(s.substring(1, s.length() - 1)); // "radar" -> true
}
```

Method overloading: two features2021 Q3b · 6 marks

Method overloading is declaring **several methods with the same name in the same class**, as long as they have different sets of parameters. Features:

1. The overloaded methods **must differ in signature**: number, types or order of parameters.
2. The **compiler selects** the right method by examining the number, types and order of the arguments in the call (decided at compile time).
3. The **return type alone cannot** distinguish overloaded methods.
4. Used to create methods that perform **similar tasks on different data types** (minimum for ints and for doubles).

Class FactorialFinder with method factorialCalculator2019 Q3c · 6 marks · tested

```
import java.util.Scanner;

public class FactorialFinder {
    public static long factorialCalculator(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++)
            result = result * i;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println("The factorial of " + n + " is " + factorialCalculator(n));
    }
}
```

```
Enter a number
5
The factorial of 5 is 120
```

The recursive version (above) is also fine: `return (number <= 1) ? 1 : number * factorialCalculator(number - 1);`

Module 3 · Unit 2

### Operator overloading

[ ] Done

In plain words

`+` already knows how to add two numbers. Operator overloading lets you teach it to add two of *your* objects, e.g. two Vectors. Java won't let you, so the course switches to C# (which looks almost the same) for Units 2–5.

What is operator overloading?unit exercise

Operator overloading is **the process of adding operator functionality to a class**. It lets you define exactly how an operator behaves when used with your class and other data types, so the class can be used with +, -, * and so on just as if it were a built-in type. Done by defining **static methods using the `operator` keyword**. Examples: adding two vectors, multiplying matrices, using + to add an item to a collection.

**Method overloading vs operator overloading:** method overloading gives several *methods* the same name with different parameter lists; operator overloading gives an existing *operator symbol* a new meaning for a class. Multiple overloaded versions of an operator can exist for different operand types, like method signatures.

Why Java doesn't support operator overloadingunit exercise

The designers of Java wanted to **keep Java code simple**; they found operator overloading made code **more complex and difficult to read**, and decided it was more of a problem than it was worth. The one exception is String: **+ concatenates strings** (`firstName + " " + lastName`), but this is built in and developers have no control over it.

**Making Java behave as if it did:** write ordinary methods named `plus()`, `minus()`, `multiply()` and so on. **Languages that support operator overloading:** C# and C++.

Binary and unary operator overloading in C# (tested)

Syntax for a binary operator: `public static result-type operator binary-operator(op-type operand, op-type2 operand2)`. The `operator` keyword tells the compiler the symbol that follows is an operator, not a normal method name.

```
public class Vector
{
    public double X, Y;
    public Vector(double x, double y) { X = x; Y = y; }

    public static Vector operator +(Vector v1, Vector v2)   // binary +
    { return new Vector(v1.X + v2.X, v1.Y + v2.Y); }

    public static Vector operator *(Vector v1, int scale)   // Vector first, integer second
    { return new Vector(v1.X * scale, v1.Y * scale); }

    public static Vector operator -(Vector v)               // unary negation
    { return new Vector(-v.X, -v.Y); }

    public static Vector operator ++(Vector v)              // unary increment
    { return new Vector(v.X + 1, v.Y + 1); }
}
```

```
a = (4, 11), b = (0, 8)
a + b = (4, 19)    a * 3 = (12, 33)    -a = (-4, -11)    a++ = (5, 12)
```

Binary and unary operators (and their syntax)2021 Q1f,g · 5 marks

A **binary operator** requires **two operands**: +, -, \*, / and %. A **unary operator** requires a **single operand**: increment (++), decrement (--) and negation (-).

```
public static result-type operator binary-operator(op-type operand, op-type2 operand2)
public static result-type operator unary-operator(op-type operand)
```

All operators must be declared **public static**. The `operator` keyword tells the compiler the symbol is an operator, not a normal method name. For binary, at least one operand must be the containing class; for unary, the operand must be the containing class. There's no way to distinguish prefix and postfix ++, so both use the same definition.

Two reasons Java doesn't support operator overloading2021_2 Q1d · 5 marks

1. Java's designers wanted to **keep Java code simple**.
2. They found operator overloading made code **more complex and difficult to read**, and judged it more of a problem than it was worth.
3. The same functionality is available through **ordinary methods** such as plus(), minus(), multiply().

Module 3 · Unit 3

### Logical operator overloading

[ ] Done

The logical operators that can be overloaded

Four logical operators can be **directly** overloaded: **NOT (!)**, **AND (&)**, **OR (|)** and **XOR (^)**. The short-circuit operators **&& and || cannot be overloaded directly**, but they are enabled automatically if the class meets certain conditions. Syntax: `public static bool operator logical-operator(op-type operand, op-type2 operand2)`; at least one operand must be the containing class.

How to enable the short-circuit operatorsunit exercise

1. Overload **& and |** so that they **return the class's own type** (e.g. Vector), not bool, with both parameters of that type.
2. Overload the **true and false** operators in the class.

Then `&&` and `||` work automatically. In an AND where the first operand is false, the result is false regardless of the second operand, so the second isn't evaluated (that's the "short circuit").

Program: overloading the logical operators (tested)

```
public class Vector
{
    public double X, Y;
    public Vector(double x, double y) { X = x; Y = y; }

    public static bool operator true(Vector v)  { return (v.X != 0) || (v.Y != 0); }
    public static bool operator false(Vector v) { return (v.X == 0) && (v.Y == 0); }

    public static bool operator !(Vector v) { return (v.X == 0) && (v.Y == 0); }   // NOT

    public static Vector operator &(Vector v1, Vector v2)      // AND returns Vector
    {
        bool a = !((v1.X == 0) && (v1.Y == 0));
        bool b = !((v2.X == 0) && (v2.Y == 0));
        return (a & b) ? new Vector(1, 1) : new Vector(0, 0);
    }
    public static Vector operator |(Vector v1, Vector v2)      // OR returns Vector
    {
        bool a = !((v1.X == 0) && (v1.Y == 0));
        bool b = !((v2.X == 0) && (v2.Y == 0));
        return (a | b) ? new Vector(1, 1) : new Vector(0, 0);
    }
}
// Main: Vector v1 = new Vector(0, 0); Vector v2 = new Vector(10, 0);
```

```
v1 && v2 = false
v1 || v2 = true
!v1 = True
```

A vector counts as true if either coordinate is non-zero; (0, 0) is false.

Module 3 · Unit 4

### Overloading true and false

[ ] Done

What it is

Overloading the true and false operators lets **a class represent its own state as either true or false**, using rules the programmer codes, so an object can be used directly in conditional processing: an `if` statement, a loop, or the conditional operator `?`. By default a class has no support for them: `if (test)` on a Vector fails to compile.

```
public static bool operator true(Vector v)  { return (v.X != 0) || (v.Y != 0); }
public static bool operator false(Vector v) { return (v.X == 0) && (v.Y == 0); }

Vector test = new Vector(4, 3);
if (test) Console.WriteLine("True");     // now compiles; prints True
```

Two limitations of overloading true and falseJan 2021 Q5b

1. The **return value must be a Boolean** (bool).
2. It is **invalid to overload only one of the two**: if the true operator is overloaded, so must false be, and vice versa.

The three types of overloadable operators: **unary, binary and conversion**.

Module 3 · Unit 5

### Conversion operator overloading and indexers

[ ] Done

Conversion operator overloading2023_2 Q2b · 6 marks

**Casting** permits a value of one type to be converted to another so it can be used where its current type is unsuitable. A new class can't be cast to anything until each possible cast is defined inside the class. **Conversion operator overloading** is defining those casts in the class, each declared **implicit** or **explicit**.

- An **implicit** conversion happens automatically by direct assignment, when an implicit conversion operator is defined and the types are compatible. Use it only where there's **no risk of data loss or an exception**.
- An **explicit** conversion requires the source to be prefixed with a **cast operator** (the target type in brackets). Use it in all other situations.

Syntax (they're unary operators):

```
public static implicit operator result-type(op-type operand)
public static explicit operator result-type(op-type operand)
```

result-type is the target of the cast; op-type is what's being converted. One of the two must be the class itself.

**Restrictions:** you may not create operators that convert a class (1) to the `object` type (provided automatically for boxing/unboxing), (2) to an interface (implement the interface instead), or (3) from a base class into a class derived from it.

Program that overloads a conversion operator2023_2 Q2c · 8 marks · tested

```
using System;

public class Vector
{
    public double X, Y;
    public Vector(double x, double y) { X = x; Y = y; }
    public double Length { get { return Math.Sqrt(X * X + Y * Y); } }

    // implicit conversion: Vector -> double (no data lost)
    public static implicit operator double(Vector v)
    {
        return v.Length;
    }

    // explicit conversion: Vector -> float (accuracy lost, so a cast is required)
    public static explicit operator float(Vector v)
    {
        return (float)v.Length;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Vector v = new Vector(5, 5);
        double d = v;            // implicit: no cast operator needed
        float f = (float)v;      // explicit: (float) is required
        Console.WriteLine(d);
        Console.WriteLine(f);
    }
}
```

```
7.07106781186548
7.071068
```

**Explanation to write under it:** the vector is converted to its length. Converting to a double loses nothing, so it's implicit. Converting to a float loses accuracy (7.07106781186548 becomes 7.071068), so it's explicit: removing the `(float)` causes a compiler error.

Array and indexerJan 2021 Q5d

An **array** stores a number of similar, related variables under the same name, each accessed by an index number in square brackets: `thirdItem = items[3];`

An **indexer** lets objects of a class be used like an array, with **array-style square-bracket notation** to present multiple values. It's declared with get and set accessors for `this[]`; get is required, set is left out for a read-only indexer. Indexers can be multidimensional, overloaded, use non-integer index types (like a hash table), or have no underlying array at all.

```
public data-type this[index-type index-name]
{
    get { }
    set { }
}

public class MyArray                          // array with any lower/upper bounds
{
    int _lowerBound;
    int _upperBound;
    string[] _items;
    public MyArray(int lowerBound, int upperBound)
    {
        _lowerBound = lowerBound;
        _upperBound = upperBound;
        _items = new string[1 + upperBound - lowerBound];
    }
    public string this[int index]
    {
        get { return _items[index - _lowerBound]; }
        set { _items[index - _lowerBound] = value; }
    }
}
// MyArray fruit = new MyArray(-2, 1);  fruit[-2] = "Apple";  fruit[-1] = "Orange";
// Console.WriteLine(fruit[-1]);  // Outputs "Orange"
```

Four properties of an implicit cast2021_2 Q3a · 4 marks

1. It happens **automatically**, by direct assignment of one type to another; no cast operator is written.
2. It occurs only when an implicit conversion operator has been defined and the two data types are **compatible**.
3. It should be used only where there is **no risk of data loss or an exception** (e.g. smaller integer to larger: uint → long).
4. It gives **easier-to-read, neater code**, but because the conversion isn't visible it **can hide problems** that an explicit cast would make obvious.
5. It is declared with `public static implicit operator result-type(op-type operand)`, a unary operator.

Program bank

### The short programs most likely to be asked

[ ] Done

Every program on this page was compiled and run. Copy each of these out by hand once; the act of writing it is what makes it stick.

1 · Non-executable class with a private first name, set and get2023_2 Q1a · 8 marks

```
public class SetGetClass
{
    private String firstName;              // private instance variable

    public void setFirstName(String name)  // method to assign (mutator / set)
    {
        firstName = name;
    }

    public String getFirstName()           // method to retrieve (accessor / get)
    {
        return firstName;
    }
}
```

**What to write under it:** the class is non-executable because it has no main method. firstName is private, so it can't be reached from outside the class; setFirstName assigns it and getFirstName returns it. Using set and get methods on private variables is data hiding. To use the class, an executable class creates an object of it:

```
public class SetGetClassTest {
    public static void main(String[] args) {
        SetGetClass student = new SetGetClass();
        System.out.println("Before: " + student.getFirstName());
        student.setFirstName("Daniel");
        System.out.println("After: " + student.getFirstName());
    }
}
```

```
Before: null
After: Daniel
```

"Before" prints null because the default constructor set firstName to its default value.

2 · Print a line of textJan 2021 Q2a

```
public class FirstProgram
{
    public static void main(String[] args)
    {
        System.out.println("I love Java Programming");
    }
}
```

```
I love Java Programming
```

Change the text for any version: "I am doing well in my Java lectures" is the unit exercise.

3 · Area of a sphere2023_2 Q4b · 12 marks

Surface area of a sphere = **4πr²**. Use the static field `Math.PI`.

```
import java.util.Scanner;

public class SphereArea
{
    public static double computeArea(double radius)
    {
        return 4 * Math.PI * radius * radius;          // A = 4 * pi * r^2
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double radius = input.nextDouble();
        System.out.println("The area of a sphere with radius " + radius
                           + " is " + computeArea(radius));
    }
}
```

```
Enter the radius of the sphere
7
The area of a sphere with radius 7.0 is 615.7521601035994
```

**Explanation (for the 12 marks):** the Scanner class is imported from java.util to read the radius. computeArea is static because it is called from the static main method. Math.PI is a public static final field of the Math class, so it's used without creating a Math object.

**Volume version** (Module 1 Unit 4 exercise): `double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);` Radius 3.0 gives 113.09733552923254. Write `4.0 / 3.0`, not `4 / 3`: integer division would give 1.

4 · Encapsulation2023_2 Q5b

See the [Employee program in 1.2](#m1u2): private fields, public get/set, a validity check in setSalary.

5 · Conversion operator (C#)2023_2 Q2c

See the [Vector program in 3.5](#m3u5).

Others ready to go

[Circle class](#m1u1) · [Default vs no-arg constructor](#m2u2) · [TimeClass overloaded constructors](#m2u2) · [DateClass](#m2u2) · [Static field counter](#m2u3) · [Composition (Student has-a Date)](#m2u4) · [CommissionEmployee](#m2u4) · [Inheriting vs overriding (Cup)](#m1u3) · [Abstract Shape](#m2u5) · [Casting 100](#m3u1) · [Recursive factorial](#m3u1) · [Logical operators](#m3u3) · [Indexer](#m3u5) · [Bicycle](#m1u1) · [StudentInfo (first name + age)](#m2u2) · [Invoice implements Payment](#m2u5) · [FactorialFinder](#m3u1) · [Student height](#m1u2) · [Abstract Liquid](#m2u5) · [Downcasting](#m2u5)

Past paper · 2023_2

### 2023_2 paper, answered

[ ] Done

Answer Q1 and any two others. Q1 = 30 marks, the rest 20 each. 2 hours. Each line points to the full model answer.

Q1 (30 marks)

1. **Create a non-executable class with a private instance variable for a student's first name, and methods to assign and retrieve it (8).** → [SetGetClass, program bank #1](#progs). Write the class, label "private instance variable", "set method", "get method", and add the two-line explanation.
2. **Default constructor vs no-argument constructor (7).** → [2.2](#m2u2). Default: supplied by the compiler when none is written, sets 0/false/null. No-argument: written by the programmer, no parameters, sets chosen values. Give the DefaultDemo/StudentClass code.
3. **Concept behind garbage collection (8).** → [2.2](#m2u2). Java has no destructors; GC is part of the runtime, a low-priority thread; an object is eligible when no reference refers to it; finalize is called just before reclaiming memory; GC is not guaranteed to run, so finalize is rarely used.
4. **Overriding vs inheritance with a schematic diagram (7).** → [1.3](#m1u3). Draw Cup → CoffeeCup (inherits addLiquid unchanged) and Cup → TeaCup (overrides addLiquid, same signature). Define both in one line each.

Q2 (20 marks)

1. **Abstract vs concrete class (6).** → [2.5 table](#m2u5): can't instantiate vs can; has abstract method(s) vs implements every method; abstract superclass gives a common design.
2. **Conversion operator overloading (6).** → [3.5](#m3u5): defining implicit/explicit casts in a class; implicit when no data loss; explicit needs cast operator; syntax; restrictions.
3. **Program that overloads a conversion operator (8).** → [the Vector program](#m3u5) (implicit double, explicit float).

Q3 (20 marks)

1. **Four properties of an ADT (6).** → [1.5](#m1u5): exports a type; exports a set of operations (the interface); operations are the only access to the data structure; axioms and preconditions define the domain.
2. **Types of polymorphism (8).** → [1.4](#m1u4): overloaded methods, overridden methods, dynamic method binding, each explained with an example.
3. **Six message-passing styles (6).** → [1.2](#m1u2): Actor model implementation, Amorphous computing, Antiobjects, Flow-based programming, SOAP. The course has only five, so add streams/pipes as the sixth.

Q4 (20 marks)

1. **Class vs object (8).** → [2.1 table + the blueprint/house analogy + the diagram](#m2u1).
2. **Program that computes the area of a sphere (12).** → [SphereArea, program bank #3](#progs).

Q5 (20 marks)

1. **Four benefits of bundling code into objects (12).** → [1.1](#m1u1): modularity, information-hiding, code re-use, pluggability and debugging ease.
2. **Encapsulation, with a program (8).** → [1.2](#m1u2): definition + the Employee program + explanation.

If you sat this paper tomorrow

Q1 (compulsory), then Q4 and Q5: Q4 is a class-vs-object table and the sphere program you've already seen; Q5 is a list of four plus the Employee program. Q2 is the C# one, so leave it unless conversion operators have clicked.

Past paper · January 2021 (2020_2)

### January 2021 paper, answered

[ ] Done

Answer Q1 and any three others (25 + 15 × 3).

Q1

1. **Polymorphism and its types.** → [1.4](#m1u4)
2. **Message-passing styles.** → [1.2](#m1u2) (the five)
3. **Import syntax.** `import packagename.classname;` for one class, `import packagename.*;` for all classes in a package. Example: `import java.util.Scanner;` → [2.1](#m2u1)
4. **Data hiding.** The ability of objects to shield variables from external access; a consequence of encapsulation; private variables reached only through public accessor/mutator methods, which permits validity checking. → [1.2](#m1u2)
5. **Two categories of data type.** Primitive (int, double, char, boolean…) and reference (classes, arrays, interfaces). → [2.1](#m2u1)
6. **Constructor vs method.** → [2.2 table](#m2u2): same name as the class, no return type, called automatically by new, initialises the object.

Q2

1. **Java class that prints "I love Java Programming".** → [program bank #2](#progs)
2. **Association property of a class + two advantages of software reuse.** → [2.1](#m2u1): Patient–Nurse–Doctor; dependable/efficient systems (already tested), saves time and effort.
3. **Two functions of a destructor.** → [2.2](#m2u2): release the object's memory; termination housekeeping (free other resources). Java uses GC instead.

Q3

1. **Motivations for modularising into methods.** → [3.1](#m3u1): divide and conquer, software reusability, code maintainability.
2. **Implicit vs explicit cast of 100, with code.** → [CastDemo in 3.1](#m3u1)
3. **Components of a method signature.** → [3.1](#m3u1): name + number, types and order of parameters (return type isn't part of it).

Q4

1. **Declaration of main + method syntax.** → [1.4](#m1u4): `public static void main(String[] args)`; accessmodifier returntype methodname(\[parameters\]) { body \[return value;\] }.
2. **Function of a method + four advantages.** → [1.4](#m1u4)
3. **What is an ADT?** → [1.5](#m1u5) (definition + the four properties + list example)

Q5

1. **Recursive methods.** → [3.1](#m3u1) (definition, base case, recursive call, factorial program)
2. **Two limitations of overloading true and false.** → [3.4](#m3u4): must return bool; must be overloaded as a pair.
3. **Implicit vs explicit cast.** → [3.1](#m3u1) / [3.5](#m3u5)
4. **Array and indexer.** → [3.5](#m3u5)

Past paper · 2021_2

### 2021_2 paper, answered

[ ] Done

Q1 compulsory + any three. Heavy on constructors, abstract classes, casting and interfaces.

Q1

1. **Inheritance, its usefulness, an application area (5).** → [1.3](#m1u3)
2. **(i) Constructor vs method (3); (ii) no-argument vs argument constructor (2).** → [2.2](#m2u2)
3. **Two functions of downcasting + syntax (5).** → [2.5](#m2u5)
4. **(i) Operator overloading (2); (ii) two reasons Java doesn't support it (3).** → [3.2](#m3u2)
5. **Syntax for overloading true and false (5).** `public static bool operator true(op-type operand)` and `public static bool operator false(op-type operand)`, plus the Vector example and the two limitations. → [3.4](#m3u4)

Q2

1. **"Overrides a method"; ways a subclass specialises (5).** → [1.3](#m1u3): override inherited methods; add new methods.
2. **Describe an abstract class (5); (c) its syntax (5).** → [2.5 Liquid example](#m2u5)

Q3

1. **Four properties of an implicit cast (4).** → [3.5](#m3u5)
2. **Three restrictions on overloading a conversion operator (6).** No conversion to object; none to an interface; none from a base class to its derived class. → [3.5](#m3u5)
3. **A one-dimensional indexer with accessor declaration (5).** → [the MyArray indexer](#m3u5)

Q4 (15 marks)

**Class Invoice implementing the Payment interface.** → [2.5, the full tested program](#m2u5). This is the course's Example 2.5.7 word for word.

Q5

1. **Six properties of an interface (6).** → [1.5](#m1u5)
2. **Properties of an ADT (4).** → [1.5](#m1u5)
3. **Features of encapsulation (5).** → [1.2](#m1u2)

Past paper · 2021_1

### 2021_1 paper, answered

[ ] Done

Q1 compulsory + any three. Two 13-mark programs, both straight from the course.

Q1

1. **Message passing (3); why called "shared communication" \[shared nothing\] (2).** → [1.2](#m1u2)
2. **Effect of message passing on other programming models (5).** → [1.2](#m1u2) (single means to pass control; dynamic dispatch; late binding; Alan Kay; live distributed objects; delegation)
3. **Six features of a constructor (6).** → [2.2](#m2u2)
4. **Default constructor with an example (4).** → [2.2 DefaultDemo](#m2u2)
5. **Module in programming (2).** → [1.4](#m1u4)
6. **Binary operator (2); (g) unary operator + syntax (3).** → [3.2](#m3u2)

Q2

1. **Data encapsulation (2).** Hiding an object's internal state and requiring all interaction to go through its methods. → [1.1](#m1u1)
2. **Class implementing a bicycle (13).** → [Bicycle + BicycleDemo in 1.1](#m1u1)

Q3

1. **Three kinds of modules in Java (3).** Methods, classes, packages.
2. **Method overloading + two features (6).** → [3.1](#m3u1)
3. **Key restrictions on overloading the conversion operator (6).** → [3.5](#m3u5)

Q4

1. **ADT + four properties (7).** → [1.5](#m1u5)
2. **Abstraction with an example (5).** → [1.5](#m1u5)
3. **Data hiding (3).** → [1.2](#m1u2)

Q5

1. **No-argument constructor (2).** → [2.2](#m2u2)
2. **Class with String first name and int age + a constructor assigning non-default values (13).** → [StudentInfo in 2.2](#m2u2)

Past paper · 2020_1

### 2020_1 paper, answered

[ ] Done

Q1 compulsory + any three. No long programs; all definitions and lists.

Q1

1. **Benefits of bundling code into objects (3).** → [1.1](#m1u1)
2. **Short note on OOP (4); (c) techniques used in OOP (3).** → [1.1](#m1u1): information hiding, data abstraction, encapsulation, modularity, polymorphism, inheritance.
3. **Class (3).** → [1.1](#m1u1) / [2.1](#m2u1)
4. **Define a variable (3).** → [1.1](#m1u1)
5. **Syntax for declaring a method (6).** → [1.4](#m1u4)
6. **Types of methods in Java (3).** → [1.1](#m1u1): constructor, accessor/mutator, helper, recursive.

Q2

1. **Binding vs polymorphism (3).** → [1.4](#m1u4)
2. **Method overloading (2); static method (2).** → [1.4](#m1u4)
3. **Advantages of using methods (5).** → [1.4](#m1u4)
4. **Predefined vs user-defined methods (3).** → [1.4](#m1u4)

Q3

1. **Inheritance, single and multiple inheritance (6).** → [1.3](#m1u3)
2. **Justify abstraction (5); (c) an example (4).** → [1.5](#m1u5)

Q4

1. **Uses of interfaces (3).** → [1.5](#m1u5)
2. **What an ADT is (4); (c) its properties (8).** → [1.5](#m1u5)

Q5

1. **Two parts of an ADT description (3).** Data and operations. → [1.5](#m1u5)
2. **Local and instance variable (3).** → [2.1](#m2u1)
3. **"A class is the fundamental building block": criticise (5).** → [2.1](#m2u1)
4. **Meaning of a constructor (4).** → [2.2](#m2u2)

Past paper · October 2019

### October 2019 paper, answered

[ ] Done

Q1 (25) + any three (15 each).

Q1

1. **Object in OOP (3); effects of new and finalize (2).** → [1.1](#m1u1) and [2.2](#m2u2)
2. **Interface vs abstract class declarations (2); a typical abstract method (2).** → [1.5](#m1u5)
3. **Instance variable (2); two differences from a local variable (2).** → [2.1](#m2u1)
4. **Modular programming (2); one advantage, one disadvantage (2).** → [1.4](#m1u4)
5. **Composition vs aggregation with an example (3); static method (2).** → [1.5](#m1u5), [1.4](#m1u4)
6. **Why abstract can't be used on a static method (3).** → [2.3](#m2u3)

Q2

1. **Define class (4); general syntax for a class (3).** → [1.1](#m1u1)
2. **Four rules for forming an ADT (4).** → [1.5](#m1u5)
3. **Four advantages of interfaces (4).** → [1.5](#m1u5)

Q3

1. **Message passing in pure OOP (4); four styles (2).** → [1.2](#m1u2)
2. **Three access modifiers (3).** → [2.4](#m2u4)
3. **FactorialFinder with method factorialCalculator (6).** → [3.1](#m3u1)

Q4

1. **Encapsulation (4); Student class encapsulating height (3).** → [1.2](#m1u2)
2. **Accessor and mutator methods (3); two differences between a constructor and a method (3).** → [1.2](#m1u2), [2.2](#m2u2)
3. **Subclass vs superclass (2).** → [1.3](#m1u3)

Q5

1. **Inheritance (4); three benefits (3).** → [1.3](#m1u3)
2. **No-argument constructor (4); two differences from a default constructor (2).** → [2.2](#m2u2)
3. **Two advantages of abstraction to the programmer (2).** → [1.5](#m1u5)

Last hour

### Flashcards

[ ] Done

Say the answer out loud before you open the card.

Define OOP

A programming paradigm that uses "objects" (data fields + methods and their interactions) to design applications and programs.

Two characteristics of an object

State (stored in fields) and behaviour (exposed through methods).

Four benefits of bundling code into objects

Modularity, information-hiding, code re-use, pluggability and debugging ease.

Class vs object in one line

A class is the blueprint; an object is a house built from it (an instance). Created with new.

Five message-passing styles

Actor model implementation, Amorphous computing, Antiobjects, Flow-based programming, SOAP.

Why are message-passing systems called "shared nothing"?

The message passing abstraction hides underlying state changes used in sending messages.

Encapsulation

Combining data and the operations on it in one unit (capsule); hiding implementation, access only through a public interface. One of the three fundamental principles.

Data hiding

Objects shielding variables from external access; private variables reached only via public get/set methods. A consequence of encapsulation.

Inheritance relationship and keyword

"is-a"; extends. Java: single inheritance only. Every class extends Object.

Overriding

A subclass redefines an inherited method with the same signature and return type; the subclass version is used.

Polymorphism + its types

An action or method doing different things depending on the object it acts on. Overloaded methods, overridden methods, dynamic method binding.

Late binding

The method that runs is decided at execution time, not compile time. Also called dynamic or run-time binding.

Composition

"has-a"; the containing object is responsible for the lifetime of the object it holds (Student has a GregorianCalendar).

Abstraction

Removing characteristics to reduce something to its essentials. The blind-date analogy.

Four properties of an ADT

Exports a type; exports a set of operations (the interface); operations are the only access to the data; axioms and preconditions define its domain.

Two advantages of software reuse

More dependable, efficient systems (already tested and tuned); saves the time and effort of re-inventing the wheel.

Executable vs non-executable class

Executable has a main method and runs alone; non-executable doesn't and must be used from an executable class.

Default vs no-argument constructor

Default: compiler-supplied when none written, sets 0/false/null. No-arg: programmer-written, no parameters, sets chosen values.

Constructor vs method

Constructor: same name as class, no return type (not even void), called automatically by new, initialises the object.

Garbage collection in four points

Java has no destructors; low-priority runtime thread reclaims memory; object eligible when nothing references it; finalize called first but GC not guaranteed to run.

The two static members of a class

Static methods and static fields (class variables).

Why is main static?

So the JVM can invoke it without creating an instance of the class.

Math's two static fields

Math.PI and Math.E, declared public static final.

public / private / protected

Public: everywhere. Private: only inside the class (not inherited). Protected: the class, its subclasses and the same package.

Abstract vs concrete class

Abstract: keyword abstract, can't be instantiated, has abstract method(s). Concrete: can be instantiated, implements every method.

Interface

All methods abstract, all properties static final; a class implements it and must code every method. Lets unrelated classes be processed polymorphically.

Three motivations for methods

Divide and conquer, software reusability, code maintainability.

Components of a method signature

Name + number, data types and order of the parameters. Not the return type.

Three ways to call a method

Name alone (same class); objectReference.method(); ClassName.staticMethod().

Implicit vs explicit cast

Implicit: automatic, compatible types, no data loss (int → long). Explicit: needs a cast operator, may lose data: (int) longValue.

Recursive method

A method that calls itself; solves the base case directly, otherwise calls itself on a slightly simpler problem.

Operator overloading + why Java lacks it

Adding operator functionality to a class (static methods with the operator keyword). Java's designers wanted simple, readable code; only + for String is built in.

Four directly overloadable logical operators

! (NOT), & (AND), | (OR), ^ (XOR). && and || are enabled when & and | return the class type and true/false are overloaded.

Two limits on overloading true/false

Must return bool; must be overloaded as a pair.

Three types of overloadable operator

Unary, binary, conversion.

Conversion operator syntax

public static implicit operator double(Vector v) { … } / public static explicit operator float(Vector v) { … }

Three conversion restrictions

Can't convert a class to object, to an interface, or from a base class to its derived class.

Indexer

Lets a class's objects use array-style \[ \] notation: public string this\[int index\] { get {…} set {…} }.

Area and volume of a sphere

Area 4 * Math.PI * r * r. Volume (4.0/3.0) * Math.PI * Math.pow(r, 3).

General syntax for a class

modifier(s) class ClassIdentifier { classMembers } — members are constants, variables (fields) and methods. class allocates no memory.

Four types of method in Java

Constructor, accessor/mutator (get/set), helper (private), recursive.

Two parts of an ADT description

Data (structure of the data) and Operations (the interface, incl. constructor and destructor).

Composition vs aggregation

Aggregation: contained object can exist alone. Composition: container controls its lifetime; it can't exist without the container.

Two ways a subclass specialises

Override inherited methods; add new methods (extend the interface).

Downcasting: what and syntax

Casting a superclass reference to a subclass reference so subclass-only methods can be called: Car c = (Car) v; check with instanceof first.

Why can't a static method be abstract?

Abstract methods exist to be overridden per object type; static methods aren't tied to objects and can't be overridden polymorphically.

Binary vs unary operator

Binary takes two operands (+ - * / %); unary takes one (++ -- -). Both declared public static … operator.

Three kinds of module in Java

Methods, classes, packages.

Modular programming disadvantage (course)

Each module has only one state and exists at most once in the program.

No-argument vs argument constructor

No-arg: no parameters, programmer sets values in the body. Argument: values passed in initialise the fields.

Payment / Invoice in one line

interface Payment { double getPaymentAmount(); } — Invoice implements Payment and returns quantity * price.

Made from your CIT383 course material and six past papers (October 2019 to 2023_2). Every program was compiled and run (Java 21, and Mono for the C#). Good luck on Tuesday, Daniel.