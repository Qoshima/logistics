# Logistics Factory Patterns

## Project Purpose

This project demonstrates two creational design patterns in Java:

- Factory Method is used to create transport for road or sea delivery.
- Abstract Factory is used to create matching Windows or macOS UI components.

The application allows the user to choose a delivery mode and a UI platform at runtime.

## Design Patterns

### Factory Method

The Factory Method pattern is used for logistics.

- `Transport` - Product
- `Truck`, `Ship` - Concrete Products
- `Logistics` - Creator
- `RoadLogistics`, `SeaLogistics` - Concrete Creators

`Logistics` contains the shared `planDelivery()` workflow and uses
`createTransport()` to obtain a transport.

### Abstract Factory

The Abstract Factory pattern is used for UI components.

- `Button`, `Checkbox` - Abstract Products
- `WindowsButton`, `WindowsCheckbox` - Windows Concrete Products
- `MacOSButton`, `MacOSCheckbox` - macOS Concrete Products
- `GUIFactory` - Abstract Factory
- `WindowsFactory`, `MacOSFactory` - Concrete Factories

`DeliveryApplication` receives `GUIFactory` and `Logistics`
through its constructor and works with their abstractions.

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
    │
    ├── windows/
    │   ├── WindowsFactory.java
    │   ├── WindowsButton.java
    │   └── WindowsCheckbox.java
    │
    └── macos/
        ├── MacOSFactory.java
        ├── MacOSButton.java
        └── MacOSCheckbox.java

uml/
├── factory-method.puml
└── abstract-factory.puml
