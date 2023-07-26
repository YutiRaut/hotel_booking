

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Random;

public class OtpSender {
    public static void main(String[] args) {
        // Generate OTP
        String otp = generateOTP();

        // Email configuration
        String host = "smtp.gmail.com";
        String port = "465";
        String username = "travellerapptesting@gmail.com";
        String password = "wjdjunrnxljqfesu";
        String recipientEmail = "yutiraut2002@gmail.com";
        String subject = "OTP Verification";
        String message = "Your OTP is: " + otp;

        // Send OTP via email
        try {
            sendEmail(host,port,username, password, recipientEmail, subject, message);
            System.out.println("OTP sent successfully!");
        } catch (MessagingException ex) {
            System.out.println("Failed to send OTP. Error message: " + ex.getMessage());
        }
    }

    private static String generateOTP() {
        // Generate a random 6-digit OTP
        System.out.println("hello");
        Random random = new Random();
        int otpValue = 100_000 + random.nextInt(900_000);
        return String.valueOf(otpValue);
    }

    private static void sendEmail(String host,String port,String username, String password,
                                  String recipientEmail, String subject, String message) throws MessagingException {
        // Setup email properties
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.starttls.enable",true);
        props.put("mail.smtp.start",true);
        props.put("mail.smtp.auth", true);



        // Create a session with authentication
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
        });

        // Create and populate the email message
        Message emailMessage = new MimeMessage(session);
        emailMessage.setFrom(new InternetAddress(username));
        emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        emailMessage.setSubject(subject);
        emailMessage.setText(message);

        // Send the email
        Transport.send(emailMessage);
    }
}



