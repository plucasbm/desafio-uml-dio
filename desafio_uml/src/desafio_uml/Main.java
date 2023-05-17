package desafio_uml;


public class Main {
	
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		System.out.println("FUNCAO: APARELHO TELEFONICO");
		iphone.atender();
		iphone.ligar();
		iphone.iniciarCorreioVoz();
		System.out.println("\n");
		
		System.out.println("FUNCAO: NAVEGADOR DE INTERNET");
		iphone.adicionarNovaAba();
		iphone.exibirPagina();
		iphone.atualizarPagina();
		System.out.println("\n");
		
		System.out.println("FUNCAO: REPRODUTOR MUSICAL");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
	}
}
