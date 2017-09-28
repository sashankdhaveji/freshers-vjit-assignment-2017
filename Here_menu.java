package restaurant_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Here_menu extends JFrame implements ActionListener
{
    JLabel jl1,jl2,jl3;
    JButton jb;
    //ImageIcon i;
    Font f;
    Container c;
    
    
    public Here_menu()
    {
        setLayout(null);
        
        f=new Font("bold",70,70);
        
        jb=new JButton("TAKE THE MENU CARD");
        //jb.setFont(f);
        c=getContentPane();
        c.setBackground(Color.BLUE);
        //i=new ImageIcon("src\\Res\\Imgs\\here is the menu card.jpg");
        
        jl1=new JLabel("HERE");
        jl1.setFont(f);
        jl1.setForeground(Color.ORANGE);
        jl2=new JLabel("IS THE");
        jl2.setForeground(Color.ORANGE);
        jl2.setFont(f);
        jl3=new JLabel("MENU CARD");
        jl3.setFont(f);
        jl3.setForeground(Color.ORANGE);
        
        jb.setBounds(200,550,250,50);
        jl1.setBounds(40,100,600,70);
        jl2.setBounds(40,250,600,70);
        jl3.setBounds(40,400,600,70);
        
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
            Menu m=new Menu();
            m.setTitle("Menu card");
            m.setSize(1000,1200);
            m.setVisible(true);
            
            
        }
        
    }
    
    
    
    
    
}
