package assignment8_1;

/**
 * Decorator that adds chocolate dip.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Chocodip extends Topping {

    /**
     * Constructor method.
     *
     * @param ijs the Ijsje to base this on
     */
    public Chocodip(Ijsje ijs) {
        super(ijs);
        if (ijs instanceof Slagroom) {
            throw new Error("It's not a good idea to put Chodocip ontop of Slagroom.");
        }
        this.beschrijving = "Chocodip";
    }

    /**
     * Get the price in cents.
     *
     * @return the price in cents
     */
    @Override
    public int prijs() {
        return this.base.prijs() + 30;
    }

}
