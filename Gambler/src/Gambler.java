/**
 * @author - Shreyash Jadhav
 */
public class Gambler {
    /*
     *  taking everyDayStack = 100 and betForGame = 1
     */
    static int everyDayStack = 100;
    static int betForGame = 1;
    public static void main(String[] args) {
        /*
         *  printing welcome message
         *  used for loop to play game till 20 days and every time add last day remaining stack to new day
         *  print starting stack of day
         *  used while  loop to play game till gambler win or loose 50% of everyDayStack
         *  In while loop,
         *  make bet of 1, use Math.random to get 0 or 1
         *  if we got 1 we will add 1 to everyDayStack
         *  else we subtract 1 from everyDayStack
         *  counting number of days won and loose and by how much
         *  print Remaining Stack
         */
        System.out.println("\n ***** Welcome to GamblingSimulator *****");
        System.out.println(" Starting stake = " + everyDayStack);
        int stack = 0;
        int startingStack;
        int winDays = 0;
        int looseDays = 0;
        int winBy = 0;
        int looseBy = 0;
        int maxWin = 0;
        int maxLoose = 0;
        for (int day = 1; day <= 20; day++) {
            stack += everyDayStack;
            startingStack = stack;
            int minStake = (stack-stack/2);
            int maxStake = (stack+stack/2);
            System.out.println("\n Day : " + day);
            System.out.println(" Starting stake = " + stack);
            while (stack > minStake && stack < maxStake) {
                int makeBet = (int) (Math.random() * 2);
                if (makeBet == 1) {
                    stack += betForGame;
                } else {
                    stack -= betForGame;
                }
            }
            if (startingStack < stack) {
                if ((stack - startingStack) > winBy){
                    maxWin = day;
                }
                 winDays += 1;
                 winBy = (stack - startingStack);
                System.out.println(" Win by : " + winBy);
            } else {
                if ((startingStack - stack) > looseBy){
                    maxLoose = day;
                }
                looseDays += 1;
                looseBy = (startingStack - stack);
                System.out.println(" Loose by : " + looseBy);
            }
            System.out.println(" Remaining stake = " + stack);
        }
        System.out.println("\n Luckiest day is Day " + maxWin + "\n Unluckiest day is Day " + maxLoose);
        System.out.println(" Total days won : " + winDays + "\n Total days loose : " + looseDays);
    }
}