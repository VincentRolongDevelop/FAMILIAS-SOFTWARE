package familias2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

//Clase con el método  que operan los datos
public class Operaciones2 {

    //Atributos 
    private Familias familiaExistente;

    //Uso del HashMap
    public static HashMap<String, Familias> familiasList;

    //Metodo de lista de familias
    public Operaciones2(HashMap<String, Familias> actualFamiliaList) {
        this.familiasList = actualFamiliaList;

    }

    //Método de lista del HashMap
    public Operaciones2() {

        if (familiasList == null) {
            familiasList = new HashMap<String, Familias>();

        }

    }

    //Método de agreagar elementos a la lista dependiendo del CC
    public void addFamilias(Familias unaFamilia) throws Exception {
        if (unaFamilia != null) {

            familiasList.put(unaFamilia.getId(), unaFamilia);

            //Guardado de los datos
            Operaciones2.guardarFamilias();
        } else {

            throw new Exception("Los datos son insuficientes");

        }
    }

    //Método editar elementos de la lista HashMap
    public void editFamilia(Familias unaFamilia) throws Exception {

        if (familiasList == null || familiasList.isEmpty()) {

            throw new Exception("No se encuentran datos");

        } else {

            String id = unaFamilia.getId();

            if (familiasList.containsKey(id) == true) {
                familiasList.put(id, unaFamilia);

                //Guardado de los datos
                Operaciones2.guardarFamilias();

            } else {

                throw new Exception("No se encuentra el nombre para modificar datos");

            }

        }

    }

    //Método eliminiar elementos de la lista
    public void deleFamilia(String id) throws Exception {
        if (familiasList.containsKey(id) == true) {
            familiasList.remove(id);

            //Guardado de los datos
            Operaciones2.guardarFamilias();

        } else {

            throw new Exception("No se encuentra el nombre para modificar datos");

        }

    }

    //Método buscar elementos de la lista
    public Familias buscFamilias(String id) throws Exception {
        Familias unaFamilia = null;

        //Búsqueda de los datos
        Operaciones2.obtenerFamilias();
        if (familiasList.containsKey(id) == true) {

            unaFamilia = familiasList.get(id);
        } else {

            throw new Exception("No se encuentra el dato de la familia");
        }
        return unaFamilia;

    }

    //Método para guardado de datos en la lista y su ruta para la creación del archivo
    public static void guardarFamilias() throws Exception {

        try {

            //Objeto escritor 
            ObjectOutputStream escritorFamilia = new ObjectOutputStream(new FileOutputStream("familiaslist.txt"));
            escritorFamilia.writeObject(Operaciones2.familiasList);

            escritorFamilia.close();

        } catch (IOException ex) {

            throw new Exception("No se puede guardar el listado");

        }

    }

    //Método obtener Familias.
    public static HashMap<String, Familias> obtenerFamilias() throws Exception {

        try {

            //Objeto lector
            ObjectInputStream lectorFamilias = new ObjectInputStream(new FileInputStream("familiaslist.txt"));
            HashMap<String, Familias> familias = (HashMap<String, Familias>) lectorFamilias.readObject();
            System.out.println(familias.keySet());

            lectorFamilias.close();

            return familias;

        } catch (IOException ex) {

            return new HashMap<String, Familias>();

        }

    }

}
