import java.util.ArrayList;

public class Bank {
    protected ArrayList<Employee> employees = new ArrayList<>();;

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void getAccounts() {

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Usuario " + (i + 1) + " :");
            System.out.println(employees.get(i).getName());
            System.out.println(employees.get(i).getLastName());
            if (employees.get(i).haveaccount) {
                for (int j = 0; j < employees.get(i).account.size(); j++) {
                    System.out.println("Cuenta " + (j + 1) + " :");
                    System.out.println(employees.get(i).getAccount(j).getAccountNumber());
                    System.out.println("Tipo de cuenta:");
                    System.out.println(employees.get(i).getAccount(j).getAccountype());
                    System.out.println("Dinero:");
                    System.out.println(employees.get(i).getAccount(j).getAmount());

                }
            }
        }

    }

    public void getNames() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Usuario " + (i + 1) + " :");
            System.out.println(employees.get(i).getName());
            System.out.println(employees.get(i).getLastName());
        }
    }

    public void showOnEmployee(int i) {
        i--;

        System.out.println("Usuario: ");
        System.out.println(employees.get(i).getName()+" ");
        System.out.print(employees.get(i).getLastName());

    }

    public void showOnEmployeeAccounts(int i) {
        i--;
        if (employees.get(i).haveaccount) {
            for (int j = 0; j < employees.get(i).account.size(); j++) {
                employees.get(i).showAccount(j);

            }
        }

        else {
            System.out.println("El empleado no tiene una cuenta");
        }

    }

    

}
