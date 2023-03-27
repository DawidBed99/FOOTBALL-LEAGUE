import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private String nameOfTeam;
    private String nameOfStadium;
    private int numberOfPlayers;
    private ArrayList<Player> players;
    private Scanner in;
    private int wins=0;
    private int losses=0;
    private int points=0;
    private int pointsWin=0;
    private int pointsDraw=0;
    private int draws;
    private boolean loop=false;

    //CONSTRUCTOR - ADDING PLAYERS TO THE CLUB
    public Team(){
       
        while(!loop){
            try{
                in = new Scanner(System.in);
        System.out.print("PASS THE AMOUNT OF PLAYERS IN THE TEAM: ");
        this.numberOfPlayers = in.nextInt();
        loop=true;
    }
        catch(Exception e){
            System.out.println("IT'S NOT A NUMBER");
            in.next();
        }
    }
        players = new ArrayList<>();
        //CALLING addPlayer METHOD
        addPlayer();
      
    }
    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }
      //ADDING NEW PLAYER TO THE TEAM
    public void addPlayer() {
        
        for (int i=0 ; i<numberOfPlayers;i++){
            Player player = new Player();
            players.add(player);
       }
       
    }
     //RETURNING LIST OF PLAYERS
    public void getPlayers(){
        System.out.println("\n"+this.nameOfTeam +" PLAYERS:" );
       for (int i=0; i<numberOfPlayers; i++){
        System.out.printf(i+1 +".%s ",
        players.get(i).getNameOfPlayer());
       }
       
    }
    
    public String getNameOfTeam() {
        return this.nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public String getNameOfStadium() {
        return this.nameOfStadium;
    }

    public void setNameOfStadium(String nameOfStadium) {
        this.nameOfStadium = nameOfStadium;
    }

    public int getWins(){
        return this.wins;
    }

    public void setWins(){
        wins++;
    }
    public int getLosses(){
        return this.losses;
    }

    public void setLosses(){
        losses++;
    }
    public int getPoints(){
        return this.points;
    }

    public void setPoints(){
       
        this.points=this.pointsWin+this.pointsDraw;
    }
    public int getDraws(){
        return this.draws;
    }

    public void setDraws(){
        
        draws++;
    }
    public int getPointDraw(){
        return this.pointsDraw;
    }
    public int getPointWin(){
        return this.pointsWin;
    }
    public void setPointsWin(){
       
        this.pointsWin=this.pointsWin+3;
    }
    public void setPointsDraw(){
       
        this.pointsDraw=this.pointsDraw+1;
    }
}

