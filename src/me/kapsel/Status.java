package me.kapsel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Status extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4369589628734065869L;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Status() {
		getContentPane().setLayout(null);
		{
			JTextPane txtpnTrwaPraca = new JTextPane();
			txtpnTrwaPraca.setBounds(149, 21, 155, 37);
			txtpnTrwaPraca.setBackground(SystemColor.menu);
			txtpnTrwaPraca.setEditable(false);
			txtpnTrwaPraca.setFont(new Font("Tahoma", Font.PLAIN, 25));
			txtpnTrwaPraca.setText("Trwa praca...");
			getContentPane().add(txtpnTrwaPraca);
		}
		{
			JButton btnNewButton = new JButton("Zako\u0144cz");
			btnNewButton.setBounds(136, 165, 168, 70);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
			getContentPane().add(btnNewButton);
		}
	}

}
