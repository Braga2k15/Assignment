package Assignment;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        {System.out.print("Enter the score for the 1st student:   ");
        int score1 = input.nextInt();


        if (score1 >= 0 && score1 <= 100)

            System.out.print(score1);

        else if (score1 < 0 || score1 > 100) {
            System.out.print("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");
            score1 = input.nextInt();
        }

    }

    {

        System.out.print("\nEnter the score for the 2nd student:  ");
        int score2 = input.nextInt();

        if (score2 >= 0 && score2 <= 100)

        {  System.out.print(score2);
    }
        else if (score2 < 0 || score2 > 100)
            System.out.print("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");
          score2 = input.nextInt();
    }



        System.out.print("\nEnter the score for the 3rd student:   ");
        int score3 = input.nextInt();

        if(score3>=0 && score3<=100)

            System.out.print(score3);

        else if(score3<0 || score3>100)
        System.out.print("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");
        score3 = input.nextInt();



        System.out.print("\nEnter the score for the 4th student:   ");
        int score4 = input.nextInt();

        if(score4>=0 && score4<=100)

            System.out.print(score4);

        else if(score4<0 || score4>100)
        System.out.print("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");
        score4 = input.nextInt();




        System.out.print("\nEnter the score for the 5th student:   ");
        int score5= input.nextInt();

        if(score5>=0 && score5<=100)

            System.out.print(score5);

        else if(score5<0 || score5>100){
        System.out.println("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");}
        score5= input.nextInt();



        System.out.print("\nEnter the score for the 6th student:   ");
        int score6 = input.nextInt();

        if(score6>=0 && score6<=100)

            System.out.print(score6);

        else if(score6<0 || score6>100) {
        System.out.println("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");}
        score6 = input.nextInt();



        System.out.print("\nEnter the score for the 7th student:   ");
        int score7 = input.nextInt();

        if(score7>=0 && score7<=100)

            System.out.print(score7);

        else if(score7<0 || score7>100) {
            System.out.println("Error Input out of bound. Score can only be between 0 and 100. Try again:  ");
            score7 = input.nextInt();

        }//int results = (score1 + score2 + score3 + score4 + score5 + score6 + score7);
        {
            {//System.out.printf("\nThank you for your input. Your entered scores are:  %f", results);

            }
            
            /* double TotalScore = Score1 + Score2 + Score3 + Score4 + Score5 + Score6 + Score7;
            double mean = TotalScore/7;
            double rounded = Math.round(mean*100.0)/100.0

            System.out.printf("rounded");
            
            
           /*double Totalscore = Toalscore.length 

    }
       
}}
