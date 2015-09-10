package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet{
	
	public SingleNumberBet(){
		super("Single number", 35);
	}
	
	
	@Override
	public String placeBet() {
	    String result = "";
        result = "" + ConsoleReader.promptRange("Enter a number 1-35",
                1, Wheel.NUM_SPOTS);
        return result;
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
        return (Integer.parseInt(betChoice) == myWheel.getNumber());
	}

}
