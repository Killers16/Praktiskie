package lv.jak.lukasovs.forma;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormaElektriba extends JFrame {
	
	JLabel VardsL,UzvardsL,EpastsL,RekinaNrL,TalrunisL,PatēretājsL,ApekinsL;
	
	JList<String>listedNAmes;
	JTextField VardsTF,UzvardsTF,EpastsTF,RekinaNrTF,TalrunisTF,PatēretājsTF,ApekinsTF;
	JButton addBTN,ClearBTN;
	JPanel panel;
	
	DefaultListModel<String>model = new DefaultListModel<String>();
	
	public FormaElektriba() {
		setBounds(600, 150, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Elektrības apreķināšana");
		setResizable(false);
		
		init();
		
		setContentPane(panel);
		
	}
	public void init() {
		panel = new JPanel(null);
		
		VardsL = new JLabel("Vārds");
		VardsL.setBounds(10, 10, 80, 20);
		
		VardsTF = new JTextField();
		VardsTF.setBounds(90, 10, 80, 20);
		
		UzvardsL = new JLabel("Uzvārds");
		UzvardsL.setBounds(10, 40, 80, 30);
		
		UzvardsTF = new JTextField();
		VardsTF.setBounds(50, 10, 120, 20);
		
		RekinaNrL = new JLabel("Rēķina Nr -");
		RekinaNrL.setBounds(10,70, 80, 30);
		
		RekinaNrTF = new JTextField();
		RekinaNrTF.setBounds(90, 70, 80, 20);
		
		EpastsL = new JLabel("E-pasts:");
		EpastsL.setBounds(10,100, 80, 30);
		
		EpastsTF = new JTextField();
		EpastsTF.setBounds(90, 100, 80, 20);
		
		TalrunisL = new JLabel("Talrunis :");
		TalrunisL.setBounds(10,120, 80, 30);
		
		TalrunisTF = new JTextField();
		TalrunisTF.setBounds(90, 120, 80, 20);
		
		PatēretājsL = new JLabel("kWh:");
		PatēretājsL.setBounds(10,150, 80, 30);
		
		PatēretājsTF = new JTextField();
		PatēretājsTF.setBounds(90, 150, 80, 20);
		
		ApekinsL = new JLabel("Apreķina dati:");
		ApekinsL.setBounds(10,180, 80, 30);
		
		ApekinsTF = new JTextField();
		ApekinsTF.setBounds(90, 180, 80, 20);
		
		panel.add(VardsL);panel.add(UzvardsL);panel.add(RekinaNrL);panel.add(EpastsL);
		panel.add(TalrunisL);panel.add(PatēretājsL);panel.add(ApekinsL);
		
		panel.add(VardsTF);panel.add(UzvardsTF);panel.add(RekinaNrTF);panel.add(EpastsTF);
		panel.add(TalrunisTF);panel.add(PatēretājsTF);panel.add(ApekinsTF);
	}


	
}
