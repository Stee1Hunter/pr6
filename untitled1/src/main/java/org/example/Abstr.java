package org.example;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Abstr {
    private double treasury;
    private long count_of_humans ;
    public ArrayList<String> buildings = new ArrayList<>(Arrays.asList());
    public int guard ;
    public double guard_efficiency_coefficient ;
    public String king ;
    public Abstr(double tres,long count_human, int guard, double eff, String KING){
        this.treasury = tres;
        this.count_of_humans = count_human;
        this.guard = guard;
        this.guard_efficiency_coefficient = eff;
        this.king=KING;
    }

}
