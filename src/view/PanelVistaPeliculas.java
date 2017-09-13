
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel con la información de una Pelicula
 */
public class PanelVistaPeliculas extends JPanel implements ActionListener
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * Comando Agregar llamada
     */
    private static final String RENTAR = "RENTAR";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazBusqueda principal;

    /**
     * Número de la pelicula
     */
    private int numeroPelicula;


    //-----------------------------------------------------------------
    // Atributos de Interfaz
    //-----------------------------------------------------------------

    /**
     * Etiqueta con la imagen del teléfono
     */
    private JLabel etiquetaImagen;

    /**
     * Etiqueta categoria o categorias de la pelicula
     */
    private JLabel categoria;

    /**
     * Etiqueta número de llamadas
     */
    private JLabel nombrePelicula;

    /**
     * Etiqueta duracion de pelicula
     */
    private JLabel duracion;

    /**
     * Botón Rentar Pelicula
     */
    private JButton btnRenta;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param laPrincipal Ventana principal. laPrincipal != null.
     * @param elNumeroLinea Número de la línea.
     */
    public PanelVistaPeliculas( InterfazBusqueda laPrincipal, int elNumeroPelicula )
    {
        principal = laPrincipal;
        numeroPelicula = elNumeroPelicula;
        setBorder( new TitledBorder( "Pelicula#" + numeroPelicula ) );
        setLayout( new GridBagLayout( ) );
        setPreferredSize( new Dimension( 490, 600 ) );

        //
        //Etiqueta de Imagen
        ImageIcon icono = new ImageIcon(getClass().getResource( "/data/pelicula"+numeroPelicula+".jpg" ));
        etiquetaImagen = new JLabel( "" );
        Icon ico = new ImageIcon(icono.getImage().getScaledInstance(120, 200, Image.SCALE_DEFAULT));
        this.repaint();
        etiquetaImagen.setIcon( ico );
        etiquetaImagen.setBorder( new TitledBorder( "" ) );

        //
        //Etiqueta Categoria
        categoria = new JLabel( formatearValor( 0 ) );
        categoria.setForeground( Color.BLUE.darker( ) );
        categoria .setFont( new Font( "Tahoma", Font.BOLD, 20 ) );

        //
        //Etiqueta Duracion de pelicula
        duracion = new JLabel( "duracion" + " base de datos" );

        //Etiqueta nombre de la pelicual
        nombrePelicula = new JLabel( "nombre base de datos" );

        //
        //Botón Agregar llamada
        btnRenta = new JButton( "Rentar Pelicula" );
        btnRenta.setPreferredSize( new Dimension( 150, 25 ) );
        btnRenta.setActionCommand( RENTAR );
        btnRenta.addActionListener( this );

        //
        //Organización
        GridBagConstraints posicion = new GridBagConstraints( 0, 0, 2, 2, 0, 0, GridBagConstraints.CENTER,
        								  GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaImagen, posicion );

        posicion = new GridBagConstraints( 0, 4, 6, 2, 0, 0, GridBagConstraints.CENTER,
        													 GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( nombrePelicula, posicion );		

        posicion = new GridBagConstraints( 0, 8, 6, 2, 0, 0, GridBagConstraints.CENTER,
        													 GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( duracion, posicion );

        posicion = new GridBagConstraints( 0, 12, 6, 2, 0, 0, GridBagConstraints.CENTER,
        													 GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( btnRenta, posicion );
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Actualiza la visualización de la información
     * @param linea Línea telefónica donde se saca la información. linea != null.
     */
    public void actualizar( PanelVistaPeliculas pelicula )
    {
        duracion.setText( formatearValor( pelicula.extraerduracion( ) ) );
        nombrePelicula.setText( "Número Pelicula: " + formatearValorEntero( pelicula.extraerNombre( ) ) );
        duracion.setText( "Número de Minutos: " + formatearValorEntero( pelicula.darDuracionPelicula( ) ) );
    }

    private int darDuracionPelicula() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int extraerNombre() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double extraerduracion() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
     * Formatea un valor numérico para presentar en la interfaz.
     * @param valor Valor numérico a ser formateado
     * @return Cadena con el valor formateado con puntos y signos.
     */
    private String formatearValor( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }

    /**
     * Formatea un valor numérico para presentar en la interfaz <br>
     * @param valor Valor numérico a ser formateado
     * @return Retorna una cadena con el valor formateado con puntos y signos.
     */
    private String formatearValorEntero( int valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( " ###,###" );
        df.setMinimumFractionDigits( 0 );
        return df.format( valor );
    }

    /**
     * Manejo de eventos del usuario
     * @param e Evento de usuario. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
    	if( RENTAR.equals( e.getActionCommand( ) ) )
        {
            principal.agregarPelicula( numeroPelicula );
        }
    }

}
