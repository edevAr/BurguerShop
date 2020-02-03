import Burgers.CheeseBurger;
import Combos.Box;
import Combos.ICombo;
import Combos.WaxPaper;
import Drinks.Lemonade;

public class Main {
    public static void main(String args[]) {
        ICombo box = new Box();
        box.display();


        box.setSoda(new Lemonade());
        box.display();
        box.setBurger(new CheeseBurger());
        box.display();

        ICombo waxPaper = new WaxPaper();
        waxPaper.display();
    }
}
