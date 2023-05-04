package samclassjava;

import java.util.Scanner;

public class Omagase {


    Scanner keyboard = new Scanner(System.in);


    public int tryPaseInt(String inPutMessage) {

        int selection = -1;
        boolean again = true;


        while(again)
        {

            try
            {

                System.out.print(inPutMessage);
                selection = Integer.parseInt(keyboard.nextLine());

                again = false;

            }

            catch (NumberFormatException e)
            {
                System.out.println("type the number please ");

            }

        }

        return selection;
    }


}