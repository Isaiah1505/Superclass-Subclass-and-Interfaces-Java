package Assignment3;

public class Computer extends Keyboard implements Button{

    @Override
    public void isButtonBlack() {
        if(BUTTON_COLOR == "Black"){
            System.out.println("The button is black");
        }
    }

    @Override
    public void isButtonHeavy() {
        if(BUTTON_WEIGHT < 2){
            System.out.println("Button isn't heavy");
        }
    }

    @Override
    void keyPressed() {
        System.out.println("A key has been pressed");
    }

    @Override
    void rgbLightsOn() {
        if(hasRGBLights) {
            System.out.println("The RGB lights can be used");
        }
    }
}
