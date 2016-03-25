package assignment8_1;

/**
 * A base decorator for Ijsjes.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public abstract class Topping extends Ijsje {

    protected Ijsje base;

    public Topping(Ijsje ijs) {
        this.base = ijs;
    }

    @Override
    public int prijs() {
        return this.base.prijs();
    }

    @Override
    public String toString() {
        return String.join(", ", this.base.toString(), this.beschrijving);
    }

}
