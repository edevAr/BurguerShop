import Combos.Box;
import Combos.ICombo;
import Combos.WaxPaper;

public class DefaultComboFactory extends AbstractFactory {
    @Override
    ICombo getCombo(String comboType) {
        if(comboType.equalsIgnoreCase("Box")){
            return new Box();
        }else
        if(comboType.equalsIgnoreCase("WaxPaper")){
            return new WaxPaper();
        }
        return null;
    }
}
