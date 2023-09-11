package com.surendra.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab49IONBugFix {

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int    height = scanner.nextInt();
        String sport = scanner.next();
        scanner.close();

        ATHLETES.add(new Athlete(name, height, sport));

        System.out.println(printAll(ATHLETES));
    }

    public static ArrayList<String> printAll(List<Athlete> all) {
        if (all == null)
            throw new NullPointerException();
        else if (all.size() < 1)
            return new ArrayList<>();
        else {
            ArrayList<String> allNames = new ArrayList<>();
            for (Athlete f : all) {
                if (rare(f)) {
                    allNames.add(f.name);
                }
            }
            return allNames;
        }
    }

    // It is the norm for tall athletes to be basketball players
    public static boolean rare(Athlete a) {
// hight >180 and profess = basketball - typical
 // hight< 180 and profession = basketball
// rare > 180 but proffession != basketball
        if(a.height>=180 && a.profession!="basketball"){

            return true;
        }
        if(a.height<180 && a.profession=="basketball"){
            return true;
        }
        else{
            return false;
        }
/*  // Actual peice of code , above code is the fix of this solution
        if(a.height>180 || a.profession!="basketball")
            return true;
        else
            return true;*/
    }


    public final static class Athlete {
        public final int height;
        public final String profession;
        public final String name;

        public Athlete(String name, int height, String profession) {
            this.name = name;
            this.height = height;
            this.profession = profession;
        }
    }

    private final static List<Athlete> ATHLETES = new ArrayList<>();
    static {
        ATHLETES.add(new Athlete("Bob", 190, "basketball"));
        ATHLETES.add(new Athlete("Alex", 170, "soccer"));
        ATHLETES.add(new Athlete("Frank", 130, "basketball"));
        ATHLETES.add(new Athlete("Scotty", 175, "basketball"));
        ATHLETES.add(new Athlete("Jane", 190, "chess"));
        ATHLETES.add(new Athlete("test", 178, "basketball"));
    }
}
