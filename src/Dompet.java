import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Dompet extends JFrame {
    JLabel lTitle,lTopup,g1,lSaldo,g2;
    JTextField fTopup;
    JButton bTopup, bBack;
    
    public Dompet(){
     setTitle("E-DOMPET");
        lTitle = new JLabel("Your current balance is :");
        lTitle.setFont(new Font("Regular", Font.PLAIN, 20));
        lTitle.setForeground(new Color(247, 252, 255));
        
        lSaldo = new JLabel("......");
        lSaldo.setFont(new Font("Regular", Font.PLAIN, 18));
        lSaldo.setForeground(new Color(247, 252, 255));
       
        lTopup = new JLabel("Top UP");
        lTopup.setFont(new Font("Regular", Font.PLAIN, 18));
        lTopup.setForeground(new Color(247, 252, 255));
        fTopup = new JTextField();
        fTopup.setFont(new Font("Regular", Font.PLAIN, 16));
        fTopup.setForeground(new Color(0, 0, 0));
        fTopup.setBackground(new Color(247, 252, 255));
        
        bTopup = new JButton("Top Up");
        bTopup.setFont(new Font("arial ",Font.PLAIN, 14));
        bTopup.setBackground(new Color(247, 252, 255));
        bBack = new JButton("Back");
        bBack.setFont(new Font("arial ",Font.PLAIN, 14));
        bBack.setBackground(new Color(247, 252, 255));
        
        g1   = new JLabel(new ImageIcon(getClass().getResource("img/kopi.png"))); 
        g2   = new JLabel(new ImageIcon(getClass().getResource("img/dompet.png"))); 
         
        getContentPane().setBackground(new Color(12, 164, 255));
        setLayout(null);
        add(lTitle);
        add(lTopup);
        add(fTopup);  
        add(lSaldo);
        add(bTopup);
        add(bBack);
        add(g1);
        add(g2);
        
        lTitle.setBounds(30, 120, 250, 30);
        lSaldo.setBounds(30, 150, 250, 30);
        lTopup.setBounds(30, 190, 120, 30);
        fTopup.setBounds(100, 190,90,30);   
        bTopup.setBounds(30, 240, 90, 30);
        bBack.setBounds(130, 240, 90, 30);
        g1.setBounds(50, 5, 300, 300);
        g2.setBounds(10, 60, 60, 50);
        
       
        
        setSize(400, 370);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
          bTopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });
          
          bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });
    }
    
}
