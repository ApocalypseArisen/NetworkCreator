package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Interface 
{
    String mainMenu_ = "             MENU"
                     + "\n\n[1] Simple Network Calculator"
                     + "\n[2] Advanced Network Calculator"
                     + "\n\n[0] Exit";

    BufferedReader reader_;

    public Interface()
    {
        reader_ = new BufferedReader(new InputStreamReader(System.in));

        mainMenu();
    }

    private int readInt()
    {
        String input;

        try
        {
            input = reader_.readLine();
            
            return Integer.parseInt(input);
        }
        catch(Exception error)
        {
            System.out.println("Input is not valid!");
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
        }
    }
}
