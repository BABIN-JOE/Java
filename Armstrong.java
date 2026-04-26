import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = n;
        int og = n;
        int count = 0;
        while(n!=0){
            n = n/10;
            count += 1;
        }
        int temp;
        int x = 1;
        int y = 0;
        while(z!=0){
            temp = z%10;
            for(int i=0;i<count;i++){
                x = temp*x;
            }
            z = z/10;
            y = y+x;
            x = 1;
        }
        if(y == og){
            System.out.println(og+" is an Armstrong number");
        }
        else{
            System.out.println(og+" is Not an Armstrong number");
        }
    }
}




