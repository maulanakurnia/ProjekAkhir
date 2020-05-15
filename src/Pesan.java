import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pesan extends JFrame{
     String[][] datas = new String[500][6];
    String[] kolom = {"ID","Username", "Coffe", "Total", "Price"};
    JLabel lTitle,g1,g2;
    JTable tTable;
    JButton bBack,bBayar;
    JScrollPane scrollPane;
    ResultSet resultSet;
    Statement statement;
    
    public Pesan(){
     setTitle("DATA PESANAN");

        lTitle = new JLabel("Orders");
        lTitle.setFont(new Font("tahoma", Font.BOLD, 20));
        lTitle.setForeground(new Color(247, 252, 255));
        bBack = new JButton("Back");
        bBack.setFont(new Font("Regular",Font.PLAIN, 14));
        bBack.setBackground(new Color(247, 252, 255));
        bBayar = new JButton("Pay");
        bBayar.setFont(new Font("Regular",Font.PLAIN, 14));
        bBayar.setBackground(new Color(247, 252, 255));
        tTable = new JTable(datas, kolom);
        tTable.setBackground(new Color(247, 252, 255));
        scrollPane = new JScrollPane(tTable);
        scrollPane.setBackground(new Color(247, 252, 255));
        g1      = new JLabel(new ImageIcon(getClass().getResource("img/kopi.png")));//icon
        g2      = new JLabel(new ImageIcon(getClass().getResource("img/order.png")));//icon
        
        getContentPane().setBackground(new Color(12, 164, 255));

        setLayout(null);
        add(lTitle);
        add(bBack);
        add(bBayar);
        add(scrollPane);
        add(g1);
        add(g2);
        lTitle.setBounds(70, 30, 300, 30);
        scrollPane.setBounds(70, 70, 400, 400);
        bBayar.setBounds(170, 490, 90, 30);
        bBack.setBounds(270, 490, 90, 30);
        g1.setBounds(80, 5, 300, 300);
        g2.setBounds(10, 20, 60, 50);
        
        setSize(570, 620);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });
        
        bBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Bayar();
            }
        });
    
    }
    
}
