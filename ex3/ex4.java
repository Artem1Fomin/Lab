package ru.mirea.lab6.ex3;
interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate; //Price per hour
    }
}

public class ex4 {
    public static void main(String[] args) {
        Priceable product = new Product("Сок", 99);
        Priceable service = new Service("Покраска", 19999);

        System.out.printf("Цена товара: %.2f\nЦена услуги: %.2f", product.getPrice(), service.getPrice());
    }
}


