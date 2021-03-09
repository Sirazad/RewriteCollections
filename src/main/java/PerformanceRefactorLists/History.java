package PerformanceRefactorLists;

public interface History {

    /**
     * Appends the list  with the words from <code>text</code>
     *
     * @param text: (must have) individual worlds will be added to the end of the list
     * nothing to return
     */

    void add(String text);


    /**
     * Removes all occurrences of the String <code>wordToBeRemoved</code> from the list
     *
     * @param wordToBeRemoved: (must have) This will be removed from the list
     * nothing to return
     */

    void removeWord(String wordToBeRemoved);



    /**
     * Counts elements of the list
     * no parameters
     * @return int:     a primitive int representing how many elements the list has
     */

    int size();


    /**
     * Removes all elements of the list
     * no parameters or return value
     */

    void clear();


    /**
     * Takes  all occurrences of the String <code>from</code> from the list and places the String <code>to</code> into its place
     *
     * @param from: (must have) This will be removed from the list
     * @param to: (must have) This will be removed from the list
     * nothing to return
     */

    void replaceOneWord(String from, String to);

    /**
     * Takes  all occurrences of the array of Strings <code>fromWords</code> from the list and places the relevant String from <code>toWords</code> into its place
     *
     * @param fromWords (must have) This will be removed from the list
     * @param toWords (must have) This will be removed from the list
     * nothing to return
     */

    void replaceMoreWords(String[] fromWords, String[] toWords);

    /**
     * DON'T rewrite this method!
     * replaces all occurrences of sentences or words with sentences or words.
     * The tests are using this method instead of replaceOneWord() or replaceMoreWords().
     *
     * @param from: the sentence or word what needs to be replaced
     * @param to:   the sentence or word which replaces the sentence found in 'from'
     */
    default void replace(String from, String to) {
        String[] fromWords = from.split("\\s+");
        String[] toWords = to.split("\\s+");
        if (fromWords.length == 1 && toWords.length == 1) {
            replaceOneWord(from, to);
        } else {
            replaceMoreWords(fromWords, toWords);
        }
    }
}
