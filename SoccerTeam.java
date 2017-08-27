
public class SoccerTeam {
	
	private int numWins;
	private int numLosses;
	private int numTies;
	private static int gamesPlayed = 0;
	private static int goalsScored = 0;
	
	public SoccerTeam() {
		numWins = 0;
		numLosses = 0;
		numTies = 0;
	}
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		// conditional to check for score differences
		gamesPlayed++;
		goalsScored = goalsScored + (myScore + opponentScore);
		if (opponentScore < myScore) {
			numWins++;
			opponent.numLosses++;
		} else {
			opponent.numWins++;
			this.numLosses++;
		}
		// conditional to check for ties
		if (myScore == opponentScore) {
			opponent.numTies++;
			numTies++;
		}
	}
	
	public int getPoints() {
		int points = (numWins * 3) + (numTies);
		return points;
	}
	
	public void reset() {
		numWins = 0;
		numLosses = 0;
		numTies = 0;
	}
	
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public static int getGoalsScored() {
		return goalsScored;
	}
	
	public static void startTournament() {
		gamesPlayed = 0;
		goalsScored = 0;
	}
}