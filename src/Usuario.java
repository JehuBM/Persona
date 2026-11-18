public class Usuario extends Persona {

    public String correo;
    public String contrasenia;

    public Usuario(String nombre, int edad, String sexo, String correo, String contrasenia) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public void informacionUsuario(){
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Tengo "+edad+" años");
        System.out.println("Yo soy un:" +sexo);
        System.out.println("Mi correo es: "+correo);
        System.out.println("Mi contraseña es: "+contrasenia);
    }
}
