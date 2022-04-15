package main;

import subteran.ValidatorMetrou;
import terestru.AdapterObiecte;
import terestru.ValidatorAdapter;
import terestru.ValidatorAutobuz;
import terestru.ValidatorTerestru;

public class Main {
    static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBiletCalatorie(validatorAutobuz);

        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        AdapterObiecte adapterObiecte = new AdapterObiecte(validatorMetrou);

        valideazaBiletCalatorie(adapterObiecte);

        ValidatorAdapter validatorAdapter = new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);
    }
}
