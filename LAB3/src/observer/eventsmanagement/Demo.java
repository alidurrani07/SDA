package observer.eventsmanagement;

import observer.eventsmanagement.Editor;
import observer.eventsmanagement.EmailNotificationListener;
import observer.eventsmanagement.LogOpenListener;
import observer.eventsmanagement.SMSSupportListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("save", new SMSSupportListener("1234567890")); // Add SMSSupportListener

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}