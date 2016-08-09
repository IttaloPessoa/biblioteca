package biblioteca;

public class LivroNaoExisteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LivroNaoExisteException(String msg){
		super(msg);
	}

}
