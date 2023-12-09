import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TeacherEditableGrade extends JFrame {
    JPanel tUpdatePanel;

    public TeacherEditableGrade() {
        setTitle("Update Grade");
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        teacherUpdateGrade();

        setVisible(true);
    }

    public void teacherUpdateGrade() {
        tUpdatePanel = new JPanel();
        tUpdatePanel.setBackground(new Color(18, 22, 43));
        tUpdatePanel.setPreferredSize(new Dimension(560, 850)); // Adjust as needed
        tUpdatePanel.setLayout(null);

        JLabel infoL = new JLabel("INFORMATION");
        infoL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        infoL.setForeground(new Color(255, 255, 255));
        infoL.setBounds(170, 20, 500, 40);
        tUpdatePanel.add(infoL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(30, 70, 520, 5); // Adjust position and size of the separator
        tUpdatePanel.add(separator);

        try {
            ImageIcon originalIcon = new ImageIcon("C:\\Users\\SHALDONN GIEL\\Downloads\\GROUP Project\\avatar.jpg");
            Image img = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 100, 200, 200);
            tUpdatePanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel nameL = new JLabel("Name: ");
        Font nameF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        nameL.setForeground(new Color(255, 255, 255));
        nameL.setBounds(250, 200, 100, 15);
        nameL.setFont(nameF);
        tUpdatePanel.add(nameL);

        JLabel classL = new JLabel("Class: ");
        Font classF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        classL.setForeground(new Color(255, 255, 255));
        classL.setBounds(250, 240, 100, 15);
        classL.setFont(classF);
        tUpdatePanel.add(classL);

        JLabel idL = new JLabel("ID No: ");
        Font idF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        idL.setForeground(new Color(255, 255, 255));
        idL.setBounds(250, 280, 100, 15);
        idL.setFont(idF);
        tUpdatePanel.add(idL);

        JLabel evaluationL = new JLabel("EVALUATION: ");
        Font evaluationF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        evaluationL.setForeground(new Color(255, 255, 255));
        evaluationL.setBounds(50, 310, 200, 15);
        evaluationL.setFont(evaluationF);
        tUpdatePanel.add(evaluationL);

        JLabel yearLabel1 = new JLabel("1st YEAR");
        Font yearFont1 = new Font("Arial Rounded MT Bold", Font.BOLD, 15);
        yearLabel1.setBounds(250, 360, 200, 30); // Adjust position and size
        yearLabel1.setFont(yearFont1);
        yearLabel1.setForeground(new Color(255, 255, 255)); // Set text color
        tUpdatePanel.add(yearLabel1);

        // Create a rectangle and set it as the background for the JLabel
        JPanel rectPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(44, 66 ,184));
                g.fillRect(0, 0, 520, 30);
            }
        };
        rectPanel1.setBounds(30, 360, 520, 30);
        tUpdatePanel.add(rectPanel1);

        // Creating the table for the first year
        String[] columnNames1 = { "Subject", "1st Sem", "2nd Sem", "Finals" };
        Object[][] data1 = {
                { "Math", "", "", "" },
                { "Science", "", "", "" },
                { "History", "", "", "" },
                { "OOP", "", "", "" },
                { "DSA", "", "", "" },
                // Add more rows as needed
        };

        DefaultTableModel tableModel1 = new DefaultTableModel(data1, columnNames1);
        JTable table1 = new JTable(tableModel1);
        JScrollPane scrollPane1 = new JScrollPane(table1);
        scrollPane1.setBounds(30, 390, 520, 105);
        tUpdatePanel.add(scrollPane1);

        JLabel yearLabel2 = new JLabel("2nd YEAR");
        Font yearFont2 = new Font("Arial", Font.BOLD, 15);
        yearLabel2.setBounds(250, 520, 200, 30);
        yearLabel2.setFont(yearFont2);
        yearLabel2.setForeground(new Color(255, 255, 255));
        tUpdatePanel.add(yearLabel2);

        JPanel rectPanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(44, 66 ,184));
                g.fillRect(0, 0, 520, 30);
            }
        };
        rectPanel2.setBounds(30, 520, 520, 30);
        tUpdatePanel.add(rectPanel2);

        // Creating the table for the second year
        String[] columnNames2 = { "Subject", "1st Sem", "2nd Sem", "Finals" };
        Object[][] data2 = {
                { "Math", "", "", "" },
                { "Science", "", "", "" },
                { "History", "", "", "" },
                { "OOP", "", "", "" },
                { "DSA", "", "", "" },
                // Add more rows as needed
        };

        DefaultTableModel tableModel2 = new DefaultTableModel(data2, columnNames2);
        JTable table2 = new JTable(tableModel2);
        JScrollPane scrollPane2 = new JScrollPane(table2);
        scrollPane2.setBounds(30, 550, 520, 105);
        tUpdatePanel.add(scrollPane2);

        JLabel yearLabel3 = new JLabel("3rd YEAR");
        Font yearFont3 = new Font("Arial", Font.BOLD, 15);
        yearLabel3.setBounds(250, 680, 200, 30);
        yearLabel3.setFont(yearFont3);
        yearLabel3.setForeground(new Color(255, 255, 255));
        tUpdatePanel.add(yearLabel3);

        JPanel rectPanel3 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(44, 66 ,184));
                g.fillRect(0, 0, 520, 30);
            }
        };
        rectPanel3.setBounds(30, 680, 520, 30);
        tUpdatePanel.add(rectPanel3);

        // Creating the table for the third year
        String[] columnNames3 = { "Subject", "1st Sem", "2nd Sem", "Finals" };
        Object[][] data3 = {
                { "Math", "", "", "" },
                { "Science", "", "", "" },
                { "History", "", "", "" },
                { "OOP", "", "", "" },
                { "DSA", "", "", "" },
                // Add more rows as needed
        };

        DefaultTableModel tableModel3 = new DefaultTableModel(data3, columnNames3);
        JTable table3 = new JTable(tableModel3);
        JScrollPane scrollPane3 = new JScrollPane(table3);
        scrollPane3.setBounds(30, 710, 520, 105);
        tUpdatePanel.add(scrollPane3);

        JScrollPane scrollPane = new JScrollPane(tUpdatePanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        add(scrollPane);
    }

    public static void main(String[] args) {
        TeacherEditableGrade teacherEditableGrade = new TeacherEditableGrade();
    }
}