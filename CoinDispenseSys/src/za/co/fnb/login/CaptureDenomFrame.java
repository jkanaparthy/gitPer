package za.co.fnb.login;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import za.co.fnb.util.VerifyRandAmt;

public class CaptureDenomFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = -8228776810561209058L;
	Container container = getContentPane();
    JLabel amtDueLabel = new JLabel("Amount Due:");
    JLabel randNoteLabel = new JLabel("Capture Rand Note Denomination");
    JTextField randNoteTextField = new JTextField();
    JTextField amtDueTextField = new JTextField();
    
    JButton submitButton = new JButton("SUBMIT");
    JButton resetButton = new JButton("RESET");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaptureDenomFrame frame = new CaptureDenomFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
		CaptureDenomFrame() {
	        setLayoutManager();
	        setLocationAndSize();
	        addComponentsToContainer();
	        addActionEvent();
	
	    }
		
	  public void setLayoutManager() {
	        container.setLayout(null);
	    }

	    public void setLocationAndSize() {
	    	amtDueLabel.setBounds(50, 150, 100, 30);
	    	randNoteLabel.setBounds(50, 220, 150, 30);
	    	randNoteTextField.setBounds(150, 150, 180, 30);
	    	randNoteTextField.setText("25.50");
	    	randNoteTextField.setEditable(false);
	        amtDueTextField.setBounds(150, 220, 180, 30);
//	        showPassword.setBounds(150, 250, 150, 30);
	        submitButton.setBounds(50, 300, 100, 30);
	        resetButton.setBounds(200, 300, 100, 30);
	    }

	    public void addComponentsToContainer() {
	        container.add(amtDueLabel);
	        container.add(randNoteLabel);
	        container.add(randNoteTextField);
	        container.add(amtDueTextField);
//	        container.add(showPassword);
	        container.add(submitButton);
	        container.add(resetButton);
	    }

	    public void addActionEvent() {
	        submitButton.addActionListener(this);
	        resetButton.addActionListener(this);
//	        showPassword.addActionListener(this);
	    }


	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //Coding Part of LOGIN button
	        if (e.getSource() == submitButton) {
	            String randNoteText;
	            randNoteText = amtDueTextField.getText();
	            System.out.println("randNoteText"+randNoteText.trim().length());
	            //Validate the randNoteText Filed for any input Value
	            if (randNoteText.trim().length() > 0) {
		            int randAmt = Integer.valueOf(randNoteText);
		            if (VerifyRandAmt.verifyRandAmt(randAmt)) {
		                JOptionPane.showMessageDialog(this, "Valid Amount");
		            } else {
		                JOptionPane.showMessageDialog(this, "Invalid Rand Amount");
		            }
	            } else {
	                JOptionPane.showMessageDialog(this, "Enter Rand Amount");
	            }
	        }
	        //Coding Part of RESET button
	        if (e.getSource() == resetButton) {
	        	amtDueTextField.setText("");
	        }
	    }
}
