package school.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("development");
        words.add("deadline");
        words.add("hightech");
        words.add("technology");
        words.add("development");
        words.add("holiday");
        words.add("pullrequest");
        words.add("document");
        words.add("release");
        words.add("deadline");
        words.add("development");
        words.add("holiday");
        System.out.println(words);
        //words.forEach(System.out::println);
        int freqDevelopment = Collections.frequency(words, "development");
        int freqDeadline = Collections.frequency(words, "deadline");
        int freqHightech = Collections.frequency(words, "hightech");
        int freqTechnology = Collections.frequency(words, "technology");
        int freqHoliday = Collections.frequency(words, "holiday");
        int freqPullrequest = Collections.frequency(words, "pullrequest");
        int freqDocument = Collections.frequency(words, "document");
        int freqRelease = Collections.frequency(words, "release");
        System.out.println(freqDeadline);
        System.out.println(freqDevelopment);
        System.out.println(freqDocument);
        System.out.println(freqHightech);
        System.out.println(freqTechnology);
        System.out.println(freqHoliday);
        System.out.println(freqPullrequest);
        System.out.println(freqRelease);
        HashSet<String> uniqueSet = new HashSet<String>();
        uniqueSet.addAll(words);
        System.out.println(uniqueSet);

    }

}
