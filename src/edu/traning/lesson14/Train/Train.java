package edu.traning.lesson14.Train;

import java.util.Objects;

public class Train {
    private String location;
    private int trainNum;
    private String timeOfDeparture;

    public Train() {

    }

    public Train(String location, int trainNum, String timeOfDeparture) {
        setLocation(location);
        setTrainNum(trainNum);
        setTimeOfDeparture(timeOfDeparture);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    @Override
    public String toString() {
        return "Train{" +
                "location='" + getLocation() + '\'' +
                ", trainNum=" + getTrainNum() +
                ", timeOfDeparture='" + getTimeOfDeparture() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train train)) return false;
        return getTrainNum() == train.getTrainNum() && Objects.equals(getLocation(), train.getLocation()) && Objects.equals(getTimeOfDeparture(), train.getTimeOfDeparture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocation(), getTrainNum(), getTimeOfDeparture());
    }
}