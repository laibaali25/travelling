
//from this class user will book his hotel



package travel.management.system1;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BookHotel extends JFrame implements ActionListener 
{
  Choice chotel , cac , cfood;
  JTextField tfpersons, tfdays;
   JLabel labelusername, labelid,labelnumber,labelphone,labelprice,labelpersons ;
   JButton checkprice, bookhotel,back;
  String username;
  
    BookHotel(String username)
    {
        this.username = username;
        setBounds(470,215,1400,800);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text =new JLabel("Book Hotel");
        text.setBounds(130, 13, 240, 35);
        text.setFont(new Font("Tahoma", Font.BOLD,28));
        add(text);
        
         JLabel lblusername =new JLabel("Username");
        lblusername.setBounds(60, 65, 120, 30);
        lblusername.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblusername);
        
         labelusername =new JLabel();
        labelusername.setBounds(330, 65, 120, 30);//80
        labelusername.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelusername);
        
        
        JLabel lblpackage =new JLabel("Select Hotel");
        lblpackage.setBounds(60, 130, 150, 30);
        lblpackage.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblpackage);
        
       chotel = new Choice();
       chotel.setBounds(330,132 ,290 ,30 );
       chotel.setFont(new Font("Berlin ",Font.BOLD,15));
        add(chotel);
        
        
        try{
            
            Connection con=null;
         PreparedStatement ps;
         ResultSet rs;
         con=Con.getConnection();
         
         String sql= "select * from hotel ";
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                while(rs.next())
                {
                    chotel.add(rs.getString("name"));
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        JLabel lblpersons =new JLabel("Total Persons");
        lblpersons.setBounds(60, 190, 200, 30);
        lblpersons.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblpersons);
        
        tfpersons=new JTextField("1");
        tfpersons.setBounds(330, 190, 290,30);
        tfpersons.setFont(new Font("Berlin",Font.BOLD,20));
        add( tfpersons);
        
        JLabel lbldays =new JLabel("No. of Days");
        lbldays.setBounds(60, 250, 200, 30);
        lbldays.setFont(new Font("Berlin",Font.BOLD,20));
        add(lbldays);
        
        tfdays=new JTextField("1");
        tfdays.setBounds(330, 250, 290,30);
        tfdays.setFont(new Font("Berlin",Font.BOLD,20));
         add( tfdays);
        
        JLabel lblac =new JLabel("AC/ Non AC");
        lblac.setBounds(60, 310, 200, 30);
        lblac.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblac);
        
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
       cac.setBounds(330,310 ,290 ,30 );
       cac.setFont(new Font("Berlin ",Font.BOLD,15));
        add(cac);
        
        
         JLabel lblfood =new JLabel("Food Included");
        lblfood.setBounds(60, 370, 200, 30);
        lblfood.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblfood);
        
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
       cfood.setBounds(330,370 ,290 ,30 );
       cfood.setFont(new Font("Berlin ",Font.BOLD,15));
        add(cfood);
        
        
         JLabel lblid =new JLabel("ID");
        lblid.setBounds(65, 430, 180, 30);
        lblid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblid);
        
         labelid =new JLabel();
        labelid.setBounds(330,430, 250, 30);
        labelid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelid);
        
        JLabel lblnumber =new JLabel("Number");//
        lblnumber.setBounds(60, 490, 200, 30);
        lblnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblnumber);
        
        labelnumber =new JLabel();//
        labelnumber.setBounds(330, 490, 200, 30);
        labelnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelnumber);
        
        
        JLabel lblphone =new JLabel("Phone");
        lblphone.setBounds(60, 550, 200, 30);
        lblphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblphone);
        
         labelphone =new JLabel();
        labelphone.setBounds(330,550, 250, 30);
        labelphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelphone);
        
        JLabel lbltotal =new JLabel("Total Price");//
        lbltotal.setBounds(60, 610, 200, 30);
        lbltotal.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lbltotal);
        
         labelprice =new JLabel();//
        labelprice.setBounds(330, 610, 200, 30);
        labelprice.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelprice);
        
        
        try
         {
         Connection con=null;
         PreparedStatement ps;
         ResultSet rs;
         con=Con.getConnection();
         
         //jo customer database me data rakha he wo lana hai
         String sql= "select * from customer where username='"+username+"'";
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                while(rs.next())
                {
                    labelusername.setText(rs.getString("username"));
                    labelid.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("Number"));
                    labelphone.setText(rs.getString("Phone"));
                   
                }
         }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(50,670 ,160 ,35 );
        checkprice.setFont(new Font("Tahoma",Font.BOLD,16));
        checkprice.addActionListener(this);
        add(checkprice);
       
        bookhotel = new JButton("BOOK HOTEL");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(230,670 ,210 ,35 );
        bookhotel.setFont(new Font("Tahoma",Font.BOLD,16));
        bookhotel.addActionListener(this);
        add(bookhotel);
       
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(470,670 ,160 ,35 );
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
         Image i2 = i1.getImage().getScaledInstance(700, 520, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(680,50 , 700, 520);
         add(image);
         
        
        
        setVisible(true);   
    
    }
    
     public void actionPerformed(ActionEvent ae)
     {   if(ae.getSource()==checkprice)
         {
         try
         {
            Connection con=null;
            PreparedStatement ps;
            ResultSet rs;
            con=Con.getConnection();
            String sql= "select * from hotel where name='"+chotel.getSelectedItem()+"'";
            
         ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                     int food = Integer.parseInt(rs.getString("foodinclude"));
                     int ac = Integer.parseInt(rs.getString("acroom"));
                     
                     int persons = Integer.parseInt(tfpersons.getText());
                     int days=Integer.parseInt(tfdays.getText());
                     
                     String acselected = cac.getSelectedItem();
                     String foodselected = cfood.getSelectedItem();
                     
                     if(persons * days > 0)
                     {
                         int total = 0;       //perpersons
                         total += acselected.equals("AC") ? ac : 0;  //using ternary opeator
                         total += foodselected.equals("YES") ? food : 0;
                         total += cost;
                         total = total * persons* days;
                         labelprice.setText("Rs" + total);
                         
                     }
                     else
                     {
                     JOptionPane.showMessageDialog(null, "Please enter a valid number");
                     }
                     
                   
                }
        
        
         }
           
     catch(Exception e)
                {
                System.out.println(e);
                }
     }
        else if(ae.getSource() == bookhotel)
        {
            try                     //table name in mysql=bookpackage,travel,customer
            {
              Connection con=null;
              PreparedStatement ps ;
              ResultSet rs;
              
              con= Con.getConnection();
              
              String sql= "insert into bookhotels values('"+ labelusername.getText()+"', '"+chotel.getSelectedItem()+"', '"+ tfpersons.getText()+"', '"+tfdays.getText()+"','"+ cac.getSelectedItem()+"','"+ cfood.getSelectedItem()+"','"+labelid.getText()+"', '"+ labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')";
              
              ps= con.prepareStatement(sql);
                 ps.executeUpdate();
                
                
                JOptionPane.showMessageDialog(null, "Hotel Boooked Successfully");
               
                setVisible(false);
            }
            
            
            
            catch(Exception i)
            {
                System.out.println(i);
            }
        }
        else
        {
            setVisible(false);
        }
    }
     
     
    
    public static void main(String[] args)
    {
       new BookHotel("laibaali"); 
    }

    
   
}

