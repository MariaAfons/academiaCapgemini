package desafio3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafio3 {

public static int anagrama(String phrase) {

Map<String, Integer> hashMap = new HashMap<>();
for (int i = 0; i < phrase.length(); i++) {
for (int j = i; j < phrase.length(); j++) {
char[] substrings = phrase.substring(i, j + 1).toCharArray();
Arrays.sort(substrings);
String newPhrase = new String(substrings);

if (hashMap.containsKey(newPhrase)) {
hashMap.put(newPhrase, hashMap.get(newPhrase) + 1);
} else {
hashMap.put(newPhrase, 1);
}
}
}
int paresAnagrama = 0;
for (String newPhrase : hashMap.keySet()) {
int i = hashMap.get(newPhrase);
paresAnagrama += (i * (i - 1)) / 2;
}
return paresAnagrama;
}

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Tipo de senteça: ");
String phrase = scanner.next();

System.out.print(anagrama(phrase) + " possiveis anagramas");

}
}