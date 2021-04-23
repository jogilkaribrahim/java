package loopractice;
public class LoopPractice{
    public static void  PracticeWhileLoop(){
int x =0 ;
while(x<5){
    System.out.println("the value of x is" + x);
    x++;
}
    }

    public static void DoWhileLoop() {
        int y = 0;
        do{
            System.out.println("the value of y is" + y);
            y++;
        }while(y < 10);
    }

    public static void ForLoop() {
        for(int z = 0 ; z < 20 ; z++){
            System.out.println("the value of z is"+ z);
            if (z == 10) {
                break;
            }
        }
      
    }

    public static void main(String[] args) {
        PracticeWhileLoop();

        DoWhileLoop();
        ForLoop();
      
     
    }
}