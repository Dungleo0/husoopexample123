package lab6.themycomplexclass;

public class Mycomplex {

    private double real = 0.0;
    private double imag = 0.0;

    public Mycomplex() {
    }

    public Mycomplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    @Override
    public String toString() {
        return String.format("(%.1f + %.1fi)", this.real, this.imag);
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(Mycomplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public Mycomplex addInto(Mycomplex right) {
        this.real = (this.real + right.real);
        this.imag = (this.imag + right.imag);
        return this;
    }

    public Mycomplex addNew(Mycomplex right) {
        double realNew = (this.real + right.real);
        double imagNew = (this.imag + right.imag);
        return new Mycomplex(realNew,imagNew);
    }
}
