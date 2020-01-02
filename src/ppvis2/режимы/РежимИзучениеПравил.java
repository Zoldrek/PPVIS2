package ppvis2.режимы;

import ppvis2.участники.Правила;

public class РежимИзучениеПравил {
    private String ТекстовоеОписание;
    private Правила Правила;

    public ppvis2.участники.Правила getПравила() {
        return Правила;
    }

    public void setПравила(ppvis2.участники.Правила правила) {
        Правила = правила;
    }

    public void ВыводТекстовогоОписания(){}
    public void ВыходИзРежима(){}

    public String getТекстовоеОписание() {
        return ТекстовоеОписание;
    }

    public void setТекстовоеОписание(String текстовоеОписание) {
        ТекстовоеОписание = текстовоеОписание;
    }
}
