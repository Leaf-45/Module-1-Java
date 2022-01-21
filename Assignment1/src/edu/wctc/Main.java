package edu.wctc;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean runQuiz = true;
        Scanner scanner = new Scanner(System.in);
        while (runQuiz)
        {
            quiz();
            System.out.println("Press 1 to take the quiz again and press any other key to end the program");
            String answer = scanner.nextLine();
            if (!answer.equals("1"))
            {
                runQuiz = false;
            }
        }
    }

    public static void quiz()
    {
        Scanner scanner = new Scanner(System.in);
        String[] questions =
                {"mild or spicy", "tea or coffee", "breakfast or brunch","summer or winter", "paper or plastic"};
        int[] answers = new int[5];
        int counter = 0;

        // quiz starts
        System.out.printf("Welcome to the preference quiz!%n-------------------------------------------%n");
        System.out.println("Press 0 for the left answer and press 1 for the right answer.");

        // all quiz questions
        for (String question : questions)
        {
            System.out.println(question);
            String response = scanner.nextLine();
            while (!response.equals("0") && !response.equals("1"))
            {
                System.out.printf("We didn't get a valid answer so please try again" +
                        "%n-------------------------------------------%n");
                System.out.println(question);
                response = scanner.nextLine();
            }
            answers[counter] = Integer.parseInt(response);
            counter++;
        }

        // getting the user's score and response
        int total = 0;
        for (int answer : answers)
        {
            total += answer;
        }

        if (total < 3)
        {
            System.out.println("You prefer life to be calm and organized.");
        }
        else if (total == 3)
        {
            System.out.println("You prefer a good balance in life.");
        }
        else
        {
            System.out.println("You prefer life to be spontaneous and active.");
        }

    }
}
