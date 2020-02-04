
import Burgers.CheeseBurger;
import Combos.CustomCombo;
import Combos.ICombo;
import Drinks.Coke;
import Drinks.Lemonade;
import Extras.ChunkyFries;
import Extras.ClassicFries;

public class CustomComboFactory extends AbstractFactory {
    @Override
    ICombo getCombo(String comboType) {
        if(comboType.equalsIgnoreCase("CustomCombo-Che-Chu-Co")){
            return new CustomCombo("CustomCombo", new CheeseBurger(), new ChunkyFries(), new Coke());
        }else
        if(comboType.equalsIgnoreCase("CustomCombo-Che-Chu-Le"))    {
            return new CustomCombo("CustomCombo", new CheeseBurger(), new ChunkyFries(), new Lemonade());
        }else
        if(comboType.equalsIgnoreCase("CustomCombo-Che-Cl-Le")){
            return new CustomCombo("CustomCombo", new CheeseBurger(), new ClassicFries(), new Lemonade());
        }else
        if(comboType.equalsIgnoreCase("CustomCombo-Che-Cl-Co")){
            return new CustomCombo("CustomCombo", new CheeseBurger(), new ClassicFries(), new Coke());
        }
        return null;
    }
}
