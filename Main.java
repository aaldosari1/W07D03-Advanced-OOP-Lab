package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lion lion1=new Lion(20,true,130);
        lion1.print();

        Cheetah cheetah1=new Cheetah(18,true,70);
        Cheetah.setSpeed(90); // setting the speed by using the class name because method is static
        System.out.println(cheetah1.toString());
    }
}
