package net.weg.appbiblioteca.view;
import java.util.Scanner;
import net.weg.appbiblioteca.model.Livro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BibliotecaView {
    private Scanner input;
    public BibliotecaView() {
        input = new Scanner(System.in);
    }
    public int menuPrincipal() {
        System.out.println("|--------------------------------------|");
        System.out.println("|    Bem vindo a Biblioteca WEG 2.0    |");
        System.out.println("|--------------------------------------|");
        System.out.println("| 1- Cadastrar Livro                   |");
        System.out.println("| 2- Listar Livro                      |");
        System.out.println("| 3- Excluir Livro                     |");
        System.out.println("| 4- Reservar Livro                    |");
        System.out.println("| 5- Pesquisar Livro|");
        System.out.println("| 6- Sair do Sistema                   |");
        System.out.println("|--------------------------------------|");
        System.out.print("|Sua Escolha:");
        int opcaoMenu = input.nextInt();
        System.out.println("|--------------------------------------|");
        return opcaoMenu;
    }
    public Livro cadastrarLivro(Livro livro) {
        input.nextLine();
        System.out.println("|--------------------------------------|");
        System.out.println("|           Cadastrar Livro            |");
        System.out.println("|--------------------------------------|");
        System.out.print("|Título do Livro: ");
        String titulo = input.nextLine();
        System.out.print("|Autor do Livro: ");
        String autor = input.nextLine();
        System.out.print("|Data de Publicação (AAAA/MM/DD):");
        String data = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dataFormatada = LocalDate.parse(data, formatter);
        livro = new Livro(titulo, autor, dataFormatada);
        System.out.println("|--------------------------------------|");
        System.out.println("|    Livro Registrado com Sucesso!!!   |");
        System.out.println("|--------------------------------------|");
        System.out.println("\n");
        return livro;
    }
    public void listarLivros(Livro l) {
        int cont = 1;
        System.out.print(cont + "- ");
        System.out.println(l.getTitulo());
        cont++;
    }
    public int escolherLivroExcluir(Livro l) {
        System.out.println("|--------------------------------------|");
        System.out.println("|          Excluir Livro               |");
        System.out.println("|--------------------------------------|");
        int cont = 1;
        System.out.print(cont + "- ");
        System.out.println(l.getTitulo());
        System.out.println("Sua Escolha: ");
        int escolha = input.nextInt();
        cont++;
        System.out.println("|--------------------------------------|");
        System.out.println("|    Livro Excluido com Sucesso!!!   |");
        System.out.println("|--------------------------------------|");
        System.out.println("\n");
        return escolha;
    }
    public int reservarLivro(Livro l) {
        System.out.println("|--------------------------------------|");
        System.out.println("|          Reservar Livro              |");
        System.out.println("|--------------------------------------|");
        int cont = 1;
        System.out.print(cont + "- ");
        System.out.println(l.getTitulo());
        System.out.println("Sua Escolha: ");
        int escolha = input.nextInt();
        cont++;
        System.out.println("|--------------------------------------|");
        System.out.println("|    Livro Reservado com Sucesso!!!   |");
        System.out.println("|--------------------------------------|");
        System.out.println("\n");
        return escolha;
    }
    public int tipoPesquisa() {
        System.out.println("|--------------------------------------|");
        System.out.println("|          Pesquisar livro             |");
        System.out.println("|--------------------------------------|");
        System.out.println("|1- Pesquisar por Título               |");
        System.out.println("|2- Pesquisar por Autor                |");
        System.out.println("|3- Pesquisar por ID                   |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Sua Escolha:");
        int escolha = input.nextInt();
        return escolha;
    }
    public String pesquisarTitulo() {
        input.nextLine();
        System.out.println("|--------------------------------------|");
        System.out.println("|        Pesquisar por Título          |");
        System.out.println("|--------------------------------------|");
        System.out.print("Título: ");
        String titulo = input.nextLine();
        return titulo;
    }
    public String pesquisarAutor() {
        input.nextLine();
        System.out.println("|--------------------------------------|");
        System.out.println("|        Pesquisar por Autor          |");
        System.out.println("|--------------------------------------|");
        System.out.print("Autor: ");
        String autor = input.nextLine();
        return autor;
    }

    public void pesquisarID() {

        System.out.println("|--------------------------------------|");
        System.out.println("|        Pesquisar por ID          |");
        System.out.println("|--------------------------------------|");

    }

    public void pesquisarIDlivro(Livro l) {

        System.out.println(l.getTitulo());

    }
}

