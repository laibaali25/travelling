
// 3 tab chahiye

//dynamic Frame
//3 package which describe about the details of every package 

package travel.management.system1;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;


public class CheckPackage extends JFrame
{
    CheckPackage()
    {
        setBounds(600,230,1100,800);
        
        
        
        String[] package1 ={"GOLD PACKAGE", "7 Days-6 Nights with River Rafting","Airport Assitance","Night Safari", "Daily Buffet","Soft Drink Free","3 Days Free Cruise Dinner","Full Day 3 Island Cruise","BOOK PACKAGE","SUMMER SPECIAL","Rs 32000/-","package1.jpg"};
        String[] package2 ={"SILVER PACKAGE","6 Days-5 Nights with Paragliding","Toll Free and Entrance Free Tickets","Meet and Greet at Airport","Welcome Drinks on Arrival","Full Day City Tour","Horse Riding","Cruise with Dinner","BOOK NOW","WINTER SPECIAL","Rs 24000/-","package2.jpg"};
        String[] package3 ={"BRONZE PACKAGE","5 Days-4 Nights with Bungee Jumping"," Return Aircraft","Horse Riding & other Games","Soft Drinks Free","Daily Buffet","Sky Diving","BBQ Dinner","BOOK NOW","MONSOON SPECIAL","Rs 20000/-","package3.jpg"};
        
        
        JTabbedPane tab= new JTabbedPane();
        
        JPanel p1=createPackage(package1);
         tab.addTab("Package 1", null, p1);
        tab.setFont(new Font("Berlin ",Font.BOLD,14));
       
        JPanel p2=createPackage(package2);
         tab.addTab("Package 2", null, p2);
        tab.setFont(new Font("Berlin ",Font.BOLD,14));
        
        JPanel p3 =createPackage(package3);
         tab.addTab("Package 3", null, p3);
        tab.setFont(new Font("Berlin ",Font.BOLD,14));
        add(tab);
        
        
        
        
        setVisible(true);
    }
    
    
    public  JPanel createPackage(String[] pack)
    {
        
        JPanel p1  = new JPanel();

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 =new JLabel(pack[0]);
        l1.setBounds(70, 10 ,400 , 35);
        l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("Tahome",Font.BOLD,37));
        p1.add(l1);
        
        JLabel l2 =new JLabel(pack[1]);
        l2.setBounds(45, 75 ,400 , 35);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l2);
        
        JLabel l3 =new JLabel(pack[2]);
        l3.setBounds(45, 145 ,400 , 35);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l3);
        
        JLabel l4 =new JLabel(pack[3]);
        l4.setBounds(45, 207 ,400 , 35);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l4);
        
        JLabel l5 =new JLabel(pack[4]);
        l5.setBounds(45, 270 ,400 , 35);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahome",Font.BOLD,31));
        p1.add(l5);
        
        JLabel l6 =new JLabel(pack[5]);
        l6.setBounds(45, 330 ,400 , 35);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l6);
        
        
        JLabel l7 =new JLabel(pack[6]);
        l7.setBounds(45, 390 ,400 , 35);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l7);
        
        JLabel l8 =new JLabel(pack[7]);
        l8.setBounds(45, 450 ,400 , 35);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahome",Font.BOLD,30));
        p1.add(l8);
        
        
        JLabel l9 =new JLabel(pack[8]);
        l9.setBounds(90,560 ,400 , 35);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahome",Font.BOLD,37));
        p1.add(l9);
        
        JLabel l10 =new JLabel( pack[9] );
        l10.setBounds(110,630 ,400 , 35);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tahome",Font.BOLD,35));
        p1.add(l10);
        
        JLabel l11 =new JLabel(pack[10]);
        l11.setBounds(570,630 ,400 , 35);
        l11.setForeground(Color.cyan);
        l11.setFont(new Font("Tahome",Font.BOLD,35));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
      //Image ka size bada ho to size chota bada karna he
      Image i2=i1.getImage().getScaledInstance(610, 410, Image.SCALE_DEFAULT);
      //image ko jlabel me lagane ke lie imageicon me convert karna padega
      ImageIcon i3=new ImageIcon(i2);
      JLabel i12=new JLabel(i3);
      i12.setBounds(460, 40 , 610, 410);
      p1.add(i12);
      
      return p1;
    }
    public static void main(String[] args)
    {
        new CheckPackage();
    }
    
}
