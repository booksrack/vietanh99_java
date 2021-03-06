package demo.s2_2;

import demo.s2.Motor;

public class MotorHonda  extends Motor {
    public void run(){
        System.out.println(brand+" runnng...");
        speedUp();
    }
}