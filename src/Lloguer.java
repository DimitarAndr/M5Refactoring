import java.util.Date;

public class Lloguer {

    private static final double NUMERO_DIAS_INICIALES_BASIC =3;
    private static final double NUMERO_DIAS_INICIALES_GENERAL =2;
    private static final double UNIDADES_COSTE_BASIC_HASTA_TRES_DIAS =3;
    private static final double UNIDADES_COSTE_GENERAL_HASTA_DOS_DIAS =4;
    private static final double MULTIPLICATOR_BASIC_MAS_DE_TRES_DIAS=1.5;
    private static final double MULTIPLICATOR_GENERAL_MAS_DE_DOS_DIAS=2.5;
    private static final double MULTIPLICATOR_LUXE=6;


        private Date data;
        private int dies;
        private Vehicle vehicle;


        public Lloguer(Date data, int dies) {
            this.data = data;
            this.dies = dies;
        }

        public Lloguer(Date data, int dies, Vehicle vehicle) {
            this(data, dies);
            this.vehicle = vehicle;
        }

        public Date getData() {
            return this.data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        public int getDies() {
            return this.dies;
        }

        public void setDies(int dies) {
            this.dies = dies;
        }

        public Vehicle getVehicle() {
            return this.vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

    public double quantitat() {
        double quantitat = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += UNIDADES_COSTE_BASIC_HASTA_TRES_DIAS;
                if (getDies() > NUMERO_DIAS_INICIALES_BASIC) {
                    quantitat += (getDies() - NUMERO_DIAS_INICIALES_BASIC) * MULTIPLICATOR_BASIC_MAS_DE_TRES_DIAS;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += UNIDADES_COSTE_GENERAL_HASTA_DOS_DIAS;
                if (getDies() > NUMERO_DIAS_INICIALES_GENERAL) {
                    quantitat += (getDies() - NUMERO_DIAS_INICIALES_GENERAL) * MULTIPLICATOR_GENERAL_MAS_DE_DOS_DIAS;
                }
                break;
            case Vehicle.LUXE:
                quantitat += getDies() * MULTIPLICATOR_LUXE;
                break;
        }
        return quantitat;
    }

    public int bonificacions() {
        int bonificacions = 0;
        // afegeix lloguers freqüents
        bonificacions++;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (getVehicle().getCategoria() == Vehicle.LUXE &&
                getDies() > 1) {
            bonificacions++;
        }
        return bonificacions;
    }
}
