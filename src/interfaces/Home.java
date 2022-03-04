package interfaces;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

	private JTextField field_userName;
	private JTextField field_password;
	int xx, xy;

	public Home() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JPanel left_bg = new JPanel();
		left_bg.setBackground(Color.DARK_GRAY);
		left_bg.setBounds(0, 0, 402, 519);
		getContentPane().add(left_bg);
		left_bg.setLayout(null);

		JLabel img_bg = new JLabel("");
		img_bg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		img_bg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Home.this.setLocation(x - xx, y - xy);
			}
		});
		img_bg.setVerticalAlignment(SwingConstants.TOP);
		img_bg.setIcon(new ImageIcon(Home.class.getResource("/images/pexels-pratikxox-3222683.jpg")));
		img_bg.setBounds(0, 0, 402, 519);
		left_bg.add(img_bg);

		Button connexion = new Button("Connexion");
		connexion.setForeground(SystemColor.controlLtHighlight);
		connexion.setBackground(new Color(241, 57, 83));
		connexion.setFont(new Font("Arial", Font.PLAIN, 12));
		connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		connexion.setBounds(499, 324, 190, 41);
		getContentPane().add(connexion);

		field_userName = new JTextField();
		field_userName.setBounds(447, 135, 274, 41);
		getContentPane().add(field_userName);
		field_userName.setColumns(10);

		JSeparator separator_userName = new JSeparator();
		separator_userName.setBounds(447, 174, 274, 2);
		getContentPane().add(separator_userName);

		JLabel userName = new JLabel("Identifiant");
		userName.setBounds(447, 103, 60, 22);
		getContentPane().add(userName);

		JLabel password = new JLabel("Mot de passe");
		password.setBounds(447, 203, 92, 22);
		getContentPane().add(password);

		field_password = new JTextField();
		field_password.setColumns(10);
		field_password.setBounds(447, 235, 274, 41);
		getContentPane().add(field_password);

		JSeparator separator_password = new JSeparator();
		separator_password.setBounds(447, 274, 274, 2);
		getContentPane().add(separator_password);

		JLabel btn_close = new JLabel("X");
		btn_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btn_close.setForeground(new Color(241, 57, 83));
		btn_close.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_close.setBounds(757, 10, 29, 41);
		getContentPane().add(btn_close);
		setResizable(false);
		setPreferredSize(new Dimension(800, 500));
	}

//	public class ConseillerView {
//		public void printConseiller(String nomConseiller, String prenomConseiller, String numeroTel, String adresse, String civilite, String login, String passeword) {
//			System.out.println(nomConseiller);
//			System.out.println(prenomConseiller);
//			System.out.println(numeroTel);
//			System.out.println(nomConseiller);
//			System.out.println(nomConseiller);
//			System.out.println(nomConseiller);
//		}
//	}
}
