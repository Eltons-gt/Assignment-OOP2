/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */

class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public void rentCar(String carId, String customerId, int days) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car == null) {
            System.out.println("Car not found with ID: " + carId);
            return;
        }
        if (customer == null) {
            System.out.println("Customer not found with ID: " + customerId);
            return;
        }
        if (!car.isAvailable()) {
            System.out.println("Car is not available for rent: " + car);
            return;
        }

        car.setAvailable(false);
        RentalTransaction transaction = new RentalTransaction(car, customer, days);
        transactions.add(transaction);
        System.out.println("Rental successful: " + transaction);
    }

    public void returnCar(String carId) {
        Car car = findCarById(carId);
        if (car == null) {
            System.out.println("Car not found with ID: " + carId);
            return;
        }
        if (car.isAvailable()) {
            System.out.println("Car is already available: " + car);
            return;
        }
        car.setAvailable(true);
        System.out.println("Car returned: " + car);
    }

    private Car findCarById(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    private Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void displayTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("Rental Transactions:");
        for (RentalTransaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
