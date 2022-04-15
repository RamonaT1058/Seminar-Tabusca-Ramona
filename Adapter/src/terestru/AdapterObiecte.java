package terestru;

import subteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru{
    private ValidatorMetrou validatorMetrou;
    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }

    public AdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }
}
