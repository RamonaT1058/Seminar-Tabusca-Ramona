package terestru;

import subteran.ValidatorMetrou;
import subteran.ValidatorSubteran;

public class ValidatorAdapter extends ValidatorMetrou implements ValidatorTerestru {

    @Override
    public void valideazaBilet(){
        super.valideazaCalatorie();
    }
}
