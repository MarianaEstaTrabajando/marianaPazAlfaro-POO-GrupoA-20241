public class Rectangulo {
    int b, h, a, p;
    double B, H, A, P;

    public Rectangulo(double Base, double Altura) {
        B = Base;
        H = Altura;

    }

    public Rectangulo(int base, int altura) {
        b = base;
        h = altura;
    }

    public double Area() {
        A = B * H;
        return A;
    }

    public int Area(boolean con_decimal) {
        a = b * h;
        return a;
    }

    public int Peri() {
        p = 2 * b + 2 * h;
        return p;
    }

    public double Peri(boolean con_decimal) {
        P = 2 * B + 2 * H;
        return P;
    }

}