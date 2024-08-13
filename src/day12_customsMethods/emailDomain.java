package day12_customsMethods;

public class emailDomain {

    public static void main(String[] args) {

        mailDomain("cydedshfushfisdjfisjgjgog@gutlook.fr");


    }

    public static void mailDomain(String email){

       // String mailDomain= "refianur@gmail.com";

       String mailDomain = email.substring(email.indexOf("@")+1 ,email.lastIndexOf("."));
        System.out.println(mailDomain);
    }

}

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */
