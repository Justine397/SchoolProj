import javax.swing.*;
import java.awt.*;

public class Teacher extends JFrame {
    JPanel teacherPanel;
    
    public Teacher() {
        setTitle("Teacher's View");
        setSize(600,800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        teacherView();

        setVisible(true);
    }

    public void teacherView() {
        teacherPanel = new JPanel();
        teacherPanel.setBackground(new Color(18, 22, 43));
        teacherPanel.setBounds(0, 0, 600, 800);
        teacherPanel.setLayout(null);
        add(teacherPanel);

        JLabel teacherL = new JLabel("Teacher");
        teacherL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        teacherL.setForeground(new Color(255, 255, 255));
        teacherL.setBounds(130, 20, 200, 30);
        teacherPanel.add(teacherL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(30, 70, 520, 5); // Adjust position and size of the separator
        teacherPanel.add(separator);

        try {
            ImageIcon originalIcon = new ImageIcon("C:\\Users\\SHALDONN GIEL\\Downloads\\GROUP Project\\avatar.jpg");
            Image img = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 100, 200, 200);
            teacherPanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel nameL = new JLabel("Name: ");
        Font nameF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        nameL.setForeground(new Color(255, 255, 255));
        nameL.setBounds(250, 200, 100, 15);
        nameL.setFont(nameF);
        teacherPanel.add(nameL);

        JLabel classL = new JLabel("Class: ");
        Font classF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        classL.setForeground(new Color(255, 255, 255));
        classL.setBounds(250, 240, 100, 15);
        classL.setFont(classF);
        teacherPanel.add(classL);

        JLabel idL = new JLabel("ID No: ");
        Font idF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        idL.setForeground(new Color(255, 255, 255));
        idL.setBounds(250, 280, 100, 15);
        idL.setFont(idF);
        teacherPanel.add(idL);

        JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
        separator1.setBounds(30, 330, 520, 5); // Adjust position and size of the separator
        teacherPanel.add(separator1);

        String sections[] = { "SECTIONS", "Section 1", "Section 2", "Section 3", "Section 4" };
        JComboBox<String> sectionBox = new JComboBox<>(sections);
        sectionBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        sectionBox.setBounds(30, 370, 300, 30);
        teacherPanel.add(sectionBox);

        DefaultListModel<String> studentList = new DefaultListModel<>();
        studentList.addElement("Student 1");
        studentList.addElement("Student 2");
        studentList.addElement("Student 3");
        studentList.addElement("Student 5");
        JList<String> Lists = new JList<>(studentList);
        Lists.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        Lists.setBounds(30, 420, 520, 300);
        teacherPanel.add(Lists);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
    }
}