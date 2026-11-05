//  Class author: Rehan Khan
//  Date created: 10/30/2026
//  General description: 

public class Pattern{

    public static void main(String[] args){

        stars(7);
        //System.out.println();
        odds(9);
    }


    public static void stars(int rows){
        String star = "*";
        int i = 0;
        while (i < rows){
            System.out.println(star);
            star += "**";
            i++;
        }
    
    }

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

    public static void eo(int maxE){
        String o = "O";
        String e = "E";

        if (maxE % 2 == 0){

            for (int i = 0; i < maxE; i++){

                
            }

        }
        else {


        }


    }
    
    public static void pyramid(int rows){


    }
}
