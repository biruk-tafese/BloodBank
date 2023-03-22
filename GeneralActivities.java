import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class GeneralActivities extends JFrame implements ActionListener{

	
	JFrame frame;
	JLabel label1, labelImage,label2, label3, label4,
	        labelusername,labelpass;
	JButton buttonDonate,buttonReciecv,ButtonRegister,submitPass,backAdmin,
	         backDetails,logout,changepwd, backDonor,
	         labelDonpass, labelDonBt,labelDoncp, labelDonout,  //these are buttons not labels
	         backRec,labelRCpass, labelRCBt,labelRCcp, labelRCout; // these are labels for REciever info
	JMenu menu1;
	JMenuBar menubar1;
	
	JPanel panel1, panel2,panel3,panel4,panel5;
	ImageIcon image1;
	JTextField Adusername, Adpassword;
	 GroupLayout layout,layout2, layout3, layout4;
	GeneralActivities() {
		frame = new JFrame("BLOOD BANK");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 panel1 = new JPanel();
		
	     panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 100) );
	 
	     
	    label1 = new JLabel("DONATE BLOOD , SAVE LIFE");
		label1.setFont(new Font("Arial", Font.BOLD,20));
		label1.setOpaque(true);
		label1.setForeground(Color.BLUE);
		
		buttonDonate = new JButton("Admin");
		buttonDonate.setFocusable(false);
		buttonDonate.setSize(100, 60);
		buttonDonate.addActionListener(this);
		 
		buttonReciecv = new JButton(" Donor");
        buttonReciecv.setFocusable(false);
        buttonReciecv.addActionListener(this);
		
        ButtonRegister = new JButton("Recipient ");
        ButtonRegister.setFocusable(false);
        ButtonRegister.addActionListener(this);
        
        backDonor = new JButton("Home");
		backDonor.setFocusable(false);
		backDonor.setBounds(200,450,100,27);
		backDonor.addActionListener(this);
		
		
		backRec = new JButton("Home");
		backRec.setFocusable(false);
		backRec.setBounds(200,450,100,27);
		backRec.addActionListener(this);
        
        image1 = new ImageIcon("bloodD");
       
        labelImage = new JLabel(image1);
		labelImage.setOpaque(true);
		
        panel1.setBackground(Color.LIGHT_GRAY);
		panel1.add(label1);
		panel1.add(buttonDonate);
		panel1.add(buttonReciecv);
		panel1.add(ButtonRegister);
		panel1.add(labelImage);
		
		
		
		/*panel2 = new JPanel();
		panel2.setbackAdminground(Color.LIGHT_GRAY);
		
		
		label2 = new JLabel("Administration");
		label2.setFont(new Font("Arial", Font.BOLD,20));
		label2.setOpaque(true);
		label2.setForeground(Color.BLUE);
		
			
		panel2.add(label2);
		*/
		frame.add(panel1);
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
		
		//turn page from home to Admin
		if (e.getSource() == buttonDonate) {
			// panel1.setVisible(false);
			panel1.setVisible(false);
            panel2 = new JPanel();
            panel2.setBackground(Color.LIGHT_GRAY);
            panel2.setBorder(BorderFactory.createTitledBorder("Sign in or log in"));
           // panel2.setLayout(new GridLayout(10,0));
          //panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

//            GridBagConstraints constraints = new GridBagConstraints();
//            constraints.gridx = 4;
            layout = new GroupLayout(panel2);  
            layout.setAutoCreateGaps(true);  
            layout.setAutoCreateContainerGaps(true); 
            panel2.setLayout(layout);
               
            labelusername = new JLabel("USERNAME:");
            labelusername.setBounds(40, 150, 100, 30);
		
            Adusername = new JTextField("username ");    
            Adusername.setBounds(150,150,100,30);
            
            labelpass = new JLabel("PASSWORD: ");
            labelpass.setBounds(40, 195, 100, 30);
            
            
            JPasswordField passwordTextField=new JPasswordField(10);   
            passwordTextField.setBounds(150,190,100,30); 
            passwordTextField.setEchoChar('*');
            
            
               
            label2 = new JLabel("Blood bank Administrator");
    		label2.setFont(new Font("Arial", Font.BOLD,15));
    		label2.setOpaque(true);
    		label2.setForeground(Color.BLUE);
    		label2.setBounds(50, 30, 250, 30);
    		
    		
    		submitPass = new JButton("log in");
    		submitPass.setFocusable(false);
    		submitPass.setBounds(70, 250, 100, 27);
    		submitPass.addActionListener(this);
    		
    		
    		backAdmin = new JButton("Home");
    		backAdmin.setFocusable(false);
    		backAdmin.setBounds(190,250,100,27); 
    		backAdmin.addActionListener(this);
    
    		
    		panel2.add(label2);
    		panel2.add(labelusername);
    		panel2.add(Adusername);
    		panel2.add(labelpass);
    		panel2.add(passwordTextField);
    		panel2.add(submitPass);
    		panel2.add(backAdmin);
    	     
    		 
    		
    	    frame.add(panel2);
			 
		}
		
		
		//return page from admin to home
		else if (e.getSource() == backAdmin) {
			  panel2.setVisible(false);
			  panel1.setVisible(true);
		  }
		
		
		//accepts the password to authorize the admin to enter to the details of admin
		else if (e.getSource() == submitPass) {
			  
			
			   panel2.setVisible(false);
			  
			   panel3 = new JPanel();
			   panel3.setVisible(true);
			   panel3.setBackground(Color.LIGHT_GRAY);
			   
			   layout2 = new GroupLayout(panel3);  
			   layout2.setAutoCreateGaps(true);  
	           layout2.setAutoCreateContainerGaps(true); 
	           panel3.setLayout(layout2);
	          //here 
	           logout = new JButton("◄ Log out");
	           logout.setBounds(80, 440, 120, 30);
	           logout.setFocusable(false);
	           
	           changepwd = new JButton("Change pasword");
	           changepwd.setBounds(80, 130, 175, 35);
	           changepwd.setFocusable(false);
	           
	           
	                  
	           
	          
	           backDetails = new JButton("←Back");
	           backDetails.setBounds(230, 440, 100, 30);
	           backDetails.setFocusable(false);
	           backDetails.addActionListener(this);
			   
	         
	           
	           panel3.setInheritsPopupMenu(isValid());
	           
	           panel3.add(backDetails);
	           panel3.add(logout);
	           panel3.add(changepwd);
	           
			   frame.add(panel3);
			  
			}  
		
		
		//this turns detail page of admin back to log in page
		else if(e.getSource() == backDetails) {
			
			  panel3.setVisible(false);
			  panel2.setVisible(true);
			  panel3.setBackground(Color.LIGHT_GRAY);
		}
		//this condition works for Donor informations and operations
		
		else if(e.getSource() == buttonReciecv) {
			
			panel1.setVisible(false);
			
			panel4 = new JPanel();
			panel4.setVisible(true);
			
			   layout3 = new GroupLayout(panel4);  
			   layout3.setAutoCreateGaps(true);  
	           layout3.setAutoCreateContainerGaps(true); 
	           
	           //these are buttons not labels
	           labelDonpass = new JButton("change password");
	           labelDonpass.setBounds(100, 130, 170, 40);
	           labelDonpass.setFocusable(false);
	           labelDonpass.addActionListener(this);
	           
	           
	           labelDonBt = new JButton("your Blood type");
	           labelDonBt.setBounds(100, 180, 170, 40);
	           labelDonBt.setFocusable(false);
	           labelDonBt.addActionListener(this);
	           
	           labelDonout = new JButton("why donate?");
	           labelDonout.setBounds(100, 230, 170, 40);
	           labelDonout.setFocusable(false);
	           labelDonout.addActionListener(this);
	           
	           
	           labelDoncp = new JButton("log out");
	           labelDoncp.setBounds(100, 280, 170, 40);
	           labelDoncp.setFocusable(false);
	           labelDoncp.addActionListener(this);
	 
	           panel4.setLayout(layout3);
	           panel4.add(labelDonpass);
	           panel4.add(labelDonBt);
	           panel4.add(labelDonout);
	           panel4.add(labelDoncp);
	           panel4.add(backDonor);

	        frame.add(panel4); 
			
			
		}
		// this return from donor page to back home
		else if(e.getSource() == backDonor) {
			panel4.setVisible(false);
			panel1.setVisible(true);
		}

	   
		else if(e.getSource() == ButtonRegister ) {
			
			 panel1.setVisible(false);
			 
			 panel5 = new JPanel();
			 panel5.setVisible(true);
				
			layout4 = new GroupLayout(panel5);  
		    layout4.setAutoCreateGaps(true);  
		    layout4.setAutoCreateContainerGaps(true); 
		    panel5.setLayout(layout4);
		    
		      labelRCpass = new JButton("change password");
		      labelRCpass.setBounds(90, 130, 165, 40);
		      labelRCpass.setFocusable(false);
		      labelRCpass.addActionListener(this);
	           
	           
	           labelRCBt = new JButton("find Blood type");
	           labelRCBt.setBounds(90, 180, 165, 40);
	           labelRCBt.setFocusable(false);
	           labelRCBt.addActionListener(this);
	           
	           labelRCout = new JButton("who need blood?");
	           labelRCout.setBounds(90, 230, 165, 40);
	           labelRCout.setFocusable(false);
	           labelRCout.addActionListener(this);
	          
	           
	           labelRCcp = new JButton("log out");
	           labelRCcp.setBounds(90, 280, 165, 40);
	           labelRCcp.setFocusable(false);
	           labelRCcp.addActionListener(this);
	          
	           
	           panel5.add(labelRCpass);
	           panel5.add(labelRCBt);
	           panel5.add(labelRCout);
	           panel5.add(labelRCcp);
	           panel5.add(backRec);
	 
		    
		    frame.add(panel5);
		           
		}
		
		else if (e.getSource() == backRec ) {
			panel5.setVisible(false);
			panel1.setVisible(true);
		}
		
		
		
		
	}
}
