//package controller;
//
//
//import model.Kunde;
//import model.Ordre;
//import storage.Storage;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class Controller2 {
//
//    /**
//     * Create a new Company.
//     * Pre: name not empty, hours >= 0.
//     */
//    public static Ordre createOrdre(int antal, double samletPris, LocalDate dato, Kunde kunde, String status){
//        Ordre ordre = new Ordre(antal, samletPris,dato,kunde,status);
//        Storage.storeOrdre(ordre);
//        return ordre;
//    }
//
//    /**
//     * Delete the company.
//     * Pre: The company has no employees.
//     */
//    public static void deleteCompany(Company company) {
//        Storage.deleteCompany(company);
//    }
//
//    /**
//     * Update the company.
//     * Pre: name not empty, hours >= 0.
//     */
//    public static void updateCompany(Company company, String name, int hours) {
//        company.setName(name);
//        company.setHours(hours);
//    }
//
//    public static ArrayList<Company> getCompanies() {
//        return Storage.getCompanies();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Create a new employee.
//     * Pre: name not empty, wage >= 0.
//     */
//    public static Employee createEmployee(String name, int wage) {
//        Employee employee = new Employee(name, wage);
//        Storage.storeEmployee(employee);
//        return employee;
//    }
//
//    /**
//     * Delete the employee.
//     */
//    public static void deleteEmployee(Employee employee) {
//        Company company = employee.getCompany();
//        if (company != null)
//            company.removeEmployee(employee);
//        Storage.deleteEmployee(employee);
//    }
//
//    /**
//     * Update the employee.
//     * Pre: wage >= 0.
//     */
//    public static void updateEmployee(Employee employee, String name, int wage) {
//        employee.setName(name);
//        employee.setWage(wage);
//    }
//
//    public static ArrayList<Employee> getEmployees() {
//        return Storage.getEmployees();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Add the employee to the company.
//     * If the employee is connected to another company, this connected is removed.
//     */
//    public static void addEmployeeToCompany(Employee employee, Company company) {
//        var oldCompany = employee.getCompany();
//        if (oldCompany != null)
//            company.removeEmployee(employee);
//        company.addEmployee(employee);
//    }
//
//    /**
//     * Remove the employee's company, if the employee has a company.
//     */
//    public static void removeCompanyOfEmployee(Employee employee) {
//        var company = employee.getCompany();
//        if (company != null)
//            company.removeEmployee(employee);
//    }
//
//    //----------------------------------------------------------------------------------
//
//    public static Customer createCustomer(String name) {
//        Customer customer = new Customer(name);
//        Storage.storeCustomer(customer);
//        return customer;
//    }
//
//
//    public static void deleteCustomer(Customer customer) {
//        Storage.deleteCustomer(customer);
//    }
//
//
//    public static void updateCustomer(Customer customer, String name) {
//        customer.setName(name);
//
//    }
//
//    public static ArrayList<Customer> getCustomers() {
//        return Storage.getCustomers();
//    }
//
//
//
//
//
//}
