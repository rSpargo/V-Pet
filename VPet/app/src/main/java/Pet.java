import java.util.List;

/**
 * Created by JWunz on 5/13/17.
 */

public class Pet extends Monster {
    private int x;
    private int y;
    private int happiness;
    private int hunger;
    private double weight;
    private float discipline;
    private int careMistakes;
    private int age;
    private List skills;
    private boolean isDirty;
    private boolean isTired;
    private boolean isSick;
    private int dirtyTime; // -
    private int tiredTime; // -These may be DateTimes or something of when the pet first became dirty/tired/sick by the end
    private int sickTime;  // -

    public int getX() {
        return x;
    }

    public boolean setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public boolean setY(int y) {
        this.y = y;
    }

    public int getHappiness() {
        return happiness;
    }

    public boolean setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean setHunger(int hunger) {
        this.hunger = hunger;
    }

    public double getWeight() {
        return weight;
    }

    public boolean setWeight(double weight) {
        this.weight = weight;
    }

    public float getDiscipline() {
        return discipline;
    }

    public boolean setDiscipline(float discipline) {
        this.discipline = discipline;
    }

    public int getCareMistakes() {
        return careMistakes;
    }

    public boolean setCareMistakes(int careMistakes) {
        this.careMistakes = careMistakes;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        this.age = age;
    }

    public List getSkills() {
        return skills;
    }

    public boolean setSkills(List skills) {
        this.skills = skills;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isTired() {
        return isTired;
    }

    public boolean setTired(boolean tired) {
        isTired = tired;
    }

    public boolean isSick() {
        return isSick;
    }

    public boolean setSick(boolean sick) {
        isSick = sick;
    }

    public int getDirtyTime() {
        return dirtyTime;
    }

    public boolean setDirtyTime(int dirtyTime) {
        this.dirtyTime = dirtyTime;
    }

    public int getTiredTime() {
        return tiredTime;
    }

    public boolean setTiredTime(int tiredTime) {
        this.tiredTime = tiredTime;
    }

    public int getSickTime() {
        return sickTime;
    }

    public boolean setSickTime(int sickTime) {
        this.sickTime = sickTime;
    }

    public boolean giveAlert() {
        return true;
    }

    public boolean bounceForward() {
        return true;
    }

    public boolean turnAround() {
        return true;
    }

    public boolean interactWitItem() {
        return true;
    }

    public boolean evolve() {
        return true;
    }

    public Pet(String img, int power, int speed, int agility, List<Monster> evolutions) {
        super(img, power, speed, agility, evolutions);
    }
}
