/**
 * Created by bwoods on 5/14/2017.
 */

public class CareItem extends Consumable implements IRemedy {
    private AilmentType ailment;

    public boolean dropItem(String img){
        return true;
    };
    public boolean setAilment(AilmentType ailment){
        this.ailment = ailment;
        return true;
    }
    @Override
    public boolean remedyAilment(){
        return true;
    }
}
