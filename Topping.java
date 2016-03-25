package assignment8_1;

/**
 * A base decorator for Ijsjes.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public abstract class Topping extends Ijsje {

    protected Ijsje base;

    /**
     * Constructor method.
     *
     * @param ijs the Ijsje to base this on
     */
    public Topping(Ijsje ijs) {
        this.base = ijs;
    }

    /**
     * Get the price in cents.
     *
     * @return the price in cents
     */
    @Override
    public int prijs() {
        return this.base.prijs();
    }

    /**
     * Get a String representation.
     *
     * @return a String representation
     */
    @Override
    public String toString() {
        return String.join(", ", this.base.toString(), this.beschrijving);
    }

}
