package ru.vsu.cs.ukhin.models;

public class InsertionSort implements Sort{
    private double minTime = Double.MAX_VALUE;
    private double maxTime = Double.MIN_VALUE;
    private double allTimes;
    private int count;
    private final String name = "Insertion";

    @Override
    public int[] sort(int[] arr) {
        int j;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int swap = arr[i];
            for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
                count++;
            }
            arr[j] = swap;
        }
        setTime(count);
        return arr;
    }

    @Override
    public double getMinTime() {
        return minTime;
    }

    @Override
    public double getMaxTime() {
        return maxTime;
    }

    @Override
    public double getAvgTime() {
        return allTimes/count;
    }

    @Override
    public String getName() {
        return name;
    }

    private void setTime(int a){
        if (a < minTime){
            minTime = a;
        }else if(a > maxTime){
            maxTime = a;
        }

        count++;
        allTimes +=a;

    }
}
