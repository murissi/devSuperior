package Retangulo;

public class Retangulo {
    public double altura;
    public double largura;

    public double areaTriangulo() {
        return this.altura * this.largura;
    }

    public double perimetroTriangulo() {
        double ladoQuadrado = Math.pow(2, this.largura);
        return ladoQuadrado + this.altura;
    }
}
