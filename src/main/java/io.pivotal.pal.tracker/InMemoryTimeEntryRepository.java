package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

/**
 *
 */
public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    public InMemoryTimeEntryRepository(){

    }

    private HashMap<Long, io.pivotal.pal.tracker.TimeEntry> timeEntries = new HashMap<>();

        @Override
        public io.pivotal.pal.tracker.TimeEntry create(io.pivotal.pal.tracker.TimeEntry timeEntry) {
            Long id = timeEntries.size() + 1L;
            io.pivotal.pal.tracker.TimeEntry newTimeEntry = new io.pivotal.pal.tracker.TimeEntry(
                    id,
                    timeEntry.getProjectId(),
                    timeEntry.getUserId(),
                    timeEntry.getDate(),
                    timeEntry.getHours()
            );

            timeEntries.put(id, newTimeEntry);
            return timeEntries.get(id);
        }


    @Override
    public TimeEntry find(Long id) {

        return timeEntries.get(id);
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntries.values());
    }


    @Override
    public TimeEntry update(Long id, TimeEntry timeEntry) {
        io.pivotal.pal.tracker.TimeEntry updatedEntry = new TimeEntry(
                id,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours()
        );

        timeEntries.replace(id, updatedEntry);
        return updatedEntry;
    }

    @Override
    public void delete(Long id){
        timeEntries.remove(id);
    }
}
