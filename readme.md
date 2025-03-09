# Duck Behaviour Simulation

This project simulates the behaviour of different types of ducks using the Strategy design pattern.

## Classes

### Interfaces
- `QuackBehaviour`: Interface for quack behaviours.
- `SwimBehaviour`: Interface for swim behaviours.
- `FlyBehaviour`: Interface for fly behaviours.

### QuackBehaviour Implementations
- `Quack`: Implements `QuackBehaviour`, represents quacking.
- `Squeak`: Implements `QuackBehaviour`, represents squeaking.
- `MuteQuack`: Implements `QuackBehaviour`, represents silence.

### SwimBehaviour Implementations
- `Swim`: Implements `SwimBehaviour`, represents swimming.
- `Float`: Implements `SwimBehaviour`, represents floating.

### FlyBehaviour Implementations
- `FlyWithWings`: Implements `FlyBehaviour`, represents flying.
- `FlyNoWay`: Implements `FlyBehaviour`, represents not flying.

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
