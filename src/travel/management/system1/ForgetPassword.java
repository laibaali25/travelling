

package travel.management.system1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


 
public class ForgetPassword extends JFrame implements ActionListener
{
    
    JTextField tfusername ,tfname,tfquestion,tfanswer ,tfpassword;
    JButton search,retrieve,back;
   
    
    
    ForgetPassword()
    {
        setBounds(350,250,1200,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //image on panel
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(710,70,520,320);
        add(image);
        
        
       
        //panel for image
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 50, 750, 420);
        add(p1);
        
         //gor textfield and buttons and labels
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(60,30,130,40);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(lblusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(240, 30, 280,40);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //for button
        
        search = new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(560,30 ,170 ,40 );
        search.setFont(new Font("Tahoma",Font.BOLD,16));
        search.addActionListener(this);
        p1.add(search);
        
        
        JLabel name =new JLabel("Name");
        name.setBounds(60,90,130,40);
        name.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(name);
        
        
       tfname = new JTextField();
       tfname.setBounds(240,90, 280,40);
       tfname.setFont(new Font("Tahoma",Font.BOLD,16));
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        //for password
        
        JLabel lblquestion=new JLabel("Security Question");
        lblquestion.setBounds(60,150,210,40);
        lblquestion.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(lblquestion);
        
        
        tfquestion = new JTextField();
        tfquestion.setBounds(240, 150, 310,40);
        tfquestion.setFont(new Font("Tahoma",Font.BOLD,16));
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
        //for answer 
        
        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setBounds(60,220,280,40);
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(lblanswer);
        
        
        tfanswer = new JTextField();
        tfanswer.setBounds(240, 220,280,40);
         tfanswer.setFont(new Font("Tahoma",Font.BOLD,16));
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        //for retrieve
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.GRAY);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(560,220,170 ,40 );
        retrieve.setFont(new Font("Tahoma",Font.BOLD,16));
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        //main password
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(60,300,280,40);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(lblpassword);
        
        
        tfpassword = new JTextField();
        tfpassword.setBounds(240, 300,280,40);
         tfpassword.setFont(new Font("Tahoma",Font.BOLD,16));
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //for backbutton
        
        back = new JButton("Back");
         back.setBackground(Color.BLUE);
         back.setForeground(Color.WHITE);
         back.setBounds(560,340,170 ,50 );
         back.setFont(new Font("Tahoma",Font.BOLD,16));
         back.addActionListener(this);
        p1.add( back);
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            
            
            try{
              
                    System.out.println(tfusername.getText());                 //ager search button ko click karna hai to query ko  hit karna hai jo username pass lekar aaaega  
                Connection con=null;      
                con  = Con.getConnection();    //Connection ka object
                PreparedStatement ps;  //null karna he ya nahi
                ResultSet rs;
               // System.out.println("ksadfkjd");
                String sql= "select * from travel where username = '"+tfusername.getText()+"'";
                 ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
            /* jo bhi quesry ka data aaya wo match karne ke lie hamestore karana padega
                to hum us query ko resultset ke object ko paas kardenge
               */ 
//                System.out.println("skadfjlf");
              while(rs.next())
              {
              tfname.setText(rs.getString("name"));  //hame textfield ke andar store karana he
               tfquestion.setText(rs.getString("security"));
                
              }   
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==retrieve)
                {
                    try{
              
                    System.out.println(tfusername.getText());                 //ager search button ko click karna hai to query ko  hit karna hai jo username pass lekar aaaega  
                Connection con=null;      
                con  = Con.getConnection();    //Connection ka object
                PreparedStatement ps;  //null karna he ya nahi
                ResultSet rs;
               
                
                String sql= "select * from travel where answer = '"+tfanswer.getText()+"' AND username= '"+tfusername.getText()+"'";
                 ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
            /* jo bhi quesry ka data aaya wo match karne ke lie hamestore karana padega
                to hum us query ko resultset ke object ko paas kardenge
               */ 
//                System.out.println("skadfjlf");
              while(rs.next())
              {
              tfpassword.setText(rs.getString("password"));  //hame textfield ke andar store karana he
               
                
              }   
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
                
        else
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args)
    {
        ForgetPassword fp=new ForgetPassword();
        
    }


    
    
}
