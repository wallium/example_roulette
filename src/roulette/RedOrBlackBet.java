package roulette;

import util.ConsoleReader;

public class RedOrBlackBet extends Bet{

	public RedOrBlackBet() {
		super("Red or Black", 1);
	}
	
    /**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
	@Override
    public String placeBet () {
        String result = "";
        result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
        return result;
    }
	
	@Override
	public boolean betIsMade (Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}

}
