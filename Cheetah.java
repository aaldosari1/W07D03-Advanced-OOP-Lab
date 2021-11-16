package com.company;

public class Cheetah extends Animal {

    static int speed;
    String [] info={"Cheetah ","is so fast ","animal "};
    public Cheetah( int numTeeth, boolean spots, int weight){
        super( numTeeth,spots ,weight);

    }

    static void setSpeed(int speedInput){

        speed=speedInput;
    }
    static int getSpeed(){

        return speed;
    }

    public String toString(){

        return info[0]+ info[1]+info[2]+"its speed can reach "+getSpeed()+" km/h, this cheetah's weight is: "+getWeight()+" kg and has "+getNumTeeth()+" teeth" ;
    }

}
