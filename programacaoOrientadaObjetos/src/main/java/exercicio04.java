import entities.Employee;
public class exercicio04 {
    public  static  void main(String[] args){

        Employee funcionario = new Employee("Pedro Lima", 5000, 1000);

        System.out.println("Salário líquido inicial: " + funcionario.netSalary());

        funcionario.increaseSalary(10.0);

        System.out.println("Salário líquido após aumento: " + funcionario.netSalary());
    }
}
