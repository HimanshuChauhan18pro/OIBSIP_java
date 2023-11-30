package Projects;

import java.util.Scanner;

public class NumberGusseing {
    public static void main(String[] args) {
        System.out.println("\n --- Welcome to Number Guessing Game \n");
        Scanner sc = new Scanner(System.in);
        int min=1,max=100;
        int cNum=(int)(Math.random()*(max-min+1)+min);
        for(int round=1;;round++){
            System.out.println("Round: "+round);
            System.out.print("Guess a Number from the range is "+min+" to "+max+" :  ");
            int gNum = sc.nextInt();
            int attempt=0;
            int maxAttempts =10;
            int score=0;
    
            while (true) {
                attempt++;
                score += maxAttempts -attempt+1;
                if(gNum==cNum){
                    System.out.println("Congratulations! , You Guessed Correct Number: "+gNum);
                    System.out.println("Your Guessing attempts : "+attempt);
                    break;
                }
                else if(cNum<gNum){
                    System.out.println("You Guessed Higher Number, Try a Lower Number : ");
                    gNum = sc.nextInt();
                }
               else if(cNum>gNum){
                    System.out.println("You Guessed Lower Number, Try a higher Number : ");
                    gNum = sc.nextInt();
                }
                if(attempt >= maxAttempts){
                    System.out.println("You Exceed the limit of maximum Attempts.");
                    System.out.println("The Correct Number was : "+cNum);
                    break;
                }
            }
            System.out.println("Your Score : "+score);
    
            System.out.println("Do you want next round (Yes/No): ");
            String nextRound = sc.next().toLowerCase();
            if(nextRound.equals("No")){
                System.out.println("Thanks for Playing!");
                System.out.println("Your Final Score :"+score);
                break;
            }
        }
     
        sc.close();
    }
}
