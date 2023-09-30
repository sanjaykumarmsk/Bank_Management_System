package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JDateChooser dateChooser;
    JTextField textName, textFName,textEmail,textAdd,textCity,textPin,textSt;
    Random ran = new Random();
    long first4 = (ran.nextLong()%900L)+1000L;
    String first = ""+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+ first);
        label1.setBounds(160,20,600,30);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,20));
        label2.setBounds(330,70,600,20);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,14));
        labelName.setBounds(100,150,100,20);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,12));
        textName.setBounds(300,150,400,25);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,14));
        labelFName.setBounds(100,200,200,20);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,200,400,25);
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB .setFont(new Font("Raleway",Font.BOLD,14));
        DOB .setBounds(100,300,200,20);
        add(DOB );

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,400,25);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Raleway",Font.BOLD,14));
        labelG.setBounds(100,250,200,20);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,250,60,25);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,250,90,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,14));
        labelEmail.setBounds(100,350,200,20);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,25);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,14));
        labelMs.setBounds(100,400,200,20);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,400,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,400,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(635,400,100,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,14));
        labelAdd.setBounds(100,450,200,20);
        add(labelAdd);

        textAdd= new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,450,400,25);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,14));
        labelCity.setBounds(100,500,200,20);
        add(labelCity);

        textCity= new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,500,400,25);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,14));
        labelPin.setBounds(100,550,200,20);
        add(labelPin);

        textPin= new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,550,400,25);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,14));
        labelState.setBounds(100,600,200,20);
        add(labelState);

        textSt= new JTextField();
        textSt.setFont(new Font("Raleway",Font.BOLD,14));
        textSt.setBounds(300,600,400,25);
        add(textSt);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,650,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,750);
        setLocation(280,0);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital="Unmarried";
        } else if (m3.isSelected()) {
            marital="Other";
        }
        String address= textAdd.getText();
        String  city = textCity.getText();
        String pincode =textPin.getText();
        String state = textSt.getText();
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
