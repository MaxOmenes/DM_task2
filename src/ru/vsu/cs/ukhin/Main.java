package ru.vsu.cs.ukhin;

import ru.vsu.cs.ukhin.models.InsertionSort;
import ru.vsu.cs.ukhin.models.Sort;
import ru.vsu.cs.ukhin.tools.FileReader;
import ru.vsu.cs.ukhin.tools.FileWriter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileWriter f = new FileWriter(args[1]);
        ArrayList<Sort> sorts = new ArrayList<>();
        sorts.add(new InsertionSort());


        int[] arr = new FileReader(args[0]).read();

        for(Sort s:sorts){
            int[] sorted = s.sort(arr);
            for(int i = 0; i < sorted.length; i++){
                f.print(Integer.toString(sorted[i])
                        +((i!=sorted.length-1)?", ":";\n"));
            }
            f.println(Double.toString(s.getAvgTime()));
            f.close();
        }


    }
}