package roulette;

import util.ConsoleReader;

public class TwoInARowBet extends Bet{

	public TwoInARowBet() {
		super("Two in a Row", 11);
	}

	@Override
    public String placeBet () {
        String result = "";
        result = "" + ConsoleReader.promptRange("Enter first of two consecutive numbers",
                1, Wheel.NUM_SPOTS - 2);
        return result;
    }

	@Override
	public boolean betIsMade (Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 2);
    }
	
}