/**
 * @author - Shreyash Jadhav
 */
public class Gambler {
    public static void main(String[] args) {
        System.out.println("\n ***** Welcome to GamblingSimulator *****");
        int everyDayStack = 100;
        int betForGame = 1;
        int bet = (int) (Math.random()*2);
        if (bet == 1) {
            everyDayStack += betForGame;
            System.out.println("\n Won the Bet \n everyDayStack : " + everyDayStack);
        } else {
            everyDayStack -= betForGame;
            System.out.println("\n Loose the Bet \n everyDayStack : " + everyDayStack);
        }
    }
}