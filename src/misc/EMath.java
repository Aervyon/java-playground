package misc;

/*
 * EMath - Class for doing math things
 * Date created: Jan/23/2020
 * Author: Null
 */

interface IMath {
    void update(EMath math);

    public void setModifable(double value);

    public double getModifable();

    public double absolute();

    public double pi();

    public double toPower(double power);

    public double getBiggest(double against);

    public double getSmallest(double against);

    public double sqRoot();

    public double roundUp();

    public double roundDown();

    public double round();

    public double log();

    public double sine();

    public double tangent();

    public double cosine();

    public double radianToDeg();

    public double degreeToRadian();
}

public class EMath implements IMath {
    double modifable;

    // Trig
    public double cosine, log, degree, tangent, sine, radian;
    // Round
    public double rounded, roundedDown, roundedUp;
    // MISC
    public double absolute, sqroot;

    public EMath(double value) {
        this.modifable = value;

        // Radians/Degree
        cosine = this.cosine();
        log = this.log();
        degree = this.degreeToRadian();
        tangent = this.tangent();
        sine = this.sine();
        radian = this.radianToDeg();

        // Round
        rounded = this.round();
        roundedDown = this.roundDown();
        roundedUp = this.roundUp();

        // Misc
        absolute = this.absolute();
        sqroot = this.sqRoot();
    }

    public void update(EMath math) {
        cosine = this.cosine();
        log = this.log();
        degree = this.degreeToRadian();
        tangent = this.tangent();
        sine = this.sine();
        radian = this.radianToDeg();

        // Round
        rounded = this.round();
        roundedDown = this.roundDown();
        roundedUp = this.roundUp();

        // Misc
        absolute = this.absolute();
        sqroot = this.sqRoot();
    }


    public void setModifable(double value) {

        this.modifable = value;
        this.update(this);
    }

    public double getModifable() {

        return this.modifable;

    }

    public double absolute() {

        return Math.abs(this.getModifable() ); // How far away from 0 the number is, negative or positive which work
        // Only returns positive number

    }

    public double pi() {

        return Math.PI; // PI!

    }

    public double toPower(double power) {

        return Math.pow(this.getModifable(), power); // Number to the power of input

    }

    public double getBiggest(double against) {

        return Math.max(this.getModifable(), against); // Return which number is larger

    }

    public double getSmallest(double against) {

        return Math.min(this.getModifable(), against); // Return which number is smaller

    }

    public double sqRoot() {

        return Math.sqrt(this.getModifable() ); // Square root number

    }

    public double roundUp() {

        return Math.ceil(this.getModifable() ); // Round up to highest whole number

    }

    public double roundDown() {

        return Math.floor(this.getModifable() ); // Round down to lowest whole number

    }

    public double round() {

        return Math.round(this.getModifable() ); // Round to nearest number

    }

    public double log() {

        return Math.log(this.getModifable() );

    }

    public double sine() {

        return Math.sin(this.getModifable() ); // Get cosine of a radian

    }

    public double tangent() {

        return Math.tan(this.getModifable() ); // Get tangent of a radian

    }

    public double cosine() {

        return Math.cos(this.getModifable() ); // Get a cosine of a radian

    }

    public double radianToDeg() {

        return Math.toDegrees(this.getModifable() ); // Turn radians to degrees

    }

    public double degreeToRadian() {

        return Math.toRadians(this.getModifable() ); // Turn a degree to a radian

    }

    public int toInt(double input) {
        return (int) input;
    }

    public double toDouble(int input) {
        return (double) input;
    }

    @Override
    public String toString() {
        return "EMath{" +
                "modifable=" + modifable +
                ", cosine=" + cosine +
                ", log=" + log +
                ", degree=" + degree +
                ", tangent=" + tangent +
                ", sine=" + sine +
                ", radian=" + radian +
                ", rounded=" + rounded +
                ", roundedDown=" + roundedDown +
                ", roundedUp=" + roundedUp +
                ", absolute=" + absolute +
                ", sqroot=" + sqroot +
                '}';
    }
}