package assignment8_1;

/**
 *
 * @author Hendrik
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
