import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
        
        
public class Daftar extends JFrame{
    JLabel lTitle, lUsername,lPassword;
    JButton bSignUp, bBack,bExit;
    JTextField fUsername, fPassword;
    
    public Daftar(){
    
        setTitle("SIGN UP");
        lTitle = new JLabel("Sign Up");
        lTitle.setFont(new Font("Regular", Font.PLAIN, 20));
        lTitle.setForeground(new Color(247, 252, 255));
        
        lUsername = new JLabel("Username ");
        lUsername.setFont(new Font("Regular", Font.PLAIN, 18));
        lUsername.setForeground(new Color(247, 252, 255));
        fUsername = new JTextField();
        fUsername.setFont(new Font("Regular", Font.PLAIN, 16));
        fUsername.setForeground(new Color(0, 0, 0));
        fUsername.setBackground(new Color(247, 252, 255));
        
        lPassword = new JLabel("Password ");
        lPassword.setFont(new Font("Regular", Font.PLAIN, 18));
        lPassword.setForeground(new Color(247, 252, 255));
        fPassword = new JTextField();
        fPassword.setFont(new Font("Regular", Font.PLAIN, 16));
        fPassword.setForeground(new Color(0, 0, 0));
        fPassword.setBackground(new Color(247, 252, 255));
       
        
       
        bSignUp = new JButton("Sign Up");
        bSignUp.setFont(new Font("Regular",Font.PLAIN, 14));
        bSignUp.setBackground(new Color(247, 252, 255));
        bBack = new JButton("Back");
        bBack.setFont(new Font("Regular",Font.PLAIN, 14));
        bBack.setBackground(new Color(247, 252, 255));
        
        
        
        getContentPane().setBackground(new Color(12, 164, 255));

        setLayout(null);
        add(lTitle);
        add(lUsername);
        add(fUsername);
        add(lPassword);
        add(fPassword);
       
        add(bSignUp);
        add(bBack);

        lTitle.setBounds(120, 20, 250, 30);
        lUsername.setBounds(30, 70, 120, 30);
        fUsername.setBounds(130, 73,270,25);
        lPassword.setBounds(30, 110, 120, 30);
        fPassword.setBounds(130, 110, 270, 30);
       
        bSignUp.setBounds(120, 180, 90, 30);
        bBack.setBounds(220, 180, 90,30);

        setSize(450, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

          bSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
          
           bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
    }
    
}
