import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author onur
 */

public class ScheduleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // For Test Usage
        //**********
        List<String> matchTeams = new ArrayList<>();
        String[] teams = {"Galatasaray", "Fenerbahçe", "Beşiktaş", "Trabzonspor", "Başakşehir", "Bursaspor"};
        //**********

        ScheduleMain footballScheduler = new ScheduleMain();
        footballScheduler.prepareTeamsBeforeSeason(teams, matchTeams);

    }

    private void createSeasonSchedule(List<String> matchTeams){

    }

    private void prepareTeamsBeforeSeason(String[] teams, List<String> matchTeams) {

        for (String team : teams) {
            matchTeams.add(team);
        }

        if (teams.length % 2 != 0) {
            matchTeams.add("bay");
        }

    }

    private void generateSchedule(int size){
        int requiredWeek = (size*2)-2;

    }
}
