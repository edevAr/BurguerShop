package Combos;

import Complements.Complement;
import Vegetables.Vegetable;

import java.util.ArrayList;

public class CustomCombo extends Combo {
    public CustomCombo(){
        name = "Combo personalizado";
        vegetables = new ArrayList<>();
        complements = new ArrayList<>();
        discount = 0.00;
        cost = calculatePrice() - (calculatePrice()*discount)/100;
    }
    @Override
    public void display() {
        System.out.println("Su combo es un: "+name);
        if(vegetables.size() == 0 && complements.size() == 0){
            System.out.println("Por favor, agregue ingredientes...");
        }else{
            System.out.println("<<<< Combo - Personalizado - "+ calculatePrice() +"bs >>>");
            System.out.println("Sus ingredientes son:");
        }
        for (Vegetable vegetable : vegetables) {
            vegetable.display();
        }
        for (Complement complement : complements) {
            complement.display();
        }
        if(soda!=null)
        soda.display();
    }
}
