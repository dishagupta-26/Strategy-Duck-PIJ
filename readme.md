# Duck Behavior Simulation

This project simulates the behavior of different types of ducks using the Strategy design pattern.

## Classes

### Interfaces
- `QuackBehaviour`: Interface for quack behaviours.
- `SwimBehaviour`: Interface for swim behaviours.
- `FlyBehaviour`: Interface for fly behaviours.

### QuackBehavior Implementations
- `Quack`: Implements `QuackBehavior`, represents quacking.
- `Squeak`: Implements `QuackBehavior`, represents squeaking.
- `MuteQuack`: Implements `QuackBehavior`, represents silence.

### SwimBehavior Implementations
- `Swim`: Implements `SwimBehavior`, represents swimming.
- `Float`: Implements `SwimBehavior`, represents floating.

### FlyBehavior Implementations
- `FlyWithWings`: Implements `FlyBehavior`, represents flying.
- `FlyNoWay`: Implements `FlyBehavior`, represents not flying.

### Duck Classes
- `Duck`: Abstract class representing a duck.
- `MallardDuck`: Subclass of `Duck`, represents a Mallard Duck.
- `Red Head Duck`: Subclass of `Duck`, represents a Mallard Duck.
- `RubberDuck`: Subclass of `Duck`, represents a Rubber Duck.
- `DecoyDuck`: Subclass of `Duck`, represents a Decoy Duck.

## Usage
1. Clone this repository:
   ```sh
   git clone https://github.com/dishagupta-26/Strategy-Duck-PIJ.git 
   ```
