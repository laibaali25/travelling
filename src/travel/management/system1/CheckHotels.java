//for slideshow ....... hotels image

package travel.management.system1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;


public class CheckHotels extends JFrame implements Runnable
{
    
    Thread t1;
    
    JLabel l1,l2 ,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] label =new JLabel[]{l1,l2 ,l3,l4,l5,l6,l7,l8,l9,l10 };
    JLabel caption;
    public void run()
    {
        
    
        String[] text = new String[]{ "Indore Marriott Hotel", "Madarin Oriental Hotel","Four Seasons Hotel","Raddison Blu Hotel"," Hotel Sayaji","The Oberoi Udaivilas","Taj Lake Palace","The Taj Hotel","The Imperial Hotel","Taj Falaknuma Palace"}; 
        try
        {
            for(int i=0;i<=9;i++)
            {
                
                label[i].setVisible(true);
                label[i].setFont(new Font("Berlin",Font.BOLD,40));
                // label[i].setBackground(Color.BLACK);
              //  label[i].setForeground(Color.BLUE);
                caption.setText(text[i]);
                Thread.sleep(2500);
                label[i].setVisible(false);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    CheckHotels()
         
    {
     
        
        setBounds(600,230,1100,750);
        
        
        caption = new JLabel();
        caption.setBounds(50,600 ,850, 80 );
        caption.setFont(new Font("Tahoma",Font.PLAIN,50));
        caption.setForeground(Color.WHITE);
        add(caption);
        //we have 10 images aur hame unhe ek ke upar ek dynamiclly set karna hai to hum ya to is obj ko 10 baar chalaye
        //ys fir use dynamic bana de
        
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        //null isliye bcoz hum ise sirf declare nahi karrrahe define bhi kar rahe
        //means null se use initialize kar rahe
        ImageIcon[] image = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
         Image[] jimage = new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
         
          ImageIcon k1 = null,k2= null,k3= null,k4= null,k5= null,k6= null,k7= null,k8= null,k9= null,k10= null;
         ImageIcon[] kimage = new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
        
         
        for(int i=0;i<=9;i++)
        {
        
         image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
         jimage[i] = image[i].getImage().getScaledInstance(1100, 750, Image.SCALE_DEFAULT);
         kimage[i] = new ImageIcon(jimage[i]);
         
         //JLabel kelie bhi ek array chalana padega bcoz ek time par jlabel par ek hi icon milega
        label[i] = new JLabel(kimage[i]);
         label[i].setBounds(0,0 , 1100, 750);
         add(label[i]);
         
         
         setVisible(true);
          
        }
         
        t1 = new Thread(this);
        t1.start();
    }
    public static void main(String[] args)
   {
         new CheckHotels();
    }

   
}
    
