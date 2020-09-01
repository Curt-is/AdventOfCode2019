package com.curtis.adventofcode2019.day2;

public class Main {


    public static void main(String[] args) {


//        int[] test1 = {1, 0, 0, 0, 99};
//        int[] test2 = {2, 3, 0, 3, 99};
//        int[] test3 = {2, 4, 4, 5, 99, 0};
//        int[] test4 = {1, 1, 1, 4, 99, 5, 6, 0, 99};
        int[] input = {1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 5, 19, 23, 2, 10, 23, 27, 1,
                27, 5, 31, 2, 9, 31, 35, 1, 35, 5, 39, 2, 6, 39, 43, 1, 43, 5, 47, 2, 47, 10, 51, 2, 51, 6, 55, 1, 5,
                55, 59, 2, 10, 59, 63, 1, 63, 6, 67, 2, 67, 6, 71, 1, 71, 5, 75, 1, 13, 75, 79, 1, 6, 79, 83, 2, 83,
                13, 87, 1, 87, 6, 91, 1, 10, 91, 95, 1, 95, 9, 99, 2, 99, 13, 103, 1, 103, 6, 107, 2, 107, 6, 111,
                1, 111, 2, 115, 1, 115, 13, 0, 99, 2, 0, 14, 0};

//        System.out.println(intCode(test1));
//        System.out.println(intCode(test2));
//        System.out.println(intCode(test3));
//        System.out.println(intCode(test4));
        System.out.println(intCode(input));


    }


    public static int intCode(int[] intArray) {

        int result = intArray[0];
        int anchorValue1 = 0;
        int anchorValue2 = 1;
        int anchorValue3 = 2;
        int anchorValue4 = 3;
        boolean flag = true;

        while (flag) {

            int anchorPosition = intArray[anchorValue1];


            if (anchorPosition == 1) {
                int valueFromElement1 = intArray[anchorValue2];
                int valueFromElement2 = intArray[anchorValue3];
                int valueFromElement3 = intArray[anchorValue4];

                intArray[valueFromElement3] = intArray[valueFromElement1] + intArray[valueFromElement2];

            }

            if (anchorPosition == 2) {
                int valueFromElement1 = intArray[anchorValue2];
                int valueFromElement2 = intArray[anchorValue3];
                int valueFromElement3 = intArray[anchorValue4];

                intArray[valueFromElement3] = intArray[valueFromElement1] * intArray[valueFromElement2];

            }

            anchorValue1 += 4;
            anchorValue2 += 4;
            anchorValue3 += 4;
            anchorValue4 += 4;
            if (intArray[anchorValue1] == 99) {
                flag = false;
            }
        }
        return intArray[0];
    }
}

