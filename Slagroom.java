package assignment8_1;

/**
 *
 * @author Hendrik
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
