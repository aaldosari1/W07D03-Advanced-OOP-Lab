package com.company;

public class Lion extends Animal {

    String type="";

   public Lion( int numTeeth, boolean spots, int weight){
        super( numTeeth,spots ,weight);
        this.type=type;

    }

    public String getType(){

       return type;
    }

    public void setType(){
       if(weight<80){
           type="Cub";
       }else if(weight>80 && weight<120)
           type="Female";
       else
           type="Male";
    }

    public void print(){
        setType();
        System.out.println("This lion number of teeth is: "+ getNumTeeth()+" This lion weight is:"+getWeight() +"kg, so this lion type is : "+getType());
    }
}
