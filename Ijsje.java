package assignment8_1;

/**
 *
 * @author Hendrik
 */
public abstract class Ijsje {

    protected String beschrijving = "onbekende ijsje";

    /**
     * Get the price ins cents.
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

    @Override
    public abstract String toString();
}
