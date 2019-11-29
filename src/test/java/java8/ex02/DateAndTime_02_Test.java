package java8.ex02;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 02 - LocalDate
 */
public class DateAndTime_02_Test {

    @Test
    public void test_localDate_of() {

        // créer un objet LocalDate à la date 24/12/2050
        LocalDate result = LocalDate.parse( "2050-12-24");

        // valoriser les différentes variables afin de rendre le test passant
        int year 			= result.getYear();
        Month month 		= result.getMonth();;
        int dayOfMonth 		= result.getDayOfMonth();
        DayOfWeek dayOfWeek = result.getDayOfWeek();
        int dayOfYear 		= result.getDayOfYear();

        assertThat(year, is(2050));
        assertThat(month, is(Month.DECEMBER));
        assertThat(dayOfMonth, is(24));
        assertThat(dayOfWeek, is(DayOfWeek.SATURDAY));
        assertThat(dayOfYear, is(358));
    }

    @Test
    public void test_localDate_parse() {

        // créer un objet LocalDate à la date 10/01/1990
        // utiliser la méthode parse
        LocalDate result = LocalDate.parse( "1990-01-10");


        // valoriser les différentes variables afin de rendre le test passant
        int year 			= result.getYear();
        Month month 		= result.getMonth();
        int dayOfMonth 		= result.getDayOfMonth();


        assertThat(year, is(1990));
        assertThat(month, is(Month.JANUARY));
        assertThat(dayOfMonth, is(10));
    }

    @Test
    public void test_localDate_format() {

        // créer un objet LocalDate à la date 11/03/2015
        // utiliser la méthode of
        LocalDate localDate = LocalDate.of( 2015, 03, 11);

        // Formatter la date pour que le test soit passant
        String result = localDate.format( DateTimeFormatter.ofPattern( "dd - MM - yyyy"));

        assertThat(result, is("11 - 03 - 2015"));
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void test_localDate_format_with_hour() {

        // créer un objet LocalDate à la date 11/03/2015
        // utiliser la méthode of
        LocalDate localDate = LocalDate.of( 2015, 03, 11);

        // Formatter la date pour avoir l'affichage suivant : "11/03/2015 00:00:00"
        String result = localDate.format( DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm:ss"));

        assertThat(result, is("11/03/2015 00:00:00"));
        
    }

    @Test
    public void test_with() {

        // créer un objet LocalDate à la date 10/01/2000
        // utiliser la méthode of
        LocalDate localDate = LocalDate.of( 2000, 01, 10);

        // TODO transformer la date précédente en 05/02/2015
        LocalDate result = localDate.plusYears(15).plusMonths(1).plusDays(-5);

        assertThat(result.getYear(), is(2015));
        assertThat(result.getMonth(), is(Month.FEBRUARY));
        assertThat(result.getDayOfMonth(), is(5));
    }

}
