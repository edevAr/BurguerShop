package Combos;

import Burgers.Burger;
import Burgers.ClassicBurger;
import Drinks.Coke;
import Drinks.Soda;

public class Box extends Combo implements ICombo {
    private Burger classicBurger;
    private Soda soda;

    public Box(){
        name = "Box";
        description = "";
        classicBurger = new ClassicBurger();
        soda = new Coke();
        price = getPrice();
    }
    @Override
    public void setBurger(Burger burger) {
        classicBurger = burger;
    }

    @Override
    public Burger getBurger() {
        return classicBurger;
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
        return classicBurger.getPrice()+soda.getPrice();
    }

    @Override
    public void display() {
        System.out.println("========= "+name+"-----"+getPrice()+" ========");
    }

}
