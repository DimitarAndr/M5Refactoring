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
                "\tTata Vista: 90.0€\n" +
                "Import a pagar: 90.0€\n" +
                "Punts guanyats: 1\n");
    }

    @Test
    public void testInformeDosCoches() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleGeneral = new Vehicle("Ford", "Focus", Vehicle.GENERAL);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerGeneral = new Lloguer(date, 4, vehicleGeneral);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);
        clientUno.afegeix(lloguerGeneral);

        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tTata Vista: 90.0€\n" +
                "\tFord Focus: 270.0€\n" +
                "Import a pagar: 360.0€\n" +
                "Punts guanyats: 2\n");
    }

    @Test
    public void testInformeTresCoches() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleGeneral = new Vehicle("Ford", "Focus", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Mercedes", "SLK", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerGeneral = new Lloguer(date, 4, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 3, vehicleLuxe);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);
        clientUno.afegeix(lloguerGeneral);
        clientUno.afegeix(lloguerLuxe);

        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tTata Vista: 90.0€\n" +
                "\tFord Focus: 270.0€\n" +
                "\tMercedes SLK: 540.0€\n" +
                "Import a pagar: 900.0€\n" +
                "Punts guanyats: 4\n");
    }



    @Test
    public void testInformeTresDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 3, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);

        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tTata Vista: 90.0€\n" +
                "Import a pagar: 90.0€\n" +
                "Punts guanyats: 1\n");
    }

    @Test
    public void testInformeQuatroDias() throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 4, vehicleBasic);

        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);

        assertEquals(clientUno.informe(), "Informe de lloguers del client Dimitar (12345678)\n" +
                "\tTata Vista: 135.0€\n" +
                "Import a pagar: 135.0€\n" +
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
                "\tTata Vista: 120.0€\n" +
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
                "\tTata Vista: 195.0€\n" +
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
                "\tTata Vista: 720.0€\n" +
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
                "\tTata Vista: 180.0€\n" +
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
                "\tTata Vista: 360.0€\n" +
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
                "\tTata Vista: 1800.0€\n" +
                "Import a pagar: 1800.0€\n" +
                "Punts guanyats: 2\n");
    }


    @Test
    public void testInformeHTML() throws ParseException {

        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);


        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);


        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);


        assertEquals(clientUno.informeHTML(), "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Dimitar</em> (<strong>12345678</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\n" +
                "\t<tr><td>Tata</td><td>Vista</td><td>90.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>90.0€</em></p>\n" +
                "<p>Punts guanyats: <em>1</em></p>");
    }

    @Test
    public void testInformeHtmlMasVehiculos() throws ParseException {

        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleDos = new Vehicle("Mercedes", "SLK", Vehicle.LUXE);


        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerDos = new Lloguer(date, 3, vehicleDos);


        Client clientUno = new Client("12345678", "Dimitar", "654111222");
        clientUno.afegeix(lloguerBasic);
        clientUno.afegeix(lloguerDos);


        assertEquals(clientUno.informeHTML(), "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Dimitar</em> (<strong>12345678</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\n" +
                "\t<tr><td>Tata</td><td>Vista</td><td>90.0€</td></tr>\n" +
                "\t<tr><td>Mercedes</td><td>SLK</td><td>540.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>630.0€</em></p>\n" +
                "<p>Punts guanyats: <em>3</em></p>");
    }


}
