package assignment8_1;

/**
 * Contains the main method.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Assignment8_1 {

    /**
     * Entry point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Topping t = new Spikkels(new Slagroom(new Chocodip(new YoghurtIjs())));
        System.out.printf("%s (%.2f€)\n", t, (double) t.prijs() / 100);
        t = new Spikkels(new VanilleIjs());
        System.out.printf("%s (%.2f€)\n", t, (double) t.prijs() / 100);
        // will throw an Error because you shouldn't use that combination
        // t = new Chocodip(new Slagroom(new YoghurtIjs()));
    }

}
