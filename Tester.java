
/**
 * Tester Class
 * @author Dylan Decker
 */
public class Tester {

	public static void main(String[] args) {
		SoccerTeam.startTournament();
		System.out.println("Tournament 1 Started");
		// Static class variables have the same value across all objects of that class.
		// You can access a class variable from any object of that class and it will
		// have the same value.
		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();
		SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		// instance where team 1 wins
		team1.played(team2, 3, 0);
		// another game
		team2.played(team3, 5, 2);
		// instance where teams are tied
		team3.played(team4, 3, 3);
		// instance where the opponent team wins
		team4.played(team2, 5, 7);
		System.out.println("Team 1 Points: " + team1.getPoints());
		System.out.println("Team 2 Points: " + team2.getPoints());
		System.out.println("Team 3 Points: " + team3.getPoints());
		System.out.println("Team 4 Points: " + team4.getPoints());
		System.out.println("GENERAL INFORMATION");
		System.out.println("Total number of games played: " + SoccerTeam.getGamesPlayed());
		System.out.println("Total number of goals scored: " + SoccerTeam.getGoalsScored());
		System.out.println("");
		
		// Second Tournament
		SoccerTeam.startTournament();
		System.out.println("Tournament 2 Started");
		// Static class variables have the same value across all objects of that class.
		// Resets the points for every team
		team1.reset();
		team2.reset();
		team3.reset();
		team4.reset();
		// instance where team 1 wins
		team1.played(team2, 1, 2);
		// another game
		team2.played(team3, 5, 6);
		// instance where teams are tied
		team3.played(team4, 6, 6);
		// instance where the opponent team wins
		team4.played(team2, 3, 5);
		System.out.println("Team 1 Points: " + team1.getPoints());
		System.out.println("Team 2 Points: " + team2.getPoints());
		System.out.println("Team 3 Points: " + team3.getPoints());
		System.out.println("Team 4 Points: " + team4.getPoints());
		System.out.println("GENERAL INFORMATION");
		System.out.println("Total number of games played: " + SoccerTeam.getGamesPlayed());
		System.out.println("Total number of goals scored: " + SoccerTeam.getGoalsScored());
	}
}