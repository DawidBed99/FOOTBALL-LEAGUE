import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class League {

  public ArrayList<Team> teams = new ArrayList<>();
  private Scanner in;
  private ArrayList<Match> matches = new ArrayList<>();
  private String nameOfLeague;
  private int option;

  //CONSTRUCTOR - ADDING TEAMS TO THE LEAGUE
  public League(String nameOfLeague) {
    in = new Scanner(System.in);
    this.nameOfLeague=nameOfLeague;
    System.out.println("======  "+this.nameOfLeague+" MENU  =======");
    System.out.println("");
    //CALLING displayMenu METHOD
    displayMenu();
  }
  public void displayMenu() {
    do {
      System.out.println("--------------------------------------------");
      System.out.println("MAKE A TEAM - PRESS 1");
      System.out.println("SHOW TEAMS IN THE LEAGUE - PRESS 2");
      System.out.println("SHOW PLAYERS IN TEAMS - PRESS 3");
      System.out.println("GENERATE MATCHES - PRESS 4");
      System.out.println("PASS RESULTS OF MATCHES - PRESS 5");
      System.out.println("SHOW LEAGUE TABLE - PRESS 6");
      System.out.println("BACK - PRESS 0");
      option = in.nextInt();
      in.nextLine();
      switch (option) {
        case 1:
          addTeam();
          break;
        case 2:
          displayTeam();
          break;
        case 3:
        System.out.println("--------------------------------------------");
          for (int i = 0; i < teams.size(); i++) {
            teams.get(i).getPlayers();
          }System.out.println("\n");
          break;
        case 4:
          makeBracket();
          break;
        case 5:
          inResults();
          break;
        case 6:
          showTable();
          break;
        case 0:
        break;
      }
    }while (option !=0);
  }

  //ADDING TEAMS TO THE LEAGUE METHOD
  private void addTeam() {
    System.out.println("--------------------------------------------");
    System.out.print("SET NAME OF THE TEAM: ");
    String teamName = in.nextLine();
    System.out.print("SET NAME OF THE STADIUM: ");
    String stadiumName = in.nextLine();
    Team team = new Team();
    team.setNameOfTeam(teamName);
    team.setNameOfStadium(stadiumName);
    teams.add(team);
    
  }

  //PRINTING TEAMS IN THE LEAGUE
  public void displayTeam() {
    System.out.println("--------------------------------------------");
    System.out.println("CLUBS: ");
    for (Team team : teams) {
      System.out.println(
        team.getNameOfTeam() + " || STADIUM: " + team.getNameOfStadium()
      );
    }
  }

  public void makeBracket() {
    if (this.teams.size() > 1) {
      for (int i = 0; i < teams.size(); i++) {
        for (int j = 1; j < teams.size(); j++) {
          if (teams.get(i).getNameOfTeam() != teams.get(j).getNameOfTeam()) {
            Match match = new Match(teams.get(i), teams.get(j));
            matches.add(match);
          } else {
            break;
          }
        }
      }System.out.println("--------------------------------------------");
      System.out.println("MATCHES GENERATED!");
    } else {
      in = new Scanner(System.in);
      System.out.println(
        "TOO FEW TEAMS! ADD MORE CLUBS: ");
    }
    
  }

  public void inResults() {
    Collections.shuffle(matches);
    System.out.println("--------------------------------------------");
    for (int k = 0; k < matches.size(); k++) {
      matches.get(k).getMatch();
    }
  }

  public void showTable() {
    Collections.sort(teams, new Sort());
    System.out.println("==========TABLE==========");
    for (int h = 0; h <teams.size(); h++) {
      System.out.println(
        h +
        1 +
        "." +
        teams.get(h).getNameOfTeam() +
        ":||POINTS: " +
        teams.get(h).getPoints() +
        "||WINS: " +
        teams.get(h).getWins() +
        "||LOSSES: " +
        teams.get(h).getLosses() +
        "||DRAWS: " +
        teams.get(h).getDraws()
      );
    }
  }
public String getNameOfLeague() {
  return this.nameOfLeague;
}
}
