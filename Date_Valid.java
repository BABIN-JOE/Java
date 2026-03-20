import java.util.*;

class Date_Valid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();
        if(Y >= 1900 && Y<=9999 && M>=1 && M<=12){
            if(M==1||M==3||M==5||M==7||M==8||M==10||M==12){
                if(D>0 && D<=31){
                    System.out.println("Valid");
                }
                else{
                    System.err.println("Invalid");
                }
            }
            else if(M==4||M==6||M==9||M==11){
                if(D>0 && D<=30){
                    System.err.println("Valid");
                }
                else{
                    System.err.println("Invalid");
                }
            }
            else if(M==2){
                if(D>0 && D<=28){
                    System.out.println("valid");
                }
                else{
                    System.err.println("Invalid");
                }
            }
            else if(M==2 && Y%4 != 0 && Y%100 != 0 || Y%400 == 0){
                if(D>0 && D<=29){
                    System.err.println("Valid");
                }
                else{
                    System.err.println("Invalid");
                }
            }
        }
        else{
            System.err.println("Invalid");
        }
    }
}
