import java.util.*;

public record Reverse_Int() {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int rev = 0;
        int temp;
        while(n!=0){
            temp = n%10;
            rev = rev*10+temp;
            n = n/10;
        }
        System.out.println(rev);
    }
}


