package oda.edu.module3;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  MainSugar
  @version  1.0.0 
  @since 07.04.2021 - 11.12
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSugar {
    public static void main(String[] args) {
        List<IAccounting> list = new ArrayList<>(
                Arrays.asList(
                        new SugarBoxed("Svoya Liniya", 2, 26, 3, 1),
                        new SugarBoxed("Posad", 2, 27, 3, 1),
                        new SugarBoxed("Dobra Vigoda", 2, 25, 1, 1),
                        new SugarBoxed("TM Varus", 2, 26.5, 4, 1),
                        new SugarWeighed("ATB", 1, 25, 2),
                        new SugarWeighed("Silpo", 1, 29.5, 2),
                        new SugarWeighed("AgroVM", 1, 27, 2),
                        new SugarWeighed("Rinok", 1, 26.5, 2)
                )
        );
        double totalSum = list.stream().mapToDouble(IAccounting::getUltimatePrice).sum();
        double theCheapest = list.stream().mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();
        double theMostExpensive = list.stream().mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();

        IAccounting element = list.stream().filter(item -> item.getUltimatePrice() == theMostExpensive)
                .findFirst().orElse(null);

        System.out.println("The most expensive sugar is : " + element);

        IAccounting element1 = list.stream().filter(item -> item.getUltimatePrice() == theCheapest)
                .findFirst().orElse(null);

        System.out.println("The cheapest sugar is : " + element1);

        System.out.println("Sum of Packed and Weighed sugar is : " + totalSum + " UAH");

        double totalSumPackedSugar = list.stream()
                .filter(el -> el instanceof SugarBoxed)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        double totalSumWeighedSugar = list.stream()
                .filter(el -> el instanceof SugarWeighed)
                .mapToDouble(IAccounting::getUltimatePrice).sum();

        if (totalSumPackedSugar > totalSumWeighedSugar) {
            System.out.println("Sum of Packed sugar bigger than Weighed");
        } else {
            System.out.println("Sum of Weighed sugar bigger than Packed");
        }
    }
}
