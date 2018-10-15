package clases;

public class BeanOperacion extends Object {

    private int numero1;
    private int numero2;

    public BeanOperacion() {
    }

    public int suma() {
        return this.numero1 + this.numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public synchronized void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public synchronized void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
