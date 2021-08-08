package user;

import java.io.IOException;

import java.util.Scanner;

public class Interface 
{
    String mainMenu_ = "             MENU"
                     + "\n\n[1] Simple Network Calculator"
                     + "\n[2] Advanced Network Calculator"
                     + "\n\n[0] Exit";

    Scanner scanner_;

    public Interface()
    {
        scanner_ = new Scanner(System.in);

        mainMenu();
    }

    private int readInt()
    {
        String input;

        try
        {
            input = scanner_.nextLine();
            
            return Integer.parseInt(input);
        }
        catch(Exception error)
        {
            System.out.println("Input is not valid! Try again.");
            return -1;
        }
    }

    private void mainMenu()
    {
        int input = ' ';

        while(input != 0)
        {
            System.out.println(mainMenu_);
            input = readInt();
            
            switch(input)
            {
                case 1:
                {
                    System.out.println("TBA");
                    pressAnyKey();
                } break;
                case 2:
                {
                    System.out.println("TBA");
                    pressAnyKey();
                } break;
                
                case 0: System.out.println("Ending operations..."); break;
                default:
                {
                    System.out.println("Unknown command, try again.");
                    pressAnyKey();
                }
            }
        }
    }

    private void pressAnyKey()
    {
        System.out.println("Press ENTER to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception error)
        {
            System.out.println("Unknown error! Exiting...");
            System.exit(0);
        }
    }
}
