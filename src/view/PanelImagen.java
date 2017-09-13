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

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel con la imagen de la empresa
 */
public class PanelImagen extends JPanel
{

    //-----------------------------------------------------------------
    // Atributos de Interfaz
    //-----------------------------------------------------------------

    /**
     * Etiqueta con la imagen de la empresa
     */
    private JLabel etiquetaImagen;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del Panel
     */
    public PanelImagen( )
    {
        setBorder( new TitledBorder( "Nombre de la tienda" ) );
        setLayout( new GridBagLayout( ) );
        //Etiqueta Logo de la empresa
        ImageIcon icono = new ImageIcon(getClass().getResource( "/data/logo.jpg" ));
        Icon ico = new ImageIcon(icono.getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT));
        this.repaint();
        etiquetaImagen = new JLabel( "" );
        etiquetaImagen.setIcon( ico );

        add( etiquetaImagen );
    }

}
