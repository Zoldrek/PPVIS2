package ppvis2.ui;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ppvis2.injector.Хоккей;
import ppvis2.режимы.РежимИгрок;
import ppvis2.режимы.РежимИзучениеПравил;
import ppvis2.режимы.РежимСудья;
import ppvis2.режимы.РежимТренер;

public class ГлавноеМеню {
    private РежимИзучениеПравил ИзучениеПравил;
    private РежимИгрок Игрок;
    private РежимСудья Судья;
    private РежимТренер Тренер;

    public void ВыборРежимаИзученияПравил(){
        Label name = new Label("Изучение правил");
        Button rules1 = new Button("Текстовое описание правил");
        Button rules2 = new Button("Изучить правила");
        Button exit = new Button("Выход в главное меню");
        GridPane pane = new GridPane();
        pane.add(name, 0, 0);
        pane.add(rules1, 0, 1);
        pane.add(rules2, 0, 2);
        pane.add(exit, 0, 3);
        Stage stage = new Stage();
        stage.setScene(new Scene(pane));
        rules1.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Правила");
            alert.setContentText(ИзучениеПравил.getТекстовоеОписание());
            alert.showAndWait();
        });
        rules2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Правила");
            alert.setContentText(ИзучениеПравил.getПравила().getТекствовоеОписание());
            alert.showAndWait();
        });
        exit.setOnAction(event -> {
            stage.close();
            Хоккей хоккей = new Хоккей();
            хоккей.ЗапускИгры();
        });
        stage.show();
    }
    public void ВыборРежимаИгрок(){
        Label name = new Label("Режим:Игрок");
        Button rules1 = new Button("Создать команду");
        Button rules2 = new Button("Прокачать игрока");
        Button rules3 = new Button("Быстрый матч");
        Button exit = new Button("Выход в главное меню");
        GridPane pane = new GridPane();
        pane.add(name, 0, 0);
        pane.add(rules1, 0, 1);
        pane.add(rules2, 0, 2);
        pane.add(rules3, 0, 3);
        pane.add(exit, 0, 4);
        Stage stage = new Stage();
        stage.setScene(new Scene(pane));
        rules1.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            alert.setContentText("Отсутствует требуемый метод");
            alert.showAndWait();
        });
        rules2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            alert.setContentText("Нечего прокачивать");
            alert.showAndWait();
        });
        rules3.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            Игрок.ПроведениеБыстрогоМатчаВРолиИгрока();
            alert.setContentText("Матч проведен");
            alert.showAndWait();
        });
        exit.setOnAction(event -> {
            stage.close();
            Хоккей хоккей = new Хоккей();
            хоккей.ЗапускИгры();
        });
        stage.show();
    }
    public void ВыборРежимаСудья(){
        Label name = new Label("Режим:Судья");
        Button rules1 = new Button("Вынести наказание игроку");
        Button rules2 = new Button("Быстрый матч");
        Button exit = new Button("Выход в главное меню");
        GridPane pane = new GridPane();
        pane.add(name, 0, 0);
        pane.add(rules1, 0, 1);
        pane.add(rules2, 0, 2);
        pane.add(exit, 0, 3);
        Stage stage = new Stage();
        stage.setScene(new Scene(pane));
        rules1.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            alert.setContentText("Отсутствует необходимый метод");
            alert.showAndWait();
        });
        rules2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            Судья.ПроведениеБыстрогоМатчаВРолиСудьи();
            alert.setContentText("Матч проведен");
            alert.showAndWait();
        });
        exit.setOnAction(event -> {
            stage.close();
            Хоккей хоккей = new Хоккей();
            хоккей.ЗапускИгры();
        });
        stage.show();
    }
    public void ВыборРежимаТренер(){
        Label name = new Label("Режим:Тренер");
        Button rules1 = new Button("Улучшить игрока");
        Button rules2 = new Button("Провести тренировку");
        Button rules3 = new Button("Быстрый матч");
        Button exit = new Button("Выход в главное меню");
        GridPane pane = new GridPane();
        pane.add(name, 0, 0);
        pane.add(rules1, 0, 1);
        pane.add(rules2, 0, 2);
        pane.add(rules3, 0, 3);
        pane.add(exit, 0, 4);
        Stage stage = new Stage();
        stage.setScene(new Scene(pane));
        rules1.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            alert.setContentText("Нечего улучшать");
            alert.showAndWait();
        });
        rules2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            alert.setContentText("Отсутствует нужный метод");
            alert.showAndWait();
        });
        rules3.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Window");
            alert.setHeaderText("Результат");
            Тренер.ПроведениеБыстрогоМатчаВРолиТренера();
            alert.setContentText("Матч проведен");
            alert.showAndWait();
        });
        exit.setOnAction(event -> {
            stage.close();
            Хоккей хоккей = new Хоккей();
            хоккей.ЗапускИгры();
        });
        stage.show();
    }

    public РежимТренер getТренер() {
        return Тренер;
    }

    public void setТренер(РежимТренер тренер) {
        Тренер = тренер;
    }

    public РежимСудья getСудья() {
        return Судья;
    }

    public void setСудья(РежимСудья судья) {
        Судья = судья;
    }

    public РежимИгрок getИгрок() {
        return Игрок;
    }

    public void setИгрок(РежимИгрок игрок) {
        Игрок = игрок;
    }

    public РежимИзучениеПравил getИзучениеПравил() {
        return ИзучениеПравил;
    }

    public void setИзучениеПравил(РежимИзучениеПравил изучениеПравил) {
        ИзучениеПравил = изучениеПравил;
    }
}
