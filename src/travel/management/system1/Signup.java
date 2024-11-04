

package travel.management.system1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener
{
    
    JButton btn, back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    
    Signup()
    {      
         //for right side
        setBounds(500,250,1150,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //for  left Panel
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,650,600);
        p1.setLayout(null);
        add(p1);
        
        //for username label
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,21));
        lblusername.setBounds(40,50 ,120 ,40);
        p1.add(lblusername);
        
        // for username Textfield
        
         tfusername=new JTextField();
        tfusername.setBounds(160, 50, 240,40);
        tfusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add( tfusername);
        
        // for Name label
        
        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,21));
        lblname.setBounds(40,120 ,120 ,40);
        p1.add(lblname);
        
        // for name Textfield
        
         tfname=new JTextField();
        tfname.setBounds(160, 120, 240,40);
        tfname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add( tfname);
        
        //label for password
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,21));
        lblpassword.setBounds(40,190 ,120 ,40);
        p1.add(lblpassword);
        
        // for password Textfield
        
         tfpassword=new JTextField();
        tfpassword.setBounds(160, 190,240,40);
        tfpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add( tfpassword);
        
       // label for security
        
        JLabel lblsecurity=new JLabel("Security Q");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,21));
        lblsecurity.setBounds(40,270 ,120 ,40);
        p1.add(lblsecurity);
        
        
        
        //for dropdown
        
        security = new Choice();
        security.add("Favourite Marvel from Endgame?");
        security.add("Your Lucky Number?");
        security.add("Your favourite Cricket Player?");
       // security.add("4.Whose your favourite Marvel from Endgame?");
        security.add("What is your Pet Name?");
        security.add("Whose your Childhood Superhero?");
        security.setFont(new Font("Tahoma",Font.BOLD,17));
        security.setBounds(160, 270, 300,120);
        p1.add(security);
        
        
        //label for security answer
        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,21));
        lblanswer.setBounds(40,330 ,120 ,40);
        p1.add(lblanswer);
        
        // forsecurity answer Textfield
        
         tfanswer=new JTextField();
        tfanswer.setBounds(160,330,240,40);
        tfanswer.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add( tfanswer);
        
        
        
        //for create button
         btn = new JButton("Create");
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(133,193,233));
        btn.setFont(new Font("Tahoma",Font.BOLD,19));
        btn.setBounds(100, 440, 140, 40);
        btn.addActionListener(this);
        p1.add(btn);
        
        
        //for back button
         back = new JButton("Back");
        back.setBackground(Color.WHITE);
       back.setForeground(new Color(133,193,233));
       back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.setBounds(310, 440, 140, 40);
        back.addActionListener(this);
        p1.add(back);
        
        
      //for picture at right side
        //getsystemresourse() method ..hamare system jo image he use laane me help karta
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
      //Image ka size bada ho to size chota bada karna he
      Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      //image ko jlabel me lagane ke lie imageicon me convert karna padega
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(750, 100 , 290, 290);
      add(image);
      
      
      
      setVisible(true);
      
      
    }
    public void  actionPerformed(ActionEvent ae)
    {
        
        
        if(ae.getSource() == btn)
        {
            
            
            
            
            String username = tfusername.getText();//user ne jo value di hai use gettext pata
              String name=tfname.getText();// lagaleta hai ki kya value hai
              String password= tfpassword.getText();
              String question= security.getSelectedItem();//dropdown me se value nikalne ke lie ye use karte
              String answer= tfanswer.getText();
              
              //database me data insert karwana hai to query chalani padegi
           //  String query= "insert into travel values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
              
             try{
                  String sql;
                 Connection con=null;
                 PreparedStatement ps=null;
                 con=Con.getConnection();
                 //executing mysql queries
                  
                 System.out.println(username);
               
                  sql= "insert into travel values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
                  ps=con.prepareStatement(sql);
                  ps.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new Login();
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
        
              
              
            
       
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args)
    {
        new Signup();
        
    }

    
      
    }
    

