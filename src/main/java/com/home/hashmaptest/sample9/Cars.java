package com.home.hashmaptest.sample9;

/**
 * Created by vitaliy on 19.03.15.
 */
public class Cars {

    private Integer id;

    private String brand;

    public Cars(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        if (brand != null ? !brand.equals(cars.brand) : cars.brand != null) return false;
        if (id != null ? !id.equals(cars.id) : cars.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }
}
