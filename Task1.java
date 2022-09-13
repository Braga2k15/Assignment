package Lecture1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        {
            int score[] = new int[7];

            int n =0;
            for (n = 0; n <= 7; n++)




            {switch(n) {

                  case 0:

                      System.out.println("Enter the score for the 1st student: ");
                      score[n] = input.nextInt();
                      break;

                  case 1:
                      System.out.println("Enter the score for the 2nd student: ");
                      score[n] = input.nextInt();
                      break;

                  case 2:
                      System.out.println("Enter the score for the 3rd student:  ");
                      score[n] = input.nextInt();
                      break;

                  case 3:
                      System.out.println("Enter the score for the 4th student:  ");
                      score[n] = input.nextInt();
                      break;

                  case 4:
                      System.out.println("Enter the score for the 5th student:  ");
                      score[n] = input.nextInt();
                      break;

                  case 5:
                      System.out.println("Enter the score for the 6th student:  ");
                      score[n] = input.nextInt();
                      break;

                  case 6:
                      System.out.println("Enter the score for the 7th student:  ");
                      score[n] = input.nextInt();
                      break;}

                if(score[n] < 0 || score[n] > 100)

                    System.out.println("Error input out of bound. Score can only be between 0 and 100");
                score[n] = input.nextInt();

            }}}}



                    //default:
                            ////break;

        //if (score[n] >= 0 && score[n] <= 100)