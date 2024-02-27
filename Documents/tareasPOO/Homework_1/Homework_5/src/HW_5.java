public class HW_5 {
    public static void main(String[] args) throws Exception {

        Rectangulo rec = new Rectangulo(4, 5);
        System.out.println("Area " + rec.Area());

        Empleado juan = new Empleado();
        System.out.println("Juan ");

        juan.calcularSalario(4500, 3000, 4.5);

        CalculadoraImpuestos xin = new CalculadoraImpuestos();
        xin.calcular_impuestos(6000, 7, 0.8, 5, 5000);
    }
}
