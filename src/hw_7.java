import java.util.*;

public class hw_7 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Bank banco = new Bank();
        Employee newEmployee;
        String name, lastName;
        int numero;
        long accountNumber;
        double money;

        for (int menu = 0; menu != 9;) {
            System.out.println("MENU: Ingresar el número que se desee ejecutar");
            System.out.println("1 Agregar empleado(s)");
            System.out.println("2 Mostrar a todos los usuarios");
            System.out.println("3 Mostrar a un usuario");
            System.out.println("4 Mostrar todas las cuentas");
            System.out.println("5 Mostrar solo una cuenta");
            System.out.println("6 Agregar dinero a una cuenta");
            System.out.println("7 Retirar dinero de una cuenta");
            System.out.println("8 Agregar cuenta a empleado");
            System.out.println("9 Salir del programa");
            menu = leer.nextInt();
            leer.nextLine();
            switch (menu) {
                case 1:
                    int cantidad, cuentas;
                    System.out.println("Cantidad de empleados a agregar: ");
                    cantidad = leer.nextInt();
                    leer.nextLine();
                    for (int i = 0; i < cantidad; i++) {

                        System.out.println("Ingrese nombres: ");
                        name = leer.nextLine();

                        System.out.println("Ingrese apellidos: ");
                        lastName = leer.nextLine();
                        System.out.println(
                                "Ingrese número de cuentas que desea crear, sí no desea crear una cuenta ingrese 0");
                        cuentas = leer.nextInt();
                        leer.nextLine();
                        if (cuentas == 0) {
                            newEmployee = new Employee(name, lastName);
                        } else {
                            newEmployee = new Employee(name, lastName, cuentas);
                        }

                        banco.addEmployee(newEmployee);
                    }

                    break;

                case 2:
                    banco.getNames();
                    break;

                case 3:
                    System.out.println("Ingrese número de empleado: ");
                    numero = leer.nextInt();
                    banco.showOnEmployee(numero);

                    break;
                case 4:
                    banco.getAccounts();
                    break;
                case 5:
                    System.out.println("Ingrese número de empleado: ");
                    numero = leer.nextInt();
                    banco.showOnEmployeeAccounts(numero);

                    break;
                case 6:
                    System.out.println("Ingrese su número de cuenta: ");
                    accountNumber = leer.nextLong();
                    System.out.println("Ingrese cantidad de dinero a agregar: ");
                    money = leer.nextDouble();
                    for (int i = 0; i < banco.employees.size(); i++) {

                        for (int j = 0; j < banco.employees.get(i).account.size(); j++) {
                            if (accountNumber == banco.employees.get(i).getAccount(j).getAccountNumber()) {
                                banco.employees.get(i).getAccount(j).plusMoneyB(money);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Ingrese su número de cuenta: ");
                    accountNumber = leer.nextLong();
                    System.out.println("Ingrese cantidad de dinero a retirar: ");
                    money = leer.nextDouble();
                    for (int i = 0; i < banco.employees.size(); i++) {

                        for (int j = 0; j < banco.employees.get(i).account.size(); j++) {
                            if (accountNumber == banco.employees.get(i).getAccount(j).getAccountNumber()) {
                                banco.employees.get(i).getAccount(j).minusMoneyb(money);
                            }
                        }
                    }

                    break;

                    case 8:
                    System.out.println("Ingrese ");
                    break;

                default:
                    break;
            }

        }

    }
}
