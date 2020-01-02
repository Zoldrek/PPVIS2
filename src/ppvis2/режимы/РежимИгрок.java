package ppvis2.режимы;

import ppvis2.участники.Игрок;
import ppvis2.участники.Команда;

import java.util.ArrayList;

public class РежимИгрок {
    private int ИгровыеНавыки;
    private ArrayList<Игрок> Игроки;

    public ArrayList<Игрок> getИгроки() {
        return Игроки;
    }

    public void setИгроки(ArrayList<Игрок> игроки) {
        Игроки = игроки;
    }

    public ArrayList<Команда> getКоманды() {
        return Команды;
    }

    public void setКоманды(ArrayList<Команда> команды) {
        Команды = команды;
    }

    private ArrayList<Команда> Команды;
    public void ПроведениеБыстрогоМатчаВРолиИгрока(){}
    public void ВыходИзРежима(){}

    public int getИгровыеНавыки() {
        return ИгровыеНавыки;
    }

    public void setИгровыеНавыки(int игровыеНавыки) {
        ИгровыеНавыки = игровыеНавыки;
    }
}
