package assignment8_1;

/**
 *
 * @author Hendrik
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

    @Override
    public String toString() {
        return this.geefBeschrijving();
    }

}
