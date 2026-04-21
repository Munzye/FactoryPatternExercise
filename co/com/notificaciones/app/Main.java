package co.com.notificaciones.app;

import co.com.notificaciones.factory.NotificationFactory;
import co.com.notificaciones.model.NotificationData;
import co.com.notificaciones.model.NotificationType;
import co.com.notificaciones.service.Notification;

public class Main {

    public static void main(String[] args) {

        //Correo
        NotificationData emailData = new NotificationData();
        emailData.setRecipientName("Carlos Pérez");
        emailData.setEmail("carlos.perez@gmail.com");
        emailData.setMessage("Hola Carlos, tienes una nueva notificación por correo.");

        Notification emailNotification =
                NotificationFactory.createNotification(NotificationType.EMAIL, emailData);
        emailNotification.send();

        //SMS
        NotificationData smsData = new NotificationData();
        smsData.setRecipientName("Laura Gómez");
        smsData.setPhoneNumber("+573001234567");
        smsData.setMessage("Hola Laura, este es un SMS de prueba.");

        Notification smsNotification =
                NotificationFactory.createNotification(NotificationType.SMS, smsData);
        smsNotification.send();

        //Whats personal
        NotificationData whatsappPersonalData = new NotificationData();
        whatsappPersonalData.setRecipientName("Andrés Torres");
        whatsappPersonalData.setPhoneNumber("+573109876543");
        whatsappPersonalData.setMessage("Hola Andrés, te escribimos por WhatsApp.");
        whatsappPersonalData.setWhatsappGroup(false);

        Notification whatsappPersonal =
                NotificationFactory.createNotification(NotificationType.WHATSAPP, whatsappPersonalData);
        whatsappPersonal.send();

        //Grupos de Whats
        NotificationData whatsappGroupData = new NotificationData();
        whatsappGroupData.setRecipientName("Grupo Desarrollo Web");
        whatsappGroupData.setPhoneNumber("+573201112233");
        whatsappGroupData.setMessage("Hola equipo, recuerden la reunión de hoy.");
        whatsappGroupData.setWhatsappGroup(true);
        whatsappGroupData.setWhatsappGroupLink("https://chat.whatsapp.com/ABC123xyz");

        Notification whatsappGroup =
                NotificationFactory.createNotification(NotificationType.WHATSAPP, whatsappGroupData);
        whatsappGroup.send();
    }
}
