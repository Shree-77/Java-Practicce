package StringQuestions.question5;

import java.util.Random;

/**
 *    Write an application that uses random-number generation to create sentences. Use four arrays of
 *    strings called article, noun, verb and preposition. Create a sentence by selecting a word at random from
 *    each array in the following order: article, noun, verb, preposition, article and noun. As each word is
 *    picked, concatenate it to the previous words in the sentence. The words should be separated by spaces.
 *    When the final sentence is output, it should start with a capital letter and end with a period. The
 *    application should generate and display 20 sentences.
 *    The article array should contain the articles "the", "a", "one", "some" and "any"; the noun array should
 *    contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain the verbs
 *    "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should contain the prepositions
 *    "to", "from", "over", "under" and "on".
 */

public class RandomSentences {
    public static void main(String[] args) {
        Random rand = new Random();
        String [] article ={"the", "a", "one", "some","any"};
        String [] noun ={"boy", "girl", "dog", "town","car"};
        String [] verb ={"drove", "jumped", "ran", "walked","skipped"};
        String [] Preposition ={"to", "from", "over", "under","on"};

        for (int i=0;i<20;i++){
            String Sentences = article[rand.nextInt(5)] +
                    " " +
                    noun[rand.nextInt(5)] +
                    " " +
                    verb[rand.nextInt(5)] +
                    " " +
                    Preposition[rand.nextInt(5)] +
                    " " +
                    article[rand.nextInt(5)] +
                    " " +
                    noun[rand.nextInt(5)];
            System.out.println(Sentences);
        }


    }
}
