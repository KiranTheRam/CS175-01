import jdk.swing.interop.SwingInterOpUtils;

public class CounterTester {

    public static void main(String[] args) {
        Counter venue = new Counter();
        int rValue;

//        Clicks 10 times
        for (int i=1; i<=10; i++) {
            venue.click();
        }

//        Unclicks 5 times
        for (int i=1; i<=5; i++) {
            venue.unclick();
        }

//        Print total clicks
        System.out.println("Expected venue = 5");
        rValue=venue.getValue();
        System.out.println("Actual venue ="+rValue);

//        Reset clicker
        venue.reset();
        rValue=0;

//        Clicks 3 times
        for (int i=1; i<=3; i++) {
            venue.click();
        }

//        Unclicks 4 times
        for (int i=1; i<=4; i++) {
            venue.unclick();
        }

//        Print total clicks
        System.out.println("Expected venue = -1");
        rValue=venue.getValue();
        System.out.println("Actual venue ="+rValue);

//        ------------- PART 2 ----------------
        System.out.println("\nOutputs for another venue:");
        Counter anotherVenue = new Counter();
        anotherVenue.clickMany(10);
        anotherVenue.unclickMany(5);

//        Prints
        System.out.println("Expected anotherVenue: 5");
        System.out.println("Actual anotherVenue: "+anotherVenue.getValue());

//      Reset
        anotherVenue.reset();

//      Clicks and unclicks
anotherVenue.clickMany(3);
anotherVenue.unclickMany(4);

//      Prints
        System.out.println("Expected anotherVenue: -1");
        System.out.println("Actual anotherVenue: "+anotherVenue.getValue());



    }

}
