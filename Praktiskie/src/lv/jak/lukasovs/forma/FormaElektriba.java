package lv.jak.lukasovs.forma;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lv.jak.lukasovs.forma.IerakstisanaFaila;



public class FormaElektriba extends JFrame {
	
	JLabel VardsL,UzvardsL,EpastsL,RekinaNrL,TalrunisL,PatēretājsL,ApekinsL,KilovataL,SummaL;
	
	JList<String>listedNAmes;
	JTextField VardsTF,UzvardsTF,EpastsTF,RekinaNrTF,TalrunisTF,SummaTF,PatēretājsTF;
	
	JButton AcceptBTN;
	JPanel panel;
	
	DefaultListModel<String> availableModel = new DefaultListModel<String>();
	DefaultListModel<String> selectedModel = new DefaultListModel<String>();

	
	
	
	public FormaElektriba() {
		setBounds(600, 150, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Elektrības apreķināšana");
		setResizable(false);
		
		init();
		
		setContentPane(panel);
		
	}
	
		
	    
	
	public void init() {
		
		
		
		panel = new JPanel(null);
		
		VardsL = new JLabel("Vārds");
		VardsL.setBounds(50, 10, 80, 30);
		
		VardsTF = new JTextField();
		VardsTF.setBounds(100, 10,160, 30);
		
		UzvardsL = new JLabel("Uzvārds");
		UzvardsL.setBounds(40, 50, 80, 30);
		
		UzvardsTF = new JTextField();
		UzvardsTF.setBounds(100, 50, 160, 30);
		
		EpastsL = new JLabel("E-pasts:");
		EpastsL.setBounds(40,90, 80, 30);
		
		EpastsTF = new JTextField();
		EpastsTF.setBounds(100, 90, 160, 30);
		
		RekinaNrL = new JLabel("Rēķina Nr:");
		RekinaNrL.setBounds(30,130, 90, 30);
		
		RekinaNrTF = new JTextField();
		RekinaNrTF.setBounds(100, 130, 160, 30);
		
		TalrunisL = new JLabel("Talrunis:");
		TalrunisL.setBounds(40,170, 80, 30);
		
		TalrunisTF = new JTextField();
		TalrunisTF.setBounds(100, 170, 160, 30);
		
		PatēretājsL = new JLabel("kWh:");
		PatēretājsL.setBounds(60,210, 80, 30);
		
		
		PatēretājsTF = new JTextField();
		PatēretājsTF.setBounds(100, 210, 160, 30);
		
		
		
		
		ApekinsL = new JLabel("Apreķina dati: ");
		ApekinsL.setBounds(10,250, 130, 30);
		
		
	
		SummaL = new JLabel("Summa:");
		SummaL.setBounds(43,270, 130, 30);
		SummaTF = new JTextField(" "+0);
		SummaTF.setBounds(100, 270, 130, 30);
		
		
		KilovataL = new JLabel("1 kWh = 0.05097"); 
		KilovataL.setBounds(120,290, 100, 30);
		
		AcceptBTN = new JButton("Accept");
		AcceptBTN.setBounds(100, 320, 100, 30);
		AcceptBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String s2 = PatēretājsTF.getText();	
				 int a = Integer.parseInt(s2);
				 double k = 0.05097;
				 int s3 = 0;
				 if(e.getSource()==AcceptBTN){  
			            
					double c = a*k;  
					String result=String.valueOf(c);  
					SummaTF.setText(result);  
				 }
				
				}	
	});
		
			
		
		
		
		panel.add(VardsL);panel.add(UzvardsL);panel.add(EpastsL);panel.add(RekinaNrL);panel.add(TalrunisL);
		panel.add(PatēretājsL);panel.add(ApekinsL);panel.add(KilovataL);panel.add(SummaL);
		
		panel.add(AcceptBTN);
		
		panel.add(VardsTF);panel.add(UzvardsTF);panel.add(EpastsTF);panel.add(RekinaNrTF);panel.add(TalrunisTF);
		panel.add(PatēretājsTF);panel.add(SummaTF);
		
		
		
	}
	
		public void actionPerformed(ActionEvent e){
			
			
			
			if(e.getSource() == AcceptBTN) {
			String text = "First Name:"+ VardsTF.getText()
			+"\nLast Name:"+ UzvardsTF.getText()
			+"\nE-Mail"+ EpastsTF.getText()
			+"\nReķina Nr:"+RekinaNrTF.getText()
			+"\nTalrunis:"+TalrunisTF.getText()
			+"\nkWh:"+PatēretājsTF.getText()
			+"\nSumma :"+SummaTF.getText();
			
			IerakstisanaFaila.writeToFile("Formas.txt", text );
			
			
		
		}
	else if(e.getSource()==AcceptBTN) {
		System.exit(0);
	}
	
		
		}
		
		
}

