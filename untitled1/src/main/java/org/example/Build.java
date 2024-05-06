package org.example;

public class Build extends  Castle{
    public Boolean create_build(String name_of_build, int cost)
    {
        for (var i : buildings){
            if (i == name_of_build)
            {
                System.out.println("Такое здание уже существует");
                return false;
            }
        }
        if (cost > 0)
        {
            buildings.add(name_of_build);
            System.out.println("Построено здание " + name_of_build);
            System.out.println("Из казны взято " + cost);
            return true;
        }
        else {
            System.out.println("Здание не может стоить меньше нуля!");
            return false;
        }
    }
    public Boolean destroy_build(String name_of_build)
    {
        for (var i : buildings){
            if (i == name_of_build)
            {
                buildings.remove(name_of_build);
                System.out.println("Разрушено здание " + name_of_build);
                return true;
            }
        }
        System.out.println("Такого здание нет в замке!");
        return false;
    }

    public Boolean sell_build(String name_of_build, int cost)
    {
        for (var i : buildings){
            if (i == name_of_build)
            {
                if (cost > 0)
                {
                    buildings.remove(name_of_build);
                    System.out.println("Продано здание " + name_of_build);
                    System.out.println("В казну поступило " + cost);
                    return true;
                }
                else
                {
                    System.out.println("Цена не может быть меньше нуля!");
                    return false;
                }
            }
        }
        System.out.println("Такого здание нет в замке!");
        return false;
    }
}
