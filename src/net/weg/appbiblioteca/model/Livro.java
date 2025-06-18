package net.weg.appbiblioteca.model;
import java.time.LocalDate;
public class Livro {

    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private boolean disponivel;

    public Livro() {

        this.titulo = "";
        this.autor = "";
        this.dataPublicacao = LocalDate.now();
        this.disponivel = true;

    }

    public Livro (String titulo, String autor, LocalDate data) {

        this.autor = autor;
        this.titulo = titulo;
        this.dataPublicacao = data;
        this.disponivel = true;

    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public LocalDate getDataPublicacao() { return dataPublicacao; }
    public void setDataPublicacao(LocalDate dataPublicacao) { this.dataPublicacao = dataPublicacao; }
    public boolean getDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel;}

    public String toString () { return "Título: " + titulo + "\nAutor: " + autor + "\nData Publicação: " + dataPublicacao + "\nDisponível: " + disponivel; }
}

