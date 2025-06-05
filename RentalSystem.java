/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentalSystem;
/**
 *
 * @author ADMIN
 */

public class RentalSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        
        agency.addCar(new Car("C001", "Toyota Crown"));
        agency.addCar(new Car("C002", "Toyota Mark X"));
  
        agency.addCustomer(new Customer("CU001", "Elton George", "eltongeorge@gmail.com"));
        agency.addCustomer(new Customer("CU002", "Casper John", "casperjohn@gmail.com"));
  
        agency.rentCar("C001", "CU001", 5);
        
        agency.rentCar("C001", "CU002", 3);

        agency.returnCar("C001");

        agency.rentCar("C001", "CU002", 2);

        agency.displayTransactions();
    }
}
