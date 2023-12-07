package edu.traning.lesson14.customer;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String numOfCreditCard;
    private String numOfBankAccount;

    public Customer() {
        setId(1);
        setName("Igor");
        setSurname("Pupkin");
        setPatronymic("Viktorovich");
        setNumOfCreditCard("1234432112344321");
        setNumOfBankAccount("12345678900987654321");
    }

    public Customer(int id, String surname,String name, String patronymic,String numOfCreditCard,String numOfBankAccount) {
        setId(id);
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setNumOfCreditCard(numOfCreditCard);
        setNumOfBankAccount(numOfBankAccount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", surname='" + getSurname() + '\'' +
                ", name='" + getName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", numOfCreditCard='" + getNumOfCreditCard() + '\'' +
                ", numOfBankAccount='" + getNumOfBankAccount() + '\'' +
                '}';
    }
}
