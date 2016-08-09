package biblioteca;

public class Estante {
	
	private Prateleira [] prateleiras = new Prateleira[20];
	private String identificador;
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public void criarPrateleira(Prateleira prateleira){
		for(int i = 0; i<=prateleiras.length; i++){
			if(prateleiras[i]!= null){
				prateleiras[i] = prateleira;
			}
		}
	}
	
	public Prateleira getPrateleira(String id) throws PrateleiraNaoExistenteException{
		for(Prateleira p: prateleiras){
			if(p.getIdentificador().equals(id)){
				return p;
			}
		}
		throw new PrateleiraNaoExistenteException("Prateleira inexistente!");
	}

}
