package ppvis2.режимы;

import ppvis2.участники.Судья;

import java.util.ArrayList;

public class РежимСудья {
    private int НавыкСудейства;
    private ArrayList<Судья> Судьи;

    public ArrayList<Судья> getСудьи() {
        return Судьи;
    }

    public void setСудьи(ArrayList<Судья> судьи) {
        Судьи = судьи;
    }

    public void ПроведениеБыстрогоМатчаВРолиСудьи(){}
    public void ВыходИзРежима(){}

    public int getНавыкСудейства() {
        return НавыкСудейства;
    }

    public void setНавыкСудейства(int навыкСудейства) {
        НавыкСудейства = навыкСудейства;
    }
}
