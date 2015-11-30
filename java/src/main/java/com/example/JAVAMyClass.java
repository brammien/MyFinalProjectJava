package com.example;

public class JAVAMyClass {

    public static void main(String[] args) {


        //Stats for Babe Ruth, BR for babe Ruth
        int BRAB = 544; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        int BRR = 141; // Number of times baserunner safely reaches home plate
        int BRH = 184;//Number of times batter hits ball and reaches bases safely
        int BR2B = 33;//Number of times batter hits ball and reaches second base
        int BR3B = 9; //Number of times batter hits ball and reaches third base
        int BRHR = 46; // Number of times batter hits ball and reaches home plate scoring a run
        int BRRBI = 143;//Number of runs that score safely due to batter hitting ball and drawing a base on balls
        int BRBB = 133; //Number of walks by batter
        int BRSO = 86; //Number of strike outs by batter
        int BRSB = 8; //Number of times bases stolen by batter


        //Stats for Ty Cobb, TC for Ty Cobb
        int TCAB = 611; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        int TCR = 120; // Number of times baserunner safely reaches home plate
        int TCH = 224;//Number of times batter hits ball and reaches bases safely
        int TC2B = 39;//Number of times batter hits ball and reaches second base
        int TC3B = 16; //Number of times batter hits ball and reaches third base
        int TCHR = 6; // Number of times batter hits ball and reaches home plate scoring a run
        int TCRBI = 103;//Number of runs that score safely due to batter hitting ball and drawing a base on balls
        int TCBB = 67; //Number of walks by batter
        int TCSO = 36; //Number of strike outs by batter
        int TCSB = 48; //Number of times bases stolen by batter

        //Based on 162 game average for career


        String player;

        if (BRAB > TCAB) {
            player = "Babe Ruth " + (BRAB - TCAB);
        } else {
            player = "Ty Cobb " + (TCAB - BRAB);
        }
        System.out.println(player + " times more had at Bats on average, Number of official bats minus sacrifices, walks, hits by pitcher ");

        if (BRR > TCR) {
            player = "Babe Ruth "+ (BRR - TCR);
        } else {
            player = "Ty Cobb "+ (TCR - BRR);
        }
        System.out.println(player + " times more reaches home plate safely on average ");

        if (BRH > TCH) {
            player = "Babe Ruth "+ (BRH - TCH);
        } else {
            player = "Ty Cobb "+ (TCH - BRH);
        }
        System.out.println(player + " times more hits ball and reaches bases safely more on average");

    }


}
