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
}
