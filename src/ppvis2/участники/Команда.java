package ppvis2.участники;

import java.util.ArrayList;

public class Команда {
    public ArrayList<Игрок> getПолевыеИгроки() {
        return ПолевыеИгроки;
    }

    public void setПолевыеИгроки(ArrayList<Игрок> полевыеИгроки) {
        ПолевыеИгроки = полевыеИгроки;
    }

    public ArrayList<Игрок> getВратари() {
        return Вратари;
    }

    public void setВратари(ArrayList<Игрок> вратари) {
        Вратари = вратари;
    }

    public int getКоличествоИгроков() {
        return КоличествоИгроков;
    }

    public void setКоличествоИгроков(int количествоИгроков) {
        КоличествоИгроков = количествоИгроков;
    }

    public Тренер getРуководитель() {
        return руководитель;
    }

    public void setРуководитель(Тренер руководитель) {
        this.руководитель = руководитель;
    }

    private int КоличествоИгроков;
    private ArrayList<Игрок> Вратари;
    private ArrayList<Игрок> ПолевыеИгроки;
    private Тренер руководитель;

    public void УчвстиеВМатче(){}
}
