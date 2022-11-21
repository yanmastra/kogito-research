package com.acme.kogito;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.SingletonStore;

import com.acme.kogito.model.Product;

public class ProductUnit implements RuleUnitData {
    private SingletonStore<Product> product;

    public ProductUnit() {
        this(DataSource.createSingleton());
    }

    public ProductUnit(SingletonStore<Product> product) {
        this.product = product;
    }

    public SingletonStore<Product> getProduct() {
        return product;
    }

    public void setProduct(SingletonStore<Product> product) {
        this.product = product;
    }

}
