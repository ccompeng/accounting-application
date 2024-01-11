package Template;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public abstract class AccApp {
    public void switchPane(String fxmlPath, BorderPane borderPane) throws IOException {
        AnchorPane view = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlPath)));
        borderPane.setLeft(view);
    }

    public String generateID() {
        String[] charsArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "p", "q",
        "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String generatedID = "";

        for (int i = 0; i < 6; i++) {
            int rnd_idx = (int) (Math.random() * charsArr.length);
            generatedID += charsArr[rnd_idx];
        }

        return generatedID;
    }
}
