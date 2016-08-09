package biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setNome("Código da Vinci");
		livro.setQuantidade(2);
		livro.setIsbn("123");
		
		Prateleira prateleira = new Prateleira();
		try {
			prateleira.addLivro(livro);
		} catch (LivroJaExisteExcepiton e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Estante estante = new Estante();
		estante.criarPrateleira(prateleira);
		estante.setIdentificador("444");
		try {
			estante.getPrateleira("444");
		} catch (PrateleiraNaoExistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
