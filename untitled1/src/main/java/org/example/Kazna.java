package org.example;

public class Kazna extends Castle {
    public static void SaveOrSpend(double amount_of_money)
    {
        if (amount_of_money > 0) {
            treasury += amount_of_money;
            System.out.println("Казна была пополнена на " + amount_of_money + " монет");
        }
        else if (amount_of_money < 0){
            if (amount_of_money / -1 <= treasury)
            {
                treasury += amount_of_money;
                System.out.println("Из казны потрачено " + amount_of_money / -1 + " монет");
            }
            else {
                System.out.println("Нельзя потратить больше монет чем есть в казне!");
            }
        }
        else {
            System.out.println("Нельзя пополнить казну на 0 монет!");
        }
    }
    public void get_tax(double count_of_money_for_tax){
        if (count_of_money_for_tax > 0) {
            double tax_from_people = count_of_humans * count_of_money_for_tax;
            double tax_from_buildings = buildings.size() * count_of_money_for_tax * 10;
            double sum_of_tax = tax_from_people + tax_from_buildings;
            treasury += sum_of_tax;
            System.out.println("В казну поступило " + sum_of_tax + " монет");
        }
        else
        {
            System.out.println("Налог не может быть отрицательным!");
        }
    }
}
