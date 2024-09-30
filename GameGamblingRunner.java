public class GameGamblingRunner {
    public static void main(String[] args) {
        Game game = new Game("Monopoly", 4);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());

        game.increaseScore(3);
        game.addPlayer();
        game.addPlayer();
        System.out.println(); 
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println();

        game.increaseScore(-9);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
    }
}
