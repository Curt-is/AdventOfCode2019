package com.curtis.adventofcode2019.day1;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputStreamReader inputStream = new InputStreamReader(Main.class.getResourceAsStream("input"));
        ArrayList<Integer> intArray = new ArrayList<>();

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            int line = scanner.nextInt();
            intArray.add(line);

        }

        sum(intArray);
        sumCalculationPart2(intArray);
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            integer = (integer / 3) - 2;
            sum += integer;
        }
        System.out.println(sum);
        return sum;
    }

    public static int sumCalculationPart2(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            while (integer > 0) {
                integer = (integer / 3) - 2;
                if (integer > 0) {
                    sum += integer;
//                        System.out.println(integer);
                }
            }
        }
        System.out.println(sum);

        return sum;
    }
}
