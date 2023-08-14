package src;

public class Stages {
    public static String stageZero(){
        String s =      "          \n" +
                        "          \n" +
                        "          \n"+
                        "          \n"+
                        "          \n"+
                        "__________";
        return s;
    }
    public static String stageOne(){
        String s =      "|         \n" +
                        "|         \n" +
                        "|         \n"+
                        "|         \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageTwo(){
        String s =      "|----     \n" +
                        "|         \n" +
                        "|         \n"+
                        "|         \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageThree(){
        String s =      "|----     \n" +
                        "|   |     \n" +
                        "|         \n"+
                        "|         \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageFour(){
        String s =      "|----     \n" +
                        "|   |     \n" +
                        "|   0     \n"+
                        "|         \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageFive(){
        String s =      "|----     \n" +
                        "|   |     \n" +
                        "|   0     \n"+
                        "|   |     \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageSix(){
        String s =      "|----     \n" +
                        "|   |     \n" +
                        "|   0     \n"+
                        "|  /|\\    \n"+
                        "|         \n"+
                        "|_________";
        return s;
    }
    public static String stageSeven(){
        String s =      "|----     \n" +
                        "|   |     \n" +
                        "|   0     \n"+
                        "|  /|\\    \n"+
                        "|  / \\    \n"+
                        "|_________";
        return s;
    }
    public static final String[] stages = {stageZero(), stageOne(), stageTwo(), stageThree(), stageFour(), stageFive(), stageSix(), stageSeven()};
}
