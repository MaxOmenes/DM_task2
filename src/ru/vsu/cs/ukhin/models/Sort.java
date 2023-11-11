package ru.vsu.cs.ukhin.models;

public interface Sort {
    int[] sort(int [] arr);

    double getMinTime();
    double getMaxTime();
    double getAvgTime();
    String getName();
}
