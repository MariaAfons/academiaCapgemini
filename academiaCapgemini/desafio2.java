package challenge2;

import java.util.Scanner;

public class Challenge2 {

public static String msgSucess = "";

public static void main(String[] args) {
Menu();
}

public static void Menu(){

Scanner write = new Scanner(System.in);

System.out.println("------------------------------------------------------------");
System.out.println("Enter a senha that meets the following criteria:"+ "\n" +
"* Have a minimum of 6 characters."+ "\n" +
"* Contain at least 1 digit."+ "\n" +
"* Contain at least 1 lowercase letter." + "\n" +
"* Contain at least 1 capital letter." + "\n" +
"* Contain at least 1 special character (!@#$%^&*()-+)."
);

System.out.print("Type it: ");
String senha = write.nextLine();

validasenha(senha);


write.close();
}

public static void validasenha(String senha){

int charactersValidated = 0;

if(senha.length() < 6){
validarCaracter = 6 - senha.length();
}else{

if (!senha.matches("(.*)[0-9](.*)")){
validarCaracter++;
}
if (!senha.matches("(.*)[a-z](.*)")){
validarCaracter++;
}
if (!senha.matches("(.*)[A-Z](.*)")){
validarCaracter++;
}
if (!senha.matches("(.*)[!@#$%^&*()-+](.*)")){
validarCaracter++;
}
}

System.out.printf("\n Remaining characters for your senha to meet security requirements: %s",validarCaracter);

System.out.println(" ");

if (validarCaracter > 0){
Menu();
} else {
System.out.println(msgSucess = "successfully registered");
}
}
}