import java.util.ArrayList;
import java.util.List;
class Event {
 private String name;
 private String description;
 public Event(String name, String description) {
 this.name = name;
 this.description = description;
 }
 public String getName() {
 return name;
 }
 public String getDescription() {
 return description;
 }
}

class EventLog {
 private List<Event> events;
 public EventLog() {
 events = new ArrayList<>();
 }
 public void addEvent(Event event) {
 events.add(event);
 }
 public List<Event> getEvents() {
 return events;
 }
}
public class EventLogExample {
 public static void main(String[] args) {
    
 EventLog eventLog = new EventLog();
 // Adding events to the log
 eventLog.addEvent(new Event("Event 1", "This is event 1"));
 eventLog.addEvent(new Event("Event 2", "This is event 2"));
 eventLog.addEvent(new Event("Event 3", "This is event 3"));
 // Retrieving events from the log
 List<Event> events = eventLog.getEvents();
 for (Event event : events) {
 System.out.println("Event Name: " + event.getName());
 System.out.println("Event Description: " + event.getDescription());
 System.out.println();
 }
 }
}
