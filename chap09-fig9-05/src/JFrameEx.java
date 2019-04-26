import javax.swing.*; 
 import java.awt.*; 
 

public class JFrameEx extends JFrame {
	    public JFrameEx() {
	    	setTitle("프레임 구성");
	    	
	    	JMenuBar mb = new JMenuBar();
	    	JMenu fileMenu = new JMenu("File");
	    	JMenu editMenu = new JMenu("Edit");
	    	JMenu  sourceMenu= new JMenu("Source");
	    	JMenu  SearchMenu= new JMenu("Search");
	    	JMenu  windowMenu= new JMenu("Window");
	    	
	    	mb.add(fileMenu);
	    	mb.add(editMenu);
	    	mb.add(sourceMenu);
	    	mb.add(SearchMenu);
	    	mb.add(windowMenu);
	    	
	    	
	    	setJMenuBar(mb);
	    	
	    	this.getContentPane().setLayout(new FlowLayout()); 
	    	this.getContentPane().setBackground(new Color(186, 143, 45)); 
            this.add(new JButton("add"));
            this.add(new JButton("sub"));
            this.add(new JButton("mul"));
            this.add(new JButton("div"));
            
            setSize(300,200);
            setVisible(true);
            
	    }
	
	
	     public static void main(String[] args) {
	              new JFrameEx(); 

	}

}
