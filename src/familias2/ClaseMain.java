package familias2;

//Importaciones de la clase
import familias2.Interfaz.Ventana1;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//Nombre clase
public class ClaseMain {

//Clase principal
    public static void main(String[] args) {
        
       

        //Objetos de HashMap que almacenana los datos de personas y familias
        HashMap<String, Personas> ppp = new HashMap<String, Personas>();
        HashMap<String, Familias> fff = new HashMap<String, Familias>();

        //Inicio de obtención de los datos del disco de personas
        try {
            ppp.putAll(Operaciones.obtenerPersonas());
        } catch (Exception ex) {
            System.out.println("Hubo un error");
            return;
        }
        Operaciones operar = new Operaciones(ppp);

        //Inicio de obtención de los datos del disco de familias
        try {
            fff.putAll(Operaciones2.obtenerFamilias());
        } catch (Exception ex) {
            System.out.println("Hubo un error");
            return;
        }
        
         //Skin de las ventanas
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Operaciones2 operar2 = new Operaciones2(fff);
        
        //Se inicia la ventana principal con los datos de disco almacenados
        Ventana1 h = new Ventana1();
        h.setVisible(true);

    }

}
