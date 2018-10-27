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
        Post post = new Post();
        FacebookObserver facebookObserver = new FacebookObserver();
        PublishSubscriber publishSubscriber = new PublishSubscriber();
        SubscriberObserver subscriberObserver = new SubscriberObserver();
        post.attach(facebookObserver);
        post.attach(publishSubscriber);
        post.attach(subscriberObserver);
        post.detach(publishSubscriber);
        post.notifyObservers();
    }
}
