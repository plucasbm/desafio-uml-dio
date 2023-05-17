package desafio_uml;

import desafio_uml.interfaces.AparelhoTelefonico;
import desafio_uml.interfaces.NavegadorInternet;
import desafio_uml.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
	}

	@Override
	public void pausar() {
		System.out.println("MUSICA PAUSADA");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONAR NOVA MUSICA");
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA DA WEB");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA NO NAVEGADOR");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
	}

	@Override
	public void ligar() {
		System.out.println("FAZENDO CHAMADA");
	}

	@Override
	public void atender() {
		System.out.println("RECEBENDO CHAMADA");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("ENCAMINHANDO PARA O CORREIO DE VOZ");
	}
	
}
