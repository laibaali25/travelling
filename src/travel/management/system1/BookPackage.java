

package travel.management.system1;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BookPackage extends JFrame implements ActionListener 
{
  Choice cpackage;
  JTextField tfpersons;
   JLabel labelusername, labelid,labelnumber,labelphone,labelprice,labelpersons;
   JButton checkprice, bookpackage,back;
  String username;
  
    BookPackage(String username)
    {
        this.username = username;
        setBounds(470,250,1400,700);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text =new JLabel("BOOK PACKAGE");
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
        
        
        JLabel lblpackage =new JLabel("Select Package");
        lblpackage.setBounds(60, 130, 150, 30);
        lblpackage.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblpackage);
        
       cpackage = new Choice();
       cpackage.add("Gold Package");
       cpackage.add("Silver Package");
       cpackage.add("Bronze Package");
       cpackage.setBounds(330,132 ,290 ,30 );
       cpackage.setFont(new Font("Berlin ",Font.BOLD,15));
        add(cpackage);
        
        JLabel lblpersons =new JLabel("Total Persons");
        lblpersons.setBounds(60, 200, 200, 30);
        lblpersons.setFont(new Font("Berlin",Font.BOLD,20));
        add(lblpersons);
        
        tfpersons=new JTextField("1");
        tfpersons.setBounds(330, 200, 290,30);
        tfpersons.setFont(new Font("Berlin",Font.BOLD,20));
      
        add( tfpersons);
        
         JLabel lblid =new JLabel("ID");
        lblid.setBounds(65, 260, 180, 30);
        lblid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblid);
        
         labelid =new JLabel();
        labelid.setBounds(330,260, 250, 30);
        labelid.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelid);
        
        JLabel lblnumber =new JLabel("Number");//
        lblnumber.setBounds(60, 325, 200, 30);
        lblnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblnumber);
        
        labelnumber =new JLabel();//
        labelnumber.setBounds(330, 325, 200, 30);
        labelnumber.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelnumber);
        
        
        JLabel lblphone =new JLabel("Phone");
        lblphone.setBounds(60, 385, 200, 30);
        lblphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lblphone);
        
         labelphone =new JLabel();
        labelphone.setBounds(330,385, 250, 30);
        labelphone.setFont(new Font("Berlin ",Font.BOLD,20));
        add(labelphone);
        
        JLabel lbltotal =new JLabel("Total Price");//
        lbltotal.setBounds(60, 445, 200, 30);
        lbltotal.setFont(new Font("Berlin ",Font.BOLD,20));
        add(lbltotal);
        
         labelprice =new JLabel();//
        labelprice.setBounds(330, 445, 200, 30);
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
        checkprice.setBounds(50,530 ,160 ,35 );
        checkprice.setFont(new Font("Tahoma",Font.BOLD,16));
        checkprice.addActionListener(this);
        add(checkprice);
       
        bookpackage = new JButton("BOOK  PACKAGE");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(230,530 ,210 ,35 );
        bookpackage.setFont(new Font("Tahoma",Font.BOLD,16));
        bookpackage.addActionListener(this);
        add(bookpackage);
       
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(470,530 ,160 ,35 );
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
         Image i2 = i1.getImage().getScaledInstance(650, 520, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(720,50 , 650, 520);
         add(image);
         
        
        
        setVisible(true);   
    
    }
    
     public void actionPerformed(ActionEvent ae)
     {
        if(ae.getSource()==checkprice)
        {
           String pack = cpackage.getSelectedItem();
           int cost = 0;//for arithmatic calculation
           if(pack.equals("Gold Package"))
           {  
               cost += 32000;
           }
           else if(pack.equals("Silver Package"))
           {
              cost += 24000; 
           }
           else if(pack.equals("Bronze Package"))
                   {
                       cost += 20000;
                   }
           int persons =Integer.parseInt(tfpersons.getText());
           cost *= persons;
           labelprice.setText("Rs " + cost);
           
        }
        else if(ae.getSource() == bookpackage)
        {
            try                     //table name in mysql=bookpackage,travel,customer
            {
              Connection con=null;
              PreparedStatement ps ;
              ResultSet rs;
              
              con= Con.getConnection();
              
              String sql= "insert into bookpackage values('"+ labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+ tfpersons.getText()+"', '"+labelid.getText()+"', '"+ labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')";
              
              ps= con.prepareStatement(sql);
                 ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Package Boooked Successfully");
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
       new BookPackage("laibaali"); 
    }

    
   
}
