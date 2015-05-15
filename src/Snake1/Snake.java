
package Snake1;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




public class Snake {
	GameBoard brd;
	int direction = 1;   //1-вверх,  2 - вправо,  3 - вниз,  4 - влево
	int length =2;
	int [][] body = new int[100][2];
    

    Snake(int x0,int y0,int x1,int y1){
    	body [0][0] = x0;
    	body [0][1] = y0;
    	body [1][0] = x1;
    	body [1][1] = y1;

    }
    public void move (){
     	for(int n = length-1; n>0; n--){
    		body [n][0] = body [n-1][0];
    		body [n][1] = body [n-1][1];
    	}

    	if (direction == 1){
    		switch (body [0][1]) {
			    case 0: body [0][1]=29; break;
				default:body [0][1]=body [0][1]-1;break;
			};
         }   	
    	if (direction == 2){
    		switch (body [0][0]) {
			    case 49: body [0][0]=0; break;
				default:body [0][0]=body [0][0]+1;break;
			};
         }   	
    	if (direction == 3){
    		switch (body [0][1]) {
			    case 29: body [0][1]=0; break;
				default:body [0][1]=body [0][1]+1;break;
			};
         }   	
    	if (direction == 4){
    		switch (body [0][0]) {
			    case 0: body [0][0]=49; break;
				default:body [0][0]=body [0][0]-1;break;
			};
			
		}	
		for (int d = length-1; d>0; d--){	
    	if ((body [0][0] == body [d][0])&&(body[0][1]==body [d][1])){
				this.length--;
				System.out.println("врезался");
			}   	
		}  
      
    
    
    
    
    
    
    
    }
}
