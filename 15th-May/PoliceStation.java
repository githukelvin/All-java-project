import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PoliceStation
 */
public class PoliceStation extends JFrame implements ActionListener {
    String title;

    PoliceStation(String title){
        title =title;
        setTitle(title);
        setSize(500, 500);
        JMenuBar bar = new JMenuBar();
        JMenu fileMenu  = new JMenu("File");
        JMenu Compile  = new JMenu("Compile");
        JMenu Edit = new JMenu("Edit");
        JMenu View = new JMenu("View");
        JMenu Help = new JMenu("Help");
        bar.add(fileMenu);
        bar.add(Compile);
        bar.add(Edit);
        bar.add(View);
        bar.add(Help);
        JMenuItem saveItem= new JMenuItem("Save");
        JMenuItem loadItem= new JMenuItem("Load");
        JMenuItem exitItem= new JMenuItem("Exit");
        exitItem.addActionListener(this);
        // compile
        JMenuItem run = new JMenuItem("Run");
        run.addActionListener(this);
        JMenuItem Debug = new JMenuItem("Debug");
        Debug.addActionListener(this);
        JMenuItem fileLocation = new JMenuItem("File location");
    //    edit;
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
    //  view
        JMenuItem zoomIn = new JMenuItem("Zoom In");
        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        JMenuItem fullScreen = new JMenuItem("Full Screen");
        // help
        JMenuItem about = new JMenuItem("About");
        JMenuItem help = new JMenuItem("Help");

        View.add(zoomIn);
        View.add(zoomOut);
        View.add(fullScreen);
        // file menu
        fileMenu.add(saveItem);
        fileMenu.add(loadItem); 
        fileMenu.add(exitItem);
        // Compile
        Compile.add(run);
        Compile.add(Debug);
        Compile.add(fileLocation);
        // View
        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        // help
        Help.add(about);
        Help.add(help);

        // setting menu
        setJMenuBar(bar);
        add(new JLabel("What's up 😁👌"),BorderLayout.SOUTH);
        setVisible(true);


    }
    public static void main(String[] args) {
        PoliceStation ps = new PoliceStation("Police Station");
        ps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String clicked;
        clicked= e.getActionCommand();
        if(clicked =="Exit"){
            // exit
            int a = JOptionPane.showConfirmDialog(this, "Are you sure?");
            if(a==JOptionPane.YES_OPTION){
                System.exit(0);
            }  
        }
        else if(clicked =="Run"){
            JOptionPane.showConfirmDialog(this, "Run");
        }
        else if(clicked =="Debug"){
            JOptionPane.showConfirmDialog(this,"Debug");   
        }
        else{
            JOptionPane.showConfirmDialog(this, "File Location");
        }
        
    }
}




