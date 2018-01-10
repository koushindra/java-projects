/*
 * ActionSample.java
 *
 * Created on 13. juli 2004, 20:18
 */

package net.rysoft.gui.actions;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author  Kjell Dirdal
 */
public class ActionSample extends JFrame {
    
    private Action sampleAction;
    private Action exitAction;
    
    /** Creates a new instance of ActionSample */
    public ActionSample() {
        super( "Using Actions" );
        
        sampleAction = new AbstractAction(){
            
            public void actionPerformed( ActionEvent event )
            {
                JOptionPane.showMessageDialog( ActionSample.this,
                    "The sampleAction was invoked" );
                
                exitAction.setEnabled( true );
            }
        };
        
        sampleAction.putValue( Action.NAME, "SampleAction" );
        
        sampleAction.putValue( Action.SMALL_ICON, 
            new ImageIcon( getClass().getResource( "Help24.gif" ) ) );
        
        sampleAction.putValue( Action.SHORT_DESCRIPTION, "A Sample Action" );
        
        sampleAction.putValue( Action.MNEMONIC_KEY, new Integer( 'S' ) );
        
        exitAction = new AbstractAction(){
            public void actionPerformed( ActionEvent event ){
                JOptionPane.showMessageDialog( ActionSample.this, "The exitAction was invoked" );
                System.exit( 0 );
            }
        };
        
        exitAction.putValue( Action.NAME, "Exit" );
        
        exitAction.putValue( Action.SMALL_ICON, new ImageIcon( getClass().getResource( "Exit.gif") ) );
        
        exitAction.putValue( Action.SHORT_DESCRIPTION, "Exit application" );
        
        exitAction.putValue( Action.MNEMONIC_KEY, new Integer( 'x' ) );
        
        exitAction.setEnabled( false );
        
        JMenu fileMenu = new JMenu( "File" );
        
        fileMenu.add( sampleAction );
        fileMenu.add( exitAction );
        
        fileMenu.setMnemonic( 'F' );
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add( fileMenu );
        setJMenuBar( menuBar );
        
        JToolBar toolbar = new JToolBar();
        
        toolbar.add( sampleAction );
        toolbar.add( exitAction );
        
        JButton sampleButton = new JButton();
        sampleButton.setAction( sampleAction );
        
        JButton exitButton = new JButton( exitAction );
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add( sampleButton );
        buttonPanel.add( exitButton );
        
        Container contentPane = getContentPane();
        contentPane.add( toolbar, BorderLayout.NORTH );
        contentPane.add( buttonPanel, BorderLayout.CENTER );
        
    }
    
    public static void main( String args[] ){
        ActionSample sample = new ActionSample();
        sample.setDefaultCloseOperation( EXIT_ON_CLOSE );
        sample.pack();
        sample.setVisible( true );
    }
}
