public class Rectangulo {
    double ancho;
    double altura;
    String color;

    Rectangulo(double width, double height, String Color) {
        ancho = width;
        altura = height;
        color = Color;

    }

    public void Area() {
        double area = ancho * altura;

        System.out.println("El área es " + area);
    }

    public void Perimetro() {
        double peri = 2 * altura + 2 * ancho;
        System.out.println("El perimetro es " + peri);
    }
}
