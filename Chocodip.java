package assignment8_1;

/**
 *
 * @author Hendrik
 */
public class Chocodip extends Topping {

    public Chocodip(Ijsje ijs) {
        super(ijs);
        if (ijs instanceof Slagroom) {
            throw new Error("It's not a good idea to put Chodocip ontop of Slagroom.");
        }
        this.beschrijving = "Chocodip";
    }

    @Override
    public int prijs() {
        return this.base.prijs() + 30;
    }

}
