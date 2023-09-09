package chap14;

import java.util.Scanner;


public class WordLengthCount {
    public static void main(String[] args) {
        // counts the occurrences of words of different lengths in the input text
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text ya 3m: ");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+"); // Split text into words
        int[] wordLengthCounts = new int[21]; // Array to store word length counts (0 to 20)

        for (String word : words) {
            int length = word.length();
            if (length <= 20) {
                wordLengthCounts[length]++;
            }
        }

        System.out.println("Word Length Occurrences:");
        for (int i = 0; i <= 20; i++) {
            if (wordLengthCounts[i] > 0) {
                System.out.println(i + ": " + wordLengthCounts[i]);
            }
        }

    }
}
