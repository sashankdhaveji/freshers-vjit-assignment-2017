package restaurant_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Menu extends JFrame implements ActionListener
{
    int bir,man,pan65,baby,fried,noodle,roti,naan,panbut,mutor,dal,mixveg,softdrink,sweet,total;
    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8,jp9,jp10,jp11,jp12,jp13,jp14;
    JRadioButton jr1,jr2,jr3,jr4,jr5,jr6,jr7,jr8,jr9,jr10,jr11,jr12,jr13,jr14;
    JButton jb1,jb2;
    
    Font f1,f2;
    Container c;
    
    public Menu()
    {
        setLayout(null);
        c=getContentPane();
        c.setBackground(Color.RED);
        
        f1=new Font("Arial",40,40);
        f2=new Font("Arial",20,20);
        
        jl1=new JLabel("MENU CARD");
        jl1.setFont(f1);
        jl1.setForeground(Color.WHITE);
        
        jl2=new JLabel("GIVE YOUR ORDER");
        jl2.setFont(f2);
        jl2.setForeground(Color.WHITE);
        
        jl3=new JLabel("ITEM");
        jl3.setForeground(Color.WHITE);
        jl4=new JLabel("PRICE");
        jl4.setForeground(Color.WHITE);
        jl5=new JLabel("ITEM");
        jl5.setForeground(Color.WHITE);
        jl6=new JLabel("PRICE");
        jl6.setForeground(Color.WHITE);
        
        jp1=new JLabel("160");
        jp1.setForeground(Color.WHITE);
        jp2=new JLabel("140");
        jp2.setForeground(Color.WHITE);
        jp3=new JLabel("150");
        jp3.setForeground(Color.WHITE);
        jp4=new JLabel("180");
        jp4.setForeground(Color.WHITE);
        jp5=new JLabel("150");
        jp5.setForeground(Color.WHITE);
        jp6=new JLabel("150");
        jp6.setForeground(Color.WHITE);
        jp7=new JLabel("25");
        jp7.setForeground(Color.WHITE);
        jp8=new JLabel("25");
        jp8.setForeground(Color.WHITE);
        jp9=new JLabel("150");
        jp9.setForeground(Color.WHITE);
        jp10=new JLabel("150");
        jp10.setForeground(Color.WHITE);
        jp11=new JLabel("100");
        jp11.setForeground(Color.WHITE);
        jp12=new JLabel("100");
        jp12.setForeground(Color.WHITE);
        jp13=new JLabel("35");
        jp13.setForeground(Color.WHITE);
        jp14=new JLabel("35");
        jp14.setForeground(Color.WHITE);
        
        bir=160;
        man=140;
        pan65=150;
        baby=180;
        fried=150;
        noodle=150;
        roti=25;
        naan=25;
        panbut=150;
        mutor=150;
        dal=100;
        mixveg=100;
        softdrink=35;
        sweet=35;
        
        jr1=new JRadioButton("Veg. BIRYANI");
        jr2=new JRadioButton("Veg. MANCHURIA");
        jr3=new JRadioButton("PANNER 65");
        jr4=new JRadioButton("BABY CORN MANCHURIA");
        jr5=new JRadioButton("Veg. FRIED RICE");
        jr6=new JRadioButton("Veg. NOODLES");
        jr7=new JRadioButton("ROTI");
        jr8=new JRadioButton("NAAN");
        jr9=new JRadioButton("PANNER BUTTER MASALA");
        jr10=new JRadioButton("MUTOR KOFTHA");
        jr11=new JRadioButton("DAL FRY");
        jr12=new JRadioButton("MIXED VEGETABLE CURRY");
        jr13=new JRadioButton("COKE/SPRITE/THUMS UP");
        jr14=new JRadioButton("DOUBLE KA MEETA");
        
        jb1=new JButton("ORDER");
        jb2=new JButton("CLEAR");
        
        
        jl1.setBounds(400,30,400,50);
        jl2.setBounds(450,90,600,30);
        jl3.setBounds(40,140,60,60);
        jl4.setBounds(300,140,60,60);
        jl5.setBounds(400,140,60,60);
        jl6.setBounds(900,140,60,60);
        jp1.setBounds(300,220,30,30);
        jp2.setBounds(300,270,30,30);
        jp3.setBounds(300,320,30,30);
        jp4.setBounds(300,370,30,30);
        jp5.setBounds(300,420,30,30);
        jp6.setBounds(300,470,30,30);
        jp7.setBounds(300,520,30,30);
        jp8.setBounds(900,220,30,30);
        jp9.setBounds(900,270,30,30);
        jp10.setBounds(900,320,30,30);
        jp11.setBounds(900,370,30,30);
        jp12.setBounds(900,420,30,30);
        jp13.setBounds(900,470,30,30);
        jp14.setBounds(900,520,30,30);
        jr1.setBounds(40,220,200,30);
        jr2.setBounds(40,270,200,30);
        jr3.setBounds(40,320,200,30);
        jr4.setBounds(40,370,200,30);
        jr5.setBounds(40,420,200,30);
        jr6.setBounds(40,470,200,30);
        jr7.setBounds(40,520,200,30);
        jr8.setBounds(400,220,200,30);
        jr9.setBounds(400,270,200,30);
        jr10.setBounds(400,320,200,30);
        jr11.setBounds(400,370,200,30);
        jr12.setBounds(400,420,200,30);
        jr13.setBounds(400,470,200,30);
        jr14.setBounds(400,520,200,30);
        jb1.setBounds(100,600,150,70);
        jb2.setBounds(600,600,150,70);
        
        add(jl1);
        add(jl2);
        add(jl3);
        add(jl4);
        add(jl5);
        add(jl6);
        add(jp1);
        add(jp2);
        add(jp3);
        add(jp4);
        add(jp5);
        add(jp6);
        add(jp7);
        add(jp8);
        add(jp9);
        add(jp10);
        add(jp11);
        add(jp12);
        add(jp13);
        add(jp14);
        add(jr1);
        add(jr2);
        add(jr3);
        add(jr4);
        add(jr5);
        add(jr6);
        add(jr7);
        add(jr8);
        add(jr9);
        add(jr10);
        add(jr11);
        add(jr12);
        add(jr13);
        add(jr14);
        add(jb1);
        add(jb2);
        
        jb1.addActionListener(this);
        
    }
    
    public void actionPerformed(java.awt.event.ActionEvent ae)
    {
        if(ae.getSource().equals(jb1))
        {
            if(jr1.isSelected())
            {
                total=total+bir;
            }
            if(jr2.isSelected())
            {
                total=total+man;
            }
            if(jr3.isSelected())
            {
                total=total+pan65;
            }
            if(jr4.isSelected())
            {
                total=total+baby;
            }
            if(jr5.isSelected())
            {
                total=total+fried;
            }
            if(jr6.isSelected())
            {
                total=total+noodle;
            }
            if(jr7.isSelected())
            {
                total=total+roti;
            }
            if(jr8.isSelected())
            {
                total=total+naan;
            }
            if(jr9.isSelected())
            {
                total=total+panbut;
            }
            if(jr10.isSelected())
            {
                total=total+mutor;
            }
            if(jr11.isSelected())
            {
                total=total+dal;
            }
            if(jr12.isSelected())
            {
                total=total+mixveg;
            }
            if(jr13.isSelected())
            {
                total=total+softdrink;
            }
            if(jr14.isSelected())
            {
                total=total+sweet;
            }
            
            Bill b=new Bill(total);
            b.setTitle("Bill");
            b.setSize(700,700);
            b.setVisible(true);
        }
        
        if(ae.getSource().equals(jb2))
        {
            Menu m=new Menu();
            m.setTitle("Menu Card");
            m.setSize(1000,1200);
            m.setVisible(true);
            
        }
    }
            
    
    
}
