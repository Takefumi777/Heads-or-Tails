import java.util.Random;


public class HeadsOrTails{

    public static void main(String[] args){
        int ROUND = 3;
        int numberOfHeads = 0, numberOfTails = 0;

Random random = new Random();


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

    }

}