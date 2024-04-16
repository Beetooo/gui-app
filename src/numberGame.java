import javax.swing.JOptionPane;

public class numberGame {
    public static void guessNumber()throws Exception {
        int num=(int) (Math.random() * 100) + 1;
        
        while (true) {
            int guess = Integer.parseInt(JOptionPane.showInputDialog("guess a number from 1 to 100"));

            if (guess>num) {
                JOptionPane.showMessageDialog(null, "your guess was too high");
            }
            else if (guess>num) {
                JOptionPane.showMessageDialog(null, "your guess was too low");
            }
            else{
                JOptionPane.showMessageDialog(null, "You are correct!");
                break;
            }
        }
    }
}
