package co.com.notificaciones.factory;

import co.com.notificaciones.model.NotificationData;
import co.com.notificaciones.model.NotificationType;
import co.com.notificaciones.service.EmailNotification;
import co.com.notificaciones.service.Notification;
import co.com.notificaciones.service.SmsNotification;
import co.com.notificaciones.service.WhatsAppNotification;

public class NotificationFactory {

    private NotificationFactory() {
    }

    public static Notification createNotification(NotificationType type, NotificationData data) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de notificación no puede ser null.");
        }

        if (data == null) {
            throw new IllegalArgumentException("Los datos de la notificación no pueden ser null.");
        }

        switch (type) {
            case EMAIL:
                return new EmailNotification(data);
            case SMS:
                return new SmsNotification(data);
            case WHATSAPP:
                return new WhatsAppNotification(data);
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + type);
        }
    }
}
