package co.com.notificaciones.service;

import co.com.notificaciones.model.NotificationData;
import co.com.notificaciones.util.Validator;

public class WhatsAppNotification implements Notification {

    private final NotificationData data;

    public WhatsAppNotification(NotificationData data) {
        Validator.validateName(data.getRecipientName());
        Validator.validateMessage(data.getMessage());
        Validator.validateColombiaPhone(data.getPhoneNumber());

        if (data.isWhatsappGroup()) {
            Validator.validateWhatsappGroupLink(data.getWhatsappGroupLink());
        }

        this.data = data;
    }

    @Override
    public void send() {
        System.out.println("=== ENVÍO DE WHATSAPP ===");
        System.out.println("Destinatario: " + data.getRecipientName());
        System.out.println("Celular: " + data.getPhoneNumber());
        System.out.println("Mensaje: " + data.getMessage());

        if (data.isWhatsappGroup()) {
            System.out.println("Tipo: Grupo de WhatsApp");
            System.out.println("Link del grupo: " + data.getWhatsappGroupLink());
        } else {
            System.out.println("Tipo: Chat personal");
        }

        System.out.println("WhatsApp enviado correctamente.\n");
    }
}
