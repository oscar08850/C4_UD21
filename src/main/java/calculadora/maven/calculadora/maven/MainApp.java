package calculadora.maven.calculadora.maven;

import java.awt.EventQueue;


/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora calculadora = new Calculadora();
					calculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
