package net.weg.appbiblioteca.app;
import net.weg.appbiblioteca.view.BibliotecaView;
import net.weg.appbiblioteca.service.BibliotecaService;
import net.weg.appbiblioteca.model.Livro;
public class Main {
    public static void main(String[] args) {

        BibliotecaView view = new BibliotecaView();
        BibliotecaService service = new BibliotecaService();
        Livro livro = new Livro();

        boolean continuar = true;

        while(continuar) {


            int opcao = view.menuPrincipal();
            service.gerenciarBiblioteca(opcao, livro, continuar);


        }

    }
}

