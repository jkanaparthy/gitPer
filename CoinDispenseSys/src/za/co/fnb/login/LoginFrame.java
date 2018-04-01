package za.co.fnb.login;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {

   /**
	 * Added default Serialised ID
	 */
	private static final long serialVersionUID = 8675621277594501827L;
		Container container = getContentPane();
	    JLabel userLabel = new JLabel("USERNAME");
	    JLabel passwordLabel = new JLabel("PASSWORD");
	    JTextField userTextField = new JTextField();
	    JPasswordField passwordField = new JPasswordField();
	    
	    JButton loginButton = new JButton("LOGIN");
	    JButton resetButton = new JButton("RESET");
	    JCheckBox showPassword = new JCheckBox("Show Password");


	    LoginFrame() {
	        setLayoutManager();
	        setLocationAndSize();
	        addComponentsToContainer();
	        addActionEvent();

	    }

	    public void setLayoutManager() {
	        container.setLayout(null);
	    }

	    public void setLocationAndSize() {
	        userLabel.setBounds(50, 150, 100, 30);
	        passwordLabel.setBounds(50, 220, 100, 30);
	        userTextField.setBounds(150, 150, 150, 30);
	        passwordField.setBounds(150, 220, 150, 30);
	        showPassword.setBounds(150, 250, 150, 30);
	        loginButton.setBounds(50, 300, 100, 30);
	        resetButton.setBounds(200, 300, 100, 30);


	    }

	    public void addComponentsToContainer() {
	        container.add(userLabel);
	        container.add(passwordLabel);
	        container.add(userTextField);
	        container.add(passwordField);
	        container.add(showPassword);
	        container.add(loginButton);
	        container.add(resetButton);
	    }

	    public void addActionEvent() {
	        loginButton.addActionListener(this);
	        resetButton.addActionListener(this);
	        showPassword.addActionListener(this);
	    }


	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //Coding Part of LOGIN button
	        if (e.getSource() == loginButton) {
	            String userText;
	            String pwdText;
	            userText = userTextField.getText();
	            pwdText = passwordField.getText();
	            if (userText.equalsIgnoreCase("fnb") && VerifyProvidedPassword.VerifyPwd(pwdText)) {
	                JOptionPane.showMessageDialog(this, "Login Successful");
	                launchDenomFrame();
	            } else {
	                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	            }

	        }
	        //Coding Part of RESET button
	        if (e.getSource() == resetButton) {
	            userTextField.setText("");
	            passwordField.setText("");
	        }
	       //Coding Part of showPassword JCheckBox
	        if (e.getSource() == showPassword) {
	            if (showPassword.isSelected()) {
	                passwordField.setEchoChar((char) 0);
	            } else {
	                passwordField.setEchoChar('*');
	            }
	        }
	    }
	    
	    
	    protected void launchDenomFrame() {
		    CaptureDenomFrame frame = new CaptureDenomFrame();
	        frame.setTitle("Cash Dispense Screen");
	        frame.setVisible(true);
	        frame.setBounds(10, 10, 370, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	    }

}
