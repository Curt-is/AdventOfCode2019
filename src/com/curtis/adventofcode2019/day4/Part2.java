package com.curtis.adventofcode2019.day4;
public class Part2 {

    public static void main(String[] args) {

        int minValue = 372037;
        int maxValue = 905157;

        System.out.println(calculator(minValue, maxValue));
    }

    public static int calculator(int minValue, int maxValue) {
        int passwordCounter = 0;

        while (minValue < maxValue) {
            int doubleCount = 0;
            char[] chrArray = String.valueOf(minValue).toCharArray();

            if (chrArray[0] == chrArray[1] && chrArray[1] != chrArray[2]) {
                doubleCount += 1;
            }
            if (chrArray[1] == chrArray[2] && chrArray[0] != chrArray[1] && chrArray[2] != chrArray[3]) {
                doubleCount += 1;
            }
            if (chrArray[2] == chrArray[3] && chrArray[1] != chrArray[2] && chrArray[3] != chrArray[4]) {
                doubleCount += 1;
            }
            if (chrArray[3] == chrArray[4] && chrArray[2] != chrArray[3] && chrArray[4] != chrArray[5]) {
                doubleCount += 1;
            }
            if (chrArray[4] == chrArray[5] && chrArray[3] != chrArray[4]) {
                doubleCount += 1;
            }


            if ((doubleCount >= 1) && ((chrArray[0] <= chrArray[1] && chrArray[1] <= chrArray[2] &&
                    chrArray[2] <= chrArray[3] && chrArray[3] <= chrArray[4] &&
                    chrArray[4] <= chrArray[5]))) {

//                System.out.println(minValue);
                passwordCounter += 1;

            }
            minValue += 1;
        }
        return passwordCounter;
    }
}