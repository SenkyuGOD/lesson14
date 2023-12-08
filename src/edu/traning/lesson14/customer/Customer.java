package edu.traning.lesson14.customer;

import java.util.Objects;

public class Customer {

    private String surname;
    private String name;
    private String patronymic;
    private String numOfCreditCard;
    private String numOfBankAccount;

    public Customer() {

    }

    public Customer( String surname, String name, String patronymic, String numOfCreditCard, String numOfBankAccount) {
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setNumOfCreditCard(numOfCreditCard);
        setNumOfBankAccount(numOfBankAccount);
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumOfCreditCard() {
        return numOfCreditCard;
    }

    public void setNumOfCreditCard(String numOfCreditCard) {
        this.numOfCreditCard = numOfCreditCard;
    }

    public String getNumOfBankAccount() {
        return numOfBankAccount;
    }

    public void setNumOfBankAccount(String numOfBankAccount) {
        this.numOfBankAccount = numOfBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return  Objects.equals(getSurname(), customer.getSurname()) && Objects.equals(getName(), customer.getName()) && Objects.equals(getPatronymic(), customer.getPatronymic()) && Objects.equals(getNumOfCreditCard(), customer.getNumOfCreditCard()) && Objects.equals(getNumOfBankAccount(), customer.getNumOfBankAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getName(), getPatronymic(), getNumOfCreditCard(), getNumOfBankAccount());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", numOfCreditCard='" + numOfCreditCard + '\'' +
                ", numOfBankAccount='" + numOfBankAccount + '\'' +
                '}';
    }
}
