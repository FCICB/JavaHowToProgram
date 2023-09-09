package chap14;
import javafx.scene.control.TableColumn;

import java.util.Scanner;
public class LetterCount {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a line of text ya dude: ");
        String text=scanner.nextLine().toLowerCase();
        int[] letterCounts=new int[26];

        for (int i=0; i<text.length();i++){
            char c=text.charAt(i);
            if(c>='a' && c<='z'){
                int index=c-'a'; //determine the position of the character
                letterCounts[index]++;
            }
        }

        System.out.println("Letter Occurrences: ");
        for (char c='a'; c<='z'; c++){
            int index=c-'a';

            if(letterCounts[index]>0){
                System.out.println(c+ ": "+letterCounts[index]);
            }
        }
    }
}
