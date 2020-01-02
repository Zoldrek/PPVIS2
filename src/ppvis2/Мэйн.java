package ppvis2;

import ppvis2.injector.Хоккей;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Мэйн extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    public void СоздатьМоделиИгры(){

    }

    @Override
    public void start(Stage primaryStage) {
        Хоккей хоккей = new Хоккей();
        хоккей.ЗапускИгры();
    }
}
