package ppvis2.режимы;

import ppvis2.участники.Команда;
import ppvis2.участники.Тренер;

import java.util.ArrayList;

public class РежимТренер {
    private int ТренерскийОпыт;
    private ArrayList<Тренер> Тренеры;
    private ArrayList<Команда> Команды;

    public ArrayList<Команда> getКоманды() {
        return Команды;
    }

    public void setКоманды(ArrayList<Команда> команды) {
        Команды = команды;
    }

    public ArrayList<Тренер> getТренеры() {
        return Тренеры;
    }

    public void setТренеры(ArrayList<Тренер> тренеры) {
        Тренеры = тренеры;
    }

    public void ПроведениеБыстрогоМатчаВРолиТренера(){};
    public void ВыходИзРежима(){}

    public int getТренерскийОпыт() {
        return ТренерскийОпыт;
    }

    public void setТренерскийОпыт(int тренерскийОпыт) {
        ТренерскийОпыт = тренерскийОпыт;
    }
}
