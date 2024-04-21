import javax.swing.JOptionPane;

public class numberGame {
    public static void guessNumber()throws Exception {
        //getting random number from 1-100
        int num=(int) (Math.random() * 100) + 1;
        //looping until right number is guessed
        while (true) {
            //getting guess
            int guess = Integer.parseInt(JOptionPane.showInputDialog("guess a number from 1 to 100"));
            //outputting whether guess was too high, too low, or correct
            if (guess>num) {
                JOptionPane.showMessageDialog(null, "your guess was too high");
            }
            else if (guess>num) {
                JOptionPane.showMessageDialog(null, "your guess was too low");
            }
            else{
                JOptionPane.showMessageDialog(null, "You are correct!");
                //breaking out of loop if correct
                break;
            }
        }
    }
}
