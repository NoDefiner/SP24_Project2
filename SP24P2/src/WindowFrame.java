import javax.swing.*;

public class WindowFrame extends JFrame {
    public WindowFrame() {
        setTitle("SIC/XE Simulator - SP24");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        setVisible(true);
    }

    public static void main(String[] args) {
        WindowFrame frame = new WindowFrame();
    }
}
