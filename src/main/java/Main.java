import Burgers.CheeseBurger;
import Combos.Box;
import Combos.Combo;
import Combos.ICombo;
import Combos.WaxPaper;
import Drinks.Lemonade;

public class Main {
    public static void main(String args[]) {

        AbstractFactory comboFactory = FactoryProducerCombo.getFactory(true);

         ICombo box = comboFactory.getCombo("Box");
         box.display();

         ICombo waxPaper = comboFactory.getCombo("WaxPaper");
         waxPaper.display();

         AbstractFactory customComboFactory = FactoryProducerCombo.getFactory(false);
         ICombo custom = customComboFactory.getCombo("CustomCombo-Che-Chu-Co");
         custom.display();
        /*ICombo box = new Box();
        box.display();


        box.setSoda(new Lemonade());
        box.display();
        box.setBurger(new CheeseBurger());
        box.display();

        ICombo waxPaper = new WaxPaper();
        waxPaper.display();*/
    }
}
