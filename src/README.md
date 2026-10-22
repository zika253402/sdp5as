# Space Travel Strategy

## Description
This project demonstrates the Strategy Design Pattern using a space travel example. A spaceship can use different travel strategies and switch between them at runtime.

## Strategies
- `FastTravelStrategy` — travels at maximum speed.
- `FuelSavingStrategy` — travels with minimum fuel consumption.
- `SafeTravelStrategy` — travels with maximum safety.

## Pattern Structure
- **Strategy:** `TravelStrategy` — declares the `travel()` method.
- **Concrete Strategies:** `FastTravelStrategy`, `FuelSavingStrategy`, `SafeTravelStrategy` — implement different travel algorithms.
- **Context:** `SpaceShip` — stores a strategy and delegates travel to it.
- **Client:** `Main` — selects strategies and changes them at runtime.

## Clean Code Principles

### 1. Polymorphism Instead of Branching
```java
strategy.travel();
```
`SpaceShip` uses the interface instead of `if` or `switch` to choose a travel algorithm.

### 2. Meaningful Names
```java
public class FuelSavingStrategy implements TravelStrategy
```
The class name clearly explains what the strategy does.

### 3. Single Responsibility Principle
```java
public void travel() {
    strategy.travel();
}
```
`SpaceShip` delegates travel behavior, while each strategy handles its own algorithm.

### 4. Depend on Abstractions
```java
private TravelStrategy strategy;
```
`SpaceShip` depends on the `TravelStrategy` interface, not on a specific strategy class.

### 5. Open/Closed Principle
A new strategy can be added by implementing `TravelStrategy`. The existing `SpaceShip` class does not need to be changed.

## How to Run
Run `Main.java` in IntelliJ IDEA.

## Expected Output
```text
Traveling at maximum speed
Traveling with minimum fuel consumption
Traveling with maximum safety
```
