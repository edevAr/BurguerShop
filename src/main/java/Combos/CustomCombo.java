package Combos;

import Burgers.Burger;
import Drinks.Soda;
import Extras.Fries;

public class CustomCombo extends Combo implements ICombo {

    private Burger burger;
    private Soda soda;
    private Fries fries;

    public CustomCombo(String name, Burger burger, Fries fries, Soda soda){
        this.burger = burger;
        this.soda = soda;
        this.name = name;
        this.fries = fries;
    }
    @Override
    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public Burger getBurger() {
        return burger;
    }

    @Override
    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    @Override
    public Soda getSoda() {
        return soda;
    }

    public Fries getFries() {
        return fries;
    }

    public void setFries(Fries fries) {
        this.fries = fries;
    }
    @Override
    public Double getPrice() {
        return burger.getPrice()+soda.getPrice();
    }

    @Override
    public void display() {
        System.out.println("========= "+name+"-----"+getPrice()+" ========");
    }
}
