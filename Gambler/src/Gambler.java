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
         *  used while  loop to play game till gambler win or loose 50% of everyDayStack
         *  In while loop,
         *  make bet of 1, use Math.random to get 0 or 1
         *  if we got 1 we will print won message and add 1 to everyDayStack
         *  else we will print loose message and subtract 1 from everyDayStack
         *  print Remaining Stack
         */
        System.out.println("\n ***** Welcome to GamblingSimulator *****");
        while (everyDayStack > 50 && everyDayStack < 150) {

            int makeBet = (int) (Math.random()*2);
            if (makeBet == 1) {
                everyDayStack += betForGame;
                System.out.println("\n Won the Bet");
            } else {
                everyDayStack -= betForGame;
                System.out.println("\n Loose the Bet");
            }
            System.out.println(" Remaining stake = " + everyDayStack);
        }
    }
}