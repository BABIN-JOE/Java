import java.util.*;

public class Array_Traversal_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[5];
        for(int i=0;i<5;i++){
            ar[i] = sc.nextLine();
        }
        for(int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}

