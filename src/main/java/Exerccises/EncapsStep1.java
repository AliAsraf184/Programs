package Exerccises;

import java.util.Scanner;

public class EncapsStep1 {
    Scanner sc= new Scanner(System.in);
    private String password= sc.nextLine();
    int n=0;
    boolean a=false,b=false,c=false;

    public String getPassword() {
        if (password.length() < 10) {return "Password can't declared";}
        else{
            for (int i = 0; i < password.length(); i++) {
                if ((48 <= (int)password.charAt(i) && (int)password.charAt(i) <= 57)){
                    a=true;
                }
                if((int)password.charAt(i) <= 90 && (int)password.charAt(i) >= 65){
                    b=true;
                }
                if((int)password.charAt(i) <= 122 && (int)password.charAt(i) <= 97){
                    c=true;
                }

                if(a||b||c) {
                    if (48 <= (int)password.charAt(i) && (int)password.charAt(i) <= 57)
                    {
                        n = n + 1;
                        if (n >= 2) {
                            this.password = password;

                        }                        }
                }
            }

        }
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "EncapsStep1{" +
                "password='" + password + '\'' +
                '}';
    }
}