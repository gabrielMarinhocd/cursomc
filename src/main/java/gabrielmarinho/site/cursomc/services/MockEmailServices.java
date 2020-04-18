package gabrielmarinho.site.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailServices extends AbstractEmailService {
	
	private static final Logger Log = LoggerFactory.getLogger(MockEmailServices.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		Log.info("Simulando envio de email...");
		Log.info(msg.toString());
		Log.info("Email enviado");
		
	}

}
