import java.util.ArrayList;
import java.util.Scanner;

public class Football{

    private ArrayList<League> leagues = new ArrayList();
    private Scanner in;
    private int option;

    public Football(){
       in = new Scanner(System.in);
    System.out.println("======  FOOTBALL MENU  =======\n");
    System.out.println("WELCOME TO MY FOOTBALL LEAGUE APP! \nWHAT DO YOU WANT TO DO?");
    displayMenu();
    }

    // FOOTBALL APP MENU
    private void displayMenu() {
        while (true) {
          System.out.println("--------------------------------------------");
          System.out.println("MAKE A LEAGUE - PRESS 1");
          System.out.println("SHOW LEAGUES - PRESS 2");
          System.out.println("OPEN A LEAGUE - PRESS 3");
          System.out.println("QUIT - PRESS 0");
          int option = in.nextInt();
          in.nextLine();
          switch (option) {
            case 1:
            addLeague();
              break;
            case 2:
            displayLeagues();
              break;
            case 3:
            openLeague();
              break;

            case 0:
            System.out.println("GOODBYE!");
              System.exit(0);
          }
        }
      }
      // ADDING A LEAGUE
      private void addLeague(){
          System.out.println("--------------------------------------------");
          System.out.print("SET NAME OF THE LEAGUE: ");
          String leagueName = in.nextLine();
          System.out.println("--------------------------------------------");
          League league = new League(leagueName);
          leagues.add(league);
          
      }

      // PRINTING LIST OF LEAGUES
      public void displayLeagues() {
        System.out.println("--------------------------------------------");
        System.out.println("LEAGUES: ");
        for (int i=0; i< leagues.size();i++) {
          System.out.println(leagues.get(i).getNameOfLeague());
        }
      }
      //ACCESS TO THE LEAGUE MENU
      public void openLeague(){
        System.out.println("--------------------------------------------");
        System.out.println("CHOOSE A LEAGUE TO OPEN:");
        for (int i=0;i<leagues.size();i++){
          System.out.println(i+1 + "." +leagues.get(i).getNameOfLeague());
        }
        option = in.nextInt();
        leagues.get(option-1).displayMenu();
      }

}