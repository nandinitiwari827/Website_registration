/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registeration;

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;

public class Registeration extends Frame implements ActionListener,ItemListener{
Label l1,l2,l3,l4,l5,l6,la,la1,lb;
TextField t1,t2,t3,t6;
Choice ch4,ch5;
Button b1,b2;

public Registeration(){
 
    Color c1 = new Color(0X1B0575);
    Color c2 = new Color(0XFF4E11);
    Font f1 = new Font("aharoni",Font.PLAIN,14);
    Font f2 = new Font("calibri",Font.PLAIN,15);
    Font f3 = new Font("calibri",Font.BOLD,22);
    Font f4 = new Font("calibri",Font.PLAIN,22);
    Font f5 = new Font("aptos light",Font.PLAIN,13);
    Font f6 = new Font("calibri",Font.BOLD,22);
 la = new Label("GARBAGE/JUNK VALUES IN PROFILE MAY LEAD TO");
la.setBounds(40,50,590,30);
la.setFont(f6);
 la1 = new Label("DEACTIVATION");
la1.setBounds(40,75,380,30);
la1.setFont(f6); 
 lb = new Label("Please use a valid E-Mail ID and mobile number in registration.");
lb.setBounds(40,102,380,30);
lb.setFont(f5);

l1 = new Label("User Name");
 t1 = new TextField();
l1.setBounds(40,140,70,30);
l1.setForeground(c1);
l1.setFont(f1);
t1.setBounds(170,140,400,25);
t1.setFont(f2);

 l2 = new Label("Password");
 t2 = new TextField();
l2.setBounds(40,180,70,30);
l2.setForeground(c1);
l2.setFont(f1);
t2.setBounds(170,180,400,25);
t2.setEchoChar('*');
t2.setFont(f2);

 l3 = new Label("Confirm Password");
 t3 = new TextField();
l3.setBounds(40,220,120,30);
l3.setForeground(c1);
l3.setFont(f1);
t3.setBounds(170,220,400,25);
t3.setEchoChar('*');
t3.setFont(f2);

 l4 = new Label("Preferred Language");
l4.setBounds(40,260,123,30);
l4.setForeground(c1);
l4.setFont(f1);
 ch4 = new Choice();
ch4.setBounds(170,260,150,25);
ch4.setFont(f2);
ch4.add("Select Language");
ch4.add("English");
ch4.add("Hindi");

 l5 = new Label("Security Question");
l5.setBounds(40,300,120,30);
l5.setForeground(c1);
l5.setFont(f1);
 ch5 = new Choice();
ch5.setBounds(170,300,310,25);
ch5.setFont(f2);
ch5.add("Select Question");
ch5.add("What is your pet name?");
ch5.add("What was the name of your first school?");
ch5.add("What is your favorite past-time?");
ch5.add("What make was your first car or bike?");
ch5.add("Where did you first meet your spouse?");
ch5.add("What is your fathers middle name?");
ch5.add("Who was your Childhood hero?");
ch5.add("What is your all time favorite sports team?");

 l6 = new Label("Security Answer");
 t6 = new TextField();
l6.setBounds(40,340,120,30);
l6.setForeground(c1);
l6.setFont(f1);
t6.setBounds(170,340,400,25);
t6.setFont(f2);

 b1 = new Button("Continue");
b1.setBounds(360,450,120,60);
b1.setForeground(Color.WHITE);
b1.setFont(f3);
b1.setBackground(c2);
 b2 = new Button("Cancle");
b2.setBounds(140,450,100,60);
b2.setFont(f4);
Color c = new Color(0XFFE6F8);
this.add(la);
this.add(la1);
this.add(lb);
this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(l4);
this.add(ch4);
this.add(l5);
this.add(ch5);
this.add(l6);
this.add(t6);
this.add(b1);
this.add(b2);
this.setBackground(c);
this.setLayout(null);
this.setVisible(true);
this.setSize(645,600);
this.setTitle("Registration Form");
b1.addActionListener(this);
b2.addActionListener(this);

 this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
}});}

public void actionPerformed(ActionEvent e) {
    if(e.getSource() == b1){
        String username = t1.getText();
        String password = t2.getText();
        String confirmpassword = t3.getText();
        String securityanswer = t6.getText();
        
        if(t1.getText().isEmpty()){
            System.out.println("Username: PLEASE ENTER Username");
        }else{System.out.println("Username: "+username);}
        
        if(t2.getText().isEmpty()){
            System.out.println("Password: PLEASE ENTER Password");
        }else{System.out.println("Password: "+password);}
       
        if(t3.getText().isEmpty()){
            System.out.println("Confirm Password: PLEASE ENTER Confirm Password");}
        
        if(ch4.getSelectedItem().equals ("Select Language")){
            System.out.println("Preferred Language: NOT SELECTED");
        }else{String selectedOption1 = ch4.getSelectedItem();
                    System.out.println("Preferred Language: " + selectedOption1);}
        
        if(ch5.getSelectedItem().equals ("Select Question")){
            System.out.println("Security Question: NOT SELECTED");
        }else{String selectedOption2 = ch5.getSelectedItem();
                    System.out.println("Security Question: " + selectedOption2);}
        
        if(t6.getText().isEmpty()){
            System.out.println("Security Answer: NULL");
        }
        else{System.out.println("Security Answer: "+securityanswer); }
        if (password.equals(confirmpassword)) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            ch4.select("Select Language");
            ch5.select("Select Question");    
            t6.setText("");
            
        } else {
        System.out.println("Passwords do not match");
        }
      
  if (e.getSource() == b2) {
  t1.setText("");
t2.setText("");
t3.setText("");
ch4.select("Select Language");
ch5.select("Select Question");  
t6.setText("");
 }}}

    public static void main(String[] args) {
        new Registeration();
}
    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    

            
            
            
    