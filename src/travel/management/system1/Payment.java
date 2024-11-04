
//payment through paytm this will be real and payment can be done throgh paytm in this Project
package travel.management.system1;

import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class Payment extends JFrame implements ActionListener
{
    
    JButton pay,back;
    
    
    Payment()
    {
       setBounds(600,245,1000,950);
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
       Image i2 = i1.getImage().getScaledInstance(1000, 750, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0, 0, 1000, 750);
       add(image);
       
       
       pay = new JButton("Pay");
     
       pay.setBounds(550, 0, 100, 50);
       pay.setFont(new Font("Tahoma",Font.BOLD,22));
        pay.addActionListener(this);
        image.add(pay);
       
       back = new JButton("Back");
         
       back.setBounds(670, 0, 100, 50);
       back.setFont(new Font("Tahoma",Font.BOLD,22));
       back.addActionListener(this);
       image.add(back);
       
       
       setVisible(true);
    }
       public void actionPerformed(ActionEvent ae)
       {
        
           if(ae.getSource() == pay)
           {
               setVisible(false);
               new Paytm();
               
           }
           else
               
           {
               setVisible(false);
           }
       }
       
    
    public static void main(String[] args)
    { 
        new Payment();
        
    }
}
