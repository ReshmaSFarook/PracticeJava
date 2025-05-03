package org.collections;

public class Implementation implements Contract{

    @Override
    public void Term1() {
        System.out.println("Implementation:Term1");
    }

    @Override
    public void Term2() {
        System.out.println("Implementation:Term2");
    }

    @Override
    public void extendedContact() {
        System.out.println("Implementation:extendedContract");
    }
}
