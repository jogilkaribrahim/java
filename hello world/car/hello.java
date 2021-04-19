package car;

import org.graalvm.compiler.nodes.ReturnNode;

class Car{
    
    int maxspeed = 100;
    int minspeed = 0;
    double weight = 4079;
    boolean IsTheCarOn = false;
    char condition = 'A';

    double maxfuel = 16;
    double currentfuel = 8;
    double mpg = 26.4;

    int maxcapicityincar = 6;

    int numberofpeopleincar = 1;

    public Car(int CustomMaxspeed , double CustomWeight, boolean CustomIsTheCaron){
        maxspeed = CustomMaxspeed;
        IsTheCarOn = CustomIsTheCaron;
        weight = CustomWeight;
    }


    public void printvariables(){
        System.out.print("the max speed is"+ maxspeed );
        System.out.print('\n');
        System.out.print(minspeed);
        System.out.print('\n');
        System.out.print(weight);
        System.out.print('\n');
        System.out.print(IsTheCarOn);
        System.out.print('\n');
        System.out.print(condition);
        System.out.print('\n');
        System.out.print(numberofpeopleincar);
        System.out.print('\n');
      


    }
   void Wreckcar(){
       condition = 'C';
   }
   void upgradespeed(){
       minspeed = maxspeed;
       maxspeed = maxspeed + 1;
   }
   public void getIn(){
       if(maxcapicityincar > numberofpeopleincar)
    {numberofpeopleincar++;}
    else{
        System.out.print("Out of Capicity");
    }
   }
   public void getOut(){
       if(numberofpeopleincar != 0)
    {numberofpeopleincar--;}
    else{
        System.out.println("car already empty");
    }
   }
   public double howmanymilesoutoffuel(){
       return currentfuel * mpg;
   }

    public static void main(String args[]){  
        System.out.println("birthday car");
     Car birthayPresent = new Car(200 , 5000, true);
   

     birthayPresent.Wreckcar();
     birthayPresent.printvariables();
     birthayPresent.upgradespeed();
     birthayPresent.printvariables();
     birthayPresent.getIn();
     birthayPresent.printvariables();
     birthayPresent.getOut();
     birthayPresent.printvariables();
 System.out.println("milees remaining" + birthayPresent.howmanymilesoutoffuel());

    }
}  