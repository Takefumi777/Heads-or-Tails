import java.util.Random;
import java.util.Scanner;


public class HeadsOrTails{

    public static void main(String[] args){
        int ROUND = 3;
        int numberOfHeads = 0, numberOfTails = 0;

Scanner scan = new Scanner(System.in);
Random random = new Random();

System.out.print("Who are you?\n> ");
      String name = scan.nextLine();
      System.out.print("Hello, " + name + "!\n");


        System.out.println("Tossing a coin...");

        for(int i = 1; i <= ROUND; i++){
            if(random.nextInt(2)>0) {
                numberOfHeads++;
                System.out.println("Round " +i+ ": Heads");
            }else{
                numberOfTails++;
                System.out.println("ROUND " +i+ ": Tails");
            }
        }
        System.out.println("Heads: "+numberOfHeads+ ", Tails: "+numberOfTails);

  if(numberOfHeads > numberOfTails) {
            System.out.println(name +" won");
        }else{
            System.out.println(name +" lose");
        }      
    }

}