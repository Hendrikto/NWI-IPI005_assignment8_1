package assignment8_1;

/**
 *
 * @author Hendrik
 */
public class Assignment8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Topping t = new Spikkels(new Slagroom(new Chocodip(new YoghurtIjs())));
        System.out.printf("%s (%.2f€)\n", t, (double) t.prijs() / 100);
        t = new Spikkels(new VanilleIjs());
        System.out.printf("%s (%.2f€)\n", t, (double) t.prijs() / 100);
    }

}
