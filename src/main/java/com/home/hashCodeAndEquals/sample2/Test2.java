package com.home.hashCodeAndEquals.sample2;

/**
 * Created by vitaliy on 18.03.15.
 */
public class Test2 {

    private String name;

    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test2 test2 = (Test2) o;

        if (id != null ? !id.equals(test2.id) : test2.id != null) return false;
        if (name != null ? !name.equals(test2.name) : test2.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
