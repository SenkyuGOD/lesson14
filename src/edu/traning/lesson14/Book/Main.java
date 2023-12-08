package edu.traning.lesson14.Book;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();

        library1.add(new Book(1, "Избранные научно-фантастические произведения в трёх томах (том 1)", "Беляев", "ЦК ВЛКСМ", 1957, 566, 10.10, "Твёрдый"));
        library1.add(new Book(2, "Фараон", "Прус", "Гос. издательство", 1955, 703, 10.80, "Твёрдый"));
        library1.add(new Book(3, "Никогда не забудем", "-", "\"Беларусь\"", 1972, 269, 0.51, "Мягкий"));
        library1.add(new Book(4, "Молот ведьм", "Шпрингер", "Норд", 1991, 350, 25, "Мягкий"));
        library1.add(new Book(5, "Старая крепость", "Беляев", "ДОСААФ", 1981, 429, 1.70, "Твёрдый"));
        library1.add(new Book(6, "Битва железных канцлеров", "Пикуль", "Лениздат", 1978, 573, 2.70, "Твёрдый"));
        library1.add(new Book(7, "Фаворит (том 1)", "Пикуль", "Лиесма", 1991, 479, 12, "Мягкий"));

        library1.print();

        System.out.println();

        library1.printBooksByAuthor("Беляев");

        System.out.println();

        library1.printBooksByPublishingHouse("Норд");

        System.out.println();

        library1.printBooksReleasedAfterAGivenYear(1975);
    }
}
