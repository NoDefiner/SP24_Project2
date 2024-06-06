import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowFrame extends JFrame {
    public WindowFrame() {
        setTitle("SIC/XE Simulator - SP24");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
    }

    public static void main(String[] args) {
        WindowFrame frame = new WindowFrame();
        frame.setLocationRelativeTo(null);

        Container cPane = frame.getContentPane();
        cPane.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JLabel fileLabel = new JLabel("No File");
        JButton fileOpenButton = new JButton("Open File");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);
        fileOpenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileChooser.showOpenDialog(frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    String fileName = fileChooser.getSelectedFile().getName();
                    fileLabel.setText("File Name: " + fileName);
                }
            }
        });
        topPanel.add(fileOpenButton);
        topPanel.add(fileLabel);

        JPanel leftPanel = new JPanel();
        

        JPanel rightPanel = new JPanel();

        cPane.add(topPanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
