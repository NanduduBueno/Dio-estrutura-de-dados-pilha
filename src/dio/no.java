package dio;

public class no {
    private int dado;
    private no refno = null;

    public no() {
    }
    public no(int dado) {
        this.dado = dado;
    }

    public no getrefno() {
        return refno;
    }

    public void setrefno(no refno) {
        this.refno = refno;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "no{" +
                "dado=" + dado +
                '}';
    }
}

