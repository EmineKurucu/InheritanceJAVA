public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Employee employee = new Employee();

        // customer. ile Person sınıfındakilere de ulaşabiliriz
        // employee. ile Person sınıfındakilere de ulaşabiliriz

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        // customerManager. ve employeeManager. yazınca PersonManager'ın da methodları çıkar
    }
}