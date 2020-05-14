import java.io.*;
import java.util.*;

public class App {
    // Write your code here.
    String queue = "";
    String stack = "";
    int sLength = 0;
    int qLength = 0;

    public void pushCharacter(char c){
        stack+=c;
        sLength++;
        
    }

    public void enqueueCharacter(char c){
        queue+=c;
        qLength++;
    }

    public char popCharacter(){
       return stack.charAt(--sLength);
    }

    public char dequeueCharacter(){
        if(qLength==queue.length())
            qLength=0;
        return queue.charAt(qLength++);
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        App p = new App();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}