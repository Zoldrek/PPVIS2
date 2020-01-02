package ppvis2.участники;

public class Игрок {

    private boolean ПозицияПолевогоИгрока;
    private boolean ПозицияВратаря;
    public void ИгратьНаПозициииПолевогоИгрока(){};
    public void ИгратьНаПозициииВратаря(){};

    public boolean isПозицияполевогоигрока() {
        return ПозицияПолевогоИгрока;
    }

    public boolean isПозицияВратаря() {
        return ПозицияВратаря;
    }

    public void setПозицияВратаря(boolean позицияВратаря) {
        ПозицияВратаря = позицияВратаря;
    }

    public void setПозицияполевогоигрока(boolean позицияполевогоигрока) {
        ПозицияПолевогоИгрока = позицияполевогоигрока;
    }

}
