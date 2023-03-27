import java.util.Comparator;

class Sort implements Comparator<Team> {
    
    public int compare(Team a, Team b){
        return b.getPoints() - a.getPoints();
    }
}
