import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//게임 보드
public class Board extends JPanel implements ActionListener {

	private final int B_WIDTH = 300;
	private final int B_HEIGHT = 300;

	//방향키는 4방향으로 유지하는것
	public Board(){
		//addKeyListener(); (방향키와 esc의 입력을 통해 잡을것임)
		setBackground(Color.black);
		setFocusable(true);
		
		setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));
		
	}
}
