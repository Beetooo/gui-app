import javax.swing.JOptionPane;

public class trueFalse {
    public static void quiz()throws Exception {
        //looping until the right answer is given
        while (true) {
            //asking turn or false question 
            int answer = JOptionPane.showConfirmDialog(null, "is Beto cool?","question", JOptionPane.YES_NO_OPTION);
            //if YES break out of loop
            if (answer == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "you are correct!");
                break;
            }
            //if NO repeat
            else{
                JOptionPane.showMessageDialog(null, "incorrect try again.");
            }

        }
    }
}
