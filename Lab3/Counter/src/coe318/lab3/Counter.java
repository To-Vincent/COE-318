/**
 *
 * @author Vincent To
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int modulus;
    int digit;
    int counter;
    Counter leftCounter;
    
    public Counter(int modulus, Counter left) 
    {
    this.modulus = modulus;
    leftCounter = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() 
    {
        return modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() 
    {
        return leftCounter;
    }

    /**
     * @return the digit
     */
    public int getDigit() 
    {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) 
    {
        this.digit = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() 
    {
    digit++;
        if(digit == modulus)
        {
        digit = 0;
            if (leftCounter != null)
            {
            leftCounter.digit++;
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (leftCounter == null)
        {
        counter = digit;
        }
        else 
        {
        counter = (modulus * leftCounter.digit) + digit;
        }
        return counter;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
