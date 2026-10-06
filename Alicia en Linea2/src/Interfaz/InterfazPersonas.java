package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;

public class InterfazPersonas extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public InterfazPersonas() {
		setVisible(false);
		setBackground(Color.GREEN);
		setBounds(100, 100, 800, 500);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("PERSONAJE");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -229, SpringLayout.EAST, this);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona un personaje:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 112, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 55, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -322, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 238, SpringLayout.WEST, this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 112, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner, -322, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 16, SpringLayout.WEST, spinner);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -19, SpringLayout.NORTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, spinner, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, spinner, 310, SpringLayout.WEST, this);
		add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setVisible(false);
		add(lblNewLabel_2);
		
		
		JButton btnNewButton = new JButton("Esta en el mundo marravilla?");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 12, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 68, SpringLayout.EAST, btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_2.setText("");
				
				
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -187, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -421, SpringLayout.EAST, this);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(btnNewButton);
		
		JButton btnConfirmarFuncin = new JButton("Embellecer");
		springLayout.putConstraint(SpringLayout.NORTH, btnConfirmarFuncin, 31, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnConfirmarFuncin, -252, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 26, SpringLayout.SOUTH, btnConfirmarFuncin);
		springLayout.putConstraint(SpringLayout.WEST, btnConfirmarFuncin, 55, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnConfirmarFuncin, -503, SpringLayout.EAST, this);
		btnConfirmarFuncin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(btnConfirmarFuncin);
		
		JButton btnEsLindo = new JButton("Es lindo?");
		springLayout.putConstraint(SpringLayout.NORTH, btnEsLindo, 29, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnEsLindo, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEsLindo, -119, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnEsLindo, 122, SpringLayout.WEST, lblNewLabel_1);
		add(btnEsLindo);
		
		JButton btnEsNormal = new JButton("Es normal?");
		springLayout.putConstraint(SpringLayout.NORTH, btnEsNormal, 22, SpringLayout.SOUTH, btnEsLindo);
		springLayout.putConstraint(SpringLayout.WEST, btnEsNormal, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEsNormal, 129, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnEsNormal, 0, SpringLayout.EAST, btnEsLindo);
		add(btnEsNormal);

	}
}
