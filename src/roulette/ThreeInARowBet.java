package roulette;

import util.ConsoleReader;

public class ThreeInARowBet extends Bet{

	public ThreeInARowBet() {
		super("Three in a Row", 11);
	}

	@Override
    public String placeBet () {
        String result = "";
        result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
        return result;
    }

	@Override
	public boolean betIsMade (Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
	
}
