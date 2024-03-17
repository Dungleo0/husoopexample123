package DSA.week3.ex4;

import java.util.*;

class WordCount {
    private String word;
    private int count;

    public WordCount(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCount wordCount = (WordCount) o;
        return Objects.equals(word, wordCount.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập văn bản:");
        String input = scanner.nextLine();

        List<String> words = Arrays.asList(input.split("\\s+"));
        LinkedList<WordCount> wordCounts = new LinkedList<>();

        for (String word : words) {
            WordCount newWord = new WordCount(word);
            int index = wordCounts.indexOf(newWord);
            if (index != -1) {
                wordCounts.get(index).incrementCount();
            } else {
                wordCounts.add(newWord);
            }
        }

        System.out.println("Số lần xuất hiện của từng từ:");
        for (WordCount wordCount : wordCounts) {
            System.out.println(wordCount.getWord() + ": " + wordCount.getCount());
        }
    }
}
