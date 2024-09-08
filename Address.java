/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.address;

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;

public class Address extends Frame implements ActionListener,ItemListener{
    Checkbox ch1,ch2;
public Address(){
 
    Color c1 = new Color(0X1B0575);
    Color c2 = new Color(0XFF4E11);
    Font f1 = new Font("aharoni",Font.PLAIN,14);
    Font f2 = new Font("calibri",Font.PLAIN,15);
    Font f3 = new Font("calibri",Font.BOLD,22);
    Font f4 = new Font("calibri",Font.PLAIN,22);
    Font f5 = new Font("calibri",Font.BOLD,14);
   
Label l1 = new Label("Flat/Block No.");
TextField t1 = new TextField();
l1.setBounds(40,50,95,30);
l1.setForeground(c1);
l1.setFont(f1);
t1.setBounds(150,50,80,25);
t1.setFont(f2);

Label l2 = new Label("Street/Lane");
TextField t2 = new TextField("[Optional]");
l2.setBounds(40,90,95,30);
l2.setForeground(c1);
l2.setFont(f1);
t2.setBounds(150,90,450,25);
t2.setFont(f2);

Label l3 = new Label("Area/Locality");
TextField t3 = new TextField("[Optional]");
l3.setBounds(40,130,95,30);
l3.setForeground(c1);
l3.setFont(f1);
t3.setBounds(150,130,450,25);
t3.setFont(f2);

Label l4 = new Label("Pin Code");
TextField t4 = new TextField();
l4.setBounds(40,170,95,30);
l4.setForeground(c1);
l4.setFont(f1);
t4.setBounds(150,170,90,25);
t4.setFont(f2);

Label l5 = new Label("State");
l5.setBounds(40,210,90,30);
l5.setForeground(c1);
l5.setFont(f1);
Choice ch5 = new Choice();
ch5.setBounds(150,210,200,25);
ch5.setFont(f2);
ch5.add("Select State");
ch5.add("Andhra Pradesh"); ch5.add("Arunachal Pradesh"); ch5.add("Assam"); ch5.add("Bihar"); ch5.add("Chhattisgarh"); ch5.add("Goa"); ch5.add("Gujarat"); ch5.add("Haryana"); ch5.add("Himachal Pradesh"); ch5.add("Jharkhand"); ch5.add("Karnataka"); ch5.add("Kerala"); ch5.add("Madhya Pradesh"); ch5.add("Maharashtra"); ch5.add("Manipur"); ch5.add("Meghalaya"); ch5.add("Mizoram"); ch5.add("Nagaland"); ch5.add("Odisha"); ch5.add("Punjab"); ch5.add("Rajasthan"); ch5.add("Sikkim"); ch5.add("Tamil Nadu"); ch5.add("Telangana"); ch5.add("Tripura"); ch5.add("Uttar Pradesh"); ch5.add("Uttarakhand"); ch5.add("West Bengal");

Label l6 = new Label("Phone");
TextField t6 = new TextField();
l6.setBounds(40,250,95,30);
l6.setForeground(c1);
l6.setFont(f1);
t6.setBounds(150,250,100,25);
t6.setFont(f2);

Label l7 = new Label("City/Town");
TextField t7 = new TextField();
l7.setBounds(40,290,95,30);
l7.setForeground(c1);
l7.setFont(f1);
t7.setBounds(150,290,150,25);
t7.setFont(f2);

ch1 = new Checkbox("Please inform me about IRCTC Co-branded credit card");
ch1.setFont(f5);
ch1.setBounds(40,340,455,20);
Label la = new Label("through Phone/Email/SMS (Optional)");
la.setBounds(40,360,455,25);
la.setFont(f5);

 ch2 = new Checkbox("I have read and agree with the Terms and Conditions and");
ch2.setFont(f5);
ch2.setBounds(40,470,455,25);
Label lb = new Label("also agree to receive promotional emails/SMS/WhatsApp/");
lb.setBounds(40,490,455,25);
lb.setFont(f5);
Label lc = new Label("Alerts/offers/announcements from IRCTC & associated partners.");
lc.setBounds(40,510,455,25);
lc.setFont(f5);

Button b1 = new Button("Register");
b1.setBounds(360,570,120,60);
b1.setBackground(Color.ORANGE);
b1.setForeground(Color.WHITE);
b1.setFont(f3);
b1.setBackground(c2);
Button b2 = new Button("Back");
b2.setBounds(140,570,100,60);
b2.setFont(f4);

Color c = new Color(0XFFE6F8);
this.add(l1);this.add(t1);this.add(l2);this.add(t2);this.add(l3);this.add(t3);this.add(l4);this.add(t4);this.add(l5);this.add(ch5);
this.add(l6);this.add(t6);this.add(l7);this.add(t7);this.add(b1);this.add(b2);this.add(ch1);this.add(ch2);this.add(la);
this.add(lb);this.add(lc);

this.setBackground(c);
this.setLayout(null);
this.setVisible(true);
this.setSize(645,680);
this.setTitle("Address");

b1.addActionListener(new ActionListener(){
@Override
 public void actionPerformed(ActionEvent e){
 if (e.getSource() == b1) {
 String flat=t1.getText();
String street=t2.getText();
String area=t3.getText();
 String pin=t4.getText();
String phone=t6.getText();
String city=t7.getText();
if(t1.getText().isEmpty()){
            System.out.println("Flat/Block No.: PLEASE ENTER Flat/Block No.");
        }else{System.out.println("Flat/Block No.: "+flat);}
        
if(t2.getText().equals("[Optional]")){
            System.out.println("Street/Lane: NULL");
        }else{System.out.println("Street/Lane: "+street);}
        
if(t3.getText().equals("[Optional]")){
            System.out.println("Area/Locality: NULL");
        }else{System.out.println("Area/Locality: "+area);}
          
if(t4.getText().isEmpty()){
            System.out.println("Pin Code: PLEASE ENTER Pin Code");
        }else{System.out.println("Pin Code: "+pin);}
        
if(ch5.getSelectedItem().equals ("Select State")){
            System.out.println("State: NOT SELECTED");
        }else{String selectedOption2 = ch5.getSelectedItem();
                    System.out.println("Security Question: " + selectedOption2);}

        if(t6.getText().isEmpty()){
            System.out.println("Phone: PLEASE ENTER Phone");
        }else{System.out.println("Phone: "+phone);}
         
           if(t7.getText().isEmpty()){
            System.out.println("City/Town: PLEASE ENTER City/Town");
        }else{System.out.println("City/Town: "+city);}

           if (ch1.getState() && ch2.getState() && !t1.getText().isEmpty() && !t4.getText().isEmpty() && !ch5.getSelectedItem().equals ("Select State") && !t6.getText().isEmpty() && !t7.getText().isEmpty()) {
            System.out.println("THANK YOU!!!");
        }else if(!ch1.getState() || !ch2.getState() || t1.getText().isEmpty() || t4.getText().isEmpty() || ch5.getSelectedItem().equals ("Select State") || t6.getText().isEmpty() || t7.getText().isEmpty())
                {System.out.println("PLEASE FULFILL THE CONDITIONS!!!");}

t1.setText("");
t2.setText("[Optional");
t3.setText("[Optional]");
t4.setText("");
ch5.select("Select State");
t6.setText("");
t7.setText("");
ch1.setState(false);
ch2.setState(false);
 }
 }});

b2.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
 if (e.getSource() == b2) {
  t1.setText("");
t2.setText("[Optional]");
t3.setText("[Optional]");
t4.setText("");
t6.setText("");
t7.setText("");
ch5.select("Select State");
ch1.setState(false);
ch2.setState(false);
 }}});

         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }});}

@Override
public void paint(Graphics g){
 Color c3 = new Color(0X1B0575);
 g.setColor(c3);
Font f6 = new Font("calibri",Font.BOLD,14);
   g.setFont(f6);
 g.drawString("Enjoy the railway ticket booking with 1% PG transaction",40,405);
  g.drawString("charges waiver with IRCTC SBI/BOB/HDFC cards and",40,425);
   g.drawString("also you can book ticket using earned loyalty reward points",40,445);
}
    public static void main(String[] args) {
Address ad = new Address();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
