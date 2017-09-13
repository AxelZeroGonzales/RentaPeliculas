/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ 
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio:  n1_lineasTelefonicas
 * Autor: Pablo Barvo - Dec 7, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelBarra extends JPanel implements ActionListener
{

    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * Comando Reiniciar
     */
    private static final String CATEGORIA = "CATEGORIA";

    /**
     * Comando Opción 1
     */
    private static final String KID = "KID";


    /**
     * Comando Opción 2
     */
    private static final String CARRO = "CARRO";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazBusqueda principal;

    //-----------------------------------------------------------------
    // Atributos de interfaz
    //-----------------------------------------------------------------

    /**
     * Botón Categoria
     */
    private JButton btnCategoria;

    /**
     * Botón Kids
     */
    private JButton btnKids;

    /**
     * barra de busqueda
     */
    private JTextField buscador;
    /**
     * Botón Carro
     */
    private JButton btnCarro;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param elPadre Ventana principal
     */
    public PanelBarra( InterfazBusqueda elPadre )
    {
        principal = elPadre;

        setLayout( new GridLayout( 1, 4 ) );

        //Categoria
        btnCategoria = new JButton( "Categoria" );
        btnCategoria.setPreferredSize( new Dimension( 150, 25 ) );
        btnCategoria.setActionCommand( CATEGORIA );
        btnCategoria.addActionListener( this );
        add(btnCategoria);

        //Botón KIDS
        btnKids = new JButton( "KIDS" );
        btnKids.setActionCommand( KID );
        btnKids.addActionListener(this);
        add( btnKids );
        
        buscador = new JTextField("");
        buscador.setPreferredSize(new Dimension(54, 20));
        add(buscador);
        
        //Botón Carro
        btnCarro = new JButton( "" );
        btnCarro.setActionCommand( CARRO );
        ImageIcon icono = new ImageIcon(getClass().getResource( "/data/carro.png" ));
        Icon ico = new ImageIcon(icono.getImage().getScaledInstance(40, 80, Image.SCALE_DEFAULT));
        this.repaint();
        btnCarro.setIcon(ico);
        btnCarro.setPreferredSize(new Dimension(54, 20));
        btnCarro.addActionListener(this);
        add( btnCarro );
        
        
        
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones
     * @param e Acción que generó el evento. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
        if( CATEGORIA.equals( e.getActionCommand( ) ) )
        {
            principal.reqCategoria( );
        }
        else if( KID.equals( e.getActionCommand( ) ) )
        {
            principal.reqKID( );
        }
        else if( CARRO.equals( e.getActionCommand( ) ) )
        {
            principal.reqCarro( );
        }
    }
}
