package com.question7;

import java.util.regex.Pattern;

public class Source {
    public static void main(String[] args) {

        Email e = new Email(new Header("meghavasu9@gmail.com","Akshaylm@gmail.com"),"hi and bye","p.s.");

        EmailOperations eo = new EmailOperations();
        System.out.println(eo.emailVerify(e));
        System.out.println(eo.bodyEncryption(e));
        System.out.println(eo.greetingMessage(e));


    }
}
class Header {
    String from;
    String to;

    public Header(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
class Email
{
    Header header;
    String body;
    String greetings;

    public Email(Header header, String body, String greetings) {
        this.header = header;
        this.body = body;
        this.greetings = greetings;
    }
}
class EmailOperations
{
    public int emailVerify(Email e)
    {
        boolean from = Pattern.matches("[a-zA-z_][\\w]+[@][a-zA-z]+[\\.][a-zA-z]+",e.header.from);
        boolean to = Pattern.matches("[a-zA-z_][\\w]+[@][a-zA-z]+[\\.][a-zA-z]+",e.header.to);
        if(from && to)
            return 2;
        else if (from || to)
            return 1;
        else
            return 0;
    }
    public String bodyEncryption(Email e)
    {
        String bodyText = e.body;
        StringBuilder cipherText = new StringBuilder();
        for(int i =0;i<bodyText.length();i++)
        {
            char ch = bodyText.charAt(i);
           if(ch==' ')
           {
               cipherText.append(ch);
           }
           else
           {
               if(Character.isUpperCase(ch))
               {
                   int ascii = ch;
                   if(ascii>=65 && ascii<=87)
                   {
                       ascii+=3;
                       char c = (char)ascii;
                       cipherText.append(c);
                   }
                   else
                   {
                       if(ch=='X')
                           cipherText.append('A');
                       if(ch=='Y')
                           cipherText.append('B');
                       if(ch=='Z')
                           cipherText.append('C');
                   }

               }
               else
               {
                   int ascii = ch;
                   if(ascii>=97 && ascii<=119)
                   {
                       ascii+=3;
                       char c = (char)ascii;
                       cipherText.append(c);
                   }
                   else
                   {
                       if(ch=='x')
                           cipherText.append('a');
                       if(ch=='y')
                           cipherText.append('b');
                       if(ch=='z')
                           cipherText.append('c');
                   }
               }
           }
        }
        return cipherText.toString();
    }
    public String greetingMessage(Email e)
    {
        String greetings = e.greetings;
        String mail = e.header.from;
        int index=mail.indexOf('@');
        String name = mail.substring(0,index);

        return greetings+" "+name;

    }
}