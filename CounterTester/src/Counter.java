/**
 This class models a tally counter.
 */
public class Counter
{
    private int value;

    /**
     Gets the current value of this counter.
     @return the current value
     */
    public int getValue()
    {
        return value;
    }

    /**
     Advances the value of this counter by 1.
     */
    public void click()
    {
        value = value + 1;
    }
    public void unclick()
    {
        value = value -1;
    }

    /**
     Resets the value of this counter to 0.
     */
    public void reset()
    {
        value = 0;
    }

//    Part 2 methods
    public void clickMany(int clicks) {
        value = value + clicks;
    }

    public void unclickMany(int unclicks) {
        value = value -unclicks;
    }
}
