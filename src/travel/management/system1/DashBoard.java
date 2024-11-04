//Dashboard class main class hogi jisme btns honge jinhe click kark other classes open hogi

package travel.management.system1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DashBoard extends JFrame implements ActionListener
{
    String username;
  JButton addPersonalDetails,viewPersonalDetails, updatePersonalDetails,checkpackages ,bookpackage ;
  JButton viewpackage, viewhotels,destinations, bookhotel, viewbookedhotel, calculators,notepad;
    JButton payments,about ,deletePersonalDetails;
          
  DashBoard(String username)
            
    {
        this.username = username;
      //  setBounds(0,0,1980,1100);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//isse hamari full screen par frame ban jaegi
        setLayout(null);
        
        
        //for blue header panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1950,75);
        add(p1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(85, 85, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 85, 85);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(100, 11, 370, 50);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        p1.add(heading);
        
        //for left blue panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 66, 325,1000);
        add(p2);
        
        //for button
          addPersonalDetails =new JButton("Add Personal Details");
         addPersonalDetails.setBounds(0, 0, 325, 70);                                    //  (0, 0, 325, 70);
        addPersonalDetails.setForeground(Color.WHITE);
       addPersonalDetails.setBackground(new Color(0,0,102));
       addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,22));                       //0,0,0,60
       addPersonalDetails.setMargin(new Insets(0,0,0,60));  //btn left se chahiye
       addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        //for update
         updatePersonalDetails =new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 60, 325, 75);                                     
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setBackground(new Color(0,0,102));
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,22));                       
       updatePersonalDetails.setMargin(new Insets(0,0,0,30));  //btn left se chahiye
       updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        
        
        //for view
         viewPersonalDetails =new JButton("View Details");
        viewPersonalDetails.setBounds(0, 125, 325, 75);
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setBackground(new Color(0,0,102));
       viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,22));
       viewPersonalDetails.setMargin(new Insets(0,0,0,130));  //btn left se chahiye
       viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        //for delete personal details
         deletePersonalDetails =new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 195, 325, 75);
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setBackground(new Color(0,0,102));
       deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,22));
       deletePersonalDetails.setMargin(new Insets(0,0,0,30));  //btn left se chahiye
       deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        // to check
        
        
        checkpackages =new JButton("Check Package");
        checkpackages.setBounds(0, 255, 325, 75);
       checkpackages.setForeground(Color.WHITE);
        checkpackages.setBackground(new Color(0,0,102));
      checkpackages.setFont(new Font("Tahoma",Font.PLAIN,22));
       checkpackages.setMargin(new Insets(0,0,0,110));//btn left se chahiye
       checkpackages.addActionListener(this);
       p2.add(checkpackages);
        
        
         bookpackage =new JButton("Book Package");
       bookpackage.setBounds(0, 315, 325, 73);
      bookpackage.setForeground(Color.WHITE);
       bookpackage.setBackground(new Color(0,0,102));
      bookpackage.setFont(new Font("Tahoma",Font.PLAIN,22));
       bookpackage.setMargin(new Insets(0,0,0,120));  //btn left se chahiye
       bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        //view package
         viewpackage =new JButton("View Package");
       viewpackage.setBounds(0, 375, 325, 73);
      viewpackage.setForeground(Color.WHITE);
       viewpackage.setBackground(new Color(0,0,102));
     viewpackage.setFont(new Font("Tahoma",Font.PLAIN,22));
       viewpackage.setMargin(new Insets(0,0,0,120));  //btn left se chahiye
       viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        //view hotels
         viewhotels =new JButton("View Hotels");
       viewhotels.setBounds(0, 430, 325, 75);
      viewhotels.setForeground(Color.WHITE);
       viewhotels.setBackground(new Color(0,0,102));
     viewhotels.setFont(new Font("Tahoma",Font.PLAIN,22));
       viewhotels.setMargin(new Insets(0,0,0,135));  //btn left se chahiye
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        
        //book hotels
         bookhotel =new JButton("Book Hotels");
       bookhotel.setBounds(0, 485, 325, 75);
      bookhotel.setForeground(Color.WHITE);
      bookhotel.setBackground(new Color(0,0,102));
     bookhotel.setFont(new Font("Tahoma",Font.PLAIN,22));
       bookhotel.setMargin(new Insets(0,0,0,130));  //btn left se chahiye
       bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        //view booked hotel
        viewbookedhotel =new JButton("View Booked Hotel");
       viewbookedhotel.setBounds(0, 545, 325, 75);
     viewbookedhotel.setForeground(Color.WHITE);
     viewbookedhotel.setBackground(new Color(0,0,102));
     viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,22));
       viewbookedhotel.setMargin(new Insets(0,0,0,65));  //btn left se chahiye
       viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        
        //destinations
        destinations  =new JButton("Destinations");
       destinations.setBounds(0, 605, 325, 75);
     destinations.setForeground(Color.WHITE);
     destinations.setBackground(new Color(0,0,102));
     destinations.setFont(new Font("Tahoma",Font.PLAIN,22));
       destinations.setMargin(new Insets(0,0,0,125));  //btn left se chahiye
       destinations.addActionListener(this);
        p2.add(destinations);
        
        //payments
         payments =new JButton("Payments");
       payments.setBounds(0, 660, 325, 80);
     payments.setForeground(Color.WHITE);
     payments.setBackground(new Color(0,0,102));
     payments.setFont(new Font("Tahoma",Font.PLAIN,22));
       payments.setMargin(new Insets(0,0,0,155));  //btn left se chahiye
       payments.addActionListener(this);
        p2.add(payments);
        
        //view booked hotel
         calculators =new JButton("Calculators");
      calculators.setBounds(0, 720, 325, 80);
     calculators.setForeground(Color.WHITE);
     calculators.setBackground(new Color(0,0,102));
    calculators.setFont(new Font("Tahoma",Font.PLAIN,22));
      calculators.setMargin(new Insets(0,0,0,145));  //btn left se chahiye
      calculators.addActionListener(this);
        p2.add(calculators);
        
        
        //view booked hotel
         notepad =new JButton("Notepad");
      notepad.setBounds(0,785, 325, 80);
     notepad.setForeground(Color.WHITE);
     notepad.setBackground(new Color(0,0,102));
     notepad.setFont(new Font("Tahoma",Font.PLAIN,22));
       notepad.setMargin(new Insets(0,0,0,165));  //btn left se chahiye
       notepad.addActionListener(this);
        p2.add(notepad);
        
        
        //view booked hotel
         about =new JButton("About");
       about.setBounds(0, 850, 325, 80);
     about.setForeground(Color.WHITE);
     about.setBackground(new Color(0,0,102));
     about.setFont(new Font("Tahoma",Font.PLAIN,22));
       about.setMargin(new Insets(0,0,0,175));  //btn left se chahiye
       about.addActionListener(this);
        p2.add(about);
        
        
        //right side image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5= i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0, 0, 2200, 1000);
        add(image);
        
        JLabel text = new JLabel("CONVENIENT TRAVELLING");
        text.setBounds(700,80, 1500,120 );
