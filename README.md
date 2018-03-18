## BlackJack 

### Week 3 Homework for Skill Distillery

### What I did:
1. Create a Dealer class with a hand object and a deck object. The dealer should also have a method that can create a new deck when the deck is low on cards.
2. Create a Player class with a hand object. 
3. Create a Hand class with an array list of cards and methods that the hand can do.
4. These methods should be able to add the cards up, display cards, shuffle the deck, empty the hand, and deal a card to each player's hand.
5. Create a Game class that will hold the bulk of the game's logic.
6. The Game class will take input from the keyboard and call methods to play the game.
7. The rules of the game will be different for the player and the dealer.
8. The Game class will need to call methods from the Hand class in order to play the game. It will also have to display the winner of the game and be able to reset and play again.
9. Create a GameApp class with a main, a scanner and a launch method.

### What I learned:
1. Initially I had created an abstract Players class and extended my DealerHand and PlayerHand from that. However I realized that I would not be creating objects for these classes. In other words.... it was going to be harder than I wanted lol
2. Once I created my Hand class it was incredibly helpful to visualize an actual BlackJack game and playing a hand.
3. When I got to my Game class I needed guidance in the initial dealing of the cards, once I was able to picture myself actually being dealt cards something clicked and I was able to run with it and completely finish my entire program.
4.While playing my finished game I noticed I was being dealt the same cards every first round. I wasn't calling the shuffle method before the dealer was dealing out the cards.
5. This project was a HUGE ah ha moment for me and I'm stoked!!