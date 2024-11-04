

package travel.management.system1;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener

{
    
    JButton login,password,signup;
    JTextField tfpassword, tfusername;
Login()
{
      setSize(1050,500);
      setLocation(450,350);
      setLayout(null);   //hum apna layout banaenge
      
      
      JPanel p1=new JPanel();
      p1.setBackground(new Color(131,193,233));
     
      p1.setBounds(0, 0, 450, 450);
      p1.setLayout(null);
      add(p1);
      
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
      Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(100, 120 , 200, 200);
      p1.add(image);
      
      
      // right side me work karenge ab
      
      JPanel p2=new JPanel();
      p2.setLayout(null);
      p2.setBounds(400, 30, 450, 300);
      add(p2);
      
      
      //username
      JLabel lblusername = new JLabel("Username");
      lblusername.setBounds(120,30 ,100 ,25);
       lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,22));
      p2.add(lblusername);
      
      // for username Textfield
      
       tfusername= new JTextField();
     tfusername.setBounds(120, 60, 400, 40);
     tfusername.setBorder(BorderFactory.createEmptyBorder());
      tfusername.setFont(new Font("Berlin ",Font.BOLD,20));
      p2.add(tfusername);
      setVisible(true);
      
      
      // for password
      JLabel lblpassword = new JLabel("Password");
      lblpassword.setBounds(120,120 ,100 ,25);
      lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,22));
      p2.add(lblpassword);
      
      // for Password Textfield
      
       tfpassword= new JTextField();
     tfpassword.setBounds(120, 150, 400, 40);
     tfpassword.setBorder(BorderFactory.createEmptyBorder());
     tfpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
      p2.add(tfpassword);
      
      //for login button
      
     login = new JButton("Login");
      login.setBounds(120, 210, 150, 40);
      login.setBackground(new Color(133, 193,233));
      login.setFont(new Font("SAN_SERIF",Font.PLAIN,22));
      login.setForeground(Color.WHITE);
      login.setBorder(new LineBorder(new Color(133,193,233)));
      login.addActionListener(this);
      p2.add(login);
      
      //for Signup button
      
       signup = new JButton("Signup");
      signup.setBounds(300, 210, 150, 40);
      signup.setBackground(new Color(133, 193,233));
      signup.setFont(new Font("SAN_SERIF",Font.PLAIN,22));
      signup.setForeground(Color.WHITE);
      signup.setBorder(new LineBorder(new Color(133,193,233)));
      signup.addActionListener(this);
      p2.add(signup);
      
      //for forgot password
      
      password = new JButton("Forget  Password");
      password.setBounds(120, 268, 200, 40);
      password.setBackground(new Color(133, 193,233));
      password.setFont(new Font("SAN_SERIF",Font.PLAIN,22));
      password.setForeground(Color.WHITE);
      password.setBorder(new LineBorder(new Color(133,193,233)));
      password.addActionListener(this);
      p2.add(password);
      
      JLabel text=new JLabel("Trouble in login....");
      text.setBounds(340,265,210,40);
      text.setForeground(Color.red);
       text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
      p2.add(text);
      
      setVisible(true);
      
}
    public static void main(String[] args)
    {
       Login l=new Login();
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==login)
        {
            //login frame se value lena he or value ko fetch karana he database k saath
            //agar value match hoti hai to loading frame open karna hai
            
            try{
                String sql;
                 Connection con=null;
                 PreparedStatement ps;
                 ResultSet rs;
                 con=Con.getConnection();
               //textfield ki value leni hai
                String username = tfusername.getText();
                String pass = tfpassword.getText();//dono info hamare paas aa chuki hai ab query banaenge
                
                sql ="select * from travel where username='"+username+"' AND password ='"+pass+"'";
                //now connection with mysql
                 ps= con.prepareStatement(sql);
                rs = ps.executeQuery();//result aaya Resultset me
                  if(rs.next())
                      
                      //bataega ki obj khali he ya fir abhi bi value hai
                  {
                      setVisible(false);//matlab ab use data mil gaya hai or data match hua to false
                      new Loading(username);
                  }
                  else         //agar data match nahi hua to or ya fir kuvh nhi mila to
                  {
                      JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                  }
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new Signup();
        }
       else
        {
            setVisible(false);
            new ForgetPassword();
        }
    }
}
