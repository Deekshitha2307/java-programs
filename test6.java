import java.util.Scanner;

class test6 {
    int num, sum = 0;

    public void calc() {
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of the number is: " + sum);
    }

    public static void main(String args[]) {
        test6 ob = new test6();
        ob.calc();
    }
}