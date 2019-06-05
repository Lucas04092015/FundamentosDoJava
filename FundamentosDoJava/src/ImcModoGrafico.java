import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImcModoGrafico extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtImc;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImcModoGrafico frame = new ImcModoGrafico();
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
	public ImcModoGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 11, 48, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 36, 48, 14);
		contentPane.add(lblPeso);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(89, 8, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(89, 33, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(10, 83, 48, 14);
		contentPane.add(lblImc);
		
		txtImc = new JTextField();
		txtImc.setBounds(89, 80, 96, 20);
		contentPane.add(txtImc);
		txtImc.setColumns(10);
		
		JButton btnCalcular = new JButton("New button");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(ImcModoGrafico.class.getResource("/Icones/imc.png")));
		btnCalcular.setBounds(206, 7, 89, 73);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("New button");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(ImcModoGrafico.class.getResource("/Icones/limpar.png")));
		btnLimpar.setBounds(335, 8, 78, 72);
		contentPane.add(btnLimpar);
		
		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(ImcModoGrafico.class.getResource("/Icones/tabela_imc.jpg")));
		lblStatus.setBounds(20, 108, 404, 196);
		contentPane.add(lblStatus);
	}
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		double altura,peso,imc;
		altura = Double.parseDouble(txtAltura.getText().replace(",","."));
		peso =  Double.parseDouble(txtPeso.getText().replace(",","."));
		imc = peso / (altura*altura);
		txtImc.setText(formatador.format(imc));
		if (imc < 18.5 ) {
			//caminho para mudar a imagem do peso da balança
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/tabela_imc_abaixo.jpg")));
			
		} else  if (imc > 18.5 && imc < 25){
			//caminho para mudar a imagem do peso da balança
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/tabela_imc_normal.jpg")));
			
		} else if (imc > 25 && imc < 30){
			//caminho para mudar a imagem do peso da balança
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/tabela_imc_acima.jpg")));
			
		} else {
			//caminho para mudar a imagem do peso da balança
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/tabela_imc_obeso.jpg")));
		}

	}
	private void limpar() {
		txtAltura.setText(null);
		txtPeso.setText(null);
		txtImc.setText(null);
		lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/tabela_imc.jpg")));
	}
	
}
