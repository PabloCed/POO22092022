
package libro;

import java.awt.Color;

public class Libro {

private String titulo;
private Color color;
private String material;
private int año;
private int paginas;

    public Libro() {
    }

    public Libro(String titulo, Color color, String material, int año, int paginas) {
        this.titulo = titulo;
        this.color = color;
        this.material = material;
        this.año = año;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
public void abrir(){
    System.out.println("el libro" + this.titulo + "esta abierto");

 }
public void cerrar(){
    System.out.println("el libro" +this.titulo + "esta cerrado");
}
}
