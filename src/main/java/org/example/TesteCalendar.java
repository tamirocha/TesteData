package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();
        c.set(Calendar.DAY_OF_MONTH, 31);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.YEAR, 2010);
        c.set(Calendar.HOUR_OF_DAY, 10);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 0);

        // Formatar Calendário

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(c.getTime()));

        // Adicionar dia no Calendário, interfirindo no mês

        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(formatador.format(c.getTime()));

        // Adicionar mês no Calendário

        c.add(Calendar.MONTH, 1);
        System.out.println(formatador.format(c.getTime()));

        // Subtraindo mês no Calendário

        c.add(Calendar.MONTH, -1);
        System.out.println(formatador.format(c.getTime()));

        // Adicionar dia no Calendário, SEM interferir no mês

        c.roll(Calendar.DAY_OF_MONTH, 1);
        System.out.println(formatador.format(c.getTime()));
    }
}