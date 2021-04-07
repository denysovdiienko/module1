package oda.edu.module3;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  SugarBoxed
  @version  1.0.0 
  @since 07.04.2021 - 11.01
*/

public class SugarBoxed implements IAccounting{
    private String name;
    private double weight;
    private double priceForSugar;
    private double priceForPack;
    private double amountOfSugarPacks;


    public SugarBoxed() {
    }

    public SugarBoxed(String name, double weight, double priceForSugar, double priceForPack, double amountOfSugarPacks) {
        this.name = name;
        this.weight = weight;
        this.priceForSugar = priceForSugar;
        this.priceForPack = priceForPack;
        this.amountOfSugarPacks = amountOfSugarPacks;
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

    public double getPriceForPack() {
        return priceForPack;
    }

    public void setPriceForPack(double priceForPack) {
        this.priceForPack = priceForPack;
    }

    public double getAmountOfSugarPacks() {
        return amountOfSugarPacks;
    }

    public void setAmountOfSugarPacks(double amountOfSugarPacks) {
        this.amountOfSugarPacks = amountOfSugarPacks;
    }

    @Override
    public String toString() {
        return "SugarBoxed{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", priceForSugar=" + priceForSugar +
                ", priceForPack=" + priceForPack +
                ", amountOfSugarPacks=" + amountOfSugarPacks +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPriceForPack() + this.priceForSugar * this.weight) * this.amountOfSugarPacks;
    }
}
