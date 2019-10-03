package clips.proyecto.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clips.proyecto.control.Metodos;
import net.sf.clipsrules.jni.Environment;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtedad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		
		Metodos m= new Metodos();
		Environment clips;
		clips = new Environment();
//		clips.load("TestProyecto.clp");


		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTestMedirIq = new JLabel("Test Medir IQ");
		lblTestMedirIq.setBounds(447, 6, 126, 24);
		contentPane.add(lblTestMedirIq);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(16, 43, 61, 24);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(16, 71, 61, 24);
		contentPane.add(lblEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 42, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setBounds(102, 71, 130, 26);
		contentPane.add(txtedad);
		txtedad.setColumns(10);
		
		JLabel lblPregunta = new JLabel("1. ¿Cuál de las palabras mostradas a continuación es la más cercana en significado a la palabra \"tranquilizador\"?");
		lblPregunta.setBounds(6, 120, 713, 16);
		contentPane.add(lblPregunta);
		
		JRadioButton rdbtnCompasivo = new JRadioButton("Compasivo");
		rdbtnCompasivo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			m.RespuestaP1("compasivo");	
				
			}
		});
		rdbtnCompasivo.setBounds(16, 151, 115, 23);
		contentPane.add(rdbtnCompasivo);
		
		JRadioButton rdbtnReconfortante = new JRadioButton("Reconfortante");
		rdbtnReconfortante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			m.RespuestaP1("reconfortante");	
				
			}
		});
		rdbtnReconfortante.setBounds(138, 151, 126, 23);
		contentPane.add(rdbtnReconfortante);
		
		JRadioButton rdbtnExplicativo = new JRadioButton("Explicativo");
		rdbtnExplicativo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP1("explicativo");
			}
		});
		rdbtnExplicativo.setBounds(274, 151, 106, 23);
		contentPane.add(rdbtnExplicativo);
		
		JRadioButton rdbtnEntrometido = new JRadioButton("Entrometido");
		rdbtnEntrometido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				m.RespuestaP1("entrometido");
				
			}
		});
		rdbtnEntrometido.setBounds(387, 151, 141, 23);
		contentPane.add(rdbtnEntrometido);
		
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnCompasivo);
		grupo1.add(rdbtnReconfortante);
		grupo1.add(rdbtnExplicativo);
		grupo1.add(rdbtnEntrometido);
		
		
		
		JLabel lblqueNumero = new JLabel("2. ¿Qué número sigue por lógica a esta serie? 4 6 9 6 14 6 ...");
		lblqueNumero.setBounds(6, 186, 713, 16);
		contentPane.add(lblqueNumero);
		
		JRadioButton rdbtnA = new JRadioButton("A:7");
		rdbtnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP2("A7");
				
			}
		});
		rdbtnA.setBounds(16, 217, 115, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B:17");
		rdbtnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP2("B17");
			}
		});
		rdbtnB.setBounds(138, 217, 130, 23);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C:19");
		rdbtnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP2("C19");
			}
		});
		rdbtnC.setBounds(274, 217, 106, 23);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D:18");
		rdbtnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP2("D18");
			}
		});
		rdbtnD.setBounds(387, 217, 141, 23);
		contentPane.add(rdbtnD);
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtnA);
		grupo2.add(rdbtnB);
		grupo2.add(rdbtnC);
		grupo2.add(rdbtnD);
		
		
		JLabel lblcualDe = new JLabel("3. ¿Cuál de las palabras de más abajo expresa el significado opuesto a la palabra \"duro\"?");
		lblcualDe.setBounds(6, 252, 713, 16);
		contentPane.add(lblcualDe);
		
		JRadioButton rdbtnCobarde = new JRadioButton("cobarde");
		rdbtnCobarde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP3("cobarde");
			}
		});
		rdbtnCobarde.setBounds(16, 283, 115, 23);
		contentPane.add(rdbtnCobarde);
		
		JRadioButton rdbtnEstirado = new JRadioButton("estirado");
		rdbtnEstirado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP3("estirado");
			}
		});
		rdbtnEstirado.setBounds(138, 283, 115, 23);
		contentPane.add(rdbtnEstirado);
		
		JRadioButton rdbtnFuerte = new JRadioButton("fuerte");
		rdbtnFuerte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP3("fuerte");
			}
		});
		rdbtnFuerte.setBounds(274, 283, 101, 23);
		contentPane.add(rdbtnFuerte);
		
		JRadioButton rdbtnDebil = new JRadioButton("débil");
		rdbtnDebil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP3("debil");
			}
		});
		rdbtnDebil.setBounds(387, 283, 141, 23);
		contentPane.add(rdbtnDebil);
		
		
		ButtonGroup grupo3 = new ButtonGroup();
		grupo3.add(rdbtnCobarde);
		grupo3.add(rdbtnEstirado);
		grupo3.add(rdbtnFuerte);
		grupo3.add(rdbtnDebil);
		
		
		JLabel lblAguaEs = new JLabel("4. Agua es a tubería lo que ... es a cable.");
		lblAguaEs.setBounds(6, 318, 713, 16);
		contentPane.add(lblAguaEs);
		
		JRadioButton rdbtnAlambre = new JRadioButton("alambre");
		rdbtnAlambre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP4("alambre");
			}
		});
		rdbtnAlambre.setBounds(16, 349, 115, 23);
		contentPane.add(rdbtnAlambre);
		
		JRadioButton rdbtnCalor = new JRadioButton("calor");
		rdbtnCalor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP4("calor");
			}
		});
		rdbtnCalor.setBounds(138, 349, 106, 23);
		contentPane.add(rdbtnCalor);
		
		JRadioButton rdbtnElectricidad = new JRadioButton("electricidad");
		rdbtnElectricidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP4("electricidad");
			}
		});
		rdbtnElectricidad.setBounds(274, 349, 106, 23);
		contentPane.add(rdbtnElectricidad);
		
		JRadioButton rdbtnGas = new JRadioButton("gas");
		rdbtnGas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP4("gas");
			}
		});
		rdbtnGas.setBounds(387, 349, 141, 23);
		contentPane.add(rdbtnGas);
		
		ButtonGroup grupo4 = new ButtonGroup();
		grupo4.add(rdbtnAlambre);
		grupo4.add(rdbtnCalor);
		grupo4.add(rdbtnElectricidad);
		grupo4.add(rdbtnGas);
		
		JLabel lblquePalabra = new JLabel("5. ¿Qué palabra significa \"expresión de disconformidad\"?");
		lblquePalabra.setBounds(6, 384, 713, 16);
		contentPane.add(lblquePalabra);
		
		JRadioButton rdbtnQueja = new JRadioButton("queja");
		rdbtnQueja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP5("queja");
			}
		});
		rdbtnQueja.setBounds(16, 415, 115, 23);
		contentPane.add(rdbtnQueja);
		
		JRadioButton rdbtnInjusticia = new JRadioButton("injusticia");
		rdbtnInjusticia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP5("injusticia");
			}
		});
		rdbtnInjusticia.setBounds(138, 415, 126, 23);
		contentPane.add(rdbtnInjusticia);
		
		JRadioButton rdbtnFutil = new JRadioButton("fútil");
		rdbtnFutil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP5("futil");
			}
		});
		rdbtnFutil.setBounds(274, 415, 101, 23);
		contentPane.add(rdbtnFutil);
		
		JRadioButton rdbtnPecado = new JRadioButton("pecado");
		rdbtnPecado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP5("pecado");
			}
		});
		rdbtnPecado.setBounds(387, 415, 141, 23);
		contentPane.add(rdbtnPecado);
		
		
		ButtonGroup grupo5 = new ButtonGroup();
		grupo5.add(rdbtnQueja);
		grupo5.add(rdbtnInjusticia);
		grupo5.add(rdbtnFutil);
		grupo5.add(rdbtnPecado);
		
		
		JLabel lblqueAnimal = new JLabel("6. ¿Qué animal no encaja con los demás?");
		lblqueAnimal.setBounds(6, 450, 713, 16);
		contentPane.add(lblqueAnimal);
		
		JRadioButton rdbtnAlugia = new JRadioButton("ALUGIA");
		rdbtnAlugia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP6("ALUGIA");
				
			}
		});
		rdbtnAlugia.setBounds(16, 481, 115, 23);
		contentPane.add(rdbtnAlugia);
		
		JRadioButton rdbtnObllaca = new JRadioButton("OBLLACA");
		rdbtnObllaca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			m.RespuestaP6("OBLLACA");	
			}
		});
		rdbtnObllaca.setBounds(138, 481, 126, 23);
		contentPane.add(rdbtnObllaca);
		
		JRadioButton rdbtnTreiub = new JRadioButton("TREIUB");
		rdbtnTreiub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP6("TREIUB");
			}
		});
		rdbtnTreiub.setBounds(274, 481, 106, 23);
		contentPane.add(rdbtnTreiub);
		
		JRadioButton rdbtnLompaa = new JRadioButton("LOMPAA");
		rdbtnLompaa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP6("LOMPAA");
			}
		});
		rdbtnLompaa.setBounds(387, 481, 141, 23);
		contentPane.add(rdbtnLompaa);
		
		ButtonGroup grupo6 = new ButtonGroup();
		grupo6.add(rdbtnAlugia);
		grupo6.add(rdbtnObllaca);
		grupo6.add(rdbtnTreiub);
		grupo6.add(rdbtnLompaa);
		
		
		
		JLabel lblSeleccionaLa = new JLabel("7. Selecciona la palabra que no encaja con las restantes");
		lblSeleccionaLa.setBounds(6, 516, 713, 16);
		contentPane.add(lblSeleccionaLa);
		
		JRadioButton rdbtnEvalcl = new JRadioButton("EVALCL");
		rdbtnEvalcl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP7("EVALCL");
			}
		});
		rdbtnEvalcl.setBounds(16, 547, 115, 23);
		contentPane.add(rdbtnEvalcl);
		
		JRadioButton rdbtnOras = new JRadioButton("ORAS");
		rdbtnOras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP7("ORAS");
			}
		});
		rdbtnOras.setBounds(138, 547, 126, 23);
		contentPane.add(rdbtnOras);
		
		JRadioButton rdbtnRtigarmaa = new JRadioButton("RTIGARMAA");
		rdbtnRtigarmaa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP7("RTIGARMAA");
			}
		});
		rdbtnRtigarmaa.setBounds(274, 547, 115, 23);
		contentPane.add(rdbtnRtigarmaa);
		
		JRadioButton rdbtnCisuf = new JRadioButton("CISUF");
		rdbtnCisuf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			m.RespuestaP7("CISUF");	
				
			}
		});
		rdbtnCisuf.setBounds(387, 547, 141, 23);
		contentPane.add(rdbtnCisuf);
		
		ButtonGroup grupo7 = new ButtonGroup();
		grupo7.add(rdbtnEvalcl);
		grupo7.add(rdbtnOras);
		grupo7.add(rdbtnRtigarmaa);
		grupo7.add(rdbtnCisuf);
		
		
		
		JLabel lblcualDe_1 = new JLabel("8. ¿Cuál de la siguientes palabras no encaja con las restantes?");
		lblcualDe_1.setBounds(6, 582, 713, 16);
		contentPane.add(lblcualDe_1);
		
		JRadioButton rdbtnLobo = new JRadioButton("LOBO");
		rdbtnLobo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP8("LOBO");
			}
		});
		rdbtnLobo.setBounds(16, 613, 115, 23);
		contentPane.add(rdbtnLobo);
		
		JRadioButton rdbtnPuma = new JRadioButton("PUMA");
		rdbtnPuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP8("PUMA");
			}
		});
		rdbtnPuma.setBounds(138, 613, 126, 23);
		contentPane.add(rdbtnPuma);
		
		JRadioButton rdbtnTigre = new JRadioButton("TIGRE");
		rdbtnTigre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				m.RespuestaP8("TIGRE");
			}
		});
		rdbtnTigre.setBounds(274, 613, 106, 23);
		contentPane.add(rdbtnTigre);
		
		JRadioButton rdbtnGuepardo = new JRadioButton("GUEPARDO");
		rdbtnGuepardo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.RespuestaP8("GUEPARDO");
			}
		});
		rdbtnGuepardo.setBounds(387, 613, 141, 23);
		contentPane.add(rdbtnGuepardo);
		
		
		ButtonGroup grupo8 = new ButtonGroup();
		grupo8.add(rdbtnLobo);
		grupo8.add(rdbtnPuma);
		grupo8.add(rdbtnTigre);
		grupo8.add(rdbtnGuepardo);
		

		
		JButton btnTest = new JButton("Test");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				
				
				clips.load("TestProyecto.clp");
				
				String nombre=txtNombre.getText();
				String edad=txtedad.getText();
				String res1=m.mostrar1();
				String res2=m.mostrar2();
				String res3=m.mostrar3();
				String res4=m.mostrar4();
				String res5=m.mostrar5();
				String res6=m.mostrar6();
				String res7=m.mostrar7();
				String res8=m.mostrar8();
				
				System.out.println(nombre);
				System.out.println(edad);
				System.out.println(res1);
				System.out.println(res2);
				System.out.println(res3);
				System.out.println(res4);
				System.out.println(res5);
				System.out.println(res6);
				System.out.println(res7);
				System.out.println(res8);
				
				String datos="(assert (testInteligencia (edad "+edad+")(nombre \" "+nombre+ "\")(pregunta1 "+res1+")(pregunta2 "+res2+")(pregunta3 "+res3+")(pregunta4 "+res4+")(pregunta5 "+res5+")(pregunta6 "+res6+")(pregunta7 "+res7+")(pregunta8 "+res8+")))";
				System.out.println(datos);
				clips.reset();
				clips.eval(datos);
				clips.run(); 
				clips.destroy();
				
				
				File archivo = new File ("Respuestas/ResultadoTotal.txt");
				FileReader fr = null;
				try {
					fr = new FileReader (archivo);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedReader br = new BufferedReader(fr);
				
				try {
					String linea = br.readLine();
					System.out.println(linea);
					
					
					JOptionPane.showMessageDialog(null, linea);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				clips.clear();
	
				
			}
		});
		btnTest.setBounds(384, 664, 189, 44);
		contentPane.add(btnTest);
	}

}
