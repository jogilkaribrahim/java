 package cointoss;

import java.util.Random;

public class Cointoss {


    public String tossacoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 0)
        {return "HEADS";}
        else

        {return "TAILS";}

      
    }


    public static void main( String []args ) {
        Cointoss game = new Cointoss();
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
        System.out.println( game.tossacoin() );
    }
}