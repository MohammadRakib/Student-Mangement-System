
////////////////////////////////PASSWORD FOR ADMIN IS 12345 AND ID IS admin//////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////


package StudentManagement;
import java.awt.Color;
import java.awt.Container;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogicForm extends JFrame {

    private Container container;
    private JLabel userlabel, passwordlabel, background;
    private JTextField usertext;
    private JButton loginbutton, resetbutton, backbutton;
    private JPasswordField passwordfield;
    private Font font;
    private ImageIcon image;
    static boolean backselector;

    AdminLogicForm() {
        seticon();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("ADMIN LOGIN");
        setBounds(200, 50, 600, 400);
        setResizable(false);
        container = getContentPane();

        container.setLayout(null);

        image = new ImageIcon(getClass().getResource("drubo.jpg"));
        background = new JLabel("", image, JLabel.CENTER);
        background.setBounds(0, 0, 600, 400);

        font = new Font("Arial", Font.BOLD, 18);

        userlabel = new JLabel("USERNAME :");
        userlabel.setBounds(50, 70, 300, 70);
        userlabel.setFont(font);
        container.add(userlabel);
        usertext = new JTextField();
        usertext.setBounds(200, 70, 150, 70);
        usertext.setFont(font);
        container.add(usertext);
        passwordlabel = new JLabel("PASSWORD :");
        passwordlabel.setBounds(50, 150, 300, 70);
        passwordlabel.setFont(font);
        container.add(passwordlabel);
        passwordfield = new JPasswordField();
        passwordfield.setBounds(200, 150, 150, 70);
        passwordfield.setFont(font);
        container.add(passwordfield);
        loginbutton = new JButton("LOGIN");
        loginbutton.setBounds(150, 250, 100, 80);
        loginbutton.setFont(font);
        container.add(loginbutton);
        resetbutton = new JButton("RESET");
        resetbutton.setBounds(280, 250, 100, 80);
        resetbutton.setFont(font);
         backbutton = new JButton("BACK");
        backbutton.setBounds(410, 250, 100, 80);
        backbutton.setFont(font);
        container.add(backbutton);
        container.add(resetbutton);
        container.add(background);
        

        // reset all
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usertext.setText(null);
                passwordfield.setText(null);
            }

        });
        //get id and password from text field and login
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = usertext.getText();
                String password = passwordfield.getText();
                if (name.equals("admin") && password.equals("12345")) {
                    dispose();
                    AdminInfo frame2 = new AdminInfo();
                    frame2.setVisible(true);
                    backselector = true;

                } else {
                    JOptionPane.showMessageDialog(null, "wrong password");
                }
            }

        });
       backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainMenu obj = new MainMenu();
                obj.setVisible(true);
            }

        });
    }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
