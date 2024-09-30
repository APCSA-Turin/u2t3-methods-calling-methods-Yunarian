public class Game {
    
    // instance variables
    private String gameName;
    private int score;
    private int players;


    // constructor
    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        score = 0;
    }

    // Increments player count by 1
    public void addPlayer(){
        players++;
    }

    // Increases score 
    public void increaseScore(int scoreIncrease) {
        score += scoreIncrease;
    }
    
    // Calculates the average of players scores
    public double averageScorePerPlayer() {
        return (double) score / players;
    }

    // Checks if game is over
    public boolean isGameOver() {
        if (score > 9) {
            return true;

        } else {
            return false;

        }
    }

    
    // "getter" methods
    public String getGameName() {
        return gameName;
    }


    public int getPlayers() {
        return players;
    }


    public int getScore() {
        return score;
    }
}
