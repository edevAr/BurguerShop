package Complements;

public class Chips extends Complement{
    private String portion;

    public Chips(String portion){
        name = "Papas fritas";
        this.portion = portion;
        price = String.valueOf(Double.parseDouble(portion)*5);
    }
    @Override
    public void display() {
        System.out.println(name+ "\n "+ portion + " porcion(es)");
    }
}
