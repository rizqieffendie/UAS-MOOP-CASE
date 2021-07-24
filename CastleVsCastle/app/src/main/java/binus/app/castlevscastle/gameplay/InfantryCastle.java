package binus.app.castlevscastle.gameplay;

public class InfantryCastle extends Castle {

    public InfantryCastle() {
        this.CastleType = Castle.INFANTRY;
    }

    @Override
    public double calculatePower() {
        double power = 0;
        for (Army arm : this.ArmiesToBattle){
            if (arm.ArmyType == Army.INFANTRY){
                power += arm.numbers + arm.numbers * Army.INFANTRY_BOOST;
            }else {
                power += arm.numbers;
            }
        }


        return power;    }

    @Override
    public Castle battleTo(Castle ct2) {
        return this;
    }

    @Override
    public void setArmy(Army[] Armies) {

    }


}


