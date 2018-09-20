
////////////////////////////////PASSWORD FOR new added student will automatically be "common" , if password is not added //////
////////////////////////////////ID is student id//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package StudentManagement;
import static StudentManagement.StudentDataEdit.row2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class STUDENTINFO extends JFrame {

    private Container container;
    private JButton myinfo, myresult, addpassword, back;
    private ImageIcon icon;
    private Font font;
    private ImageIcon image;
    private JLabel background;

    STUDENTINFO() {
        seticon();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("STUDENT INFO");
        setSize(820, 645);
        setLocation(200, 30);
        setResizable(false);
        icon = new ImageIcon(getClass().getResource("Icon.jpg"));
        setIconImage(icon.getImage());
        container = getContentPane();
        container.setBackground(Color.GREEN);
        container.setLayout(null);
        image = new ImageIcon(getClass().getResource("backgroundforadmin.png"));
        background = new JLabel("", image, JLabel.LEADING);
        background.setBounds(0, 0, 820, 645);
        font = new Font("Arial", Font.BOLD, 18);
        myinfo = new JButton("MY INFO");
        myinfo.setBounds(250, 40, 300, 70);
        myinfo.setFont(font);
        container.add(myinfo);
        myresult = new JButton("MY RESULT");
        myresult.setBounds(250, 130, 300, 70);
        myresult.setFont(font);
        container.add(myresult);
        back = new JButton("BACK");
        back.setBounds(250, 310, 300, 70);
        back.setFont(font);
        container.add(back);
        addpassword = new JButton("Add password");
        addpassword.setBounds(250, 220, 300, 70);
        addpassword.setFont(font);
        container.add(addpassword);
        container.add(background);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainMenu obj = new MainMenu();
                obj.setVisible(true);
            }

        });
        addpassword.addActionListener(new ActionListener() {//password
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                editpassword ob = new editpassword();
                ob.setVisible(true);

            }

        });

        myinfo.addActionListener(new ActionListener() {//student info
            @Override
            public void actionPerformed(ActionEvent e) {
                STUDENTLOGICFORM ob = new STUDENTLOGICFORM();
                getMyINfo(ob.studentId);
                InfoForm ob1 = new InfoForm();
                ob1.backselector = false;

            }

        });

        myresult.addActionListener(new ActionListener() {//student result
            @Override
            public void actionPerformed(ActionEvent e) {
                myresult ob = new myresult();
                ob.setVisible(true);
                dispose();
            }

        });

    }

    // this function get my info from database and set it to info form
    public void getMyINfo(String myID) {

        InfoForm ob = new InfoForm();
        ob.setVisible(true);
        dispose();
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");

            String sql = "select * from INFOTABLE where ID='" + myID + "' ";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("NAME");
                ob.getname().setText(add1);
                String add2 = rs.getString("ID");
                ob.getID().setText(add2);
                String add3 = rs.getString("SECTION");
                ob.getSection().setText(add3);
                String add4 = rs.getString("DEPARTMENT");
                ob.getDepartment().setText(add4);
                String add5 = rs.getString("EMAIL");
                ob.getEmail().setText(add5);
                String add6 = rs.getString("PHONENUMBER");
                ob.getPhoneNUM().setText(add6);
                String add7 = rs.getString("FATHERNAME");
                ob.getFatherNam().setText(add7);
                String add8 = rs.getString("MOTHERNAME");
                ob.getMotherNam().setText(add8);
                String add9 = rs.getString("ADDRESS");
                ob.getAddress().setText(add9);
                String add10 = rs.getString("PERMANENTADDRESS");
                ob.getPermanentAddrs().setText(add10);
                String add11 = rs.getString("BLOODGROUP");
                ob.getBloodGrp().setText(add11);
            }

            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public static void main(String[] args) {

    }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
