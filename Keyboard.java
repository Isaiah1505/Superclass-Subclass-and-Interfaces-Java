package Assignment3;

public abstract class Keyboard {
    int numberOfKeys;
    boolean hasRGBLights;
    String brand;

    Keyboard(){}

    public Keyboard(int numberOfKeys, boolean hasRGBLights, String brand) {
        this.numberOfKeys = numberOfKeys;
        this.hasRGBLights = hasRGBLights;
        this.brand = brand;
    }

    public Keyboard(int numberOfKeys, boolean hasRGBLights) {
        this.numberOfKeys = numberOfKeys;
        this.hasRGBLights = hasRGBLights;
    }

    public Keyboard(int numberOfKeys, String brand) {
        this.numberOfKeys = numberOfKeys;
        this.brand = brand;
    }

    public Keyboard(boolean hasRGBLights, String brand) {
        this.hasRGBLights = hasRGBLights;
        this.brand = brand;
    }

    public void isDell(){
        if(brand == "Dell"){
            System.out.println("This is a Dell keyboard");
        }
    }

    public void isFullSizedKeyboard(){
        if(numberOfKeys == 104){
            System.out.println("The keyboard is a standard full-sized one");
        }
    }

    abstract void keyPressed();

    abstract void rgbLightsOn();

}
