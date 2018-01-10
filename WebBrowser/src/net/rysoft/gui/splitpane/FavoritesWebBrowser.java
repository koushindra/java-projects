/*
 * FavoritesWebBrowser.java
 *
 * Created on 14. juli 2004, 02:26
 */

package net.rysoft.gui.splitpane;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;
import javax.swing.event.*;

import Webbrowser.*;

/**
 *
 * @author  Kjell Dirdal
 */
public class FavoritesWebBrowser extends JFrame {
    
    private WebToolbar toolBar;
    private WebBrowserPane browserPane;
    private WebBrowserPane favoritesBrowserPane;
    
    /** Creates a new instance of FavoritesWebBrowser */
    public FavoritesWebBrowser() {
        super( "RySoft Web Browser");
        
        browserPane = new WebBrowserPane();
        toolBar = new WebToolbar( browserPane );
        
        favoritesBrowserPane = new WebBrowserPane();
        
        favoritesBrowserPane.addHyperlinkListener( toolBar );
        
        favoritesBrowserPane.goToURL(
            getClass().getResource( "favorites.html" ) );
        
        JSplitPane splitPane = new JSplitPane( 
        	JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane( favoritesBrowserPane ),
                new JScrollPane( browserPane ) );
        
        splitPane.setDividerLocation( 210 );
        
        splitPane.setOneTouchExpandable( true );
        
        Container contentPane = getContentPane();
        
        contentPane.add( toolBar, BorderLayout.NORTH );
        contentPane.add( splitPane, BorderLayout.CENTER );
        
    }
    
    public static void main( String args[] ){
        FavoritesWebBrowser browser = new FavoritesWebBrowser();
        browser.setDefaultCloseOperation( EXIT_ON_CLOSE );
        browser.setSize( 640, 480 );
        browser.setVisible( true );
    }
}
