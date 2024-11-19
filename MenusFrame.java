
package za.ac.tut.ui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class MenusFrame extends JFrame{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    private JMenu editorsViewSubMenu;
    private JMenu splitViewSubMenu;
    
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectsMenuItem;
    
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    
    private JMenuItem sourceMenuItem;
    
    private JMenuItem horizontallyMenuItem;
    private JMenuItem verticallyMenuItem;
    private JMenuItem clearMenuItem;
    
    public MenusFrame(){
        setTitle("Menus Frame");
        setSize(600,700);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        newProjectMenuItem = new JMenuItem("New Project");
        newFileMenuItem = new JMenuItem("New File");
        openProjectMenuItem = new JMenuItem("Open Project");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectsMenuItem = new JMenuItem("Close All Projets");
        
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectsMenuItem);
        
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut", new ImageIcon("images/cut.png"));
        copyMenuItem = new JMenuItem("Copy", new ImageIcon("images/copy.png"));
        pasteMenuItem = new JMenuItem("Paste",new ImageIcon("images/paste.png"));
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        sourceMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourceMenuItem);
        
        horizontallyMenuItem = new JMenuItem("Horizontally");
        verticallyMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        
        splitViewSubMenu.add(horizontallyMenuItem);
        splitViewSubMenu.add(verticallyMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        setJMenuBar(menuBar);
        setVisible(true);
          
    }
}
