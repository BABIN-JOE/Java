import java.util.*;

public class Palindrome_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og = n;
        int rev = 0;
        int temp;
        while(n!=0){
            temp = n%10;
            rev = rev*10+temp;
            n = n/10;
        }
        if(og == rev){
            System.out.println(og+" is a Palindrome");
        }
        else{
            System.out.println(og+" is Not a Palindrome");
        }
    }
}
