/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author cfco5
 */
public class Libro {
 
    private String isbn;
    private String titulo_libro;
    private String mfn;
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getMfn() {
        return mfn;
    }

    public void setMfn(String mfn) {
        this.mfn = mfn;
    }

    public Libro() {
    }

    public Libro(String isbn, String titulo_libro, String mfn) {
        this.isbn = isbn;
        this.titulo_libro = titulo_libro;
        this.mfn = mfn;
    }
    
    
}
