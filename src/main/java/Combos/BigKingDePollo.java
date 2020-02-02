package Combos;

import Complements.*;
import Drink.Coke;
import Vegetables.Lettuce;
import Vegetables.Onion;
import Vegetables.Tomato;
import Vegetables.Vegetable;

import java.util.ArrayList;

public class BigKingDePollo extends Combo {

    public BigKingDePollo(){
        name = "Big King De Pollo";
        description = "Big King De Pollo";
        discount = 15.00;

        soda = new Coke();
        Vegetable tomato = new Tomato();
        Vegetable lettuce = new Lettuce();
        Vegetable onion = new Onion();

        Complement cheese = new Cheese();
        Complement meat = new Meat();
        Complement chips = new Chips("1");

        complements = new ArrayList<Complement>();
        complements.add(cheese);
        complements.add(meat);
        complements.add(chips);

        vegetables = new ArrayList<Vegetable>();
        vegetables.add(lettuce);
        vegetables.add(onion);

        cost = calculatePrice() - (calculatePrice()*discount)/100;
    }
    @Override
    public void display() {
        System.out.println("<<<< Combo - Big King De Pollo - "+ calculatePrice() +"bs >>>");
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
