package Homework;

public class Secondhighest_Array {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infsys - Autoamtion Interview
        int max = salaries[0];
        int max2 = salaries[1];
        int max3 = salaries[2];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max3 = max2;
                max2 = max;
                max = salaries[i];

            } else if (salaries[i]>max2 && salaries[i] != max) {
                max2= salaries[i];
            } else if (salaries[i]>max3 && salaries[i]!= max2 && salaries[i]!= max) {
                max3 = salaries[i];
            }
        }

        System.out.println(max3);

    }
}