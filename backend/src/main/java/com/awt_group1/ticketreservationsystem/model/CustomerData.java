package com.awt_group1.ticketreservationsystem.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class CustomerData {
    private String customerId;
    private String username;
    private String email;
    private String customerPassword;
    private String preferredPaymentMethod;
    private Timestamp lastUpdate;
    private Location locationByLocationId;
    private Station stationByPreferredStationId;

    @Id
    @Column(name = "Customer_Id", nullable = false, length = 36)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "Username", nullable = true, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Customer_Password", nullable = true, length = 255)
    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    @Basic
    @Column(name = "Preferred_Payment_Method", nullable = true, length = 20)
    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    @Basic
    @Column(name = "Last_Update", nullable = true)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerData that = (CustomerData) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(username, that.username) && Objects.equals(email, that.email) && Objects.equals(customerPassword, that.customerPassword) && Objects.equals(preferredPaymentMethod, that.preferredPaymentMethod) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, username, email, customerPassword, preferredPaymentMethod, lastUpdate);
    }

    @ManyToOne
    @JoinColumn(name = "Location_Id", referencedColumnName = "Location_Id")
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @ManyToOne
    @JoinColumn(name = "Preferred_Station_Id", referencedColumnName = "Station_Id")
    public Station getStationByPreferredStationId() {
        return stationByPreferredStationId;
    }

    public void setStationByPreferredStationId(Station stationByPreferredStationId) {
        this.stationByPreferredStationId = stationByPreferredStationId;
    }
}
