public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double add(double real, double imaginary) {
    }

    public double add(ComplexNumber complexNumber) {
        return (complexNumber + this.imaginary + this.real);
    }

}
