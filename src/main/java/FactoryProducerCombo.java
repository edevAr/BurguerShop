public class FactoryProducerCombo {
    public static AbstractFactory getFactory(boolean defaultCombo){
        if(defaultCombo){
            return new DefaultComboFactory();
        }else{
            return new CustomComboFactory();
        }
    }
}
