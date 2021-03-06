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
        String[] words = text.replaceAll("\\W+", " ")
                .split(" ");
        wordsArrayList.addAll(Arrays.asList(words));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        wordsArrayList.removeIf(n -> n.contentEquals(wordToBeRemoved));
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
        ListIterator<String> iterator = wordsArrayList.listIterator();
        while (iterator.hasNext())
        {
            if (iterator.next().contentEquals(from)) iterator.set(to);
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        String from = String.join(" ", fromWords);
        String to = String.join(" ", toWords);
        String words = String.join(" ", wordsArrayList);

        wordsArrayList = Arrays.asList(words.replaceAll("\\b" + from + "\\b", to)
                .split(" "));
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        for (String word : wordsArrayList) {
            sj.add(word);
        }
        return sj.toString();
    }
}
