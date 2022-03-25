/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscheduler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author galileo-onur
 */
public class FootballScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> matchTeams = new ArrayList<>();
        String[] teams = {"Galatasaray", "Fenerbahçe", "Beşiktaş", "Trabzonspor", "Başakşehir", "Bursaspor"};

        FootballScheduler footballScheduler = new FootballScheduler();
        footballScheduler.prepareTeamsBeforeSeason(teams, matchTeams);

    }

    private void prepareTeamsBeforeSeason(String[] teams, List<String> matchTeams) {

        for (String team : teams) {
            matchTeams.add(team);
        }

        if (teams.length % 2 != 0) {
            matchTeams.add("bay");
        }

    }

}
