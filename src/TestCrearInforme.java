import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class TestCrearInforme {

    @Test
    public void testInforme() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);

        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 90.0€\n" +
                "Import a pagar: 90.0€\n" +
                "Punts guanyats: 1\n");
    }

    @Test
    public void testInformeSinLloguer() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "Import a pagar: 0.0€\n" +
                "Punts guanyats: 0\n");
    }

    @Test
    public void testInformeGeneralUnDia() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.GENERAL);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 1, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 120.0€\n" +
                "Import a pagar: 120.0€\n" +
                "Punts guanyats: 1\n");
    }

    @Test
    public void testInformeGeneralDosDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.GENERAL);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 3, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 195.0€\n" +
                "Import a pagar: 195.0€\n" +
                "Punts guanyats: 1\n");
    }


    @Test
    public void testInformeGeneralDiezDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.GENERAL);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 10, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 720.0€\n" +
                "Import a pagar: 720.0€\n" +
                "Punts guanyats: 1\n");
    }


    @Test
    public void testInformeLuxeUnDia() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 1, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 180.0€\n" +
                "Import a pagar: 180.0€\n" +
                "Punts guanyats: 1\n");
    }

    @Test
    public void testInformeLuxeDosDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 360.0€\n" +
                "Import a pagar: 360.0€\n" +
                "Punts guanyats: 2\n");
    }

    @Test
    public void testInformeLuxeDiezDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.LUXE);


        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Date dateDos = dateFormat.parse("6/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 10, vehicleBasic);


        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);



        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tVista Tata: 360.0€\n" +
                "Import a pagar: 360.0€\n" +
                "Punts guanyats: 2\n");
    }







}
