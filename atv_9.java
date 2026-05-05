package Atividades.lista_10;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] let = new char[15];
        int

        System.out.println("Digite 15 caracteres(letras), o sistema vai checar quantos deles são vogais: ");
        for (int i = 0 ; i< let.length; i++){
            System.out.print((i+1)+"ª caracter: ");
            let[i] = sc.next().toUpperCase().charAt(0);
            if (let[i]=='A'||let[i]=='E'||let[i]=='I'||let[i]=='O'||let[i]=='U');
        }
    }
}
