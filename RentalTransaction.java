/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentalSystem;

/**
 *
 * @author ADMIN
 */

class RentalTransaction {
    private Car car;
    private Customer customer;
    private int rentalDays;

    public RentalTransaction(Car car, Customer customer, int rentalDays) {
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    @Override
    public String toString() {
        return "Rental [Car=" + car.getModel() + ", Customer=" + customer.getName() + ", Days=" + rentalDays + "]";
    }
}
