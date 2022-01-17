package com.company;

public class Main {

    public static void main(String[] args) {
        //#1
        //System.out.println("Задача №1");

        int [] firstArray = new int[3];
        firstArray [0] = 1;
        firstArray [1] = 2;
        firstArray [2] = 3;

        double [] secondArray = {1.57, 7.654, 9.986};

        boolean [] thirdArray = {true, false, true, true, true, false};

        //#2
        System.out.println("\nЗадача №2");
        int firstArrayLastElement = firstArray.length -1;
        int secondArrayLastElement = secondArray.length -1;
        int thirdArrayLastElement = thirdArray.length -1;

        String message = "";

        message += firstArray[0];
        for (int i = 1; i <= firstArrayLastElement; i++) {
            message += "," + firstArray[i];
        }
        message += " " +secondArray[0];
        for (int i = 1; i <= secondArrayLastElement; i++) {
            message += "," + secondArray[i];
        }
        message += " " + thirdArray[0];
        for (int i = 1; i <= thirdArrayLastElement; i++) {
            message += "," + thirdArray[i];
        }
        System.out.println(message);

        //#3
        System.out.println("\nЗадача №3");

        message = "";

        message += firstArray[firstArrayLastElement];
        for (int i = firstArrayLastElement-1; i >= 0; i--) {
            message += "," + firstArray[i];
        }
        message += "\n" +secondArray[secondArrayLastElement];
        for (int i = secondArrayLastElement-1; i >= 0; i--) {
            message += "," + secondArray[i];
        }
        message += "\n" + thirdArray[thirdArrayLastElement];
        for (int i = thirdArrayLastElement-1; i >= 0; i--) {
            message += "," + thirdArray[i];
        }
        System.out.println(message);

        //#4
        System.out.println("\nЗадача №4");

        for (int i = 0; i <= firstArrayLastElement; i++) {
            if (firstArray[i] % 2 == 1)
                firstArray[i]++;
            System.out.println(firstArray[i]);
        }

    }
}
