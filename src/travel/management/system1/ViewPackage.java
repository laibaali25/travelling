





    

package travel.management.system1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class ViewPackage extends JFrame implements ActionListener
{
    
    JButton back;
    
    ViewPackage(String username)
    {
        setBounds(600,240,1150,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW  PACKAGE  DETAILS");
        text.setFont(new Font("Tahoma", Font.BOLD,25));
        text.setBounds(75,0 ,350,37 );
        add(text);
        
        
        JLabel lblusername =new JLabel("Username");
        lblusername.setBounds(50, 60, 200, 30);
        lblusername.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblusername);
        
        JLabel labelusername =new JLabel();
        labelusername.setBounds(250, 60, 200, 30);
        labelusername.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelusername);
        
        
        JLabel lblid =new JLabel("Package");
        lblid.setBounds(50, 130, 200, 30);
        lblid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblid);
        
        JLabel labelpackage =new JLabel();
        labelpackage.setBounds(250, 130, 200, 30);
        labelpackage.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelpackage);
        
        
        JLabel lblnumber =new JLabel("Total Persons");
        lblnumber.setBounds(50, 200, 200, 30);
        lblnumber.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblnumber);
        
        JLabel labelpersons =new JLabel();
        labelpersons.setBounds(250, 200, 200, 30);
        labelpersons.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelpersons);
        
         JLabel lblname =new JLabel("ID");
        lblname.setBounds(50, 270, 200, 30);
        lblname.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblname);
        
        JLabel labelid =new JLabel();
        labelid.setBounds(250,270, 200, 30);
        labelid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelid);
        
        JLabel lblnumbers =new JLabel("ID Number");//
        lblnumbers.setBounds(50, 340, 200, 30);
        lblnumbers.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblnumbers);
        
        JLabel labelnumber =new JLabel();//
        labelnumber.setBounds(250, 340, 200, 30);
        labelnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelnumber);
        
        
        JLabel lblcountry =new JLabel("Phone");
        lblcountry.setBounds(50,410, 200, 30);//
        lblcountry.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblcountry);
        
        JLabel labelphone =new JLabel();
        labelphone.setBounds(250,410, 200, 30);//
        labelphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelphone);
        
        
        JLabel lbladdress =new JLabel("Price");
        lbladdress.setBounds(50, 480, 200, 30);
        lbladdress.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lbladdress);
        
        JLabel labelprice =new JLabel();
        labelprice.setBounds(250,470, 200, 30);
        labelprice.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelprice);
        
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.setBounds(170,550, 130, 35);
        back.addActionListener(this);
        add(back);
        
        
  
         
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image2 = new JLabel(i3);
         image2.setBounds(530,0 , 700, 650);
         add(image2);
        
        //database se data lenge
         
         try
         {
         Connection con=null;
         PreparedStatement ps;
         ResultSet rs;
         con=Con.getConnection();
         
         //jo bookpackage database me data rakha he wo lana hai
         String sql= "select * from bookpackage where username='"+username+"'";
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                while(rs.next())
                {
                    labelusername.setText(rs.getString("username"));
                    labelid.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("number"));
                    labelpackage.setText(rs.getString("package"));
                    labelprice.setText(rs.getString("price"));
                    labelpersons.setText(rs.getString("persons"));
                    //labeladdress.setText(rs.getString("Address"));
                    labelphone.setText(rs.getString("Phone"));
                    //labelemail.setText(rs.getString("Email"));
                }
         }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
                setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    public static void main(String[] args)
    {
        new ViewPackage("laibaali");
    }

    
   
}

    

