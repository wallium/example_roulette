package roulette;

import util.ConsoleReader;

public class HighOrLowBet extends Bet{

	public HighOrLowBet() {
		super("High or Low", 1);
	}

	@Override
	public String placeBet() {
        String result = "";
        result = ConsoleReader.promptOneOf("Please bet", "high", "low");
        return result;
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return ((myWheel.getNumber() <= 18) == betChoice.equals("low"));
	}

}
