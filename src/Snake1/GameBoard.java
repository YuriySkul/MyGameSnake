package Snake1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

public class GameBoard extends JPanel implements ActionListener  {
	JFrame gameFrame;
	Brick br = new Brick((int)(Math.random()*50),((int)(Math.random()*30)));
	Snake sss = new Snake(10,10,10,11);
	int  speed = 5;
	boolean setka = true;
	public final int scale = 16;
	public  int width = 50;
	public  int hight = 30;
	Timer t = new Timer(1000/speed,this);
	
	public Color color(int red, int green, int blue ){
		return new Color(red,green,blue);
	}
	
	public void paint(Graphics g){
		g.setColor(color(165, 165, 160));
		g.fillRect(0, 0, width*scale, hight*scale);
		if(setka){
		g.setColor(color(253, 244, 227));
		for (int x = 0; x <= width*scale; x += scale){
			g.drawLine(x, 0, x, hight*scale);
		}
		for(int y =0; y <= hight*scale; y += scale){
			g.drawLine(0, y, width*scale, y);
		}
		}
		g.setColor(color(34, 137, 17));
 	    for(int k = 0; k<sss.length;k++){
 	    	g.fillRect(sss.body [k][0]*scale+3, sss.body [k][1]*scale+3, scale-5, scale-5);
	    }
 	    g.setColor(color(255,0,0));
// 	    g.fillRect((br.x*scale), (br.y*scale), scale,scale );
 	    g.fillOval((br.x*scale), (br.y*scale), scale, scale);
 	  
	}
	GameBoard(){
	gameFrame = new JFrame("Змейка Ю.В.");
	addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e) {
			int code =e.getKeyCode();
			if((code == KeyEvent.VK_UP)&&!(sss.direction==3) ){
				sss.direction = 1;
			}
			if((code == KeyEvent.VK_RIGHT)&&!(sss.direction==4)){
				sss.direction = 2;
			}
			if((code == KeyEvent.VK_DOWN )&&!(sss.direction==1)){
				sss.direction = 3;
			}
			if((code == KeyEvent.VK_LEFT )&&!(sss.direction==2)){
				sss.direction = 4;
			}
			if (code == KeyEvent.VK_SPACE){
				if(t.isRunning()){
					t.stop();
				}else{
					t.start();
				}
			}
			if (code == KeyEvent.VK_S){
				if (setka){
					setka = false;
				}else{
					setka = true;
				};
			}
		}   	
	}
	);
	 setFocusable(true);
	
	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gameFrame.setSize(width*scale+7,hight*scale+33);
	gameFrame.setVisible(true);
	gameFrame.add(this);
	gameFrame.setLocationRelativeTo(null);
	gameFrame.setResizable(false);
 	
 	t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		sss.move();
		 if((sss.body [0][0] == br.x)&&(sss.body [0][1]==br.y)){
			 sss.length++;
			 speed++;
			 t.setDelay(1000/speed);;
			 br.x =(int)(Math.random()*width);
			 br.y = (int)(Math.random()*hight);
			 
			 for (int d=0;d<sss.length;d++){
				 while((sss.body[d][0]==br.x)&(sss.body[d][1] ==br.y) ){ br.x =(int)(Math.random()*20);
				 br.y = (int)(Math.random()*20);}
			 }
			 
			
			;
		}
			
			
		repaint();
	}
    
//	public class Keyboard extends KeyAdapter{
//		public void keyPressed(KeyEvent e) {
//			int code =e.getKeyCode();
//			if(code == KeyEvent.VK_UP ){
//				sss.direction = 1;
//			}
//			if(code == KeyEvent.VK_RIGHT){
//				sss.direction = 2;
//			}
//			if(code == KeyEvent.VK_DOWN ){
//				sss.direction = 3;
//			}
//			if(code == KeyEvent.VK_LEFT ){
//				sss.direction = 4;
//			}
//			
//		}
//	}
}
