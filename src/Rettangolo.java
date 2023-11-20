public class Rettangolo {
    private int altezza, base;

    public Rettangolo(int altezza, int base) {
        this.altezza = altezza;
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getBase() {
        return base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int area (){
        int a=base*altezza;
        return a;
    }

    public int perimetro (){
        int p= 2*(altezza+base);
        return p;
    }

    public double diagonale (){
        double diagonale = Math.sqrt(Math.pow(altezza, 2) + Math.pow (base, 2));
        return diagonale;
    }
}
