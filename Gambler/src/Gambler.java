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
         * used for loop to play game till 20 days and every time add last day remaining stack to new day
         *  used while  loop to play game till gambler win or loose 50% of everyDayStack
         *  In while loop,
         *  make bet of 1, use Math.random to get 0 or 1
         *  if we got 1 we will print won message and add 1 to everyDayStack
         *  else we will print loose message and subtract 1 from everyDayStack
         *  print Remaining Stack
         */
        System.out.println("\n ***** Welcome to GamblingSimulator *****");
        System.out.println(" Starting stake = " + everyDayStack);
        int stack = 0;
        for (int day = 1; day <= 20; day++) {
            stack += everyDayStack;
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
            System.out.println(" Remaining stake = " + stack);
        }
    }
}