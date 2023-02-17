package Retangulo;

public class Retangulo {
    public double largura;
    public double altura;

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return 2 * (this.largura + this.altura);
    }

    public double diagonal() {
        double numerosElevados = Math.pow(this.largura, 2) + Math.pow(this.altura, 2);
        return Math.sqrt(numerosElevados);
    }

    public String toString() {
        return "Area: "
                + this.area()
                + " Perimetro: "
                + this.perimetro()
                + " Diagonal: "
                + this.diagonal();
    }
}
