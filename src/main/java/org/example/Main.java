package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje);

        // Formatar a data

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Date representa tanto a data quanto a hora
        System.out.println(formatador.format(hoje));

        // Fazer o caminho contrário (converter String para tipo Date)

        String dataAniversario = "24/02/1988";
        DateFormat formatador02 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date aniversario = formatador02.parse(dataAniversario);
            System.out.println(formatador.format(aniversario));
        } catch (ParseException e) {
            System.out.println("Formato de data invalido.");
        }

    }
}