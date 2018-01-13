/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;


public class SendingMail {

    private static String host = "smtp.gmail.com";
    private static String port = "587";
    private static String user = "abc@gmail.com";
    private static String pass = "";

    //    private char[] pass ="satish26";
    public static void sendMail(String email, StringBuffer password) throws MessagingException {

        String recipient = email;
        String subject = "Login Credential";
        String content = "Please Use this link for JarvisSoft Technology Login \n"
                + "Link:   http://jarvissoft-pc:8080/StudManagement/faces/index.xhtml \n\nUser_Name: " + email + "\n\nPassword: " + password;

        System.out.println("in sendmaillll.................." + password);

        try {
            EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void sendAllMail(String email, String content) throws MessagingException {

        String recipient = email;
        String subject = "jarvissofttechnology Link";

        try {
            EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
