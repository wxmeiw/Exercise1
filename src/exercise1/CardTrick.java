package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Xiu Mei Wu May 25, 2023
 */
import java.util.Scanner;
import java.util.Random;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            //
            
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
          
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            
            hand[i] = card;
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.       
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter your card suit (0-3): ");
        int suitIndex = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitIndex]);
        
        boolean foundMatch = false;
        
        // Then loop through the cards in the array to see if there's a match.
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                foundMatch = true;
                break;
            }
        }
        // If the guess is successful, invoke the printInfo() method below.
        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found for your card.");
        }
    }
      
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    
    // I'm done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Xiu Mei Wu, but you can call me mei.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
	    
        System.out.println();
        
    
    }

}
