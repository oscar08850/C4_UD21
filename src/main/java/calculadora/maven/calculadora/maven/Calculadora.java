package calculadora.maven.calculadora.maven;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNum2;
	private JTextField textFieldNum1;
	private JLabel lblSigno;
	private	JLabel lblResultado;
	JButton button1, button2,button3,button4, button5, button6,button7,button8,button9,button0;
	JButton btnIgual, btnCe, buttonSuma, buttonResta, buttonDivision, buttonMultiplicacion, buttonSalir;

	int operacion = 0;
	
	boolean primerNumero = true;


	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(422, 76, 87, 17);
		contentPane.add(lblResultado);

		textFieldNum1 = new JTextField();
		textFieldNum1.setColumns(10);
		textFieldNum1.setBounds(34, 75, 114, 19);
		contentPane.add(textFieldNum1);

		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(290, 75, 114, 19);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);

		buttonSuma = new JButton("+");
		buttonSuma.setBounds(208, 173, 52, 31);
		contentPane.add(buttonSuma);

		buttonResta = new JButton("-");
		buttonResta.setBounds(208, 203, 52, 31);
		contentPane.add(buttonResta);

		buttonDivision = new JButton("/");
		buttonDivision.setBounds(208, 233, 52, 31);
		contentPane.add(buttonDivision);

		buttonMultiplicacion = new JButton("*");
		buttonMultiplicacion.setBounds(208, 263, 52, 31);
		contentPane.add(buttonMultiplicacion);

		buttonSalir = new JButton("Salir");
		buttonSalir.setBounds(371, 203, 70, 31);
		contentPane.add(buttonSalir);

		lblSigno = new JLabel("");
		lblSigno.setBounds(202, 62, 28, 31);
		contentPane.add(lblSigno);
		
		button1 = new JButton("1");
		button1.setBounds(23, 174, 42, 47);
		contentPane.add(button1);
		
		button2 = new JButton("2");
		button2.setBounds(68, 174, 42, 47);
		contentPane.add(button2);
		
		button3 = new JButton("3");
		button3.setBounds(116, 173, 42, 47);
		contentPane.add(button3);
		
		button4 = new JButton("4");
		button4.setBounds(23, 225, 42, 47);
		contentPane.add(button4);
		
		button5 = new JButton("5");
		button5.setBounds(68, 225, 42, 47);
		contentPane.add(button5);
		
		button6 = new JButton("6");
		button6.setBounds(116, 225, 42, 47);
		contentPane.add(button6);
		
		button7 = new JButton("7");
		button7.setBounds(23, 269, 42, 47);
		contentPane.add(button7);
		
		button8 = new JButton("8");
		button8.setBounds(68, 269, 42, 47);
		contentPane.add(button8);
		
		button9 = new JButton("9");
		button9.setBounds(116, 269, 42, 47);
		contentPane.add(button9);
		
		button0 = new JButton("0");
		button0.setBounds(23, 314, 42, 47);
		contentPane.add(button0);
		
		btnCe = new JButton("CE");
		btnCe.setBounds(208, 297, 52, 31);
		contentPane.add(btnCe);
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(208, 325, 52, 31);
		contentPane.add(btnIgual);

		
		
		
		// Botones de los números
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText());
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText());
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button2.getText();
				if (primerNumero) {
					System.out.println("TextfieldNUM1: " + textFieldNum1.getText() + "Numero: " + numero);
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button3.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button4.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button5.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button6.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button7.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button8.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button1.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = button0.getText();
				if (primerNumero) {
					textFieldNum1.setText(textFieldNum1.getText() + numero);
				}
				else {
					textFieldNum2.setText(textFieldNum2.getText() + numero);
				}
			}
		});
		
		
		
		
		
		
		
		// Operaciones botones
		
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNum1.setText("");
				textFieldNum2.setText("");
				lblResultado.setText("");
				primerNumero = true;
				operacion = 0;
			}
		});

		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("+");
				primerNumero = false;
				operacion = 1;
			}
		});

		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("-");
				primerNumero = false;
				operacion = 2;
			}
		});

		buttonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("*");
				primerNumero = false;
				operacion = 3;
			}
		});

		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSigno.setText("/");
				primerNumero = false;
				operacion = 4;
			}
		});
		
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int n1 = Integer.parseInt(textFieldNum1.getText());
					int n2 = Integer.parseInt(textFieldNum2.getText());
					String resultado = "";
					int resultadoInt = 0;
					switch (operacion) {
					case 1:
						resultadoInt = suma(n1,n2);
						resultado = "= " + Integer.toString(resultadoInt);
						break;
					case 2:
						resultadoInt = resta(n1,n2);
						resultado = "= " + Integer.toString(resultadoInt);
						break;
					case 3:
						resultadoInt = multiplicacion(n1,n2);
						resultado = "= " + Integer.toString(resultadoInt);
						break;
					case 4:
						resultadoInt = division(n1,n2);
						resultado = "= " + Integer.toString(resultadoInt);
						break;
					default:
						resultado = "";
						break;
					}
					lblResultado.setText(resultado);
					primerNumero = true;
				} catch (Exception e) {
					System.out.println("Error! Excepcion: " + e);
				}
			}
		});
		

		
		
		buttonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        System.exit(0);
			}
		});
		
	
	}
	
	public void borraTextfields() {
		textFieldNum1.setText("");
		textFieldNum2.setText("");
		lblSigno.setText("");
		lblResultado.setText("");		
	}
	
	public int suma(int n1, int n2) {
		return n1 + n2;
	}
	
	public int resta(int n1, int n2) {
		return n1-n2;
	}
	
	public int multiplicacion(int n1, int n2) {
		return n1*n2;
	}
	
	public int division(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}
}