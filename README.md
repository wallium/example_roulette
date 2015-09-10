### William Yang and Susan Lang

# example_roulette
Program to refactor that plays a game of roulette

####1. In what ways is the refactored code simpler?

The Game class is shorter and contains fewer lengthy if/else-if/else statements. We created Bet subclasses that held their unique interactions.

####2. In what ways is the refactored code more complex?

The program is split up into several classes, so making a new Bet involves creating a whole new subclass and implementing some methods.

####3. What trade-offs did you make when refactoring your old code?

We chose to have more classes, which keeps the code organized, but now there are more classes to keep track of when you extend the game.

####4. Which code do you prefer and why?

We prefer the new code because it is easier to define behaviors for new bets. The Bet class is now abstract, which makes more sense because there is no generic bet. The methods for each type of bet are defined in the Bet subclasses, instead of being separate cases in an if-statement, which also depended on the bets being in a fixed position in an array.