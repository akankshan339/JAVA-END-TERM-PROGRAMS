import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!contains(result,ch)) {
                result.append(ch);
            }
        }
        System.out.println("The given string is: " + s);
        System.out.println("After removing duplicate characters the new string is: " + result.toString());
    sc.close();
    }
    private static boolean contains(StringBuffer res, char ch) {
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == ch) 
                return true;
        }
        return false;
    }}
