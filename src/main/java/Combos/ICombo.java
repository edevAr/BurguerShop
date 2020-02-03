package Combos;

import Burgers.Burger;
import Drinks.Soda;

public interface ICombo {
    public void setBurger(Burger burger);
    public Burger getBurger();
    public void setSoda(Soda soda);
    public Soda getSoda();
    public Double getPrice();
    public void display();
}
