package java30;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class List_MakeFrame extends Frame implements ActionListener { //ActionListener을 구현화 하면 override가 필수임.

	private List list; //리스트 생성
	private Panel panel;
	private TextField textField;
	private Button okBtn;
	private Button exitBtn;
	
	public List_MakeFrame() {
		
		list = new List();  //
		panel = new Panel(); // 맨 하단에 생기는 틀, 그 위에 버튼이나 입력상자등이 추가된다.
		textField = new TextField(20);
		okBtn = new Button("OK");
		exitBtn = new Button("EXIT");
		
		//레이아웃을 잡는 과정  컴포넌트 생성 후 레이아웃은 필수임. 레이아웃은 Frame에 속해 있음.
		setLayout(new BorderLayout()); 
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		
		//패널에 레이아웃을 붙히는 중
		panel.add(new Label("write"));
		panel.add(textField);
		panel.add(okBtn);
		panel.add(exitBtn);
	
		
		//버튼을 누를면 actionlistener에 나 자신을 넣어 호출하라.
		okBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
	}
	
	
	@Override //actionListener을 구현화 하면 필수임.
	public void actionPerformed(ActionEvent e) { //actionPerformed의 경우 ActionEvent가 발생하면 이벤트가 매개변수로 들어오고 자동으로 호출된다.
		if(e.getSource() == okBtn) { //이벤트 들어온 것의 소스가 okbtn이면,
			list.add(textField.getText()); //list에 항목을 추가해라.
		} else if(e.getSource() == exitBtn) { 
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}

}
