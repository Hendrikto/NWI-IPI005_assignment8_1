package assignment8_1;

/**
 * An Ijsje with vanilla flavor.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class VanilleIjs extends Ijsje {

    public VanilleIjs() {
        this.beschrijving = "Vanille Ijs";
    }

    /**
     * Get a price for this Ijsje in cents.
     *
     * @return a price for this Ijsje in cents
     */
    @Override
    public int prijs() {
        return 150;
    }

    /**
     * Get a String representation.
     *
     * @return a String representation
     */
    @Override
    public String toString() {
        return this.geefBeschrijving();
    }

}
