import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Bayar extends JFrame {
    JLabel lTitle, lId,lHarga,g1,g2;
    JTextField fId,fHarga;
    JButton bBayar, bBack,bPesan;
    
    public Bayar(){
        
        setTitle("PAYMENT");
        lTitle = new JLabel("Input Order ID");
        lTitle.setFont(new Font("Regular", Font.PLAIN, 20));
        lTitle.setForeground(new Color(247, 252, 255));
        
        lId = new JLabel("ID ");
        lId.setFont(new Font("Regular", Font.PLAIN, 18));
        lId.setForeground(new Color(247, 252, 255));
        fId = new JTextField();
        fId.setFont(new Font("Regular", Font.PLAIN, 16));
        fId.setForeground(new Color(0, 0, 0));
        fId.setBackground(new Color(247, 252, 255));
        lHarga = new JLabel("Price");
        lHarga.setFont(new Font("Regular", Font.PLAIN, 18));
        lHarga.setForeground(new Color(247, 252, 255));
        fHarga = new JTextField();
        fHarga.setFont(new Font("Regular", Font.PLAIN, 16));
        fHarga.setForeground(new Color(0, 0, 0));
        fHarga.setBackground(new Color(247, 252, 255));
        
        bBayar = new JButton("Pay");
        bBayar.setFont(new Font("arial ",Font.PLAIN, 14));
        bBayar.setBackground(new Color(247, 252, 255));
        bBack = new JButton("Back");
        bBack.setFont(new Font("arial ",Font.PLAIN, 14));
        bBack.setBackground(new Color(247, 252, 255));
        bPesan = new JButton("Orders");
        bPesan.setFont(new Font("arial ",Font.PLAIN, 14));
        bPesan.setBackground(new Color(247, 252, 255));
        
        g1   = new JLabel(new ImageIcon(getClass().getResource("img/kopi.png"))); 
        g2   = new JLabel(new ImageIcon(getClass().getResource("img/pay.png"))); 
         
        getContentPane().setBackground(new Color(12, 164, 255));
        setLayout(null);
        add(lTitle);
        add(lId);
        add(fId);  
        add(lHarga);
        add(fHarga);  
        
        add(bBayar);
        add(bBack);
        add(bPesan);
        add(g1);
        add(g2);
        
        lTitle.setBounds(30, 120, 250, 30);
        lId.setBounds(30, 150, 50, 30);
        fId.setBounds(100, 150,50,30);   
        lHarga.setBounds(30, 190, 120, 30);
        fHarga.setBounds(100, 190,130,30);   
        bBayar.setBounds(30, 240, 90, 30);
        bPesan.setBounds(130, 240, 90, 30);
        bBack.setBounds(230, 240, 90, 30);
        g1.setBounds(50, 5, 300, 300);
        g2.setBounds(10, 60, 60, 50);
        
       
        
        setSize(400, 370);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
          bBayar.addActionListener(new ActionListener() {
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
