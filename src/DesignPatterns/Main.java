package DesignPatterns;

public class Main {
    public static void main(String[] args) {
        AtmApi atmApi = new AtmApi();
        atmApi.deposit();
        atmApi.payOut();
        atmApi.transferMoney();
        atmApi.recharge();
        atmApi.getLoan();
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Product product = concreteCreator.createProduct("AdvanceProduct");
        System.out.println(product.getName());
    }
}
