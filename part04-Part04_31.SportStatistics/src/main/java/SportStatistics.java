import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        int count = 0, wins = 0, losses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String file = scanner.nextLine();
       
        
        ArrayList<Team> records = readFile(file);
        
        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        for (Team team: records) {
            if (team.getHomeTeam().contains(teamName)) {
                count++;
                
                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            } else if (team.getAwayTeam().contains(teamName)) {
                count++;
                
                if (team.getAwayScore() >= team.getHomeScore()) {
                    wins++;
                    team.setWins();
            } else {
                    losses++;
                    team.setLosses();
                }
                
                team.playGame();
            }
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        } 
    
    public static ArrayList<Team> readFile (String file) {
        ArrayList<Team> teams = new ArrayList<>();
        String line, homeTeam, awayTeam;
        String[] split;
        int homeScore, awayScore;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                
                split = line.split(",");
                
                homeTeam = split[0];
                awayTeam = split[1];
                
                homeScore = Integer.valueOf(split[2]);
                awayScore = Integer.valueOf(split[3]);
                
                teams.add(new Team(homeTeam, awayTeam, homeScore, awayScore)); 
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return teams;
    }
}


