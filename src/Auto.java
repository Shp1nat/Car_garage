public class Auto {
    private String firm;
    private long govNumber;
    private int maxSpeed;
    public void setGovNumber(long govNumb){
        govNumber = govNumb;
    }
    public long getGovNumber(){
        return govNumber;
    }
    public void setFirm(String firma){
        firm=firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public Auto(){
        firm="Без названия";
        maxSpeed=0;
        govNumber=0;
    }
    public Auto(String firma, int speed, long govNumb){
        firm=firma;
        maxSpeed=speed;
        govNumber = govNumb;
    }
}
