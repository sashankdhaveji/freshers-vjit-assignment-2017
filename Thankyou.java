package restaurant_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thankyou extends JFrame
{
    JLabel jl1,jl2,jl3,jl4;
    //ImageIcon i;
    Font f;
    Container c;
    
    public Thankyou()
    {
        
        setLayout(null);
        
        c=getContentPane();
        c.setBackground(Color.GREEN);
        
        f=new Font("bold",100,100);
        
        //i=new ImageIcon("src\\Res\\Imgs\\Thank you visit again.jpg");
        
        jl1=new JLabel("THANK YOU");
        jl1.setForeground(Color.BLUE);
        jl1.setFont(f);
        
        jl2=new JLabel("AND");
        jl2.setForeground(Color.BLUE);
        jl2.setFont(f);
        
        jl3=new JLabel("VISIT AGAIN");
        jl3.setForeground(Color.BLUE);
        jl3.setFont(f);
        
        jl1.setBounds(40,100,600,70);
        jl2.setBounds(40,250,600,70);
        jl3.setBounds(40,400,600,70);
        
        add(jl1);
        add(jl2);
        add(jl3);
        
        
       
    }
    
    
    
}
