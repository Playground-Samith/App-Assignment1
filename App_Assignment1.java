import java.util.Scanner;

public class App_Assignment1{
    private static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR="\033[H\033[2J";
        final String COLOR_BLUE_BOLD="\033[34;1m";
        final String RESET="\033[0m";
        final String DASHBOARD="💰Welcome to Smart Banking App";
        String screen=DASHBOARD;
        final String LINE="-".repeat(40);


        // do{
            final String APP_TITLE=String.format("%s%s%s",COLOR_BLUE_BOLD,screen,RESET);

            System.out.println(CLEAR);
            System.out.println(LINE);
            System.out.println(" ".repeat((40-APP_TITLE.length()+12)/2).concat(APP_TITLE));
            System.out.println(LINE);

            switch(screen){
                case DASHBOARD:
                System.out.println("\n[1]. Open New Account");
                System.out.println("[2]. Deposit Money");
                System.out.println("[3]. Withdraw Money");
                System.out.println("[4]. Transfer Money");
                System.out.println("[5]. Check Account Balance");
                System.out.println("[6]. Drop Existing Account");
                System.out.println("[7]. Exit \n");
                System.out.print("Enter an option to continue: ");
                int option=SCANNER.nextInt();
                SCANNER.nextLine();
                break;
            }
            




        // }while(true);

    }
}