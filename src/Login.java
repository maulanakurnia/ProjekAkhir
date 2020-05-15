import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login extends JFrame {
    JLabel lTitle, lUsername,lPassword,g1,g2,g3;
    JButton bSignIn, bSignUp,bExit;
    JTextField fUsername, fPassword;
    
    public Login(){
    
        setTitle("LOGIN");
        lTitle = new JLabel("LOGIN");
        lTitle.setFont(new Font("Arial ", Font.PLAIN, 20));
        lTitle.setForeground(new Color(247, 252, 255));
        
        lUsername = new JLabel("Username ");
        lUsername.setFont(new Font("Arial ", Font.PLAIN, 18));
        lUsername.setForeground(new Color(247, 252, 255));
        fUsername = new JTextField();
        fUsername.setFont(new Font("Arial ", Font.PLAIN, 16));
        fUsername.setForeground(new Color(0, 0, 0));
        fUsername.setBackground(new Color(247, 252, 255));
        
        lPassword = new JLabel("Password ");
        lPassword.setFont(new Font("Arial ", Font.PLAIN, 18));
        lPassword.setForeground(new Color(247, 252, 255));
        fPassword = new JTextField();
        fPassword.setFont(new Font("Arial ", Font.PLAIN, 16));
        fPassword.setForeground(new Color(0, 0, 0));
        fPassword.setBackground(new Color(247, 252, 255));
       
        g1      = new JLabel(new ImageIcon(getClass().getResource("img/userr.png")));//icon
        g2      = new JLabel(new ImageIcon(getClass().getResource("img/pw.png")));//icon
        g3      = new JLabel(new ImageIcon(getClass().getResource("img/loginn.png")));//icon
        
        bSignIn = new JButton("Sign In");
        bSignIn.setFont(new Font("Arial",Font.PLAIN, 14));
        bSignIn.setForeground(new Color(0, 0, 0));
        bSignIn.setBackground(new Color(247, 252, 255));
        bSignUp = new JButton("Sign Up");
        bSignUp.setFont(new Font("Arial",Font.PLAIN, 14));
        bSignUp.setForeground(new Color(0, 0, 0));
        bSignUp.setBackground(new Color(247, 252, 255));
        
        
        
        getContentPane().setBackground(new Color(12, 164, 255));

        setLayout(null);
        add(lTitle);
        add(lUsername);
        add(fUsername);
        add(lPassword);
        add(fPassword);
       
        add(g1);
        add(g2);
        add(g3);
                
        add(bSignIn);
        add(bSignUp);

        lTitle.setBounds(70, 30, 250, 30);
        g3.setBounds(5, 20, 50, 60);
        
        g1.setBounds(50, 90, 50, 60);
        fUsername.setBounds(130, 110,270,30);
       
        g2.setBounds(50, 150, 50, 60);
        fPassword.setBounds(130, 170, 270, 30);
       
        bSignIn.setBounds(130, 230, 100, 30);
        bSignUp.setBounds(250, 230, 100,30);

        setSize(450, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

          bSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });
           bSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Daftar();
            }
        });
           
    }


}
