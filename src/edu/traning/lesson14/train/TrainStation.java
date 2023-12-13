package edu.traning.lesson14.train;

import java.util.ArrayList;
import java.util.List;

public class TrainStation {

    private List<Train> trains = new ArrayList<>();

    public TrainStation() {
    }

    public void add(Train train) {
        trains.add(train);
    }

    public void sortTrainsByNum() {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.size() - 1; i++) {
                if (trains.get(i).getTrainNum() > trains.get(i + 1).getTrainNum()) {
                    isSorted = false;


                    Train temp = trains.get(i);
                    trains.set(i, trains.get(i + 1));
                    trains.set(i + 1, temp);

                }
            }
        }
    }

    public void sortTrainByLocation() {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0, j = 1; i < trains.size() - 1; i++, j++) {
                Train train1 = trains.get(i);
                Train train2 = trains.get(j);
                if (train1.getLocation().compareTo(train2.getLocation()) > 0) {
                    isSorted = false;


                    trains.set(i, train2);
                    trains.set(j, train1);
                }

                if (train1.getLocation().equals(train2.getLocation())) {
                    if (train1.getTimeOfDeparture().compareTo(train2.getTimeOfDeparture()) > 0) {
                        trains.set(i, train2);
                        trains.set(j, train1);
                    }
                }
            }
        }
    }


    public List<Train> findTrainByUserInputNum(int num) {
        List<Train> result = new ArrayList<>();

        for (int i = 0; i < trains.size(); i++) {
            Train train = trains.get(i);
            if (train.getTrainNum() == num) {
                result.add(train);
            }
        }

        return result;
    }

    public void printTrains() {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }
}
