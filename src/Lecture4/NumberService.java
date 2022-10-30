package Lecture4;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;

        if (start <= finish) {
            System.out.println("Start element is less than finish.");

            for (int i = start; i <= finish; i++) {
                System.out.println("Start: " + start + " Finish: " + finish);
                sum = i + sum;
                System.out.println("i: " + i + " sum: " + sum);
            }

        } else {
            System.out.println("Start element is bigger than finish. Start: " + start + " Finish: " + finish);

            for (int i = start; i >= finish; i--) {
                System.out.println("Start: " + start + " Finish: " + finish);
                sum = i + sum;
                System.out.println("i: " + i + " sum: " + sum);
            }
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int sum = 0;

        if (start <= finish) {
            System.out.println("Start element is less than finish.");

            for (int i = start; i <= finish; i++) {
                System.out.println("Start: " + start + " Finish: " + finish);
                if (i % 2 == 0) {
                    sum = i + sum;
                    System.out.println("i: " + i + " sum: " + sum);
                } else {
                    System.out.println("i not even: " + i + " sum: " + sum);
                }
            }
        } else {
            System.out.println("Start element is bigger than finish. Start: " + start + " Finish: " + finish);

            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    sum = i + sum;
                    System.out.println("i: " + i + " sum: " + sum);
                } else {
                    System.out.println("i not even: " + i + " sum: " + sum);
                }
            }
        }
        return sum;
    }
}



