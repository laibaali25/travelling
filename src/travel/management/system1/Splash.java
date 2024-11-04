
// In this project we have use "swing (core java)"
// database we use here is 'mysql'
//as this is the desktop application so we have to make GUI (graphical User Interface) with th help of 
// swing and awt
//desktop based application


package travel.management.system1;

import java.awt.Image;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;


public class Splash extends JFrame implements Runnable
{
    Thread thread;
    Splash()
    {
     //   setSize(1200,700);    //frame siZe
     //   setLocation(300,200);  //for Frame Location
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
       Image i2= i1.getImage().getScaledInstance(1500, 600, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);  //to add component on frame
       
        
        setVisible(true);    //for visibility of frame
        
        thread =new Thread(this);
        thread.start();
        
        
    }
    public static void main(String[] args)
    {
    Splash frame = new Splash();         //class ka obj banate hi constructor call hota hai to
                           //pura code constructor me likhna padega
    
    //continue image ka direction change karne k lie
    
    int x=1;
    for(int i=1;i<=700;x+=7,i+=6)
    {
        frame.setLocation(950-(x+i)/2, 550 - (i/2));
       
        frame.setSize(x+i , i);
        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            
        }
    }
    }

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       try{
         Thread.sleep(5000);
       new Login();
       setVisible(false);  
       }
       catch(Exception e)
       {
           
       }
    
    }
    
    
}