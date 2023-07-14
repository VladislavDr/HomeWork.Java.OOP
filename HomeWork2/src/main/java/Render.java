
public class Render{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_Bright_RED = "\u001B[91m";

    public static void showIndicator(Object obj){
        if(obj instanceof HP){
            int maxHP = ((HP)obj).getMaxXP();
            int currXP = ((HP)obj).getCurrRndXP();

            if(currXP == maxHP){
                System.out.println(ANSI_GREEN + "Max health: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_GREEN + "Current health: " + currXP + ANSI_RESET);
            }else
                if(currXP < (maxHP/2)){
                System.out.println(ANSI_Bright_RED + "Max health: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_Bright_RED + "Current health: " + currXP + ANSI_RESET);
            }
            else{
                System.out.println(ANSI_RED + "Max health: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_RED + "Current health: " + currXP + ANSI_RESET);
            }
        }

        if(obj instanceof MP){
            System.out.println(ANSI_BLUE + "maxManaPoint: " + ((MP)obj).getMaxRndMP() + ANSI_RESET);
            System.out.println(ANSI_BLUE + "currentManaPoint: " + ((MP)obj).getCurrRndMP() + ANSI_RESET);
        }
        System.out.println("------------------");
     }
}
