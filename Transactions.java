package bank.managament.system;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
        JButton deposit,withdrawal,fastcash,ministatement,pinchange,balanceenquiry,exit;
        String pinnumber;
        
        Transactions(String pinnumber){
            this.pinnumber=pinnumber;
            setLayout(null);
            
            ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(0,0,900,900);
            add(image);
            
            JLabel text=new JLabel("Please select your Transaction");
            text.setFont(new Font("Raleway",Font.BOLD,16));
            text.setForeground(Color.white);
            text.setBounds(230,300,700,35);
            image.add(text);
            
            deposit=new JButton("Deposit");
            deposit.setBounds(170,415,150,30);
            deposit.addActionListener(this);
            add(deposit);
            
            withdrawal=new JButton("Cash Withdrawal");
            withdrawal.setBounds(350,415,150,30);
            withdrawal.addActionListener(this);
            add(withdrawal);
            
            fastcash=new JButton("Fastcash");
            fastcash.setBounds(170,450,150,30);
            fastcash.addActionListener(this);
            add(fastcash);
            
            ministatement=new JButton("Mini Statement");
            ministatement.setBounds(350,450,150,30);
            ministatement.addActionListener(this);
            add(ministatement);
        
            pinchange=new JButton("Pin change");
            pinchange.setBounds(170,485,150,30);
            pinchange.addActionListener(this);
            add(pinchange);
            
            balanceenquiry=new JButton("Balance Enquiry");
            balanceenquiry.setBounds(350,485,150,30);
            balanceenquiry.addActionListener(this);
            add(balanceenquiry);
            
            exit=new JButton("Exit");
            exit.setBounds(350,520,150,30);
            exit.addActionListener(this);
            add(exit);
            
            setSize(900,900);
            setLocation(300,0);
            setUndecorated(true);
            setVisible(true);
        
        }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdrawal){
            setVisible(false);
            new Withdrawal (pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }   
        
    
    public static void main(String args[]){
        new Transactions("");
    }
    
}
