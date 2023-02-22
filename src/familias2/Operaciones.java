package familias2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

//Clase con el método  que operan los datos
public class Operaciones {

    //Atributos 
    private Personas personaHum;

    //Uso del HashMap
    public static HashMap<String, Personas> personaslist;

    //Método de lista de personas
    public Operaciones(HashMap<String, Personas> actualPersonasList) {
        this.personaslist = actualPersonasList;

    }

    //Método de lista del HashMap
    public Operaciones() {

        if (personaslist == null) {
            personaslist = new HashMap<String, Personas>();

        }

    }

    //Método de agreagar elementos a la lista dependiendo del CC
    public void addPersonas(Personas unaPersona) throws Exception {
        if (unaPersona != null) {

            personaslist.put(unaPersona.getCc(), unaPersona);

            //Guardado de los datos
            Operaciones.guardarPersonas();
        } else {

            throw new Exception("Los datos son insuficientes");

        }
    }

    //Método editar elementos de la lista HashMap
    public void editPersona(Personas unaPersona) throws Exception {

        if (personaslist == null || personaslist.isEmpty()) {

            throw new Exception("No se encuentran datos");

        } else {

            String cc = unaPersona.getCc();

            if (personaslist.containsKey(cc) == true) {
                personaslist.put(cc, unaPersona);

                //Guardado de los datos
                Operaciones.guardarPersonas();

            } else {

                throw new Exception("No se encuentra el nombre para modificar datos");

            }

        }

    }

    //Método eliminiar elementos de la lista
    public void delePersona(String cc) throws Exception {
        if (personaslist.containsKey(cc) == true) {
            personaslist.remove(cc);

            //Guardado de los datos
            Operaciones.guardarPersonas();

        } else {

            throw new Exception("No se encuentra el nombre para modificar datos");

        }

    }

    //Método buscar elementos de la lista
    public Personas buscPersonas(String cc) throws Exception {
        Personas unaPersona = null;

        //Búsqueda de los datos
        Operaciones.obtenerPersonas();
        if (personaslist.containsKey(cc) == true) {

            unaPersona = personaslist.get(cc);
        } else {

            throw new Exception("No se encuentra el dato de persona");
        }
        return unaPersona;

    }

    //Método para guardado de datos en la lista y su ruta para la creación del archivo
    public static void guardarPersonas() throws Exception {

        try {

            //Objeto escritor 
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("personaslist.txt"));
            escritor.writeObject(Operaciones.personaslist);

            escritor.close();

        } catch (IOException ex) {

            throw new Exception("No se puede guardar el listado");

        }

    }

    //Método obtener personas.
    public static HashMap<String, Personas> obtenerPersonas() throws Exception {

        try {

            //Objeto lector
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("personaslist.txt"));
            HashMap<String, Personas> personas = (HashMap<String, Personas>) lector.readObject();
            System.out.println(personas.keySet());

            lector.close();

            return personas;

        } catch (IOException ex) {

            return new HashMap<String, Personas>();

        }

    }

}
