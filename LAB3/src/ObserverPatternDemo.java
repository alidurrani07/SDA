public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      // Create observers
      Observer observer1 = new HexaObserver(subject);
      Observer observer2 = new OctalObserver(subject);
      Observer observer3 = new BinaryObserver(subject);

      System.out.println("First state change: 15");
      subject.setState(15);

      // Change observer
      subject.detach(observer2);

      System.out.println("Second state change: 10");
      subject.setState(10);
   }
}
