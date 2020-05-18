package ru.polardl.homeshopping.Models;

import java.io.Serializable;

public class Client implements Serializable {

    private String clientName;
    private String address;
    private long phoneNumber;

    public Client(String clientName, String address, long phoneNumber) {
        this.clientName = clientName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (phoneNumber != client.phoneNumber) return false;
        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        return address != null ? address.equals(client.address) : client.address == null;
    }

    @Override
    public int hashCode() {
        int result = clientName != null ? clientName.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }
}
