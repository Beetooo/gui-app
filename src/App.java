import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //getting user name
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Oh Hello.." +name);
        //getting user age
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are ya??"));
        JOptionPane.showMessageDialog(null, "Oh wow! you're only " +age+" years old??");
        //calling functions
        trueFalse.quiz();
        numberGame.guessNumber();
    }
}
