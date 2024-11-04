//loading frame

package travel.management.system1;

import javax.swing.*;
import java.awt.*;

public class Loading  extends JFrame implements Runnable
{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run()         //multithreading for loading bar from 0 to 100%
    {
    try
    {
       for(int i=0;i<=101;i++)
       {
           int max = bar.getMaximum();//100
           int value=bar.getValue();//
           
           
           //check
           if(value < max)
           {   //101<100
               bar.setValue(bar.getValue() +1);
           }
           else{
               setVisible(false);
               //new class ka object
               new DashBoard(username);
           }
           Thread.sleep(50);
           
           
               }
    }   
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    Loading(String username)
    {
        
        this.username =  username;
        //run method ko call karna hai
        t= new Thread(this);
        
        
       setBounds(500,300,900,540);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel text = new JLabel("Travel and Tourism Application");
       text.setBounds(130, 10, 800, 80);
       text.setForeground(Color.BLUE);
       text.setFont(new Font("Raleway", Font.BOLD, 44));
       add(text);
       
        bar = new JProgressBar();//progress bar i. 0%
       bar.setBounds(210, 105, 450, 50);
       bar.setStringPainted(true);
       add(bar);
       
       
       JLabel loading = new JLabel("Loading Please wait..");
       loading.setBounds(300, 150, 300, 50);
      loading.setForeground(Color.RED);
       loading.setFont(new Font("Raleway", Font.BOLD, 25));
       add(loading);
       
       JLabel lblusername = new JLabel("Welcome " + username );
       lblusername.setBounds(40, 400, 550, 65);
       lblusername.setForeground(Color.BLUE);
       lblusername.setFont(new Font("Raleway", Font.BOLD, 44));
       add(lblusername);
       t.start();
       
       
       setVisible(true);
    }
    public static void main(String[] args)
    {
        
    }

    
    
}
