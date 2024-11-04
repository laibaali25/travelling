package travel.management.system1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class ViewBookedHotel extends JFrame implements ActionListener
{
    
    JButton back;
    
    ViewBookedHotel(String username)
    {
        setBounds(550,220,1150,800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("Tahoma", Font.BOLD,25));
        text.setBounds(75,0 ,450,37 );
        add(text);
        
        
        JLabel lblusername =new JLabel("Username");
        lblusername.setBounds(50, 60, 200, 30);
        lblusername.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblusername);
        
        JLabel labelusername =new JLabel();
        labelusername.setBounds(250, 60, 200, 30);
        labelusername.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelusername);
        
        
        JLabel lblid =new JLabel("Hotel Name");
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
        
        JLabel lbldays =new JLabel("Total Days");
        lbldays.setBounds(50, 260, 200, 30);
        lbldays.setFont(new Font("Berlin",Font.BOLD,20));
        add(lbldays);
        
        JLabel labeldays =new JLabel();
        labeldays.setBounds(250, 260, 200, 30);
        labeldays.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labeldays);
        
        JLabel lblac =new JLabel("AC/Non-AC");
        lblac.setBounds(50, 320, 200, 30);
        lblac.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblac);
        
        JLabel labelac =new JLabel();
        labelac.setBounds(250, 320, 200, 30);
        labelac.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelac);
        
        JLabel lblfood =new JLabel("Food Included?");
        lblfood.setBounds(50, 380, 200, 30);
        lblfood.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblfood);
        
        JLabel labelfood =new JLabel();
        labelfood.setBounds(250, 380, 200, 30);
        labelfood.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelfood);
        
         JLabel lblname =new JLabel("ID");
        lblname.setBounds(50, 440, 200, 30);
        lblname.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblname);
        
        JLabel labelid =new JLabel();
        labelid.setBounds(250,440, 200, 30);
        labelid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelid);
        
        JLabel lblnumbers =new JLabel("ID Number");//
        lblnumbers.setBounds(50, 500, 200, 30);
        lblnumbers.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblnumbers);
        
        JLabel labelnumber =new JLabel();//
        labelnumber.setBounds(250, 500, 200, 30);
        labelnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelnumber);
        
        
        JLabel lblcountry =new JLabel("Phone");
        lblcountry.setBounds(50,560, 200, 30);//
        lblcountry.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblcountry);
        
        JLabel labelphone =new JLabel();
        labelphone.setBounds(250,560, 200, 30);//
        labelphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelphone);
        
        
        JLabel lbladdress =new JLabel("Price");
        lbladdress.setBounds(50, 620, 200, 30);
        lbladdress.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lbladdress);
        
        JLabel labelprice =new JLabel();
        labelprice.setBounds(250,620, 200, 30);
        labelprice.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelprice);
        
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.setBounds(170,700, 150, 35);
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
         String sql= "select * from bookhotels where username='"+username+"'";
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                while(rs.next())
                {
                    labelusername.setText(rs.getString("username"));
                    labelpackage.setText(rs.getString("hotelname"));
                     labelpersons.setText(rs.getString("persons"));
                     labeldays.setText(rs.getString("days"));
                      labelac.setText(rs.getString("ac"));
                       labelfood.setText(rs.getString("food"));
                    labelid.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("idnumber"));
                    labelphone.setText(rs.getString("phone"));
                    labelprice.setText(rs.getString("price"));
                   
                    //labeladdress.setText(rs.getString("Address"));
                 
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
        new ViewBookedHotel("laibaali");
    }

    
   
}

    


