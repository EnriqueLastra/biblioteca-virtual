
import java.util.List;
public class Autor {
        String nombre;
        String primerApellido;
        String segundoApellido;
       List<titulo>titulo;
        public autor(){

        }
        public autor(String nombre, String primerApellido){
            this.nombre=nombre;
            this.primerApellido=primerApellido;
        }
        public autor(String nombre, String primerApellido, String segundoApellido, String listaTitulos){
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
    }
}
