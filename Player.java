import java.util.Scanner;

public class Player {

    private String nameOfPlayer;

    public Player(){
        System.out.print("PASS THE NAME OF PLAYER: ");
        Scanner in = new Scanner(System.in);
        this.nameOfPlayer = in.nextLine();
    }
    //ACCESS TO PLAYER'S NAME
    public String getNameOfPlayer(){
        return nameOfPlayer;
    }    
}
