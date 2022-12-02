public class AzulRunner {
    public static void main(String [] args) {
        Game game = new Game();

        Player[] players = game.getPlayers();

        players[0].addPoints(35);
        players[1].addPoints(35);
        players[2].addPoints(42);
        players[3].addPoints(78);

        new BonusFrame(game);
    }
}