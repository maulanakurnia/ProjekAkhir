import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    JLabel lHome1,lHome2,g1,g2,g3;
    JButton bLogin,bExit;
    
    public void displayHome(){
    
         setTitle("Home");
        lHome1 = new JLabel("Selamat datang di aplikasi WARKOP IF");
        lHome1.setFont(new Font("arial black", Font.PLAIN, 14));
        lHome1.setForeground(new Color(247, 252, 255));
        lHome2 = new JLabel("Silahkan Login terlebih dahulu");
        lHome2.setFont(new Font("arial black", Font.PLAIN, 14));
        lHome2.setForeground(new Color(0, 0, 0));
    
        g1      = new JLabel(new ImageIcon(getClass().getResource("img/welcome.png")));//icon
        g2      = new JLabel(new ImageIcon(getClass().getResource("img/coffee.png")));//icon
        g3      = new JLabel(new ImageIcon(getClass().getResource("img/coffee.png")));//icon
        
        bLogin = new JButton("Login");
        bLogin.setFont(new Font("arial black",Font.PLAIN, 16));
        bLogin.setForeground(new Color(0,0,0));
        bLogin.setBackground(new Color(245, 235, 254));
        
        getContentPane().setBackground(new Color(12, 164, 255));
        
        setLayout(null);
        add(lHome1);
        add(lHome2);
        add(g1);
        add(g2);
        add(g3);
        add(bLogin);
        
        //lHome1.setBounds(10, 130, 500, 30);
        //lHome2.setBounds(10, 100, 500, 30);
        g1.setBounds(10, 0, 400, 100);
        g2.setBounds(60, 80, 100, 100);
        g3.setBounds(250, 80, 100, 100);
        bLogin.setBounds(160, 100, 90, 30);
        
        
        setSize(420, 230);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
    }
    
}
