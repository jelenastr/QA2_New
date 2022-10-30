package Lecture4;

public class ArraysElementsSum {
    public static void main(String[] args) {

        int[] elements = {5, 67, 4654, -548, 45, 0, 45, 5854};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
//     sum = sum + elements[i];

//     sum -= elements[i];
//     sum = sum - elements[i];

            System.out.println("Current element is " + i + " sum is " + sum);

        }
        for (int element:elements){
            sum += element;
            System.out.println("Sum is " + sum);
        }
    }
}

