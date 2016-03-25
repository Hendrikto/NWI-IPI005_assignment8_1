package assignment8_1;

/**
 * An Ijsje with yoghurt flavor.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class YoghurtIjs extends Ijsje {

    public YoghurtIjs() {
        this.beschrijving = "Yoghurt Ijs";
    }

    /**
     * Get a price for this Ijsje in cents.
     *
     * @return a price for this Ijsje in cents
     */
    @Override
    public int prijs() {
        return 200;
    }

    @Override
    public String toString() {
        return this.geefBeschrijving();
    }

}
