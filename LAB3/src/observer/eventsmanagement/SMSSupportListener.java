package observer.eventsmanagement;

import java.io.File;
public class SMSSupportListener implements EventListener {
    private String phoneNumber;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "Someone has performed " + eventType + " operation with the following file: " + file.getName();
        if (message.length() > 160) {
            System.out.println("Warning: The default SMS message is too long (" + message.length() + " characters). Please define a valid default SMS message.");
        } else {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
            // Here you would implement the actual SMS sending logic.
        }
    }
}