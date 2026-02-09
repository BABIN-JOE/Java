import java.util.*;

class Traversal_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int divisor = 1;
        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }
        while (divisor > 0) {
            int digit = n / divisor;
            System.out.println(digit);
            n = n % divisor;
            divisor = divisor / 10;
        }
    }
}

