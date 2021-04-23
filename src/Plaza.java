public class Plaza {
    private int idPlaza;
    private Vuelo vuelo;
    private Categoria categoria;
    private int numeroplazas;
    private double tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, Categoria categoria, int numeroplazas, double tarifa) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroplazas = numeroplazas;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroplazas() {
        return numeroplazas;
    }

    public void setNumeroplazas(int numeroplazas) {
        this.numeroplazas = numeroplazas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
