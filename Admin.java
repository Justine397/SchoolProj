import javax.swing.*;
import java.awt.*;

public class Admin extends JFrame {
    JPanel adminPanel;
    JButtons updateBtn, createBtn, deleteBtn;
    
    public Admin() {
        setTitle("Admin's View");
        setSize(600, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        adminView();

        setVisible(true);
    }

    public void adminView() {
        adminPanel = new JPanel();
        adminPanel.setBackground(new Color(18, 22, 43));
        adminPanel.setBounds(0, 0, 600, 800);
        adminPanel.setLayout(null);
        add(adminPanel);

        JLabel adminL = new JLabel("ADMIN");
        adminL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        adminL.setForeground(new Color(255, 255, 255));
        adminL.setBounds(120, 20, 500, 40);
        adminPanel.add(adminL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(30, 70, 520, 5); // Adjust position and size of the separator
        adminPanel.add(separator);

        try {
            ImageIcon originalIcon = new ImageIcon("C:\\Users\\SHALDONN GIEL\\Downloads\\GROUP Project\\avatar.jpg");
            Image img = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 100, 200, 200);
            adminPanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel nameL = new JLabel("Name: ");
        Font nameF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        nameL.setForeground(new Color(255, 255, 255));
        nameL.setBounds(250, 200, 100, 15);
        nameL.setFont(nameF);
        adminPanel.add(nameL);

        JLabel classL = new JLabel("Class: ");
        Font classF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        classL.setForeground(new Color(255, 255, 255));
        classL.setBounds(250, 240, 100, 15);
        classL.setFont(classF);
        adminPanel.add(classL);

        JLabel idL = new JLabel("ID No: ");
        Font idF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        idL.setForeground(new Color(255, 255, 255));
        idL.setBounds(250, 280, 100, 15);
        idL.setFont(idF);
        adminPanel.add(idL);

    }
}