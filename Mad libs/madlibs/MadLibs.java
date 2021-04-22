package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public void setRandomNums() {
       int num = Math.abs(rand.nextInt()) % 100;
       int index = 0;
        int[] numberholder = new int[3];
        while (index < numberholder.length) {
            numberholder[index] = num + index;
            index++;

        }
        randomNums = "not"+numberholder[0] + ", not" + numberholder[1]+ ", but" +numberholder[2];
    }



    public void printinstruction() {
        System.out.println("welcome to MadLibs Game.If you type in" + "words, we'll give you a story . Start by typing in a name");
    }

    public void enterName() {
        setName(scanner.nextLine());
    }
    public void enterNoun1() {
        System.out.println("Give me first Noun");
        setNoun1(scanner.nextLine());
    }
    public void enterNoun2() {
        System.out.println("Give me a second Noun");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3() {
        System.out.println("Give me third Noun");
        setNoun3(scanner.nextLine());
    }
    public void  enterAdjective1(){
        System.out.println("Give me an Adjective");
        setAdjective1(scanner.nextLine());
    }
    public void  enterAdjective2(){
        System.out.println("Give me a another Adjcective");
        setAdjective2(scanner.nextLine());
    }
    public void  enterAdverb(){
        System.out.println("Give me an Adverb");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory() {
        String story;
int num  = Math.abs(rand.nextInt()) % 2;
if (num == 0) {
    story =  " jessie and her best friend "+getName() +" went to disney world today "+
    " They saw a "+getNoun1()+" in a show at magic kingdom " +
     " and ate a " + getAdjective1() + " feast for dinner. the next day i " +
      " ran "+ getAdverb() +" to meet mickey in his " +getNoun2()+" and then at late night " + getRandomNums() +" "+
       getAdjective2() +" firewoks shooting from the "+ getNoun3() + " . ";
    
}
else{
    story =  " john and his best friend "+getName() +" went to turkey today "+
    " They saw a "+getNoun1()+" in a show at magic kingdom " +
     " and ate a " + getAdjective1() + " meal for dinner. the second day i " +
      " ran "+ getAdverb() +" to meet his girlfriend in his " +getNoun2()+" and then at late night " + getRandomNums() +" "+
       getAdjective2() +" firewoks shooting from the "+ getNoun3() + " . ibra";
}
        
       

           setStory(story);
    }
    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterNoun2();
        enterAdjective2();
        enterNoun3();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

 
    public static void main(String[] args) {
 
        MadLibs game = new MadLibs();
        game.printinstruction();
        game.play();
    }
}

