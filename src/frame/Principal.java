package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1000000004524L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmCadastros = new JMenuItem("Cadastros");
		menuBar.add(mntmCadastros);
		
		JMenuItem mntmLocao = new JMenuItem("Loca\u00E7\u00E3o");
		menuBar.add(mntmLocao);
		
		JMenuItem mntmUtilidades = new JMenuItem("Utilidades");
		menuBar.add(mntmUtilidades);
		
		JMenuItem mntmRelatrios = new JMenuItem("Relat\u00F3rios");
		menuBar.add(mntmRelatrios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
