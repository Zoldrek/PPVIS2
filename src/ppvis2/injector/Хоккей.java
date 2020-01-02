package ppvis2.injector;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ppvis2.ui.ГлавноеМеню;
import ppvis2.режимы.РежимИгрок;
import ppvis2.режимы.РежимИзучениеПравил;
import ppvis2.режимы.РежимСудья;
import ppvis2.режимы.РежимТренер;
import ppvis2.участники.*;

import java.util.ArrayList;

public class Хоккей {
private ArrayList<Character> УчастникиИгровогоПроцесса;
public void ЗапускИгры(){
    Правила правила = createПравила("text");
    Игрок игрок1 = createИгрок(false,true);
    Игрок игрок2 = createИгрок(true,false);
    Судья судья = createСудья(5);
    ArrayList<Судья> судьи = new ArrayList<>();
    судьи.add(судья);
    Тренер тренер = createТренер(3);
    ArrayList<Тренер> тренеры = new ArrayList<>();
    тренеры.add(тренер);
    ArrayList<Игрок> Вратари = new ArrayList<>();
    Вратари.add(игрок1);
    ArrayList<Игрок> Игроки = new ArrayList<>();
    Игроки.add(игрок2);
    Команда команда = createКоманда(Вратари.size()+Игроки.size(), Вратари, Игроки, тренер);
    ArrayList<Команда> команды = new ArrayList<>();
    команды.add(команда);
    РежимИгрок ри = createРежимИгрок(4, Игроки,команды );
    РежимТренер рт = createРежимТренер(4,тренеры, команды);
    РежимСудья рс = createРежимСудья(8, судьи);
    РежимИзучениеПравил рип = createИзучениеПравил("text", правила);
    ГлавноеМеню ГМ = createГлавноеМеню(рип, рс, рт, ри);

    Label name = new Label("Хоккей");
    Button rules = new Button("Изучение правил");
    Button player = new Button("Режим Игрок");
    Button trainer = new Button("Режим Тренер");
    Button judge = new Button("Режим Судья");
    Button exit = new Button("Выход из игры");
    GridPane pane = new GridPane();
    pane.add(name, 0, 0);
    pane.add(rules, 0, 1);
    pane.add(player, 0, 2);
    pane.add(trainer, 0, 3);
    pane.add(judge, 0, 4);
    pane.add(exit, 0, 5);
    Stage stage = new Stage();
    stage.setScene(new Scene(pane));
    rules.setOnAction(event -> {
        stage.close();
        ГМ.ВыборРежимаИзученияПравил();
        });
    player.setOnAction(event -> {
        stage.close();
        ГМ.ВыборРежимаИгрок();
        });
    trainer.setOnAction(event -> {
        stage.close();
        ГМ.ВыборРежимаТренер();
    });
    judge.setOnAction(event -> {
        stage.close();
        ГМ.ВыборРежимаСудья();
    });
    exit.setOnAction(event -> {
        stage.close();
    });
    stage.show();
}
public void ВыходИзИгры(){}

public Тренер createТренер(int ОпытТренирования){
    Тренер тренер = new Тренер();
    тренер.setОпытТренирования(ОпытТренирования);
    return тренер;
}

public Судья createСудья(int НавыкСудейства){
    Судья судья = new Судья();
    судья.setНавыксудейства(НавыкСудейства);
    return судья;
}

public Правила createПравила(String ТекствовоеОписание){
    Правила правила = new Правила();
    правила.setТекствовоеОписание(ТекствовоеОписание);
    return правила;
}

public Команда createКоманда(int КоличествоИгроков, ArrayList<Игрок> Вратари, ArrayList<Игрок> ПолевыеИгроки, Тренер Руководитель){
    Команда команда = new Команда();
    команда.setВратари(Вратари);
    команда.setПолевыеИгроки(ПолевыеИгроки);
    команда.setКоличествоИгроков(КоличествоИгроков);
    команда.setРуководитель(Руководитель);
    return команда;
}

public Игрок createИгрок(boolean Вратарь, boolean Игрок){
    Игрок игрок = new Игрок();
    игрок.setПозицияВратаря(Вратарь);
    игрок.setПозицияполевогоигрока(Игрок);
    return игрок;
}

public РежимИгрок createРежимИгрок(int ИгровыеНавыки,ArrayList<Игрок> Игроки, ArrayList<Команда> Команды){
    РежимИгрок ри = new РежимИгрок();
    ри.setИгровыеНавыки(ИгровыеНавыки);
    ри.setИгроки(Игроки);
    ри.setКоманды(Команды);
    return ри;
}

public РежимТренер createРежимТренер(int ТренерскийОпыт, ArrayList<Тренер> Тренеры, ArrayList<Команда> Команды){
    РежимТренер рт = new РежимТренер();
    рт.setКоманды(Команды);
    рт.setТренерскийОпыт(ТренерскийОпыт);
    рт.setТренеры(Тренеры);
    return рт;
}

public РежимСудья createРежимСудья(int НавыкСудейства, ArrayList<Судья> Судьи){
    РежимСудья рс = new РежимСудья();
    рс.setНавыкСудейства(НавыкСудейства);
    рс.setСудьи(Судьи);
    return рс;
}

public РежимИзучениеПравил createИзучениеПравил(String ТекстовоеОписание, Правила правила){
    РежимИзучениеПравил рип = new РежимИзучениеПравил();
    рип.setТекстовоеОписание(ТекстовоеОписание);
    рип.setПравила(правила);
    return рип;
    }

public ГлавноеМеню createГлавноеМеню(РежимИзучениеПравил рип, РежимСудья рс, РежимТренер рт, РежимИгрок ри){
    ГлавноеМеню меню = new ГлавноеМеню();
    меню.setИгрок(ри);
    меню.setИзучениеПравил(рип);
    меню.setТренер(рт);
    меню.setСудья(рс);
    return меню;
}
}
