/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentalSystem;

/**
 *
 * @author ADMIN
 */

class Customer {
    private String customerId;
    private String name;
    private String contactInfo;

    public Customer(String customerId, String name, String contactInfo) {
        this.customerId = customerId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + name + ", Contact=" + contactInfo + "]";
    }
}
