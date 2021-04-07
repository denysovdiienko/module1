package oda.edu.module3;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  SugarWeighed
  @version  1.0.0 
  @since 07.04.2021 - 11.02
*/

public class SugarWeighed implements IAccounting {
    private String name;
    static private double weight = 1;
    private double priceForSugar;
    private double amountOfKgs;

    public SugarWeighed() {
    }

    public SugarWeighed(String name, double weight, double priceForSugar, double amountOfKgs) {
        this.name = name;
        this.weight = weight;
        this.priceForSugar = priceForSugar;
        this.amountOfKgs = amountOfKgs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceForSugar() {
        return priceForSugar;
    }

    public void setPriceForSugar(double priceForSugar) {
        this.priceForSugar = priceForSugar;
    }

    public double getAmountOfKgs() {
        return amountOfKgs;
    }

    public void setAmountOfKgs(double amountOfKgs) {
        this.amountOfKgs = amountOfKgs;
    }

    @Override
    public String toString() {
        return "SugarWeighed{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", priceForSugar=" + priceForSugar +
                ", amountOfKgs=" + amountOfKgs +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPriceForSugar() * this.getWeight()) * this.amountOfKgs;
    }
}
