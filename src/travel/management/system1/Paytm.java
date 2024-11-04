
// yaha par hum paytm ki link url daalenge jiske through hum pay kar sake
package travel.management.system1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Paytm extends JFrame implements ActionListener
{
    Paytm()
    {
       setBounds(600,210,1100,800);
       
       //textarea..jisme puri website ko load karenge
       
       JEditorPane pane = new JEditorPane();
    //textarea editable hoti hai but hum non editable banare hai
       pane.setEditable(false);
       
       try
       {
           pane.setPage("https://paytm.com/rent-payment");
           
           
       }
       catch(Exception e)
       {
           //System.out.println(e);
          pane.setContentType("text/html");
          pane.setText("<html>Could not load, Error 404</html>");
       
       }
       
       //scroll bar
       JScrollPane sp =new JScrollPane(pane);
       getContentPane().add(sp);
       
       JButton back = new JButton("Back");
       back.setBounds(850, 30, 140, 50);
       back.setFont(new Font("Tahoma",Font.BOLD,22));
       back.addActionListener(this);
       pane.add(back);
       
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args)
    {
        new Paytm();
    }
}
