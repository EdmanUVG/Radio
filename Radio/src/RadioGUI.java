import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class RadioGUI {

	private JFrame frame;
	private JLabel lblRadioFrecuencias;
	private JRadioButton rdbtnFm;
	private JRadioButton rdbtnAm;
	private ButtonGroup group;
	private JButton btnAvanzar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioGUI window = new RadioGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, "name_256784339772400");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(194, 166, 518, 113);
		panel_1.setBackground(new Color(251, 251, 251));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFm = new JLabel("102.35");
		lblFm.setHorizontalAlignment(SwingConstants.CENTER);
		lblFm.setFont(new Font("Arial", Font.BOLD, 30));
		lblFm.setBounds(211, 33, 179, 49);
		panel_1.add(lblFm);
		
		lblRadioFrecuencias = new JLabel("");
		lblRadioFrecuencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadioFrecuencias.setFont(new Font("Arial", Font.PLAIN, 30));
		lblRadioFrecuencias.setBounds(33, 33, 93, 49);
		panel_1.add(lblRadioFrecuencias);
		
		JLabel lblNewLabel = new JLabel("Radio UVG");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 30, 826, 36);
		panel.add(lblNewLabel);
		
		JButton button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(35, 316, 55, 36);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(100, 316, 55, 36);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBounds(165, 316, 55, 36);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBounds(230, 316, 55, 36);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.setBounds(295, 316, 55, 36);
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.setBounds(360, 316, 55, 36);
		panel.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.setBounds(425, 316, 55, 36);
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.setBounds(490, 316, 55, 36);
		panel.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.setBounds(555, 316, 55, 36);
		panel.add(button_8);
		
		JButton button_9 = new JButton("10");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_9.setBounds(620, 316, 55, 36);
		panel.add(button_9);
		
		JButton button_10 = new JButton("12");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.setBounds(750, 316, 55, 36);
		panel.add(button_10);
		
		JButton button_11 = new JButton("11");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_11.setBounds(685, 316, 55, 36);
		panel.add(button_11);
		
		rdbtnFm = new JRadioButton("FM");
		rdbtnFm.setSelected(true);
		rdbtnFm.setBackground(Color.WHITE);
		rdbtnFm.setBounds(194, 112, 109, 23);
		panel.add(rdbtnFm);
		
		rdbtnAm = new JRadioButton("AM");
		rdbtnAm.setSelected(true);
		rdbtnAm.setBackground(Color.WHITE);
		rdbtnAm.setBounds(194, 136, 109, 23);
		panel.add(rdbtnAm);
		
		group = new ButtonGroup();
		group.add(rdbtnFm);
		group.add(rdbtnAm);
			
		
		JLabel lblNewLabel_1 = new JLabel("Frecuencia:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(194, 96, 76, 14);
		panel.add(lblNewLabel_1);
		
		btnAvanzar = new JButton("Avanzar");
		btnAvanzar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAvanzar.setBounds(77, 203, 96, 45);
		panel.add(btnAvanzar);
		frame.setBounds(100, 100, 857, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if(rdbtnFm.isSelected()) {
			lblRadioFrecuencias.setText("FM");
		} else {
			lblRadioFrecuencias.setText("AM");
		}
		
		rdbtnFm.addActionListener(new MiListener());
		rdbtnAm.addActionListener(new MiListener());
		btnAvanzar.addActionListener(new MiListener());
		
	}
	
	public class MiListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == rdbtnFm) {
				rdbtnFm.setSelected(true);
//				rdbtnAm.setSelected(false);
				lblRadioFrecuencias.setText("FM");
				
			}
			if(e.getSource() == rdbtnAm) {
				rdbtnAm.setSelected(true);
				
				lblRadioFrecuencias.setText("AM");
			}
			
			if(e.getSource() == btnAvanzar) {
				// Se usa la otra clase
			}
		}
		
	}
}




















