package restaurant_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame implements ActionListener
{
    JLabel jl1,jl2,jl3;
    JButton jb;
    Font f;
    Container c;
    
    public Welcome()
    {
        setLayout(null);
        c=getContentPane();
        c.setBackground(Color.ORANGE);
        
        
        f=new Font("bold",70,70);
        
        jb=new JButton("ENTER THE HOTEL");
        
        jl1=new JLabel("WELCOME");
        jl2=new JLabel("TO THE");
        jl3=new JLabel("RESTAURANT");
        
        jb.setBounds(200,550,250,50);
        jl1.setBounds(40,100,600,70);
        jl1.setFont(f);
        jl2.setBounds(40,250,600,70);
        jl2.setFont(f);
        jl3.setBounds(40,400,600,70);
        jl3.setFont(f);
        
        add(jb);
        add(jl1);
        add(jl2);
        add(jl3);
        
       jb.addActionListener(this);
        
       
    }
    
    public void actionPerformed(java.awt.event.ActionEvent ae)
    {
        if(ae.getSource().equals(jb))
        {
            Here_menu h=new Here_menu();
            h.setTitle("Take menu card sir");
            h.setSize(700,700);
            h.setVisible(true);
            
            
        }
        
    }
    
    
    
}
