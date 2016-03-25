package assignment8_1;

/**
 * Decorator that adds sprinkles.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Spikkels extends Topping {

    public Spikkels(Ijsje ijs) {
        super(ijs);
        this.beschrijving = "Spikkels";
    }

    @Override
    public int prijs() {
        return this.base.prijs();
    }

}
