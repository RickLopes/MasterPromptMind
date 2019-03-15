import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Game {

    private Server server;
    //private ConcurrentHashMap<String, Player> playerList;
    private int passwordGame;
    private HashMap<Player,Integer> playersGuess;


    private void passwordGenerator(){
        passwordGame = (int)(1000 + Math.random() * 1000);
    }

    public void start(){
        server = new Server();

    }


    private void guessFromPlayer(){
        int guess = player.getGuess();
        playersGuess.put(getPlayer, guess);

    }


    private void verificate(){

        passwordGame.

    }










    public static void main(String[] args) {

       Game game = new Game();
       game.passwordGenerator();
        System.out.println(game.passwordGame);
    }


}
