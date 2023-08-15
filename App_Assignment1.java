import java.util.Scanner;

public class App_Assignment1{
    private static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR="\033[H\033[2J";
        final String COLOR_BLUE_BOLD="\033[34;1m";
        final String COLOR_RED_BOLD="\033[31;1m";
        final String RESET="\033[0m";
        final String DASHBOARD="💰 Welcome to Smart Banking App";
        final String OPEN_ACCOUNT="📂 Open New Account";
        final String DEPOSIT_MONEY="⏬ Deposit Money";
        final String WITHDRAW_MONEY="⏫ Deposit Money";
        final String TRANSFER_MONEY="🔁 Transfer Money";
        final String ACCOUNT_BALANCE="💲 Check Account Balance";
        final String DELETE_ACCOUNT="❌ Drop Existing Account";
        String screen=DASHBOARD;
        final String LINE="-".repeat(40);
        final String ERROR_MSG=String.format("%s%s%s",COLOR_RED_BOLD,"%s",RESET);
        String[] accountId=new String[0];
        String[] accountName=new String[0];


        do{
            final String APP_TITLE=String.format("%s%s%s",COLOR_BLUE_BOLD,screen,RESET);

            System.out.println(CLEAR);
            System.out.println(LINE);
            System.out.println(" ".repeat((40-APP_TITLE.length()+11)/2).concat(APP_TITLE));
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
                switch(option){
                    case 1: screen=OPEN_ACCOUNT;break;
                    case 2: screen=DEPOSIT_MONEY;break;
                    case 3: screen=WITHDRAW_MONEY;break;
                    case 4: screen=TRANSFER_MONEY;break;
                    case 5: screen=ACCOUNT_BALANCE;break;
                    case 6: screen=DELETE_ACCOUNT;break;
                    case 7: System.exit(0);
                    default: continue;
                }
                break;
                
                case OPEN_ACCOUNT:
                    String id;
                    String name;
                    boolean valid=true;
                    System.out.printf("\tID : SDB-%05d \n",accountId.length+1);

                    //Name Validation
                    do{
                    System.out.print("\tName : ");
                    name=SCANNER.nextLine().strip();

                    if(name.isBlank()){
                        System.out.printf("\t"+ERROR_MSG+"\n","Name can't be empty");
                        valid=false;
                        continue;
                    }

                    for(int i=0;i<name.length();i++){
                        if(!(Character.isLetter(name.charAt(i)) || Character.isSpaceChar(name.charAt(i)))){
                            System.out.printf("\t"+ERROR_MSG+"\n","Invalid name");
                            valid=false;
                            break;
                        }
                    }
                }while(!valid);

                //Initial Deposit Validation
                do{
                    System.out.print("\tInitial Deposit : ");
                    name=SCANNER.nextLine().strip();

                    if(name.isBlank()){
                        System.out.printf("\t"+ERROR_MSG+"\n","Name can't be empty");
                        valid=false;
                        continue;
                    }

                    for(int i=0;i<name.length();i++){
                        if(!(Character.isLetter(name.charAt(i)) || Character.isSpaceChar(name.charAt(i)))){
                            System.out.printf("\t"+ERROR_MSG+"\n","Invalid name");
                            valid=false;
                            break;
                        }
                    }
                }while(!valid);


                
                
                default:
                  System.exit(0);
            }

           
        }while(true);

    }
}