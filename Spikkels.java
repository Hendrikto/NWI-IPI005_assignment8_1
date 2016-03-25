package assignment8_1;

/**
 *
 * @author Hendrik
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
