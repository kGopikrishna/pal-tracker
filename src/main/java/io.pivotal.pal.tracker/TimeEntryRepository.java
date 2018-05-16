package io.pivotal.pal.tracker;

import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry createdTimeEntry);
    public TimeEntry find(Long id);
    public List<TimeEntry> list();
    public TimeEntry update(Long id, TimeEntry timeEntry);
    public void delete(Long id);
}
