package DesignPatterns;

public class ConcreteCreator implements Creator {
    @Override
    public Product createProduct(String type){
        Product product = null;
        if(type.equals("SimpleProduct")){
            product = new SimpleProduct();
        } else if(type.equals("AdvanceProduct")){
            product = new AdvanceProduct();
        } else if(type.equals("AdvanceProduct")){
            product = new VirtualProduct();
        }
        return product;
    }
}
