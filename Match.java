import java.util.Scanner;
public class Match {

    private Team teamHome;
    private Team teamAway;
    private String result;
    private String draw = "DRAW";
    private Scanner in = new Scanner(System.in);
    private String resultUpper;
   

    public Match(Team teamHome, Team teamAway){
       this.teamHome = teamHome;
       this.teamAway = teamAway;
    }
    public void getMatch() {
        System.out.println(this.teamHome.getNameOfTeam() +" vs "+this.teamAway.getNameOfTeam());
        System.out.print("PASS THE WINNER OR DRAW:");
        result = in.nextLine();
        resultUpper = result.toUpperCase();
        if (resultUpper.equals(this.teamHome.getNameOfTeam())){
            this.teamHome.setWins();
            this.teamAway.setLosses();
            this.teamHome.setPointsWin();
            this.teamHome.setPoints();
        }
        else if(resultUpper.equals(this.draw)){
            this.teamHome.setDraws();
            this.teamAway.setDraws();
            this.teamHome.setPointsDraw();
            this.teamAway.setPointsDraw();
            this.teamHome.setPoints();
            this.teamAway.setPoints();
        }
        else if(resultUpper.equals(this.teamAway.getNameOfTeam()))
        {
            this.teamAway.setWins();
            this.teamHome.setLosses();
            this.teamAway.setPointsWin();
            this.teamAway.setPoints();
        }
        else {
            System.out.println("WRONG VALUE OF RESULT");
            result = in.nextLine();
            return;
        }
    }
       
        public String getTeamHome(){
        return teamHome.getNameOfTeam();
    }
    public String getTeamAway(){
        return teamAway.getNameOfTeam();
    }
    
}
