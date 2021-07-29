import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.SwingConstants;

public class hesapmakinesi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesapmakinesi frame = new hesapmakinesi();
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
	private double sayi,sonuc;
	private int yapilacakislem;
	private JTextField txtHesapMakinesi;
	private JTextField txtbasarili;
	
	public void hesapla()
	{
		switch(yapilacakislem)
		{
		case 1:
			sonuc = sayi + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;
		
		case 2:
			sonuc = sayi - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;
			
		case 3:
			sonuc = sayi / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;	
			
		case 4:
			sonuc = sayi * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;			
		case 5:
			sonuc = Math.pow(sayi,Double.parseDouble(textField.getText()));
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;	
		case 6:
			sonuc = Math.sqrt(sayi);
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;		
		case 7:
			sonuc = sayi % Double.parseDouble(textField.getText());
			textField.setText(Double.toString(sonuc));
			txtbasarili.setText("Baaþrýyla Hesaplandý.");
			break;	
		}
		
	}
	public hesapmakinesi() {
		setResizable(false);
		JButton btnArti = new JButton("+");
		btnArti.setEnabled(false);
		btnArti.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnArti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 1;
				textField.setText("");
				
			}
		});
		btnArti.setForeground(new Color(255, 255, 0));
		btnArti.setBackground(new Color(128, 0, 0));
		
		JButton btnEksi = new JButton("-");
		btnEksi.setEnabled(false);
		btnEksi.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEksi.setForeground(new Color(255, 255, 0));
		btnEksi.setBackground(new Color(128, 0, 0));
		btnEksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 2;
				textField.setText("");
			}
		});
		
		JButton btnBolme = new JButton("/");
		btnBolme.setEnabled(false);
		btnBolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 3;
				textField.setText("");
			}
		});
		btnBolme.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBolme.setForeground(new Color(255, 255, 0));
		btnBolme.setBackground(new Color(128, 0, 0));
		
		JButton btnCarpma = new JButton("*");
		btnCarpma.setEnabled(false);
		btnCarpma.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCarpma.setForeground(new Color(255, 255, 0));
		btnCarpma.setBackground(new Color(128, 0, 0));
		btnCarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 4;
				textField.setText("");
			}
		});
		
		JButton btnEsittir = new JButton("=");
		btnEsittir.setEnabled(false);
		btnEsittir.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEsittir.setForeground(new Color(128, 0, 0));
		btnEsittir.setBackground(new Color(255, 255, 0));
		btnEsittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesapla();
			}
		});
		JButton btnus = new JButton("^");
		btnus.setEnabled(false);
		btnus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 5;
				textField.setText("");
			}
		});
		btnus.setForeground(Color.YELLOW);
		btnus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnus.setBackground(new Color(128, 0, 0));
		
		JButton btnkok = new JButton("\u221A\u00AF");
		btnkok.setEnabled(false);
		btnkok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 6;
				//textField.setText("");
			}
		});
		btnkok.setForeground(Color.YELLOW);
		btnkok.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnkok.setBackground(new Color(128, 0, 0));
		
		JButton btnyuzde = new JButton("%");
		btnyuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(textField.getText());
				yapilacakislem = 7;
				textField.setText("");
				
			}
		});
		btnyuzde.setEnabled(false);
		btnyuzde.setForeground(Color.YELLOW);
		btnyuzde.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnyuzde.setBackground(new Color(128, 0, 0));
		JButton btnCLEAR = new JButton("CLEAR");
		btnCLEAR.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnCLEAR.setEnabled(false);
		btnCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				txtbasarili.setText("");
			}
		});
		
		JButton btnNokta = new JButton(".");
		btnNokta.setEnabled(false);
		btnNokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		
		JButton btnON = new JButton("ON");
		btnON.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);			
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btnNokta.setEnabled(true);
				
				btnCarpma.setEnabled(true);
				btnBolme.setEnabled(true);
				btnEksi.setEnabled(true);
				btnArti.setEnabled(true);
				btnEsittir.setEnabled(true);
				btnkok.setEnabled(true);
				btnus.setEnabled(true);
				btnyuzde.setEnabled(true);
	
				btnCLEAR.setEnabled(true);
			}
		});
		
		
		
		JButton btnOFF = new JButton("OFF");
		btnOFF.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);				
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btnNokta.setEnabled(false);
				
				btnCarpma.setEnabled(false);
				btnBolme.setEnabled(false);
				btnEksi.setEnabled(false);
				btnArti.setEnabled(false);
				btnEsittir.setEnabled(false);
	
				btnCLEAR.setEnabled(false);
				
				
				
				
			}
		});
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		
		
		
		txtHesapMakinesi = new JTextField();
		txtHesapMakinesi.setForeground(new Color(255, 255, 0));
		txtHesapMakinesi.setBackground(new Color(128, 0, 0));
		txtHesapMakinesi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHesapMakinesi.setText("Hesap Makinesi");
		txtHesapMakinesi.setColumns(10);
		
		txtbasarili = new JTextField();
		txtbasarili.setBackground(new Color(0, 0, 0));
		txtbasarili.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtbasarili.setHorizontalAlignment(SwingConstants.CENTER);
		txtbasarili.setForeground(new Color(255, 0, 0));
		txtbasarili.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnON, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(btn7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNokta, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
												.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(btnOFF, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCLEAR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(btnus, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnEsittir, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnBolme, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnArti, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
										.addComponent(btnkok, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnyuzde, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(btnEksi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnCarpma, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addComponent(txtbasarili, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtHesapMakinesi, 179, 179, 179))))
					.addGap(35))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtHesapMakinesi)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnON, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCLEAR, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnOFF, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
									.addGap(18))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnArti, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnEksi, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBolme, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCarpma, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnkok, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnyuzde, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnNokta, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnEsittir, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(161)
							.addComponent(btnus, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtbasarili, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
