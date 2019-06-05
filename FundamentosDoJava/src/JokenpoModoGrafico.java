import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class JokenpoModoGrafico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokenpoModoGrafico frame = new JokenpoModoGrafico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    int jogador = 0;
    private JLabel lblComputador;
    private JLabel lblResultado;
	/**
	 * Create the frame.
	 */
	public JokenpoModoGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPapel = new JButton("");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogo();
			}
		});
		btnPapel.setIcon(new ImageIcon(JokenpoModoGrafico.class.getResource("/IconesJokenpo/papel.png")));
		btnPapel.setBounds(149, 11, 81, 86);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogo();
			}
		});
		btnTesoura.setIcon(new ImageIcon(JokenpoModoGrafico.class.getResource("/IconesJokenpo/tesoura.png")));
		btnTesoura.setBounds(292, 11, 81, 86);
		contentPane.add(btnTesoura);
		
		JButton btnPedra = new JButton("");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogo();
			}
		});
		btnPedra.setIcon(new ImageIcon(JokenpoModoGrafico.class.getResource("/IconesJokenpo/pedra.png")));
		btnPedra.setBounds(10, 11, 81, 86);
		contentPane.add(btnPedra);
		
		lblComputador = new JLabel("");
		lblComputador.setIcon(new ImageIcon(JokenpoModoGrafico.class.getResource("/IconesJokenpo/pc.png")));
		lblComputador.setBounds(108, 189, 194, 166);
		contentPane.add(lblComputador);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(97, 139, 205, 36);
		contentPane.add(lblResultado);
	}
 private void jogo () {
	 int computador = (int)(Math.random() * 3 + 1);
	 System.out.println(jogador);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("IconesJokenpo/pcpedra.png")));
			break;
			
		case 2:
			System.out.println("Computador escolheu PAPEL");
			lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("IconesJokenpo/pcpapel.png")));
			break;
			
		case 3:
			System.out.println("Computador escolheu TESOURA");
			lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("IconesJokenpo/pctesoura.png")));
			break;
		}
		//lógica para determinar o vencedor ou empate
		if (jogador == computador){
			System.out.println("EMPATE");
			lblResultado.setText("EMPATE");
		}else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
				System.out.println("JOGADOR VENCEU");
				lblResultado.setText("JOGADOR VENCEU");
			} else {
				System.out.print("COMPUTADOR VENCEU");
				lblResultado.setText("COMPUTADOR VENCEU");
		}
 }	

 }
 }
 
