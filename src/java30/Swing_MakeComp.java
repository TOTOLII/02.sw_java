package java30;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing_MakeComp extends JFrame implements ActionListener{ //스윙은 앞에 J가 붙는다.

	JPanel jPanel;
	JLabel jLabel;
	JButton jButton;
	JButton jButtonExit;
	JTextField jTextField;
	JComboBox<String> jComboBox;
	JCheckBox jCheckBox;
	String[] items = {"A", "B", "C"};
	JLabel jLabelBlank;
	
	public Swing_MakeComp() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit_on_Close = 윈도우 창에 빨간색 x버튼을 누르면 종료하라는 뜻임.
		jPanel = (JPanel)getContentPane();
		jPanel.setLayout(new FlowLayout());
		jLabel = new JLabel("Label");
		jButton = new JButton("Button");
		jTextField = new JTextField(20);
		jComboBox = new JComboBox<String>(items);
		jCheckBox = new JCheckBox("CheckBox");
		jLabelBlank = new JLabel();
		jButtonExit = new JButton("Exit");
		
		//패널에 버튼이나 라벨등을 추가
		jPanel.add(jLabel);
		jPanel.add(jButton);
		jPanel.add(jTextField);
		jPanel.add(jComboBox);
		jPanel.add(jCheckBox);
		jPanel.add(jLabelBlank);
		jPanel.add(jButtonExit);
		
		//사이즈 지정
		jLabel.setPreferredSize(new Dimension(50, 50));
		jButton.setPreferredSize(new Dimension(100, 50));
		jTextField.setPreferredSize(new Dimension(300, 50));
		jComboBox.setPreferredSize(new Dimension(50, 50));
		jCheckBox.setPreferredSize(new Dimension(100, 50));
		jLabelBlank.setPreferredSize(new Dimension(200, 50));
		jButtonExit.setPreferredSize(new Dimension(100, 50));
		
		jButton.addActionListener(this);
		jButtonExit.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			jLabelBlank.setText(jTextField.getText());
		} else if(e.getSource() == jButtonExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	
	
}
