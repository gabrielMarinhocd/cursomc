package gabrielmarinho.site.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import gabrielmarinho.site.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfimationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
