

package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entity.Customer;
import entity.Film;

/**
 * Esta es la ventana principal de la aplicación.
 */
public class InterfazBusqueda extends JFrame
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Clase principal del mundo
     */
    private Film pelicula;
    private Customer inicializar;
    /**
     * Panel con la imagen
     */
    private PanelImagen panelImagen;

    /**
     * Panel con los botones y la barra buscadora
     */
    private PanelBarra panelBarra;

    /**
     * Panel Línea 1
     */
    private PanelVistaPeliculas panelLinea1;
    /**
     * Panel Línea 2
     */
    private PanelVistaPeliculas panelLinea2;
    /**
     * Panel Línea 3
     */
    private PanelVistaPeliculas panelLinea3;
    /**
     * Panel Línea 4
     */
    private PanelVistaPeliculas panelLinea4;
    /**
     * Panel Línea 5
     */
    private PanelVistaPeliculas panelLinea5;
    /**
     * Panel Línea 6
     */
    private PanelVistaPeliculas panelLinea6;

    /**
     * Panel con las extensiones
     */


    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor de la interfaz
     */
    public InterfazBusqueda( )
    {
        // Crea la clase principal
        pelicula = new Film();

        // Construye la forma
        // organizar el panel principal
        getContentPane( ).setLayout( new BorderLayout( ) );
        //setSize( 530, 530 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "MiEmpresa - Renta de Peliculas" );

        //Creación de los paneles aquí
        JPanel panelSuperior = new JPanel( );
        panelSuperior.setLayout( new BorderLayout( ) );
        getContentPane( ).add( panelSuperior, BorderLayout.NORTH );

        panelImagen = new PanelImagen( );
        panelSuperior.add( panelImagen, BorderLayout.WEST );
        panelBarra = new PanelBarra(this);
        panelSuperior.add( panelBarra, BorderLayout.CENTER );

        JPanel panelContenedor = new JPanel( );
        //se muestra el numero de peliculas que se mostraran por fila 
        panelContenedor.setLayout( new GridLayout( 1, 4 ) );
        getContentPane( ).add( panelContenedor, BorderLayout.CENTER );

        //Agrega los paneles al panel contenedor
        
        panelLinea1 = new PanelVistaPeliculas( this, 1 );
        panelContenedor.add( panelLinea1 );
        panelLinea2 = new PanelVistaPeliculas( this, 2 );
        panelContenedor.add( panelLinea2 );
        panelLinea3 = new PanelVistaPeliculas( this, 3 );
        panelContenedor.add( panelLinea3 );
        panelLinea4 = new PanelVistaPeliculas( this, 4 );
        panelContenedor.add( panelLinea4 );
        panelLinea5 = new PanelVistaPeliculas( this, 5 );
        panelContenedor.add( panelLinea5 );
        panelLinea6 = new PanelVistaPeliculas( this, 6 );
        panelContenedor.add( panelLinea6 );
        pack( );
        setResizable( false );
    }


    // Métodos
    //-----------------------------------------------------------------

    /**
     * Agrega una llamada a una línea telefónica <br>
     * <b>pre: </b> 1 >= numeroLinea >= 3 <br>
     * @param numeroLinea Numero de la línea telefónica
     */
   
    /**
     * Método para la extensión 1
     */
	public void reqCategoria() {
		JOptionPane.showMessageDialog(null, "Terror,Miedo,Acccion");
	}
	

	public void reqKID() {
		JOptionPane.showMessageDialog(null, "Cambiar a vista de peliculas KID");
		
	}

	public void reqCarro() {
		JOptionPane.showMessageDialog(null, "Mostrar Peliculas en carrito");
		
	}
    //-----------------------------------------------------------------
    // Main
    //-----------------------------------------------------------------

    /**
     * Este método ejecuta la aplicación, creando una nueva interfaz
     * @param args Argumentos de el llamado. No se requiere ninguno.
     */
    public static void main( String[] args )
    {

        InterfazBusqueda interfaz = new InterfazBusqueda( );
        interfaz.setVisible( true );
    }

	public void agregarPelicula(int numeroPelicula) {
		JOptionPane.showMessageDialog(null, "Agregar Pelicula");
		
	}







	

}