package familias2;

//Importaciones 
import java.io.Serializable;

//Nombre de la clase que implementa "Serializable"
public class Familias implements Serializable {

    //Atributos de la clase Familias
    private String id;
    private String padre;
    private String madre;
    private String pais;
    private String estado;
    private String ciudad;
    private String barrio;
    private String diccionario;
    private String telefono2;
    private String tieneCasaPropia;
    private String numeroCarros;
    private String numeroMascotas;
    private String numeroCasas;

    //Métodos Getter de la clase
    public String getNumeroCasas() {
        return numeroCasas;
    }

    public String getId() {
        return id;
    }

    public String getPadre() {
        return padre;
    }

    public String getMadre() {
        return madre;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDiccionario() {
        return diccionario;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getTieneCasaPropia() {
        return tieneCasaPropia;
    }

    public String getNumeroCarros() {
        return numeroCarros;
    }

    public String getNumeroMascotas() {
        return numeroMascotas;
    }
    
    //Métodos Setter de la clase

    public void setNumeroCasas(String numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDiccionario(String diccionario) {
        this.diccionario = diccionario;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public void setTieneCasaPropia(String tieneCasaPropia) {
        this.tieneCasaPropia = tieneCasaPropia;
    }

    public void setNumeroCarros(String numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public void setNumeroMascotas(String numeroMascotas) {
        this.numeroMascotas = numeroMascotas;
    }

}
