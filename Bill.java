package restaurant_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bill extends JFrame implements ActionListener
{
    int total;
    
    JLabel jl1,jl2;
    JButton jb;
    JTextField jt;
    
    //ImageIcon i;
    Font f;
    Container c;
    
    public Bill(int total)
    {
        this.total=total;
        
        setLayout(null);
        
        f=new Font("bold",70,70);
        c=getContentPane();
        c.setBackground(Color.WHITE);
        
        jb=new JButton("PAY THE AMOUT");
        //jb.setFont(f);
        
        jt=new JTextField();
        
        //i=new ImageIcon("src\\Res\\Imgs\\bill.jpg");
        
        jl1=new JLabel("HERE IS");
        jl1.setForeground(Color.red);
        jl1.setFont(f);
        
        jl2=new JLabel("THE BILL");
        jl2.setForeground(Color.red);
        jl2.setFont(f);
        
        jb.setBounds(200,550,250,50);
        jl1.setBounds(40,100,600,70);
        jl2.setBounds(40,250,600,70);
        jt.setBounds(40,400,60,70);
        
        
        add(jb);
        add(jl1);
        add(jl2);
        
        
        jb.addActionListener(this);
       
        jt.setText(""+total);
        add(jt);
        
       
    }
    
    public void actionPerformed(java.awt.event.ActionEvent ae)
    {
        
        
        
        if(ae.getSource().equals(jb))
        {
            Thankyou t=new Thankyou();
            t.setTitle("Thank you and visit again");
            t.setSize(700,700);
            t.setVisible(true);
            
        }
        
    }
    
    
    
    
}
