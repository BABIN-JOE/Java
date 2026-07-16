import java.util.*;

public class Second_Max_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max1 = 0;
        int max2 = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[i]>max2 && arr[i]<max1){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}



