import java.util.*;

public class Employee {
    private String name;
    private String lastName;
    protected ArrayList<BankAccount> account;
    protected int quantity;
    protected int limNumber;
    protected boolean haveaccount = false;
    Scanner leer = new Scanner(System.in);

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Employee(String name, String lastName, int quantity) {
        this.name = name;
        this.lastName = lastName;
        account = new ArrayList<>();
        this.quantity = quantity;
        Accounts(account);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount(int number) {
        return account.get(number);
    }

    public void CreateBankAccount(long accountNumber, char accountype) {

        if (accountype == 'A' || accountype == 'B' || accountype == 'C') {

            account.set(limNumber, new BankAccount(accountNumber, accountype));
            haveaccount = true;
            limNumber++;

        } else {
            System.out.println("La cuenta no se pudo crear");

        }
    }

    public void showAccount(int number) {
        System.out.println(
                "La cuenta del empleado " + name + " es " + account.get(number).getAccountNumber() + " su saldo es "
                        + account.get(number).getAmount() + " y la cuenta es de tipo "
                        + account.get(number).getAccountype());
    }


    private void Accounts(ArrayList<BankAccount> Account) {
        char accountype;
        long accountNumber;
        int yes,i=limNumber;
        limNumber=limNumber+  quantity;

        for (; i < limNumber; i++) {
            System.out.println("Ingrese tipo de cuenta: ");

            accountype = leer.nextLine().charAt(0);
            
            if (accountype == 'A' || accountype == 'B' || accountype == 'C') {
                System.out.println("Ingrese número de cuenta: ");
            accountNumber = leer.nextLong();
            leer.nextLine();
                Account.add(i, new BankAccount(accountNumber, accountype));
                haveaccount = true;

            } else {
                System.out.println("La cuenta no se pudo crear");
                System.out.println("¿Desea repetir la cuenta (ingresar 0) o dejar cuentas hasta aquí (ingresar 1)?");
                yes = leer.nextInt();
                leer.nextLine();
                if (yes == 0) {
                    i = i - 1;
                } else {
                    limNumber = i;
                }

            }

        }
        if(i!=0)
        limNumber=i-1;

    }

}