package roulette;

import roulette.bets.OddEven;
import roulette.bets.RedBlack;
import roulette.bets.ThreeConsecutive;
import util.ConsoleReader;

public class Factory {
	private String[] betClassNames = {"RedBlack", "OddEven", "ThreeConsecutive"};
	private String[] betInputNames = {"Red or Black", "Odd or Even", "Three in a Row"};
	private int[] betInputNum = {1, 1, 11};

    private Bet[] myPossibleBets = {
    		(Bet) Class.forName(betClassNames[0]).getConstructor(String.class, Integer.TYPE).newInstance(betInputNames[0], betInputNum[0]),
    		(Bet) Class.forName(betClassNames[0]).getConstructor(String.class, Integer.TYPE).newInstance(betInputNames[1], betInputNum[1]),
    		(Bet) Class.forName(betClassNames[0]).getConstructor(String.class, Integer.TYPE).newInstance(betInputNames[2], betInputNum[2])
    };
    
    /**
     * Prompt the user to make a bet from a menu of choices.
     */
    public Bet promptForBet () {
        System.out.println("You can make one of the following types of bets:");
        for (int k = 0; k < myPossibleBets.length; k++) {
            System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k]));
        }
        int response = ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length);
        return myPossibleBets[response - 1];
    }
}
