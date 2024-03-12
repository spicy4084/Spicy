public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int secondLargest;

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            secondLargest = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}