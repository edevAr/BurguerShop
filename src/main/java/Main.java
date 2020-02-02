
import Combos.*;
import Complements.*;
import Drink.Coke;
import Drink.Fanta;
import Drink.Soda;
import Vegetables.Lettuce;
import Vegetables.Onion;
import Vegetables.Tomato;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        try{
            String res = "start";
            while(!res.equals("3")){
                res = callToReader("Que desea hacer, seleccione una opcion del menu?: " +
                        "\n 1.- Listar todos los combos" +
                        "\n 2.- Crear un combo personalizado" +
                        "\n 3.- Salir(bye)");
                switch (res.toLowerCase()){
                    case "1":
                        displayAllCombos();
                        break;
                    case "2":
                        createCustomCombo();
                        break;
                    default: ;
                }
            }
            System.out.println("Gracias hasta luego");
        }catch (Exception e){
            System.out.println("Gracias hasta luego");
        }

    }
    private static String callToReader(String message){
        System.out.println(message);
        Scanner inn = new Scanner(System.in);
        return inn.nextLine();
    }
    private static void displayAllCombos(){
        String res = "start";
        while(!res.equals("finish")){
            res = callToReader("Nuestros combos tienen un descuento del 15%, Cual de los combos desea seleccionar?: " +
                    "\n 1.- Combo Big King de pollo 28.0bs" +
                    "\n 2.- Combo Whopper 25bs" +
                    "\n 3.- Combo Mega Stacker 35bs" +
                    "\n 4.- Volver al menu principal(X)");
            switch (res){
                case "1":
                    res = processSell(new BigKingDePollo());
                    String a = "b";
                    break;
                case "2":
                    res = processSell(new Whopper());
                    break;
                case "3":
                    res = processSell(new MegaStacker());
                    break;
                default:
                    return;
            }
        }
    }
    private static String createCustomCombo(){
        String condition = "complete";
        String res = "";
        Combo customCombo = new CustomCombo();
        while(!condition.equals("finish")){
            customCombo.display();
            res = callToReader("Desea agregar o quitar algo mas(Si desea quitar algo de su combo antes de el numero agregue un guion, ejem: -1)? : " +
                    "\n 1.- Carne  " +
                    "\n 2.- Queso" +
                    "\n 3.- Tocino" +
                    "\n 4.- Tomate" +
                    "\n 5.- Cebolla" +
                    "\n 6.- Lechuga" +
                    "\n 7.- Papas y/o Refresco" +
                    "\n 8.- Realizar Venta" +
                    "\n 9.- Cancelar"
            );
            switch (res.toLowerCase()){
                case "1":
                    customCombo.addComplement(new Meat());
                    break;
                case "2":
                    customCombo.addComplement(new Cheese());
                    break;
                case "3":
                    customCombo.addComplement(new Bacon());
                    break;
                case "4":
                    customCombo.addVegetable(new Tomato());
                    break;
                case "5":
                    customCombo.addVegetable(new Onion());
                    break;
                case "6":
                    customCombo.addVegetable(new Lettuce());
                    break;
                case "-1":
                    customCombo.removeComplement(new Meat());
                    break;
                case "-2":
                    customCombo.removeComplement(new Cheese());
                    break;
                case "-3":
                    customCombo.removeComplement(new Bacon());
                    break;
                case "-4":
                    customCombo.removeVegetable(new Tomato());
                    break;
                case "-5":
                    customCombo.removeVegetable(new Onion());
                    break;
                case "-6":
                    customCombo.removeVegetable(new Lettuce());
                    break;
                case "7":
                    addExtras(customCombo);
                    break;
                case "8":
                    if(customCombo.hasCreated()){
                        condition = processSell(customCombo);
                    }
                    break;
                case "9":
                    condition = "finish";
                    break;
                default:;
            }
        }
        return res;
    }
    private static void addExtras(Combo combo){
        String condition = "begin";
        String res = "";
        while(!condition.equals("complete")){
            res = callToReader("Desea agregar algo mas a su orden?: " +
                    "\n 1.- Papa " +
                    "\n 2.- Refresco" +
                    "\n 3.- Terminar orden"
            );
            switch (res.toLowerCase()){
                case "1":
                    String portions = addChips();
                    if(!portions.equals("")){
                        Complement chips = new Chips(portions);
                        combo.addComplement(chips);
                    }
                    condition = "complete";
                    break;
                case "2":
                    String sodaName = addSoda();
                    if(!sodaName.equals("")){
                        Soda soda = sodaName.equals("Fanta") ? new Fanta() : new Coke();
                        combo.setSoda(soda);
                    }
                    condition = "complete";
                    break;
                default:
                    break;
            }
        }
    }
    private static String addChips(){
        String condition = "begin";
        String res = "";
        while(!condition.equals("complete")){
            condition = callToReader("Cuantas porciones de papa desea agregar?: " +
                    "\n 1.- Una porcion " +
                    "\n 2.- Dos porciones" +
                    "\n 3.- Tres porciones" +
                    "\n 4.- Cancelar"
                    );
            switch (condition.toLowerCase()){
                case "1":
                    res = "1";
                    break;
                case "2":
                    res = "2";
                    break;
                case "3":
                    res = "3";
                    break;
                default:
                    break;
            }
            condition = "complete";
        }
        return res;
    }
    private static String addSoda(){
        String condition = "begin";
        String res = "";
        while(!condition.equals("complete")){
            condition = callToReader("Que soda desea agregar a su pedido?: " +
                    "\n 1.- Coca cola" +
                    "\n 2.- Fanta " +
                    "\n 2.- Cancelar "
            );
            switch (condition.toLowerCase()){
                case "1":
                    res = "Coca cola";
                    break;
                case "2":
                    res = "Fanta";
                    break;
                default:
                    break;
            }
            condition = "complete";
        }
        return res;
    }
    private static String processSell(Combo combo){
        int order = (int)(Math.random()*10000);
        System.out.println("==========================================================");
        System.out.println("=============Numero de orden: "+order+" =======================");
        System.out.println("==========================================================");
        combo.display();
        System.out.println("======================= Realizar venta? ===================");
        String condition = "begin";
        String res = "";
        while(!condition.equals("sell")){
            res = callToReader("1.- Aceptar  \n2.- Cancelar");
            switch (res){
                case "1":
                    condition = "sell";
                    res = "finish";
                    System.out.println("================= Se proceso la venta!!! ===================");
                    break;
                case "2":
                    condition = "sell";
                    res = "";
                    break;
                default:;
            }
        }
        return res;
    }

}
