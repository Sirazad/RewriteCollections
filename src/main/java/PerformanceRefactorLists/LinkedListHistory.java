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
        ListIterator<String> iterator = wordsLinkedList.listIterator();
        while (iterator.hasNext())
        {
            if (iterator.next().contentEquals(wordToBeRemoved)) iterator.remove();
        }
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
        ListIterator<String> iterator = wordsLinkedList.listIterator();
        while (iterator.hasNext())
        {
            if (iterator.next().contentEquals(from)) iterator.set(to);
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        String from = String.join(" ", fromWords);
        String to = String.join(" ", toWords);
        String words = String.join(" ", wordsLinkedList);

        wordsLinkedList = Arrays.asList(words.replaceAll("\\b" + from + "\\b", to)
                .split(" "));


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
