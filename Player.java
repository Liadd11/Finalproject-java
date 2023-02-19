import java.util.Scanner;
/*
 * 
 *TODO:  
 * 
*/
public class Player {
    Scanner scanner;
    private String name;

    public Player() {
        this.name = getUserInput(3);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getUserInput(int c) {
        prompt(c);
        scanner = new Scanner(System.in);
        if(scanner != null){
            return scanner.nextLine();
        }
        else{
            return "";
        }

    }



    public void prompt(int c){
        switch(c){
            case 1: System.out.println("Player " + name + ": Enter a row number: ");
                    break;
            case 2: System.out.println("Player " + name + ": Enter a column number: ");
                    break;
            case 3: System.out.println("Please Enter your name: ");
                    break;        
            default: System.out.println("Eat a Banana and play again!");
                    break;
        }
            
        

    }

}