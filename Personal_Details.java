/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personal_details;
/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.Checkbox;
public class Personal_Details extends Frame implements ActionListener,ItemListener{
    Checkbox cb1,cb2,cb3,cb4,cb5;
public Personal_Details(){
    Color c1 = new Color(0X1B0575);
    Color c2 = new Color(0XFF4E11);
    Font f1 = new Font("aharoni",Font.PLAIN,14);
    Font f2 = new Font("calibri",Font.PLAIN,15);
    Font f3 = new Font("calibri",Font.BOLD,22);
    Font f4 = new Font("calibri",Font.PLAIN,22);
  
Label l1 = new Label("First Name");
TextField t1 = new TextField();
l1.setBounds(40,50,95,30);
l1.setForeground(c1);
l1.setFont(f1);
t1.setBounds(150,50,450,25);
t1.setFont(f2);

Label l2 = new Label("Middle Name");
TextField t2 = new TextField("[Optional]");
l2.setBounds(40,90,95,30);
l2.setForeground(c1);
l2.setFont(f1);
t2.setBounds(150,90,450,25);
t2.setFont(f2);

Label l3 = new Label("Last Name");
TextField t3 = new TextField("[Optional]");
l3.setBounds(40,130,95,30);
l3.setForeground(c1);
l3.setFont(f1);
t3.setBounds(150,130,450,25);
t3.setFont(f2);

Label l4 = new Label("Occupation");
l4.setBounds(40,170,95,30);
l4.setForeground(c1);
l4.setFont(f1);
Choice ch4 = new Choice();
ch4.setBounds(150,170,170,25);
ch4.setFont(f2);
ch4.add("Select Occupation");
ch4.add("GOVERNMENT"); ch4.add("PUBLIC"); ch4.add("PRIVATE"); ch4.add("PROFESSIONAL"); ch4.add("SELF EMPLOYED");
ch4.add("STUDENT"); ch4.add("OTHER");

Label l5 = new Label("Country");
l5.setBounds(40,210,95,30);
l5.setForeground(c1);
l5.setFont(f1);
Choice ch5 = new Choice();
ch5.setBounds(150,210,180,25);
ch5.setFont(f2);
ch5.add("Select a Country");
ch5.add("Afghanistan"); ch5.add("Albania"); ch5.add("Algeria"); ch5.add("Andorra"); ch5.add("Angola"); ch5.add("Antigua and Barbuda"); ch5.add("Argentina"); ch5.add("Armenia"); ch5.add("Australia"); ch5.add("Austria"); ch5.add("Azerbaijan"); ch5.add("Bahamas"); ch5.add("Bahrain"); ch5.add("Bangladesh"); ch5.add("Barbados"); ch5.add("Belarus"); ch5.add("Belgium"); ch5.add("Belize"); ch5.add("Benin"); ch5.add("Bhutan"); ch5.add("Bolivia"); ch5.add("Bosnia and Herzegovina"); ch5.add("Botswana"); ch5.add("Brazil"); ch5.add("Brunei"); ch5.add("Bulgaria"); ch5.add("Burkina Faso"); ch5.add("Burundi"); ch5.add("Cabo Verde"); ch5.add("Cambodia"); ch5.add("Cameroon"); ch5.add("Canada"); ch5.add("Central African Republic"); ch5.add("Chad"); ch5.add("Chile"); ch5.add("China"); ch5.add("Colombia"); ch5.add("Comoros"); ch5.add("Congo, Democratic Republic of the"); ch5.add("Congo, Republic of the"); ch5.add("Costa Rica"); ch5.add("Croatia"); ch5.add("Cuba"); ch5.add("Cyprus"); ch5.add("Czech Republic"); ch5.add("Denmark"); ch5.add("Djibouti"); ch5.add("Dominica"); ch5.add("Dominican Republic"); ch5.add("Ecuador"); ch5.add("Egypt"); ch5.add("El Salvador"); ch5.add("Equatorial Guinea"); ch5.add("Eritrea"); ch5.add("Estonia"); ch5.add("Eswatini"); ch5.add("Ethiopia"); ch5.add("Fiji"); ch5.add("Finland"); ch5.add("France"); ch5.add("Gabon"); ch5.add("Gambia"); ch5.add("Georgia"); ch5.add("Germany"); ch5.add("Ghana"); ch5.add("Greece"); ch5.add("Grenada"); ch5.add("Guatemala"); ch5.add("Guinea"); ch5.add("Guinea-Bissau"); ch5.add("Guyana"); ch5.add("Haiti"); ch5.add("Honduras"); ch5.add("Hungary"); ch5.add("Iceland"); ch5.add("India"); ch5.add("Indonesia"); ch5.add("Iran"); ch5.add("Iraq"); ch5.add("Ireland"); ch5.add("Israel"); ch5.add("Italy"); ch5.add("Jamaica"); ch5.add("Japan"); ch5.add("Jordan"); ch5.add("Kazakhstan"); ch5.add("Kenya"); ch5.add("Kiribati"); ch5.add("Korea, North"); ch5.add("Korea, South"); ch5.add("Kosovo"); ch5.add("Kuwait"); ch5.add("Kyrgyzstan"); ch5.add("Laos"); ch5.add("Latvia"); ch5.add("Lebanon"); ch5.add("Lesotho"); ch5.add("Liberia"); ch5.add("Libya"); ch5.add("Liechtenstein"); ch5.add("Lithuania"); ch5.add("Luxembourg"); ch5.add("Madagascar"); ch5.add("Malawi"); ch5.add("Malaysia"); ch5.add("Maldives"); ch5.add("Mali"); ch5.add("Malta"); ch5.add("Marshall Islands"); ch5.add("Mauritania"); ch5.add("Mauritius"); ch5.add("Mexico"); ch5.add("Micronesia"); ch5.add("Moldova"); ch5.add("Monaco"); ch5.add("Mongolia"); ch5.add("Montenegro"); ch5.add("Morocco"); ch5.add("Mozambique"); ch5.add("Myanmar"); ch5.add("Namibia"); ch5.add("Nauru"); ch5.add("Nepal"); ch5.add("Netherlands"); ch5.add("New Zealand"); ch5.add("Nicaragua"); ch5.add("Niger"); ch5.add("Nigeria"); ch5.add("North Macedonia"); ch5.add("Norway"); ch5.add("Oman"); ch5.add("Pakistan"); ch5.add("Palau"); ch5.add("Panama"); ch5.add("Papua New Guinea"); ch5.add("Paraguay"); ch5.add("Peru"); ch5.add("Philippines"); ch5.add("Poland"); ch5.add("Portugal"); ch5.add("Qatar"); ch5.add("Romania"); ch5.add("Russia"); ch5.add("Rwanda"); ch5.add("Saint Kitts and Nevis"); ch5.add("Saint Lucia"); ch5.add("Saint Vincent and the Grenadines"); ch5.add("Samoa"); ch5.add("San Marino"); ch5.add("Sao Tome and Principe"); ch5.add("Saudi Arabia"); ch5.add("Senegal"); ch5.add("Serbia"); ch5.add("Seychelles"); ch5.add("Sierra Leone"); ch5.add("Singapore"); ch5.add("Slovakia"); ch5.add("Slovenia"); ch5.add("Solomon Islands"); ch5.add("Somalia"); ch5.add("South Africa"); ch5.add("South Sudan"); ch5.add("Spain"); ch5.add("Sri Lanka"); ch5.add("Sudan"); ch5.add("Suriname"); ch5.add("Sweden"); ch5.add("Switzerland"); ch5.add("Syria"); ch5.add("Taiwan"); ch5.add("Tajikistan"); ch5.add("Tanzania"); ch5.add("Thailand"); ch5.add("Timor-Leste"); ch5.add("Togo"); ch5.add("Tonga"); ch5.add("Trinidad and Tobago"); ch5.add("Tunisia"); ch5.add("Turkey"); ch5.add("Turkmenistan"); ch5.add("Tuvalu"); ch5.add("Uganda"); ch5.add("Ukraine"); ch5.add("United Arab Emirates"); ch5.add("United Kingdom"); ch5.add("United States"); ch5.add("Uruguay"); ch5.add("Uzbekistan"); ch5.add("Vanuatu"); ch5.add("Vatican City"); ch5.add("Venezuela"); ch5.add("Vietnam"); ch5.add("Yemen"); ch5.add("Zambia"); ch5.add("Zimbabwe");

Label l6 = new Label("Date Of Birth");
TextField t6 = new TextField("YYYY-MM-DD");
l6.setBounds(40,330,95,30);
l6.setForeground(c1);
l6.setFont(f1);
t6.setBounds(150,330,150,25);
t6.setFont(f2);

Label l7 = new Label("Email");
TextField t7 = new TextField();
l7.setBounds(40,450,95,30);
l7.setForeground(c1);
l7.setFont(f1);
t7.setBounds(150,450,450,25);
t7.setFont(f2);

Label l8 = new Label("Phone Number");
TextField t8 = new TextField();
l8.setBounds(40,290,95,30);
l8.setForeground(c1);
l8.setFont(f1);
Choice cha = new Choice();
cha.setBounds(150,290,80,25);
cha.setFont(f2);
cha.add("ISD");
cha.add("+93");cha.add("+355");cha.add("+213");cha.add("+1-684");cha.add("+376");cha.add("+244");cha.add("+1-264");cha.add("+1-268");cha.add("+54");cha.add("+374");cha.add("+297");cha.add("+61");cha.add("+43");cha.add("+994");cha.add("+1-242");cha.add("+973");cha.add("+880");cha.add("+1-246");cha.add("+375");cha.add("+32");cha.add("+501");cha.add("+229");cha.add("+1-441");cha.add("+975");
cha.add("+591");cha.add("+387");cha.add("+267");cha.add("+55");cha.add("+246");cha.add("+1-284");cha.add("+673");cha.add("+359");cha.add("+226");cha.add("+257");
cha.add("+855");cha.add("+237");cha.add("+1");cha.add("+238");cha.add("+599");cha.add("+1-345");cha.add("+236");cha.add("+235");cha.add("+56");cha.add("+86");
cha.add("+61 89164");cha.add("+61 89162");cha.add("+57");cha.add("+269");cha.add("+682");cha.add("+506");cha.add("+385");cha.add("+53");cha.add("+599 9");cha.add("+357");
cha.add("+420");cha.add("+243");cha.add("+45");cha.add("+253");cha.add("+1-767");cha.add("+1-809");cha.add("+1-829");cha.add("+1-849");cha.add("+670");cha.add("+593");cha.add("+20");cha.add("+503");cha.add("+240");cha.add("+291");
cha.add("+372");cha.add("+268");cha.add("+251");cha.add("+500");cha.add("+298");cha.add("+679");cha.add("+358");cha.add("+33");cha.add("+594");cha.add("+689");
cha.add("+262");cha.add("+241");cha.add("+220");cha.add("+995");cha.add("+49");cha.add("+233");cha.add("+350");cha.add("+30");cha.add("+299");cha.add("+1-473");
cha.add("+590");cha.add("+1-671");cha.add("+502");cha.add("+44 1481");cha.add("+44 7781");cha.add("+44 7839");cha.add("+44 7911");cha.add("+224");cha.add("+245");
cha.add("+592");cha.add("+509");cha.add("+1 672");cha.add("+504");cha.add("+852");cha.add("+36");cha.add("+354");cha.add("+91");cha.add("+62");cha.add("+98");cha.add("+964");cha.add("+353");cha.add("+44 1624");cha.add("+44 7524");cha.add("+44 7624");cha.add("+44 7924");cha.add("+972");
cha.add("+39");cha.add("+225");cha.add("+1-876");cha.add("+81");cha.add("+44 1534");cha.add("+962");cha.add("+7 6");cha.add("+7 7");cha.add("+254");cha.add("+686");cha.add("+383");cha.add("+965");cha.add("+996");cha.add("+856");
cha.add("+371");cha.add("+961");cha.add("+266");cha.add("+231");cha.add("+218");cha.add("+423");cha.add("+370");cha.add("+352");cha.add("+853");cha.add("+261");cha.add("+265");cha.add("+60");cha.add("+960");cha.add("+223");cha.add("+356");cha.add("+692");
cha.add("+596");cha.add("+222");cha.add("+230");cha.add("+262 269");cha.add("+262 639");cha.add("+52");cha.add("+691");cha.add("+373");cha.add("+377");cha.add("+976");cha.add("+382");cha.add("+1-664");
cha.add("+212");cha.add("+258");cha.add("+95");cha.add("+264");cha.add("+674");cha.add("+977");cha.add("+31");cha.add("+599");cha.add("+687");cha.add("+64");
cha.add("+505");cha.add("+227");cha.add("+234");cha.add("+683");cha.add("+672 3");cha.add("+850");cha.add("+389");cha.add("+44 28");cha.add("+1-670");cha.add("+47");cha.add("+968");cha.add("+92");
cha.add("+680");cha.add("+970");cha.add("+675");cha.add("+595");cha.add("+51");cha.add("+63");cha.add("+64");cha.add("+48");cha.add("+351");cha.add("+1-787");
cha.add("+1-939");cha.add("+974");cha.add("+242");cha.add("+262");cha.add("+40");cha.add("+7");cha.add("+250");cha.add("+590");cha.add("+290");cha.add("+508");
cha.add("+239");cha.add("+966");cha.add("+221");cha.add("+381");cha.add("+248");cha.add("+232");cha.add("+65");cha.add("+421");cha.add("+386");cha.add("+677");cha.add("+252");cha.add("+27");cha.add("+82");cha.add("+211");cha.add("+34");cha.add("+94");cha.add("+290");cha.add("+1-869");cha.add("+1-758");
cha.add("+590");cha.add("+508");cha.add("+1-784");cha.add("+249");cha.add("+597");cha.add("+268");cha.add("+46");cha.add("+41");cha.add("+963");cha.add("+886");cha.add("+992");cha.add("+255");cha.add("+66");cha.add("+228");cha.add("+690");cha.add("+676");cha.add("+1-868");cha.add("+216");cha.add("+90");cha.add("+993");cha.add("+1-649");cha.add("+688");cha.add("+256");cha.add("+380");cha.add("+971");cha.add("+44");cha.add("+1");cha.add("+598");cha.add("+998");cha.add("+678");cha.add("+379");cha.add("+58");cha.add("+84");cha.add("+1-340");cha.add("+681");cha.add("+967");cha.add("+260");cha.add("+263");
t8.setBounds(240,290,100,25);
t8.setFont(f2);

Label l9 = new Label("Nationality");
l9.setBounds(40,370,95,30);
l9.setForeground(c1);
l9.setFont(f1);
Choice ch9 = new Choice();
ch9.setBounds(150,370,180,25);
ch9.setFont(f2);
ch9.add("Select a Nationality");
ch9.add("Afghan");ch9.add("Albanian"); ch9.add("Algerian"); ch9.add("American"); ch9.add("Andorran"); ch9.add("Angolan"); ch9.add("Antiguan"); ch9.add("Argentine"); ch9.add("Armenian"); ch9.add("Australian"); ch9.add("Austrian"); ch9.add("Azerbaijani"); ch9.add("Bahamian"); ch9.add("Bahraini"); ch9.add("Bangladeshi"); ch9.add("Barbadian"); ch9.add("Belarusian"); ch9.add("Belgian"); ch9.add("Belizean"); ch9.add("Beninese"); ch9.add("Bhutanese"); ch9.add("Bolivian"); ch9.add("Bosnian"); ch9.add("Botswanan"); ch9.add("Brazilian"); ch9.add("British"); ch9.add("Bruneian"); ch9.add("Bulgarian"); ch9.add("Burkinabé"); ch9.add("Burmese"); ch9.add("Burundian"); ch9.add("Cabo Verdean"); ch9.add("Cambodian"); ch9.add("Cameroonian"); ch9.add("Canadian"); ch9.add("Central African"); ch9.add("Chadian"); ch9.add("Chilean"); ch9.add("Chinese"); ch9.add("Colombian"); ch9.add("Comorian"); ch9.add("Congolese"); ch9.add("Costa Rican"); ch9.add("Croatian"); ch9.add("Cuban"); ch9.add("Cypriot"); ch9.add("Czech"); ch9.add("Danish"); ch9.add("Djiboutian"); ch9.add("Dominican"); ch9.add("Dutch"); ch9.add("East Timorese"); ch9.add("Ecuadorean"); ch9.add("Egyptian"); ch9.add("Emirati"); ch9.add("Equatorial Guinean"); ch9.add("Eritrean"); ch9.add("Estonian"); ch9.add("Ethiopian"); ch9.add("Fijian"); ch9.add("Finnish"); ch9.add("French"); ch9.add("Gabonese"); ch9.add("Gambian"); ch9.add("Georgian"); ch9.add("German"); ch9.add("Ghanaian"); ch9.add("Greek"); ch9.add("Grenadian"); ch9.add("Guatemalan"); ch9.add("Guinean"); ch9.add("Guinea-Bissauan"); ch9.add("Guyanese"); ch9.add("Haitian"); ch9.add("Honduran"); ch9.add("Hungarian"); ch9.add("Icelandic"); ch9.add("Indian"); ch9.add("Indonesian"); ch9.add("Iranian"); ch9.add("Iraqi"); ch9.add("Irish"); ch9.add("Israeli"); ch9.add("Italian"); ch9.add("Ivorian"); ch9.add("Jamaican"); ch9.add("Japanese"); ch9.add("Jordanian"); ch9.add("Kazakh"); ch9.add("Kenyan"); ch9.add("Kiribati"); ch9.add("Kuwaiti"); ch9.add("Kyrgyz"); ch9.add("Lao"); ch9.add("Latvian"); ch9.add("Lebanese"); ch9.add("Lesotho"); ch9.add("Liberian"); ch9.add("Libyan"); ch9.add("Liechtenstein"); ch9.add("Lithuanian"); ch9.add("Luxembourgish"); ch9.add("Macedonian"); ch9.add("Malagasy"); ch9.add("Malawian"); ch9.add("Malaysian"); ch9.add("Maldivian"); ch9.add("Malian"); ch9.add("Maltese"); ch9.add("Marshallese"); ch9.add("Mauritanian"); ch9.add("Mauritian"); ch9.add("Mexican"); ch9.add("Micronesian"); ch9.add("Moldovan"); ch9.add("Monacan"); ch9.add("Mongolian"); ch9.add("Montenegrin"); ch9.add("Moroccan"); ch9.add("Mozambican"); ch9.add("Namibian"); ch9.add("Nauruan"); ch9.add("Nepalese"); ch9.add("New Zealander"); ch9.add("Nicaraguan"); ch9.add("Nigerian"); ch9.add("Nigerien"); ch9.add("North Korean"); ch9.add("Northern Irish"); ch9.add("Norwegian"); ch9.add("Omani"); ch9.add("Pakistani"); ch9.add("Palauan"); ch9.add("Palestinian"); ch9.add("Panamanian"); ch9.add("Papua New Guinean"); ch9.add("Paraguayan"); ch9.add("Peruvian"); ch9.add("Polish"); ch9.add("Portuguese"); ch9.add("Qatari"); ch9.add("Romanian"); ch9.add("Russian"); ch9.add("Rwandan"); ch9.add("Saint Kitts and Nevis"); ch9.add("Saint Lucian"); ch9.add("Saint Vincentian"); ch9.add("Samoan"); ch9.add("San Marinese"); ch9.add("Sao Tomean"); ch9.add("Saudi"); ch9.add("Scottish"); ch9.add("Senegalese"); ch9.add("Serbian"); ch9.add("Seychellois"); ch9.add("Sierra Leonean"); ch9.add("Singaporean"); ch9.add("Slovak"); ch9.add("Slovenian"); ch9.add("Solomon Islander"); ch9.add("Somali"); ch9.add("South African"); ch9.add("South Korean"); ch9.add("South Sudanese"); ch9.add("Spanish"); ch9.add("Sri Lankan"); ch9.add("Sudanese"); ch9.add("Surinamese"); ch9.add("Swazi"); ch9.add("Swedish"); ch9.add("Swiss"); ch9.add("Syrian"); ch9.add("Taiwanese"); ch9.add("Tajik"); ch9.add("Tanzanian"); ch9.add("Thai"); ch9.add("Togolese"); ch9.add("Tongan"); ch9.add("Trinidadian"); ch9.add("Tunisian"); ch9.add("Turkish"); ch9.add("Turkmen"); ch9.add("Tuvaluan"); ch9.add("Ugandan"); ch9.add("Ukrainian"); ch9.add("Uruguayan"); ch9.add("Uzbek"); ch9.add("Vanuatuan"); ch9.add("Venezuelan"); ch9.add("Vietnamese"); ch9.add("Welsh"); ch9.add("Yemeni"); ch9.add("Zambian"); ch9.add("Zimbabwean");

 cb1 = new Checkbox("Married");
cb1.setFont(f1);
cb1.setBounds(150,250,85,25);
cb1.setForeground(c1);
 cb2 = new Checkbox("Unmarried");
cb2.setFont(f1);
cb2.setBounds(240,250,95,25);
cb2.setForeground(c1);
cb3 = new Checkbox("Male");
cb3.setFont(f1);
cb3.setBounds(150,410,70,25);
cb3.setForeground(c1);
 cb4 = new Checkbox("Female");
cb4.setFont(f1);
cb4.setBounds(230,410,75,25);
cb4.setForeground(c1);
 cb5 = new Checkbox("Transgender");
cb5.setFont(f1);
cb5.setBounds(320,410,100,25);
cb5.setForeground(c1);

Button b1 = new Button("Continue");
b1.setBounds(360,600,120,60);
b1.setBackground(Color.ORANGE);
b1.setForeground(Color.WHITE);
b1.setFont(f3);
b1.setBackground(c2);

Button b2 = new Button("Back");
b2.setBounds(140,600,100,60);
b2.setFont(f4);
Color c = new Color(0XFFE6F8);

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
this.add(l7);
this.add(t7);
this.add(l8);
this.add(t8);
this.add(cha);
this.add(l9);
this.add(ch9);
this.add(b1);
this.add(b2);
this.add(cb1);
this.add(cb2);
this.add(cb3);
this.add(cb4);
this.add(cb5);

this.setBackground(c);
this.setLayout(null);
this.setVisible(true);
this.setSize(645,680);
this.setTitle("Personal Details");

b1.addActionListener(new ActionListener(){
@Override
 public void actionPerformed(ActionEvent e){
 if (e.getSource() == b1) {
 String firstname=t1.getText();
String middlename=t2.getText();
String lastname=t3.getText();
 String dob=t6.getText();
String email=t7.getText();
String phone=t8.getText();

if(t1.getText().isEmpty()){
            System.out.println("First Name: PLEASE ENTER Name");
        }else{System.out.println("First Name: "+firstname);}
        
if(t2.getText().equals("[Optional]")){
            System.out.println("Middle Name: NULL");
        }else{System.out.println("Middle Name: "+middlename);}
        
if(t3.getText().equals("[Optional]")){
            System.out.println("Last Name: NULL");
        }else{System.out.println("Last Name: "+lastname);}
        
if(ch4.getSelectedItem().equals ("Select Occupation")){
            System.out.println("Occupation: NOT SELECTED");
        }else{String selectedOption1 = ch4.getSelectedItem();
                    System.out.println("Occupation: " + selectedOption1);}
        
if(ch5.getSelectedItem().equals ("Select a Country")){
            System.out.println("Country: NOT SELECTED");
        }else{ String selectedOption2 = ch5.getSelectedItem();
                    System.out.println("Country: " + selectedOption2);}

int selectedcCount1 = 0;
             if (cb1.getState()) selectedcCount1++;
        if (cb2.getState()) selectedcCount1++;
        if (selectedcCount1 > 1) {
          System.out.println("Marital Status: INVALID!!!");
        } 
                  else if(cb1.getState()){
                      String selectedOption7 = cb1.getLabel();
            System.out.println("Marital Status: "+selectedOption7);
              }else if (cb2.getState()){
                 String selectedOption8 = cb2.getLabel();
                  System.out.println("Marital Status: "+selectedOption8);
              }else if (!cb1.getState() || !cb2.getState()){
                  System.out.println("Marital Status: NOT SELECTED");
              }else{System.out.println("Marital Status: INVALID!!!");}
       
        if(cha.getSelectedItem().equals("ISD")){
            System.out.println("ISD: NOT SELECTED");
        }
             if(t8.getText().isEmpty()){
            System.out.println("Phone No.: PLEASE ENTER PHONE NO.");
        }else{String selectedOption4 = cha.getSelectedItem();
                System.out.println("Phone Number: +"+selectedOption4+" "+phone);}
             
              if(t6.getText().equals("YYYY-MM-DD")){
            System.out.println("Date: PLEASE ENTER Date of Birth");
        }else{System.out.println("Date of Birth: "+dob);
              }
       
             if(ch9.getSelectedItem().equals ("Select a Nationality")){
            System.out.println("Nationality: NOT SELECTED");
              }else{String selectedOption3 = ch9.getSelectedItem();
                    System.out.println("Nationality: " + selectedOption3);}
              
             int selectedcCount = 0;
             if (cb3.getState()) selectedcCount++;
        if (cb4.getState()) selectedcCount++;
        if (cb5.getState()) selectedcCount++;

        if (selectedcCount > 1) {
          System.out.println("Gender: INVALID!!!");
        } 
        else if(cb3.getState()){
                 String selectedOption5 = cb3.getLabel();
            System.out.println("Gender: "+selectedOption5);
              }else if (cb4.getState()){
              String selectedOption6 = cb4.getLabel();
            System.out.println("Gender: "+selectedOption6);
              }else if (cb5.getState()){
                      String selectedOption7 = cb5.getLabel();
            System.out.println("Gender: "+selectedOption7);
              }
              
             if(t7.getText().isEmpty()){
            System.out.println("Email: PLEASE ENTER Email");
        }else{System.out.println("Email:"+email);}
              
t1.setText("");
t2.setText("[Optional]");
t3.setText("[Optional]");
ch4.select("Select Occupation");            
ch5.select("Select a Country");
cb1.setState(false);
cb2.setState(false);
t6.setText("YYYY-MM-DD"); 
t7.setText(""); 
cb3.setState(false);
cb4.setState(false);
cb5.setState(false);
t8.setText(""); 
cha.select("ISD");
ch9.select("Select a Nationality");

}}});

b2.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
 if (e.getSource() == b2) {
  t1.setText("");
t2.setText("[Optional]");
t3.setText("[Optional]");
t6.setText("YYYY-MM-DD");
t7.setText("");
t8.setText("");
ch4.select("Select Occupation");            
ch5.select("Select a Country");
cha.select("ISD");
ch9.select("Select a Nationality");
cb1.setState(false);
cb2.setState(false);
cb3.setState(false);
cb4.setState(false);
cb5.setState(false);
 }}});

         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }});
}
@Override
public void paint(Graphics g){
    Color c3 = new Color(0X9FE8EA); 
 g.setColor(c3);
 g.fillRect(40,490,550,75);
    g.drawRect(40,490,550,75);
 Color c4 = new Color(0X63ADEA);
 g.setColor(c4);
 Font f5 = new Font("calibri",Font.PLAIN,17);
   g.setFont(f5);
 g.drawString("International/NRI users with ISD code other than 91 have to pay",87,510);
 g.drawString("Registration fees after successful registration i.e. on first login. Please",50,530);
 g.drawString("note that the Registration fee for International/NRI users is Rs. 100 + GST.",50,550);
   Font f6 = new Font("calibri",Font.BOLD,18);
   g.setFont(f6);
   g.drawString("Info!",50,510);  
}

public static void main(String[] args) {
       new Personal_Details();
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

