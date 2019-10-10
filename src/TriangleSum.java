public class TriangleSum {

    public static void main(String[] args) {

        System.out.println(triangleSum(10));

    }

    private static int triangleSum(int line) {
        int number = 1;
        int sum = 0;
        int sumOneLine = 0;
        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", number);
                sum += number;
                sumOneLine = sum;
                number += 2;

            }
            System.out.print(" sum numbers = " + sum);
            sum = 0;
            System.out.println();
        }
        return sumOneLine;
    }

}