//guessig the number 
// by AYUSH KUMAR GHOSAL UEMK

import java.util.Scanner;
import java.util.Random;
class Game
{
    public int number;
    public int input;
    public int guess = 0;
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void u_input() {
        System.out.println("GUESS THE NUMBER......");
        Scanner ab = new Scanner(System.in);
        input = ab.nextInt();
    }

    boolean correct() {
        guess++;
        if (input == number) {

            System.out.format("CONGRATS !! CORRECT GUESS IT WAS %d\nYOU GUESSED IT IN %d ATTEMPTS", number, guess);
            return true;

        } else if (input > number) {
            System.out.println("TOO HIGH ...........");
        } else if (input < number) {
            System.out.println("TOO LOW........");
        }
        return false;
    }
}
public class Guess_the_number {
  public static void main(String args[])
    {
        Game obj=new Game();
        boolean b=false;
        while(!b)
        {
            obj.u_input();
            b=obj.correct();
        }
    }
}
