 import java.util.List;
 public class titulo{
    // variables
    public String titulo;
    public String edicion;
    public String isbn;
    List<Autor>autores;
    List<Categoria>categorias;
    // metodo constructor
    public titulo(){
        System.out.println("el objeto titulo se creo");
    }
    public titulo(String titulo, String edicion){
    }
    this.titulo= titulo;
    this.edicion= edicion;
}
