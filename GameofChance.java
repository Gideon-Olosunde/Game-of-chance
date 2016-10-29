import java.util.Scanner;
import java.util.Random;
public class GameofChance
{
    public static int winnings(int number){
        int Even = number%2;
        int Mten = number%10;
        int twoMultiplier;
        int tenMultiplier;
        int pMultiplier;
        int factors=0;
        if(Even==0){
            twoMultiplier = 2;

        }else{
            twoMultiplier = 1;
        }

        if(Mten==0){
            tenMultiplier = 3;
        }else {
            tenMultiplier = 1;
        }

        for(int i =2; i < number-1;i++){
            int remainder = number%i;
            if(remainder==0){
                factors++;  

            }else{
                factors = factors;

            }
            if(number==1){
                factors=1;
            }
        }
        
        if (factors==0){
            pMultiplier = 5;
        }else{
            pMultiplier = 1;
        }

        int multiplier =  pMultiplier*tenMultiplier*twoMultiplier;
        return multiplier;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random gRand = new Random();
        int Rand = gRand.nextInt(31);
        System.out.println(Rand);
        System.out.println("Guess a number between 0 and 30");
        int Guess = input.nextInt();
        if(Guess==Rand){
            System.out.println("You will have"+" "+winnings(Rand)+"X"+" "+ "your money!!!");

        }else{
            System.out.println("You would have won"+" "+winnings(Rand)+"X"+" "+ "your money :( ");
        }
    }
}
