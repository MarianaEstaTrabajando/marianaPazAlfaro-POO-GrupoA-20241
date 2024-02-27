public class CalculadoraImpuestos {
    double impuestos;

    public void calcular_impuestos(int ingresos) {

        System.out.println("Ingresos: " + (ingresos * 0.15));
    }

    public void calcular_impuestos(int ingresos, int ventas, double porcentajeImpuesto) {
        System.out.println("Ingresos: " + (ingresos * 0.15));
        System.out.println("Ventas: " + (ventas * (porcentajeImpuesto / 100)));
    }

    public void calcular_impuestos(int ingresos, int ventas, double porcentajeImpuesto, double dividendo,
            double exencion) {
        System.out.println("Ingresos: " + (ingresos * 0.15));
        System.out.println("Ventas: " + (ventas * (porcentajeImpuesto / 100)));
        impuestos = dividendo * (porcentajeImpuesto / 100);
        if (impuestos > exencion) {
            impuestos = 0;
        }

        System.out.println("Los impuestos son: " + impuestos);

    }

}
