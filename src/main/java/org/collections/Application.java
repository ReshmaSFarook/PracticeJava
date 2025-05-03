package org.collections;

public class Application {
    public static void main (String[] args){
    Contract contract = new Implementation();//invokes the implementation of the contract and the extended contract
    printTerms(contract);
    }

    public static void printTerms(Contract contract)
    {
        contract.Term1();
        contract.Term2();
        contract.extendedContact();
    }
}
