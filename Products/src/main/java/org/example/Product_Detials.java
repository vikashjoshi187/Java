package org.example;

import java.io.Serializable;

public class Product_Detials implements Serializable {

    int pid;
    String product_name;
    double product_price;
    @Override
    public String toString() {
        return pid+"\t"+product_name+"\t"+product_price;
    }

    public Product_Detials(int pid, String product_name, double product_price) {
        this.pid = pid;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public int getPid() {
        return pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

}
