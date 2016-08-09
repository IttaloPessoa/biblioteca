package biblioteca;

public class Prateleira {

	private int capacidade;
	private Livro[] livros = new Livro[capacidade];
	private String identificador;
	
	
	public boolean existeLivro(String isbn){
		for(Livro l: livros){
			if(l.getIsbn().equals(isbn)){
				return true;
			}
		}
		return false;
	}

	public void addLivro(Livro livro) throws LivroJaExisteExcepiton{
		
		for(int i = 0; i<=capacidade; i++){
			if(livros[i]!=null){
				if(existeLivro(livro.getIsbn())){
					throw new LivroJaExisteExcepiton("Livro já cadastrado");
				}
				else{
					livros[i] = livro;
					break;
				}
				
			}
		}
		
	}
	
	public Livro getLivro(String isbn) throws LivroNaoExisteException{
		for(Livro l : livros){
			if(existeLivro(isbn)){
				return l;
			}
		}
		throw new LivroNaoExisteException("Livro não cadastrado!");
	}
	
	public int totalLivros(){
		int total = 0;
		for(int i = 0; i<=capacidade; i++){
			if(livros[i]!= null){
				total++;
			}
		}
		return total;
	}


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	

}
