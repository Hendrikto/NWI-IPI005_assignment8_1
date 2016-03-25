package assignment8_1;

/**
 *
 * @author Hendrik
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
