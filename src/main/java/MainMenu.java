import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
/*
 * MainMenu displays main menu for the user, first screen user sees when starting app.
 * When user finishes game it will bring him back to the main menu
 */
public class MainMenu {

    void showMainMenu() throws IOException, URISyntaxException {
        boolean runGame = true;

        welcome();
//      keeps prompting user for valid response
        while (runGame) {
            String startGame = TextParser.textInputMainMenu();
            if (startGame.equals("game")) {
                runGame = false;
            }
        }
//      for testing verbs
//      String response = TextParser.gameScannerInput();
//      TextParser.gameScannerOutput(response, player1);
//      for testing player
//      Player player1 = new Player();
//      player1.readMap();


    }

    private void welcome() {
        System.out.println(Data.textMap.get("mainMenu"));
    }

}
