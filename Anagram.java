    import java.util.*;

    public class Anagram {
        public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.replaceAll("\\s","").toLowerCase();
            s2 = s2.replaceAll("\\s","").toLowerCase();
            if(s1.length() != s2.length()){
                System.out.println("Not Anagram");
            }
            else{
                char[] ch1 = s1.toCharArray();
                char[] ch2 = s2.toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                if(Arrays.equals(ch1,ch2)){
                    System.out.println("Anagram");
                }
                else{
                    System.out.println("Not Anagram");
                }
            }
            
            /* 
            else{
                int[] arr = new int[26];
                for(int i = 0;i<s1.length();i++){
                    arr[s1.charAt(i) - 'a']++;
                    arr[s2.charAt(i) - 'a']--;
                }
                for(int i = 0;i<arr.length;i++){
                    if(arr[i] != 0){
                        System.out.println("Not Anagram");
                        return;
                    }
                }
                System.out.println("Anagram");
            }            
            */
            
        }
    }
