package samuelzorto_examen1p2;

public class Escritorio extends PC{
    protected int ram, almacenamiento;
    protected String tipoA;
    protected boolean grafic;

    public Escritorio() {
        super();
    }

    public Escritorio(int ram, int almacenamiento, String tipoA, boolean grafic, String ip, String mark, String host) {
        super(ip, mark, host);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipoA = tipoA;
        this.grafic = grafic;
    }

    

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoA() {
        return tipoA;
    }

    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }

    public boolean isGrafic() {
        return grafic;
    }

    public void setGrafic(boolean grafic) {
        this.grafic = grafic;
    }

    @Override
    public String toString() {
        return "Escritorio  \n" + super.toString() + "ram:" + ram + "\nalmacenamiento: " + almacenamiento + "\ntipoA: " + tipoA + "\ngrafic: " + grafic + "\n \n";
    }
    
    
}
