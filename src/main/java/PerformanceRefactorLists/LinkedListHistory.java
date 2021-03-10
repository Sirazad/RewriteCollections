package PerformanceRefactorLists;

import java.util.*;

public class LinkedListHistory implements History {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        String[] words = text.replaceAll("\\W+", " ")
                .split(" ");
        wordsLinkedList.addAll(Arrays.asList(words));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO
    }

    @Override
    public int size() {
        return wordsLinkedList.size();
    }

    @Override
    public void clear() {
        wordsLinkedList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO

    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        for (String word : wordsLinkedList) {
            sj.add(word);
        }
        return sj.toString();

    }

}
