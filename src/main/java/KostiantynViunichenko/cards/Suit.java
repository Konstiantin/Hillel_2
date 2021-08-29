package KostiantynViunichenko.cards;
//
//1. Написать два класса Enum - Suit и Rank. Suit - масть карт(DIAMONDS,CLUBS,HEARTS,SPADES),
//        Rank - ранг карт(JACK,QUEEN,KING,ACE).
//        2. Создать класс Card  в котором будут две приватные переменные которые не будут меняться с типами enum классов Suit и Rank,
//        а также конструктор который будет в эти переменные записывать новые значения при создании
//        нового экземпляра класса card, перепишите метод toString
//        который будет возвращать масть и ранг карты, а так же гетеры которые возвращают ранг и масть
//        3.  Написать класс Deck, экземпляры которого представляют собой колоду из 36 карт.
//        Заполнение осуществлять в конструкторе класса
//        4.  Написать метод для получения названия всех карт на русском языке.
//        5.  Вывести на экран перевод Туза.
//       6.  Вывести на экран перевод Туза. Вызовы производим в классе Run, блок main
//       7.  Переопределить метод toString в классе Rank. И вывести на экран что получится для туза
//        8.  Создать конструктор в классе Suit по аналогии с класом Rank где будет хранится условное числовое значение для каждой масти
// (DIAMONDS - 1,CLUBS - 3,HEARTS - 2,SPADES - 0)
//    9.  Вывести на экран название масти.
//10. Вывести на экран условно числовое значение ранга карты.
//11. Вывести на экран порядковый номер константы Король (индекс Enum).
//12 Переписать метод toString для Deck для вывода колоды карт


public enum Suit {

    DIAMONDS(2),
    CLUBS(3),
    HEARTS(6),
    SPADES(10);


    private int number;

    public int getNumber() {
        return number;
    }

    Suit(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " Масть " + number;
    }
}