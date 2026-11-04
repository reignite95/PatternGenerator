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
        String displayNum = "";
        for (int i = start; start >= 1; i -= 2){
            displayNum = "";
            for (int num = start; num >= i; num++){
                displayNum += num;
            }
            System.out.println(displayNum);
        }

    }
    
}
