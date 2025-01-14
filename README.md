# Observer Pattern Projects

This repository contains implementations of the Observer Design Pattern in Java. The Observer Pattern is a behavioral design pattern that allows an object (the subject) to maintain a list of its dependents (observers) and notify them automatically of any state changes. This is particularly useful in scenarios where one object needs to be updated in response to changes in another object.

## Project Structure

The projects are divided into two main parts:

1. **Basic Observer Pattern Implementation**
   - **Classes:**
     - `Subject`: Maintains a list of observers and notifies them of any state changes.
     - `Observer`: An abstract class that defines the update method.
     - `BinaryObserver`: A concrete observer that outputs the state in binary format.
     - `HexaObserver`: A concrete observer that outputs the state in hexadecimal format.
     - `OctalObserver`: A concrete observer (not shown in the provided code) that would output the state in octal format.
     - `ObserverPatternDemo`: Contains the `main` method to demonstrate the observer pattern.

2. **Event Management System**
   - **Classes:**
     - `Editor`: The subject that triggers events (open and save).
     - `EventManager`: Manages event subscriptions and notifications.
     - `EventListener`: An interface for listeners that react to events.
     - `EmailNotificationListener`: Sends an email notification when an event occurs.
     - `LogOpenListener`: Logs the opening of a file to a specified log file.
     - `SMSSupportListener`: Sends an SMS notification when an event occurs.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- An IDE or text editor to run the Java code.

### Running the Projects

1. **Basic Observer Pattern Implementation:**
   - Navigate to the `ObserverPatternDemo` class.
   - Run the `main` method to see the output of state changes and observer notifications.

2. **Event Management System:**
   - Navigate to the `Demo` class.
   - Run the `main` method to see how different listeners respond to file operations.

### Example Output

- For the basic observer pattern:
- First state change: 15 Hex String: F Binary String: 1111 Second state change: 10 Hex String: A Binary String: 1010


Verify

Open In Editor
Edit
Copy code

- For the event management system:
Save to log /path/to/log/file.txt: Someone has performed open operation with the following file: test.txt Email to admin@example.com: Someone has performed save operation with the following file: test.txt Sending SMS to 1234567890: Someone has performed save operation with the following file: test.txt


Verify

Open In Editor
Edit
Copy code

## Contributing

Feel free to submit issues or pull requests if you would like to contribute to this project.

## License

This project is open-source and available under the MIT License.
