

//  will work on apni update customer frame par  
//user ki actual info ko agar update karna hoto
package travel.management.system1;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class UpdateCustomer extends JFrame implements ActionListener
{
    
    JLabel labelusername ,labelname;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone ,tfid, tfgender;
    Choice id;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    UpdateCustomer(String username)
    {                        
                //2 option : ya to username ko update kar sakte hai
               //ya fir username and name ko update nhi kar sakte
                                    
        setBounds(650,190,1050,850);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("UPDATE  CUSTOMER  DETAILS");
        text.setBounds(55, 0, 400, 50);
        text.setFont(new Font("Britannic Bold",Font.PLAIN,24));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 180, 35);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,18));

        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(190, 50, 150, 37);
        labelusername.setFont(new Font("Tahoma",Font.BOLD,18));
        add(labelusername);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30, 110, 150, 35);
        lblid.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblid);
        
       
//        comboid = new JComboBox(new String[] ("Passport", "Aadhar Card", "Pan Card", "Ration Card"));//drop down checkbox
//         comboid.setBounds(220, 90, 150 , 25);
//         comboid.setBackground(Color.WHITE);
//         add(comboid);
         
       /* id= new Choice();
       id.add("Passport");
        id.add("Aadhar Card");
       id.add("Pan Card");
      id.add("Ration Card");
     
       id.setFont(new Font("Tahoma",Font.PLAIN,17));
        id.setBounds(190, 110, 180,35);
        id.setBackground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,16));
        add(id);
        */
         
         tfid=new JTextField();
         tfid.setBounds(190, 115, 200, 35);
         tfid.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfid);
         
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 180, 180, 35);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblnumber);
        
         
         tfnumber=new JTextField();
         tfnumber.setBounds(190, 180, 200, 35);
         tfnumber.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfnumber);
         
         
         JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 270, 180, 35);
        lblname.setFont(new Font("Tahoma",Font.BOLD,18));

        add(lblname);
        
        labelname = new JLabel();//tabel le rahe hai ,textfield isliye nhi lere coz humchahte he ki ye uneditable textfield ho
                                        //bande ka name and username hame change nahi karna      
        labelname.setBounds(190, 270, 180, 35);
        labelname.setFont(new Font("Tahoma",Font.BOLD,18));
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 355, 180, 35);
        lblgender.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblgender);
        //noe this btn will be radio btn
        
        tfgender=new JTextField();
         tfgender.setBounds(190, 355, 200, 35);
         tfgender.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfgender);
        
         
         
         
         
         
         //for country
         JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 420, 180, 35);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblcountry);
        
         
         tfcountry=new JTextField();
         tfcountry.setBounds(190, 420, 200, 35);
         tfcountry.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfcountry);
         
         //for address
         JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 480, 180, 35);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lbladdress);
        
         
         tfaddress=new JTextField();
         tfaddress.setBounds(190, 480, 200, 35);
         tfaddress.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfaddress);
         
         
         //for phone number
         JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 550, 180, 35);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblphone);
        
         
         tfphone=new JTextField();
         tfphone.setBounds(190, 550, 200, 35);
        tfphone.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfphone);
         
         //for email
         JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 620, 180, 35);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblemail);
        
         
         tfemail=new JTextField();
         tfemail.setBounds(190, 620, 200, 35);
         tfemail.setFont(new Font("Tahoma",Font.BOLD,16));
         add(tfemail);
         
         
         //for button
         add = new JButton("Update");
         add.setBackground(Color.BLACK);
         add.setForeground(Color.WHITE);
         add.setBounds(60, 700, 170, 35);
         add.setFont(new Font("Tahoma",Font.BOLD,18));
         add.addActionListener(this);
         add(add);
         
         
         back = new JButton("Back");
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.setBounds(270, 700, 180, 35);
         back.setFont(new Font("Tahoma",Font.BOLD,18));
         back.addActionListener(this);
         add(back);
         
         //for Image
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
         Image i2 = i1.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(440,80 , 600, 650);
         add(image);
         
         
         //ab hame saari information database se pehle se hi laani hai
         try{
             
             Connection con=null;
             PreparedStatement ps;
             ResultSet rs;
             con=Con.getConnection();
              
             String sql= "select * from customer where username='"+username +"'";   //ye username hum peeche se paas karenge 
                 ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
           
                
                while(rs.next())
                {
                    labelusername.setText(rs.getString("username"));
                    labelname.setText(rs.getString("name"));
                    tfid.setText(rs.getString("id"));
                    tfnumber.setText(rs.getString("number"));
                    tfgender.setText(rs.getString("gender"));
                    tfcountry.setText(rs.getString("country"));
                    tfaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
           setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae) 
     {
        //kon sa btn call hua he to
         if(ae.getSource() ==add)
         {
            String username = labelusername.getText();//value chahiye user se 
            String lblid= tfid.getText();
            String number = tfnumber.getText();
            String name =labelname.getText();
            String gender= tfgender.getText();
            String country= tfcountry.getText();
            String address =tfaddress.getText();
            String phone = tfphone.getText();
            String email =tfemail.getText();
            
            try{
               //ab database ke saath connection banana hai
                Connection con=null;
                PreparedStatement ps;
                ResultSet rs;
                con=Con.getConnection();
                String sql="update customer set username='"+username+"', id='"+lblid +"' , number='"+ number+"' ,name='"+name +"',gender= '"+gender +"',country= '"+country +"', address='"+ address+"',phone='"+ phone+"', email='"+email+"'";
                
                ps= con.prepareStatement(sql);
                 ps.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                  setVisible(false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
         }
         else
         {
             setVisible(false);
         }
    }
    
    
    public static void main(String[] args)
    {
        new UpdateCustomer("laibaali");  //parameterized customer hai
    }

    
   
}

