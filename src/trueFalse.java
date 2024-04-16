import javax.swing.JOptionPane;

public class trueFalse {
    public static void quiz()throws Exception {
        
        while (true) {
            int answer = JOptionPane.showConfirmDialog(null, "is Beto cool?","question", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "you are correct!");
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "incorrect try again.");
            }

        }
    }
}
