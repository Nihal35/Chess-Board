import java.awt.*; 
import java.applet.*; 
  
public class chessBoard extends Applet{ 
  
    public void paint (Graphics a) 
    { 
    	Frame title = (Frame)this.getParent().getParent();
    	title.setTitle("Chess Board");
    	
    	this.setSize(new Dimension(400,400));
        
        for (int numRows = 0; numRows < 10; numRows++) { 
  
            for (int numCols = 0; numCols < 10; numCols++) { 
  
                // Sets x and y coords for rectangle 40 times
                int x = numRows * 40; 
                int y = numCols * 40; 
  
                //checks if rows and cols are in even positions
                if ((numRows % 2) == (numCols % 2)) 
                    a.setColor(Color.WHITE); 
                else 
                    a.setColor(Color.BLACK); 
  
                //creates rectangles of heights and widths 40 
                a.fillRect(x, y, 40, 40); 
            } 
        } 
    } 
} 