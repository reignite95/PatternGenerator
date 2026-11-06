//  Class author: Rehan Khan
//  Date created: 10/30/2026
//  General description: Methods that generate unique patterns of different kinds based on user input

public class Pattern{


    //Main Method to run tests
    public static void main(String[] args){

        stars(7);
        System.out.println();
        triangle(9);
        System.out.println();
        odds(9);
        System.out.println();
        eo(6);
        System.out.println();
        pyramid(5);
    }

//Pre condition: Call a positive integer of rows
//Post condition: Displays rows of stars from user input with two stars added each time

    public static void stars(int rows){
        String star = "*";
        int i = 0;
        while (i < rows){
            System.out.println(star);
            star += "**";
            i++;
        }
    
    }

//Pre condition: Call a positive integer of rows
//Post condition: Displays a triangle composed of numbers starting from 1 to rows

    public static void triangle(int rows){
      
        int num = 0;
        int i = 0;
        String displayNum = "";
        while (num < rows){
            displayNum = "";
            i = 0;
            num++;
            while (i < num){
                displayNum += num;
                i++;
            }
            System.out.println(displayNum);

        }
    }
    //Pre condition: You must enter a positive odd integer
    //Post condition: Displays odd numbers starting from user input until 1. This forms an upside down triangle.

    public static void odds(int start){
            
        String displayNum = start + "";
        for (int i = start; i >= 1; i -= 2){
            displayNum = "";
            for (int num = i; num > 0; num--){
                displayNum += i;
            }
            System.out.println(displayNum);
        }

    }

    //Pre condition: You must enter a positive integer
    //Post condition: Displays a sideways triangle made of alternating O's and E's    

    public static void eo(int maxE){
        String output = "E";

        //first half of pattern
        if (maxE % 2 == 0){
            output = "O"; 

        }
        for (int k = 1; k <= maxE; k++){

            for (int i = 0; i < k; i++){
                System.out.print(output);

            }
            System.out.println();
            if(output.equals("E")){

                output = "O";
            }
            else {
                output = "E";
            }


            
        }

        //second half of pattern
        for (int k = maxE - 1; k >= 1; k--){
            for (int i = 0; i < k; i++){
                System.out.print(output);

            }
            System.out.println();
            if(output.equals("E")){

                output = "O";
            }
            else {
                output = "E";
            }


            
        }


        


    }
    //Pre condition: You must enter a positive integer
    //Post condition: Displays an upside down pyramid starting from 1 until the rows user inputs
    
    public static void pyramid(int rows){
        String displayNum = "";
        String whiteSpace = "";
        for (int i = 1; i <= rows; i++){

            displayNum = "";
            whiteSpace = "";

            for (int j = 0; j <= i - 1; j++){

                whiteSpace += " ";
            }

            for (int k = 0; k < 2 * (rows - i) + 1; k++){
                displayNum += i;

            }
            System.out.println(whiteSpace + displayNum);

        }

    }
}
