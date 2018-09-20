
////////////////////////////////PASSWORD FOR new added student will automatically be "common" , if password is not added //////
////////////////////////////////ID is student id//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package StudentManagement;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class STUDENTLOGICFORM extends JFrame {

    private Container container;
    private JLabel userlabel, passwordlabel, background,note;
    private JTextField usertext;
    private JButton loginbutton, resetbutton, backbuton;
    private JPasswordField passwordfield;
    private Font font;
    static String studentId;
    private ImageIcon image;

    STUDENTLOGICFORM() {
        seticon();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("STUDENT LOGIN");
        setBounds(200, 50, 600, 400);
        setResizable(false);
        container = getContentPane();
        container.setBackground(Color.GREEN);
        container.setLayout(null);
        image = new ImageIcon(getClass().getResource("drubo.jpg"));
        background = new JLabel("", image, JLabel.CENTER);
        background.setBounds(0, 0, 600, 400);

        font = new Font("Arial", Font.BOLD, 18);
        userlabel = new JLabel("USERNAME :");
        userlabel.setBounds(50, 70, 300, 70);
        userlabel.setFont(font);
        container.add(userlabel);
        note= new JLabel("Password is 'common' if not added");
        note.setBounds(150, 300, 350, 100);
        note.setFont(font);
        container.add(note);
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
        backbuton = new JButton("BACK");
        backbuton.setBounds(410, 250, 100, 80);
        backbuton.setFont(font);
        container.add(backbuton);
        container.add(resetbutton);
        container.add(background);
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usertext.setText(null);
                passwordfield.setText(null);
            }

        });
        // this is for login button, this take data from text field and check it to database data and login  
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int loginsuccesful = 0;
                    studentId = usertext.getText();
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/LoginInformation", "pass", "pass");
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from PASSWORD");
                    while (rs.next()) {
                        if (rs.getString(1).equals(usertext.getText()) && rs.getString(2).equals(passwordfield.getText())) {
                            loginsuccesful = 1;
                            break;
                        }
                    }
                    if (loginsuccesful == 1) {

                        dispose();
                        STUDENTINFO frame1 = new STUDENTINFO();
                        frame1.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "LOGIN UNSUCCESSFULL");
                    }
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }

        });
        backbuton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainMenu obj = new MainMenu();
                obj.setVisible(true);
            }

        });
    }

    public static void main(String[] args) {

    }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
