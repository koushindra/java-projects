/*
 * MIDWebBrowser.java
 *
 * Created on 17. juli 2004, 12:13
 */

package net.rysoft.gui.MDIWebbrowser;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Webbrowser.*;

/**
 *
 * @author  Kjell Dirdal
 */
public class MDIWebBrowser extends JFrame{
    
    private JDesktopPane desktopPane = new JDesktopPane();
    
    /** Creates a new instance of MIDWebBrowser */
    public MDIWebBrowser() {
        super( "MDI Webbrowser");
        
        createNewWindow();
        
        Container contentPane = getContentPane();
        contentPane.add( desktopPane );
        
        JMenu fileMenu = new JMenu( "File" );
        fileMenu.add( new NewWindowAction() );
        fileMenu.addSeparator();
        fileMenu.add( new ExitAction() );
        fileMenu.setMnemonic( 'F' );
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add( fileMenu );
        setJMenuBar( menuBar );
    }
    
    private void createNewWindow(){
        JInternalFrame frame = new JInternalFrame( "Browser",
        true, 
        true,
        true,
        true );
        
        WebBrowserPane browserPane = new WebBrowserPane();
        WebToolbar toolBar = new WebToolbar( browserPane );
        
        Container contentPane = frame.getContentPane();
        contentPane.add( toolBar, BorderLayout.NORTH );
        contentPane.add( new JScrollPane( browserPane ), BorderLayout.CENTER );
        
        frame.setSize( 320, 240 );

        int offset = 30 * desktopPane.getAllFrames().length;
        frame.setLocation( offset, offset );
        
        desktopPane.add( frame );
        
        frame.setVisible( true );
    }
    
    private class NewWindowAction extends AbstractAction{
        
        public NewWindowAction()
        {
            putValue( Action.NAME, "New Window" );
            putValue( Action.SHORT_DESCRIPTION, 
                "Create New Web Browser Window" );
            putValue( Action.MNEMONIC_KEY, new Integer( 'N' ) );
        }
        
        public void actionPerformed(ActionEvent e) {
            createNewWindow();
        }
    }
    
    private class ExitAction extends AbstractAction{
        
        public ExitAction()
        {
            putValue( Action.NAME, "Exit" );
            putValue( Action.SHORT_DESCRIPTION, 
                "Exit Application" );
            putValue( Action.MNEMONIC_KEY, new Integer( 'x' ) );
        }
        
        public void actionPerformed(ActionEvent e) {
            System.exit( 0 );
        }
    }
    
    public static void main( String args[] ){
        MDIWebBrowser browser = new MDIWebBrowser();
        browser.setDefaultCloseOperation( EXIT_ON_CLOSE );
        browser.setSize( 800, 640 );
        browser.setVisible( true );
    }
}
