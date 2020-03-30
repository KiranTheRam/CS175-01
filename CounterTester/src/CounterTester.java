public class CounterTester {

    public static void main(String[] args) {
        Counter venue = new Counter();
        int rValue=venue.getValue();

//        Clicks 10 times
        for (int i=1; i<=10; i++) {
            venue.click();
        }

//        Unclicks 5 times
        for (int i=1; i<=5; i++) {
            venue.unclick();
        }
        rValue=venue.getValue();
//        Print total clicks
        System.out.println("venue ="+rValue);

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


        rValue=venue.getValue();
        System.out.println("venue =" + rValue);
    }

}
