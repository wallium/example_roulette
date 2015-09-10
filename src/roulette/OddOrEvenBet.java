package roulette;

import util.ConsoleReader;

public class OddOrEvenBet extends Bet{

	public OddOrEvenBet() {
		super("Odd or Even", 1);
	}
	
	@Override
    public String placeBet () {
        String result = "";
        result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
        return result;
    }
	
	@Override
	public boolean betIsMade (Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
