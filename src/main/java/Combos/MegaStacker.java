package Combos;

import Complements.*;
import Drink.Coke;
import Vegetables.Lettuce;
import Vegetables.Onion;
import Vegetables.Tomato;
import Vegetables.Vegetable;

import java.util.ArrayList;

public class MegaStacker extends Combo {
    public MegaStacker() {
        name = "MegaStacker";
        description = "MegaStacker";
        discount = 15.00;

        soda = new Coke();
        Vegetable tomato = new Tomato();
        Vegetable lettuce = new Lettuce();
        Vegetable onion = new Onion();

        Complement cheese = new Cheese();
        Complement meat = new Meat();
        Complement bacon = new Bacon();
        Complement chips = new Chips("1");

        complements = new ArrayList<Complement>();
        complements.add(cheese);
        complements.add(meat);
        complements.add(bacon);
        complements.add(chips);

        vegetables = new ArrayList<Vegetable>();
        vegetables.add(tomato);
        vegetables.add(lettuce);
        vegetables.add(onion);

        cost = calculatePrice() - (calculatePrice()*discount)/100;
    }


    public void display() {
        System.out.println("<<<< Combo - MegaStacker - "+ calculatePrice() +"bs >>>");
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
