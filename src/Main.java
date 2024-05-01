import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            //Inside your main method add some code that will read from standard input a sentence and then prints the count of the words that starts with a vowel A, E, I, O, U.
            //Each word that does not start with a vowel should be skipped and an error message should be printed to show that.

            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            int vowelWordsCount = 0;

            // get input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write me a sentence minimum lenght should be 20 characters, and I will count how many words start with a vowel");

            String sentence = scanner.nextLine();

            // check if sentence has a minimum of 20 characters, trying a while for some variation

            while( sentence.length() < 20 ) {
                System.err.println("Too short try again");
                sentence = scanner.nextLine();
            }

            if ( sentence.length() >= 20 ) {
                System.out.println("Length of the sentence is: " + sentence.length());
            }

            // split sentence to words in an array

            String[] splitSentence = sentence.toLowerCase().split("\\s+");

            // use for each method to go every word and check if first letter starts with a vowel

            for (String word : splitSentence ) {
                // every first character in the word
                char firstChar = word.charAt(0);

                // loop over the vowels
                for (char vowel : vowels) {
                    // if the first character is a vowel check, and add an int to th vowelWordCount+
                    if (firstChar == vowel) {
                        vowelWordsCount++;
                        break;
                    }
                }


            }

        System.out.println("The vowelcount is: " + vowelWordsCount);

            scanner.close();
    }
}