package net.weg.appbiblioteca.service;
import net.weg.appbiblioteca.model.Livro;
import net.weg.appbiblioteca.view.BibliotecaView;
import java.util.ArrayList;
import java.util.List;
public class BibliotecaService {

    private List<Livro> livros;

    BibliotecaView view = new BibliotecaView();
    Livro livro = new Livro();
    public BibliotecaService(){ livros = new ArrayList<>(); }

    public boolean gerenciarBiblioteca(int opcao, Livro livroRegistrar, boolean continuar ) {

        switch(opcao) {

            case 1-> { livroRegistrar = view.cadastrarLivro(livro); livros.add(livroRegistrar); }

            case 2->{ for ( Livro l : livros) { view.listarLivros(l); } }

            case 3->{ for ( Livro l : livros ) {int escolhaExcluir = view.escolherLivroExcluir(l); int escolhaAtualizada = escolhaExcluir - 1 ; livros.remove(escolhaAtualizada); } }

            case 4->{ for (Livro l: livros) { int escolha =  view.reservarLivro(l); l.setDisponivel(false);} }

            case 5-> { int tipoPesquisa = view.tipoPesquisa();

                if (tipoPesquisa == 1) {

                    String titulo =  view.pesquisarTitulo();

                    for ( Livro f : livros ) {

                        if ( titulo.equals(livro.getTitulo())) {

                            System.out.println(f);
                        }
                    }

                }

                else if ( tipoPesquisa == 2 ) {

                    String autor =  view.pesquisarAutor();

                    for ( Livro f : livros ) {

                        if ( autor.equals(livro.getTitulo())) {

                            System.out.println(f);
                        }
                    }

                }

                else if ( tipoPesquisa == 3) {

                    for ( Livro l : livros ) {

                        view.pesquisarID();
                        int pesquisaID = view.pesquisarI();

                    }


                }

            }


            case 6-> { return false; }


        }

        return true;


    }

}



