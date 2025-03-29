package com.ram.amazon;

public class ParkingSystem {

    private int big=0;
    private int small=0;
    private int medium=0;

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.small=small;
        this.medium=medium;
    }

    public synchronized boolean parkCar(int carType){
        if (carType == 1 && big  > 0) {
                big--;
                return true;
        } else if (carType == 2 && medium > 0) {
                medium--;
                return true;
        } else if (carType == 3 && small > 0) {
                small--;
                return true;
        }
        return false;
    }

    public boolean addCar(int carType) {
        return parkCar(carType);
    }

}
