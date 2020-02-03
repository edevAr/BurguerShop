package Combos;

import Burgers.Burger;
import Burgers.ClassicBurger;
import Drinks.Coke;
import Drinks.Lemonade;
import Drinks.Soda;

public class WaxPaper extends Combo implements ICombo {
    private Burger cheeseBurger;
    private Soda soda;

    public WaxPaper(){
        name = "Wax Paper";
        description = "";
        cheeseBurger = new ClassicBurger();
        soda = new Coke();
        price = getPrice();
    }
    @Override
    public void setBurger(Burger burger) {
        cheeseBurger = burger;
    }

    @Override
    public Burger getBurger() {
        return cheeseBurger;
    }

    @Override
    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    @Override
    public Soda getSoda() {
        return soda;
    }

    @Override
    public Double getPrice() {
        return cheeseBurger.getPrice()+soda.getPrice();
    }

    @Override
    public void display() {
        System.out.println("========= "+name+"-----"+getPrice()+" ========");
    }
}
