import java.util.Vector;

public class Client {
    private static final double EUROS_PER_UNITAT_DE_COST = 30;

    private String nif;
    private String nom;
    private String telefon;
    private Vector<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void afegeix(Lloguer lloguer) {
        if (!lloguers.contains(lloguer)) {
            lloguers.add(lloguer);
        }
    }

    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer)) {
            lloguers.remove(lloguer);
        }
    }

    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public String informeHTML() {

        StringBuilder sb = new StringBuilder();

        capsaleraHTML(sb);
        detallHTML(sb);
        peuHTML(sb);

        return sb.toString();

    }


    public String informe() {

        return composaCapsalera() + composaDetall() + composaPeu();


    }

    private void capsaleraHTML(StringBuilder sb) {
        sb.append("<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>" + this.getNom() + "</em> (<strong>" + this.getNif() + "</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\n");
    }

    private void detallHTML(StringBuilder sb) {
        lloguers.forEach(lloguer -> {
            sb.append("\t<tr><td>" + lloguer.getVehicle().getMarca() + "</td><td>" + lloguer.getVehicle().getModel() + "</td><td>" + lloguer.quantitatUnidadesDeCoste() * EUROS_PER_UNITAT_DE_COST + "€</td></tr>\n");
        });
    }

    private StringBuilder peuHTML(StringBuilder sb) {
        return sb.append("</table>\n"+
                "<p>Import a pagar: <em>" + importTotal() + "€</em></p>\n" +
                "<p>Punts guanyats: <em>" + bonificacionsTotals() + "</em></p>");
    }


    private String composaPeu() {
        String resultatPeu = "";
        // afegeix informació final
        resultatPeu += "Import a pagar: " + importTotal() + "€\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultatPeu;
    }

    private String composaDetall() {
        String resultatDetall = "";
        for (Lloguer lloguer : lloguers) {

            // composa els resultats d'aquest lloguer
            resultatDetall += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitatUnidadesDeCoste() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
        return resultatDetall;
    }

    private String composaCapsalera() {
        String resultCapselera = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";

        return resultCapselera;
    }

    private double importTotal() {
        int resultImportTotal = 0;
        for (Lloguer lloguer : lloguers) {
            resultImportTotal += lloguer.quantitatUnidadesDeCoste() * EUROS_PER_UNITAT_DE_COST;
        }
        return resultImportTotal;
    }

    private int bonificacionsTotals() {
        int resultBonificacions = 0;
        for (Lloguer lloguer : lloguers) {
            resultBonificacions += lloguer.bonificacions();
        }
        return resultBonificacions;
    }


}