package edu.traning.lesson14.train;

public class Main {
    public static void main(String[] args) {
        TrainStation trainStation1 = new TrainStation();

        trainStation1.add(new Train("Витебск", 109, "9:00"));
        trainStation1.add(new Train("Минск", 99, "18:33"));
        trainStation1.add(new Train("Гомель", 120, "21:55"));
        trainStation1.add(new Train("Гродно", 35, "14:45"));
        trainStation1.add(new Train("Брест", 14, "21:12"));
        trainStation1.add(new Train("Минск", 25, "13:30"));
        trainStation1.sortTrainByLocation();
        trainStation1.printTrains();

        System.out.println();

        TrainStation trainStation2 = new TrainStation();
        trainStation2.add(new Train("Vitebsk", 109, "9:00"));
        trainStation2.add(new Train("Minsk", 99, "18:33"));
        trainStation2.add(new Train("Gomel", 120, "21:55"));
        trainStation2.add(new Train("Grodno", 35, "14:45"));
        trainStation2.add(new Train("Brest", 14, "21:12"));
        trainStation2.add(new Train("Minsk", 25, "13:30"));
        trainStation2.sortTrainsByNum();
        trainStation2.printTrains();
    }
}
