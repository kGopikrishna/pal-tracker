package io.pivotal.pal.tracker;

import org.springframework.stereotype.Service;

import java.util.List;
public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry createdTimeEntry);
    public TimeEntry find(long id);
    public List<TimeEntry> list();
    public TimeEntry update(long id, TimeEntry timeEntry);
    public void delete(long id);
}
