package gabrielmarinho.site.cursomc.resources.exeption;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FildMessage> errors = new ArrayList<>();
	
	
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}


	public List<FildMessage> getErrors() {
		return errors;
	}


	public void addError(String fildName, String messagem) {
		errors.add(new FildMessage(fildName, messagem));
	}

	

}
