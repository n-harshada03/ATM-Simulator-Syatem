package bank.managament.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawal extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    
    Withdrawal(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to Withdraw");
        text.setFont(new Font("Raleway",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(180,300,700,35);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setForeground(Color.white);
        amount.setBackground(Color.black);
        amount.setBounds(180,350,310,30);
        image.add(amount);
        
        withdraw=new JButton("Withdraw");
        withdraw.setBounds(350,485,150,30);
        withdraw.addActionListener(this);
        add(withdraw);
            
        back=new JButton("Back");
        back.setBounds(350,520,150,30);
        back.addActionListener(this);
        add(back);    
        
        
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
    
    
    
    }
    
            
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdraw){
            String number=amount.getText();
            Date date =new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            }else{
                try{
                    Conn conn=new Conn();
                    String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawal','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+number+" Withdraw Successfully!");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                    
                }catch(Exception e){
                    System.out.println(e);
                }
            
            
            
            
            }
        }
        else if(ae.getSource()==back){
            setVisible(true);
            new Transactions(pinnumber).setVisible(true);
            
        }
    
    }
    
    public static void main(String args[]){
    
        new Withdrawal("");
    }
}
