# Logistics Factory Application

## Project Purpose

This Java application demonstrates two creational design patterns:

- **Factory Method** is used to create transport for road and sea delivery.
- **Abstract Factory** is used to create matching Windows or macOS UI components.

The user selects the delivery mode and UI platform at runtime.

## Project Structure

```text
src/
├── app/
│   ├── Main.java
│   └── DeliveryApplication.java
│
├── transport/
│   ├── Transport.java
│   ├── Truck.java
│   ├── Ship.java
│   ├── Logistics.java
│   ├── RoadLogistics.java
│   └── SeaLogistics.java
│
└── gui/
    ├── Button.java
    ├── Checkbox.java
    ├── GUIFactory.java
    ├── windows/
    │   ├── WindowsFactory.java
    │   ├── WindowsButton.java
    │   └── WindowsCheckbox.java
    └── macos/
        ├── MacOSFactory.java
        ├── MacOSButton.java
        └── MacOSCheckbox.java

diagrams/
├── factory method.png
├── abstract factory.png
├── factory-method.puml
└── abstract-factory.puml
```

## Prerequisites

- Java JDK 26
- IntelliJ IDEA or another Java IDE

## Build and Run

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Set the Project SDK to **JDK 17**.
3. Open `src/app/Main.java`.
4. Run the `Main` class.
5. Enter the delivery mode and UI platform when prompted.

### Terminal

From the project root directory:

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out app.Main
```

## Supported Input Values

Delivery mode:

```text
ROAD
SEA
```

UI platform:

```text
WINDOWS
MACOS
```

The application also accepts lowercase input because the entered values are converted to uppercase.

Invalid or missing input displays a validation message and stops the application.

## Sample Run

```text
Enter delivery mode (ROAD or SEA): ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS

Delivery mode: ROAD
UI platform: WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```
