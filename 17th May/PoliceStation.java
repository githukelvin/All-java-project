import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliceStation extends JFrame implements ActionListener{
    String title;
    PoliceStation(String myTitle){
        title = myTitle;
        setTitle(myTitle);
        setSize(600,600);
        JPanel myPanel = new JPanel();
        JTextArea myTextArea =new JTextArea("Details");
        myTextArea.setSize(500, 500);
        myTextArea.setBackground(Color.WHITE);
        myPanel.add(myTextArea);
        getContentPane().add(myPanel,BorderLayout.CENTER);
        JButton myMenuButton = new JButton("Submit");
        myMenuButton.setBackground(Color.MAGENTA);
        myMenuButton.setSize(100, 80);
        //add(myMenuButton,BorderLayout.NORTH);
        myMenuButton.addActionListener(this);
        myPanel.add(myMenuButton);
        JButton myClearButton = new JButton("Clear");
        myClearButton.setBackground(Color.RED);
        myClearButton.setSize(100, 80);
        //add(myClearButton,BorderLayout.NORTH);
        myClearButton.addActionListener(this);
        myPanel.add(myClearButton);
        String [] ourColumns = {"Serial No","Name","Grade"};
        String [][] ourData = {{"A001","Linet", "A"},{"Ab02","Dominic", "A"},{"A002","Alfie", "B"},{"A001","Linet", "A"},{"Ab02","Dominic", "A"},{"A002","Alfie", "B"}};
        JTable myTable = new JTable(ourData,ourColumns);
        myTable.setBounds(20, 30, 300, 200);
        JScrollPane scrollPane = new JScrollPane(myTable);
        
        myPanel.add(scrollPane);
        JMenuBar myMenuBar = new JMenuBar();
        JMenu   myFileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        JMenuItem openItem = new JMenuItem("Open" );
        openItem.addActionListener(this);
        JMenu myCompileMenu = new JMenu("Compile");
        JMenuItem thisFile = new JMenuItem("This file");
        thisFile.addActionListener(this);
        JMenuItem wholeProject = new JMenuItem("Whole project");
        wholeProject.addActionListener(this);
        JMenu myEditMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(this);
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(this);
        myFileMenu.add(saveItem);
        myFileMenu.add(openItem);
        myMenuBar.add(myFileMenu);
        myCompileMenu.add(thisFile);
        myCompileMenu.add(wholeProject);
        myMenuBar.add(myCompileMenu);
        myEditMenu.add(copyItem);
        myEditMenu.add(pasteItem);
        myMenuBar.add(myEditMenu);
        setJMenuBar(myMenuBar);
        add(new JLabel("Jay"),BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public static void main(String [] args){
    //creating instance of window
     PoliceStation Mathare = new PoliceStation("Mathare Police Station");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String clickedItem = e.getActionCommand();
       System.out.println( "You clicked:" +clickedItem);

       if(clickedItem.equals("This file")){
        JOptionPane.showConfirmDialog(this,"You are compiling this file");
       }
    }
}