package PerformanceRefactorLists;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListHistory implements History {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        //TODO

    }


    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO
    }


    @Override
    public int size() {
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        wordsArrayList.clear();
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
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
