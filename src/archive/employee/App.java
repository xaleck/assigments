
interface Payable {
    public double getPaymentAmount();
}

public class App {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 5000);
        ContractEmployee cte = new ContractEmployee("Bob", 102, 50, 160);

        System.out.println("Full-Time Employee Details:");
        fte.displayEmployeeInfo();
        System.out.println();

        System.out.println("Contract Employee Details:");
        cte.displayEmployeeInfo();
    } 
}
