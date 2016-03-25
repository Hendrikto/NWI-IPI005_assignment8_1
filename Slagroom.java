package assignment8_1;

/**
 * Decorator that adds whipped cream.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Slagroom extends Topping {

    public Slagroom(Ijsje ijs) {
        super(ijs);
        this.beschrijving = "Slagroom";
    }

    @Override
    public int prijs() {
        return this.base.prijs() + 50;
    }

}
