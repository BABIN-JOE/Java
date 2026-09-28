import java.util.*;

public class Vowel_Consonant_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s","").toLowerCase();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i); 
            if(ch >= 'a' && ch <= 'z'){
                if(vowels.contains(ch)){
                    c1++;
                }
                else{
                    c2++;
                }
            }
        }
        System.out.println("Volwel Count : " +c1);
        System.out.println("Consonant Count : " +c2);
    }
}


