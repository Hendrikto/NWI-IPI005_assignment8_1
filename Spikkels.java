package assignment8_1;

/**
 * Decorator that adds sprinkles.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Spikkels extends Topping {

    /**
     * Constructor method.
     *
     * @param ijs the Ijsje to base this on
     */
    public Spikkels(Ijsje ijs) {
        super(ijs);
        this.beschrijving = "Spikkels";
    }

    /**
     * Get the price in cents.
     *
     * @return the price in cents.
     */
    @Override
    public int prijs() {
        return this.base.prijs();
    }

}
