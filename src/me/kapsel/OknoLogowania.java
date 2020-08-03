package me.kapsel;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class OknoLogowania extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2381337730012128037L;
	public static char[] nickname;
	public JTextField txtLogin;
	public JTextField txtPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OknoLogowania dialog = new OknoLogowania();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OknoLogowania() {
		setResizable(false);
		setTitle("Log-in screen");
		setBounds(100, 100, 440, 148);
		getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtLogin.setToolTipText("");
		txtLogin.setBounds(29, 19, 152, 25);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setName("");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtPassword.setToolTipText("");
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 75, 152, 25);
		getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("LOG-IN -->");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String username=txtLogin.getText();
			String password=txtPassword.getText();
			dispose();
			try {
				Bot.main(null, username,password);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			}
		});
		btnNewButton.setBounds(245, 25, 152, 59);
		getContentPane().add(btnNewButton);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(UIManager.getColor("CheckBox.background"));
		txtpnLogin.setText("login");
		txtpnLogin.setBounds(29, 0, 111, 20);
		getContentPane().add(txtpnLogin);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setText("password");
		txtpnPassword.setBackground(SystemColor.menu);
		txtpnPassword.setBounds(29, 56, 111, 20);
		getContentPane().add(txtpnPassword);
		
		
		
	}
}
