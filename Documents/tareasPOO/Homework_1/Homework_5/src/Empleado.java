public class Empleado {
    double sB;
    double b;
    double he;
    double salario;

    public void calcularSalario(double salarioBase) {
        sB = salarioBase;
        System.out.println("Salario: " + sB);

    }

    public void calcularSalario(double salarioBase, double bonificación) {
        sB = salarioBase;
        b = bonificación;
        sB = sB + b;
        System.out.println("Salario: " + sB);

    }

    public void calcularSalario(double salarioBase, double bonificación, double horas_extras) {
        sB = salarioBase;
        b = bonificación;
        he = horas_extras;
        sB = sB + b + (he * 20f);
        System.out.println("Salario: " + sB);

    }

}