//        about.setBackground(new Color(0,0,102));
        text.setBackground(new Color(0,0,102));
        text.setFont(new Font("Britannic Bold", Font.PLAIN,65));
        image.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== addPersonalDetails )
        {
           new AddCustomer(username); 
        }
        else if(ae.getSource()==viewPersonalDetails)
        {
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails)
        {
           new UpdateCustomer(username); 
        }
        else if(ae.getSource()==checkpackages)
        {
            new CheckPackage();
        }
        else if(ae.getSource()==bookpackage)
        {
            new BookPackage(username);
        }
        else if(ae.getSource()==viewpackage)
        {
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewhotels)
        {
          new CheckHotels(); 
        }
        else if(ae.getSource()==destinations)
        {
            new Destinations();
        }
        else if(ae.getSource()==bookhotel)
        {
           new BookHotel(username);   
        }
        else if(ae.getSource()==viewbookedhotel)
        {
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()== payments)
        {
            new Payment();
        }
        else if(ae.getSource()==calculators)
        {                
            // yaha humare desktop ka calc open hoga
                try
                {
                    Runtime.getRuntime().exec("calc.exe");
                }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }
        else if(ae.getSource()==notepad)
        {
            try
            {
              Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==about)
        {
            new About();
            
        }
       else if(ae.getSource()==deletePersonalDetails)
                {
                    new DeleteDetails(username);
                }
    }
    
    public static void main(String[] args)
    {
        new DashBoard(" ");
    }

    
   
}
