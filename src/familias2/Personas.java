package familias2;

import java.io.Serializable;
import java.util.Date;

//Nombre de la clase que implementa "Serializable"
public class Personas implements Serializable{
    
    //Atributos de las personas
    private String cc;
    private String password;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String rol;
    private String genero;
    private Date fechaNacimiento;
 
    //Metodos getter
    public String getCc() {
        return cc;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRol() {
        return rol;
    }

    public String getGenero() {
        return genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    //Metodos setter 
    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
