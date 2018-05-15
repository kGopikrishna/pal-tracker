package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Repository {

    public static List<TimeEntry> repo=null;

    public static synchronized List<TimeEntry> getRepo() throws Exception{
        if(repo==null) {
            repo = new ArrayList<>();
            repo.add(new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8));
            repo.add(new TimeEntry(2L, 789L, 321L, LocalDate.parse("2017-01-07"), 4));
        }
        return repo;
    }
}
