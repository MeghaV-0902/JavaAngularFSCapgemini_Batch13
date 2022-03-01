import java.util.ArrayList;

public class Main1
{
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        Soccerplayer backam = new Soccerplayer("backam");

        Team<FootballPlayer> blore = new Team<>("blore");
        blore.addPlayer(joe);
        Team<FootballPlayer> blore1 = new Team<>("blore1");
        blore.addPlayer(joe);
//        blore.addPlayer(pat);
//        blore.addPlayer(backam);
        Team<BaseballPlayer> baseballTeam = new Team<>("Punjab");
        baseballTeam.addPlayer(pat);


        System.out.println(blore.NumPlayer());
        System.out.println(blore.getName()+" : "+blore.ranking());
    }
}
