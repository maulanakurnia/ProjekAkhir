import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Menu extends JFrame {
    JLabel lTittle,g1;
    JButton bKopi,  bDompet, bExit,bLogout,bBayar,bPesan;

    public Menu(){
        setTitle("Coffe House");
        lTittle = new JLabel(" ");
        lTittle.setFont(new Font("arial black", Font.BOLD, 18));
        lTittle.setForeground(new Color(247, 252, 255));
        bKopi = new JButton("Menu");
        bKopi.setFont(new Font("Regular",Font.PLAIN, 16));
        bKopi.setBackground(new Color(247, 252, 255));
        
        /*bRead = new JButton("Pesanan ");
        bRead.setFont(new Font("Regular",Font.PLAIN, 16));
        bRead.setBackground(new Color(247, 252, 255));    
        bUpdate = new JButton("Edit ");
        bUpdate.setFont(new Font("Regular",Font.PLAIN, 16));
        bUpdate.setBackground(new Color(247, 252, 255));*/
        
        bPesan = new JButton("Orders ");
        bPesan.setFont(new Font("Regular",Font.PLAIN, 16));
        bPesan.setBackground(new Color(247, 252, 255));
        bBayar = new JButton("Payment");
        bBayar.setFont(new Font("Regular",Font.PLAIN, 16));
        bBayar.setBackground(new Color(247, 252, 255));
        bDompet = new JButton("E-Dompet ");
        bDompet.setFont(new Font("Regular",Font.PLAIN, 16));
        bDompet.setBackground(new Color(247, 252, 255));
        bExit = new JButton("Exit ");
        bExit.setFont(new Font("Regular",Font.PLAIN, 16));
        bExit.setBackground(new Color(255, 0, 0));
        bLogout = new JButton("Logout ");
        bLogout.setFont(new Font("Regular",Font.PLAIN, 16));
        bLogout.setBackground(new Color(255, 0, 0));
        g1      = new JLabel(new ImageIcon(getClass().getResource("img/kopi.png")));//icon
        
        getContentPane().setBackground(new Color(12, 164, 255));

        setLayout(null);
        add(lTittle);
        add(bKopi);
     
        add(bPesan);
        add(bBayar);
        add(bDompet);
        add(bExit);
        add(bLogout);
        add(g1);

        lTittle.setBounds(270,70,350,30);
        bKopi.setBounds(10, 120, 220, 30);
        bPesan.setBounds(250, 120, 220, 30);
        bBayar.setBounds(10, 160, 220, 30);
        bDompet.setBounds(250, 160, 220, 30);
        bLogout.setBounds(140, 200, 90, 30);
        bExit.setBounds(250, 200, 70, 30);
        g1.setBounds(80, 5, 300, 300);

        setSize(500, 370);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bKopi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Kopi();
            }
        });
        bBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                 new Bayar();
            }
        });
        
        bDompet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                 new Dompet();
            }
        });
        
        bPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                 new Pesan();
            }
        });
        /*bRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pesan();
            }
        });
        bDompet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Delete();
                }catch (ClassNotFoundException classError){
                    classError.printStackTrace();
                }catch (SQLException sqlError){
                    sqlError.printStackTrace();
                }
            }
        });
        /*bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Edit();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        });*/

        bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        bLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
    }
}
