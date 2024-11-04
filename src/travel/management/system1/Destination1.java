

package travel.management.system1;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Destination1 extends JFrame implements Runnable
{  
    
    Thread t1;
    
    JLabel image, image1, image2, image3, image4, image5, image6, image7, image8, image9, image10;
    
   public void run()
   {
       try{
          for(int i= 0; i<=10;i++)
          {
              image1.setVisible(true);
              Thread.sleep(2000);
              image1.setVisible(false);
              
          }
       }
       catch(Exception e)
       {
           System.out.println(e);
           
       }
   }
  
    Destination1()
    {
     
      setBounds(600,220,1100,750);
      
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/desti1.jpeg"));
         Image i2 = i1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
          image = new JLabel(i3);
         image.setBounds(0,550 , 800, 305);
         add(image);
         
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/desti2.jpg"));
         Image i5 = i4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon i6 = new ImageIcon(i5);
          image1 = new JLabel(i6);
         image1.setBounds(620,550 , 800, 305);
         add(image1);
         
         ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/desti3.jpg"));
         Image j2 = j1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon j3 = new ImageIcon(j2);
          image2 = new JLabel(j3);
         image2.setBounds(620,550 , 800, 305);
         add(image2);
         
         ImageIcon j4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest3.png"));
         Image j5 = j4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon j6 = new ImageIcon(j5);
          image3 = new JLabel(j6);
         image3.setBounds(620,550 , 800, 305);
         add(image3);
         
         ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest4.jpg"));
         Image k2 = k1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon k3 = new ImageIcon(k2);
         JLabel image4 = new JLabel(k3);
         image4.setBounds(620,550 , 800, 305);
         add(image4);
         
         
         ImageIcon k4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest5.jpg"));
         Image k5 = k4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon k6 = new ImageIcon(k5);
         JLabel image5 = new JLabel(k6);
         image5.setBounds(620,550 , 800, 305);
         add(image5);
         
         ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest6.jpg"));
         Image l2 = l1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon l3 = new ImageIcon(l2);
          image6 = new JLabel(l3);
         image6.setBounds(620,550 , 800, 305);
         add(image6);
         
          ImageIcon l4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest7.jpeg"));
         Image l5 = l4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon l6 = new ImageIcon(l5);
          image7 = new JLabel(l6);
         image7.setBounds(620,550 , 800, 305);
         add(image7);
         
         ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest8.jpg"));
         Image m2 = m1.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon m3 = new ImageIcon(m2);
          image8 = new JLabel(m3);
         image8.setBounds(620,550 , 800, 305);
         add(image8);
         
          ImageIcon m4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest9.jpg"));
         Image m5 = m4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon m6 = new ImageIcon(m5);
          image9 = new JLabel(m6);
         image9.setBounds(620,550 , 800, 305);
         add(image9);
         
         ImageIcon n4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest10.jpg"));
         Image n5 = n4.getImage().getScaledInstance(800, 305, Image.SCALE_DEFAULT);
         ImageIcon n6 = new ImageIcon(n5);
          image10 = new JLabel(n6);
         image10.setBounds(620,550 , 800, 305);
         add(image10);
         
         
        t1 = new Thread(this);
        t1.start();
         
         
      setVisible(true);
    
    
    }
    public static void main(String[] args) {
        new Destination1();
    }
}
