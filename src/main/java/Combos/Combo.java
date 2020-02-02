package Combos;

import Drink.Soda;
import Complements.Complement;
import Vegetables.Vegetable;

import java.util.List;

public abstract class Combo {
    protected String name;
    protected String description;
    protected Double cost;
    protected Double discount;

    Soda soda;
    List<Vegetable>vegetables;
    List<Complement>complements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public List<Complement> getComplements() {
        return complements;
    }

    public void setComplements(List<Complement> complements) {
        this.complements = complements;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }
    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }
    public void addComplement(Complement complement){
        complements.add(complement);
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }
    public abstract void display();

    public void removeVegetable(Vegetable vegetable) {
        int position = getPosition(vegetable.getName());
        vegetables.remove(position);
    }
    public void removeComplement(Complement complement) {
        int position = getComplementPosition(complement.getName());
        complements.remove(position);
    }
    private int getPosition(String name){
        int position = 0;
        for(int i =0;i<vegetables.size(); i++){
            Vegetable vegetable = vegetables.get(i);
            if (vegetable.getName().equals(name)) {
                position = i;
            }
        }
        return  position;
    }
    public boolean hasCreated(){
        return vegetables.size() != 0 || complements.size() != 0;
    }
    private int getComplementPosition(String name){
        int position = 0;
        for(int i =0;i<complements.size(); i++){
            Complement complement = complements.get(i);
            if (complement.getName().equals(name)) {
                position = i;
            }
        }
        return  position;
    }
    public Double calculatePrice(){
        double price = 0.0;
        if(vegetables != null){
            for (Vegetable vegetable : vegetables) {
                price = price + Double.parseDouble(vegetable.getPrice());
            }
        }
        if(complements != null){
            for (Complement complement : complements) {
                price = price + Double.parseDouble(complement.getPrice());
            }
        }
        if(soda !=null){
            price = price + Double.parseDouble(soda.getPrice());
        }
        return price;
    }
}
