package assignment8_1;

/**
 * A plain Ijsje to base flavors on.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public abstract class Ijsje {

    protected String beschrijving = "onbekende ijsje";

    /**
     * Get the price in cents.
     *
     * @return the price in cents.
     */
    public abstract int prijs();

    /**
     * Get a description for the Ijsje.
     *
     * @return a description for the Ijsje
     */
    public String geefBeschrijving() {
        return this.beschrijving;
    }

    /**
     * Get a String representation.
     *
     * @return a String representation
     */
    @Override
    public abstract String toString();
}
