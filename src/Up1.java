
import javax.swing.*;


public class Up1 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Enter the thing example (wasdds)");
        int N = n.length();
        int pos = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < N; i++){

            if('a' == n.charAt(pos)){
                x = x-1;
                pos++;
            }
            else if('d' == n.charAt(pos)){
                x = x+1;
                pos++;
            }
            else if('s' == n.charAt(pos)){
                y = y-1;
                pos++;
            }
            else if('w' == n.charAt(pos)){
                y++;
                pos++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }

        }
        JOptionPane.showMessageDialog(null, "(" + x + "," + y + ")");
    }
}
