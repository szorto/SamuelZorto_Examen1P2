package samuelzorto_examen1p2;


public class Laptop extends PC{
    protected String Marca;
    protected int def1, def2;
    protected boolean rgb;

    public Laptop() {
        super();
    }

    public Laptop(String Marca, int def1, int def2, boolean rgb, String ip, String mark, String host) {
        super(ip, mark, host);
        this.Marca = Marca;
        this.def1 = def1;
        this.def2 = def2;
        this.rgb = rgb;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getDef1() {
        return def1;
    }

    public void setDef1(int def1) {
        this.def1 = def1;
    }

    public int getDef2() {
        return def2;
    }

    public void setDef2(int def2) {
        this.def2 = def2;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Laptop\n" + super.toString() + "Marca: " + Marca + "\ndefinicion: " + def1 + "x" + def2 + "\nrgb: "  + rgb + "\n \n";
    }
    
    
}
