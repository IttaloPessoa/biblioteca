package biblioteca;

public class LivroJaExisteExcepiton extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LivroJaExisteExcepiton(String msg){
		super(msg);
	}

}
