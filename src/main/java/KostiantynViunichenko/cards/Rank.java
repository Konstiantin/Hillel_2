package KostiantynViunichenko.cards;

public enum Rank {

    SIX("Шесть"),
    SEVEN("Семь"),
    EIGHT("Восемь"),
    NINE("Девять"),
    TEN("Десять"),
    JACK("Валет"),
    QUEEN("Королева"),
    KING("Король"),
    ACE("Туз");

    private String translation;

    public String getTranslation() {
        return translation;
    }

    Rank(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return " Перевод на русский язык " + translation ;
    }

}
