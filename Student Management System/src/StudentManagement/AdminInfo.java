
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

public class AdminInfo extends JFrame {

    private Container container;
    private JButton infobutton, addbutton, editbutton, resultbutton, cgpabutton, backbutton;
    private Font font;
    private ImageIcon image;
    private JLabel background;

    AdminInfo() {
        seticon();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ADMIN INFO");
        setSize(820, 645);
        setLocation(200, 30);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        image = new ImageIcon(getClass().getResource("backgroundforadmin.png"));
        background = new JLabel("", image, JLabel.LEADING);
        background.setBounds(0, 0, 820, 645);
        font = new Font("Arial", Font.BOLD, 18);
        infobutton = new JButton("STUDENT INFO");
        infobutton.setBounds(280, 40, 310, 70);
        infobutton.setFont(font);
        container.add(infobutton);
        resultbutton = new JButton("STUDENT RESULT");
        resultbutton.setBounds(280, 160, 310, 70);
        resultbutton.setFont(font);
        container.add(resultbutton);
        cgpabutton = new JButton("CGPA Calculator");
        cgpabutton.setBounds(280, 280, 310, 70);
        cgpabutton.setFont(font);
        container.add(cgpabutton);
        backbutton = new JButton("BACK");
        backbutton.setBounds(280, 400, 310, 70);
        backbutton.setFont(font);
        container.add(backbutton);
        container.add(background);
        //this function is for what back button does
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainMenu obj = new MainMenu();
                obj.setVisible(true);
                AdminLogicForm ob = new AdminLogicForm();
                ob.backselector = false;
            }

        });
        //this function is for what cgpa button does, this function allow us to go cgpa calculator jframe
        cgpabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CGPACALCULATOR object = new CGPACALCULATOR();

                object.setResizable(false);
                object.setBackground(Color.cyan);
                object.setVisible(true);
            }

        });
        //this function is for what infobutton button does, it allow us to go studentdataedit jframe
        infobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                dispose();
                StudentDataEdit ob = new StudentDataEdit();
                ob.setVisible(true);
                InfoForm ob1 = new InfoForm();
                ob1.backselector = true;

            }

        }
        );
        //this function is for what resultbutton button does, it allow us to go studentresult jframe
        resultbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                dispose();
                studentresult ob = new studentresult();
                ob.setVisible(true);

            }

        }
        );

    }

    public static void main(String[] args) {

    }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
