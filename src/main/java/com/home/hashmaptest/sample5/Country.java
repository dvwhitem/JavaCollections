package com.home.hashmaptest.sample5;

/**
 * Created by vitaliy on 07.03.15.
 */
public class Country {

    public String name;
    public long population;

    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public int hashCode() {
        if(this.name.length()%2==0)
            return 31;
        else
            return 95;
    }

    @Override
    public boolean equals(Object obj) {

        Country other = (Country) obj;
        if (name.equalsIgnoreCase((other.name)))
            return true;
        return false;
    }
}
