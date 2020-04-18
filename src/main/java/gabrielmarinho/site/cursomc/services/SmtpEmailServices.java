package gabrielmarinho.site.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailServices extends AbstractEmailService {

	@Autowired
	private MailSender mailSender;
	private static final Logger Log = LoggerFactory.getLogger(SmtpEmailServices.class);
	
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		Log.info("Enviando email...");
		mailSender.send(msg);
		Log.info("Email enviado");
		
	}

}
