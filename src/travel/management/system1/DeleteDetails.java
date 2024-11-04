

package travel.management.system1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class DeleteDetails extends JFrame implements ActionListener
{
    
    JButton back;
    String username;
    
    DeleteDetails(String username)
    {
        this.username = username;
        setBounds(550,200,1050,890);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel lblusername =new JLabel("Username");
        lblusername.setBounds(50, 60, 200, 30);
        lblusername.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblusername);
        
        JLabel labelusername =new JLabel();
        labelusername.setBounds(250, 60, 200, 30);
        labelusername.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelusername);
        
        
        JLabel lblid =new JLabel("Id");
        lblid.setBounds(50, 150, 200, 30);
        lblid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblid);
        
        JLabel labelid =new JLabel();
        labelid.setBounds(250, 150, 200, 30);
        labelid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelid);
        
        
        JLabel lblnumber =new JLabel("Number");
        lblnumber.setBounds(50, 230, 200, 30);
        lblnumber.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblnumber);
        
        JLabel labelnumber =new JLabel();
        labelnumber.setBounds(250, 230, 200, 30);
        labelnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelnumber);
        
         JLabel lblname =new JLabel("Name");
        lblname.setBounds(50, 320, 200, 30);
        lblname.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblname);
        
        JLabel labelname =new JLabel();
        labelname.setBounds(250,320, 200, 30);
        labelname.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelname);
        
        JLabel lblgender =new JLabel("Gender");//
        lblgender.setBounds(50, 410, 200, 30);
        lblgender.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblgender);
        
        JLabel labelgender =new JLabel();//
        labelgender.setBounds(250, 410, 200, 30);
        labelgender.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelgender);
        
        
        JLabel lblcountry =new JLabel("Country");
        lblcountry.setBounds(550,60, 200, 30);//
        lblcountry.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblcountry);
        
        JLabel labelcountry =new JLabel();
        labelcountry.setBounds(690, 60, 200, 30);//
        labelcountry.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelcountry);
        
        
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(550, 160, 200, 30);
        lbladdress.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lbladdress);
        
        JLabel labeladdress =new JLabel();
        labeladdress.setBounds(690,160, 200, 30);
        labeladdress.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labeladdress);
        
        JLabel lblphone =new JLabel("Phone");//
        lblphone.setBounds(550, 250, 200, 30);
        lblphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblphone);
        
        JLabel labelphone =new JLabel();//
        labelphone.setBounds(690, 250, 200, 30);
        labelphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelphone);
        
        
        JLabel lblemail =new JLabel("Email");
        lblemail.setBounds(550,340, 200, 30);//
        lblemail.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblemail);
        
        JLabel labelemail =new JLabel();
        labelemail.setBounds(690, 340, 200, 30);//
        labelemail.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelemail);
        
        back = new JButton("DELETE");
        back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.setBounds(450, 470, 130, 35);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0,520 , 800, 305);
         add(image);
         
         //same image ko duplicate karke use karre side me
         
         
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
         Image i5 = i4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon i6 = new ImageIcon(i5);
         JLabel image2 = new JLabel(i6);
         image2.setBounds(620,520 , 800, 305);
         add(image2);
        
        //database se data lenge
         
         try
         {
             String sql;
         Connection con=null;
         PreparedStatement ps;
         ResultSet rs;
         con=Con.getConnection();
         
         //jo customer database me data rakha he wo lana hai
          sql= "select * from customer where username='"+username+"'";
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                while(rs.next())
                {
                    labelusername.setText(rs.getString("username"));
                    labelid.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("Number"));
                    labelname.setText(rs.getString("Name"));
                    labelgender.setText(rs.getString("Gender"));
                    labelcountry.setText(rs.getString("Country"));
                    labeladdress.setText(rs.getString("Address"));
                    labelphone.setText(rs.getString("Phone"));
                    labelemail.setText(rs.getString("Email"));
                }
         }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
                setVisible(true);
        
    }
    //hame saari tables me se data delete karna hai jis jis me data rakha hai user ka wo sab
    
    
     public void actionPerformed(ActionEvent ae) {
        
         try{
             String sql , abc , xyz ,pqr;
             Connection con=null;
         PreparedStatement ps =null;
         ResultSet rs;
         con=Con.getConnection();
         
         //jo customer database me data rakha he wo lana hai
        
          sql= "delete * from travel where username='"+username+"'";
           abc= "delete * from customer where username='"+username+"'";
           xyz = "delete * from bookpackage where username='"+username+"'";
           pqr = "delete * from bookhotels where username='"+username+"'";
           
           JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
           
           setVisible(false);
                 
         ps= con.prepareStatement(sql);
                 ps.executeUpdate();
             
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
    public static void main(String[] args)
    {
        new DeleteDetails("laibaali");
    }

    
   
}

