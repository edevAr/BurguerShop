package Combos;

import Complements.Cheese;
import Complements.Chips;
import Complements.Complement;
import Complements.Meat;
import Drink.Coke;
import Vegetables.Lettuce;
import Vegetables.Onion;
import Vegetables.Tomato;
import Vegetables.Vegetable;

import java.util.ArrayList;

public class Whopper extends Combo {
    public Whopper(){
        name = "Whoper";
        description = "Whoper";
        discount = 15.00;

        soda = new Coke();
        Vegetable tomato = new Tomato();
        Vegetable lettuce = new Lettuce();
        Vegetable onion = new Onion();

        Complement meat = new Meat();
        Complement chips = new Chips("1");

        complements = new ArrayList<Complement>();
        complements.add(meat);
        complements.add(chips);

        vegetables = new ArrayList<Vegetable>();
        vegetables.add(lettuce);
        vegetables.add(tomato);
        vegetables.add(onion);

        cost = calculatePrice() - (calculatePrice()*discount)/100;
    }
    @Override
    public void display() {
        System.out.println("<<<< Combo - Whoper- "+ calculatePrice() +"bs >>>");
        System.out.println("Precio con descuento del "+discount+"% : " + cost+"bs");
        for (Vegetable vegetable : vegetables) {
            vegetable.display();
        }
        for (Complement complement : complements) {
            complement.display();
        }
        soda.display();
    }
}
