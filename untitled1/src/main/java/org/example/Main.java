package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Castle m = new Castle();
        Build n = new Build();
        Kazna k = new Kazna();
        while (true){
            System.out.println("Выберите функцию: ");
            System.out.println("1) Казнь");
            System.out.println("2) Рождение детей");
            System.out.println("3) Операции с казной");
            System.out.println("4) Построить здание");
            System.out.println("5) Разрушить постройку");
            System.out.println("6) Продать постройку");
            System.out.println("7) Налоги");
            System.out.println("8) Набор гвардии");
            System.out.println("9) Тренровать гвардию");
            System.out.println("10) Сила гвардии");
            System.out.println("11) Сменить короля");
            System.out.println("12) Выход");
            int ch = cs.nextInt();
            if (ch ==1){
                System.out.println("Введите число человек, которых вы хотите казнить: ");
                int a = cs.nextInt();
                Castle.execute(a);
            }
            if (ch ==2){
                System.out.println("Введите среднее число детей, которых рождают в замке за месяц: ");
                int a = cs.nextInt();
                Castle.born_people(a);
            }
            if (ch ==3){
                System.out.println("Введите количество денег, на которое изменилась казна: ");
                Double a = cs.nextDouble();
                k.SaveOrSpend(a);
            }
            if (ch ==4){
                System.out.println("Введите название постройки: ");
                String a = cs.next();
                System.out.println("Введите цену постройки: ");
                int b = cs.nextInt();
                n.create_build(a,b);
            }
            if (ch ==5){
                System.out.println("Введите здание, которое должно быть разрушено:");
                String ho = cs.next();
                n.destroy_build(ho);
            }
            if (ch ==6){
                System.out.println("Введите название постройки, которую вы хотите продать: ");
                String a = cs.next();
                System.out.println("Введите цену, за которую вы хотите продать постройку: ");
                int b = cs.nextInt();
                n.sell_build(a,b);
            }
            if (ch ==7){
                System.out.println("Введите ставку по налогу: ");
                long a = cs.nextLong();
                k.get_tax(a);
            }
            if (ch ==8){
                System.out.println("Введите колчество гвардейцев, которых собираетесь нанять:");
                int c = cs.nextInt();
                m.hire_a_guard(c);
            }
            if (ch ==9){
                m.train_the_guard();
            }
            if (ch ==10){
                m.check_guard_power();
            }
            if (ch ==11){
                System.out.println("Введите имя нового короля");
                String KING = cs.next();
                Castle.new_king(KING);
            }
            if (ch ==12){
                break;
            }
            else {
                System.out.println("такого варианта нет!");
            }

        }
    }
}