package chap14;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text ya3aaaam: ");
        String text = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting
        String[] words = text.split("\\s+"); // Split text into words

        String[] uniqueWords = new String[words.length];
        int[] wordCounts = new int[words.length];
        int uniqueWordCount = 0;

        for (String word : words) {
            // Check if the word is already in the uniqueWords array
            boolean found = false;
            for (int i = 0; i < uniqueWordCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCounts[i]++;
                    found = true;
                    break;
                }
            }

            // If the word is not found in the uniqueWords array, add it
            if (!found) {
                uniqueWords[uniqueWordCount] = word;
                wordCounts[uniqueWordCount] = 1;
                uniqueWordCount++;
            }
        }

        System.out.println("Word Occurrences:");
        for (int i = 0; i < uniqueWordCount; i++) {
            System.out.println(uniqueWords[i] + ": " + wordCounts[i]);
        }
    }
}