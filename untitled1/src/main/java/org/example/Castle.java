package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Castle {
    public static double treasury;

    public static long count_of_humans = 2;

    public ArrayList<String> buildings = new ArrayList<>(Arrays.asList("Ратуша"));

    private int guard = 1;

    private double guard_efficiency_coefficient = 1;

    private static String king = "Джофри";

    public static void execute(long count){
        if (count <= 0){
            System.out.println("Нельзя казнить - " + count + " человек");
        }
        else if (count <= count_of_humans){
            count_of_humans -= count;
            System.out.println("В замке было казнено - " + count + " человек");
        }
        else {
            System.out.println("Нельзя так делать!");
        }
    }

    public static void born_people(long kef_of_born){
        long womans = count_of_humans / 2;
        if (kef_of_born < 0){
            System.out.println("Рожать не могут отрицательно!");
        }
        else{
            count_of_humans += womans * kef_of_born;
            System.out.println("В замке родилось " + womans * kef_of_born + " человек");
        }
    }



    public Boolean hire_a_guard(int count)
    {
        if (count > 0)
        {
            if (treasury <= count)
            {
                System.out.println("В казне недостаточно монет для найма стражи!");
                return false;
            }
            else
            {
                guard += count;
                treasury -= count;
                System.out.println("Стража пополнилась на " + count + " человек");
                System.out.println("Из казны было взято " + count + " монет");
                return true;
            }
        }
        else
        {
            System.out.println("Нельзя нанять отрицательное кол-во человек!");
            return false;
        }
    }

    public Boolean train_the_guard()
    {
        if (treasury >= guard*0.1)
        {
            if (guard_efficiency_coefficient < 2)
            {
                treasury -= guard*0.1;
                guard_efficiency_coefficient += 0.1;
                System.out.println("Эффективность гвардии повышена!");
                System.out.println("Из казны было взято " + guard_efficiency_coefficient + " монет");
                return true;
            }
            else
            {
                System.out.println("Гвардия максимально обучена!");
                return false;
            }
        }
        else
        {
            System.out.println("В казне недостатоно средств для обучения стражи!");
            return false;
        }
    }

    public double check_guard_power()
    {
        System.out.println("Мощь гвардии - " + guard_efficiency_coefficient * guard);
        return guard_efficiency_coefficient * guard;
    }

    public static Boolean new_king(String king_name)
    {
        if (king_name != null && !king_name.isEmpty())
        {
            king = king_name;
            System.out.println("Да здравствует новый король " + king_name);
            return true;
        }
        else
        {
            System.out.println("Король " + king + " всё ещё у престола!");
            return false;
        }
    }
}
