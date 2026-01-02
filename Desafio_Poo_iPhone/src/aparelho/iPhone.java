package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() { System.out.println("Tocando musica...");}
    public void pausar() { System.out.println("Pausando musica...");}
    public void selecionarMusica(String musica) { System.out.println("Selecionando " + musica);}

    public void ligar(String numero) { System.out.println("Ligando para: " + numero); }
    public void atender() { System.out.println("Atendendo chamada."); }
    public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz."); }

    // Métodos de NavegadorInternet
    public void exibirPagina(String url) { System.out.println("Exibindo: " + url); }
    public void adicionarNovaAba() { System.out.println("Nova aba aberta."); }
    public void atualizarPagina() { System.out.println("Página atualizada."); }
}
