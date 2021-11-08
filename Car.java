import java.awt.*;

public abstract class Car implements Movable{

        //Notes :
        //  - Vi kan behöva kollam med någon angående vad som ska
        //    vara private och vad som ska vara public.

        //name
        public String modelName; // The car model name

        //color
        public Color color; // Color of the car
        public Color getColor(){
                return color;
        }
        public void setColor(Color clr){
                color = clr;
        }

        //doors
        public int nrDoors; // Number of doors on the car
        public int getNrDoors(){
                return nrDoors;
        }

        //engine
        public double enginePower; // Engine power of the car
        public double getEnginePower(){
                return enginePower;
        }
        public void startEngine(){
                currentSpeed = 0.1;
        }
        public void stopEngine(){
                currentSpeed = 0;
        }

        //speed
        public double currentSpeed; // The current speed of the car
        public double getCurrentSpeed(){
                return currentSpeed;
        }


        @Override //Override visar i detta fall visar att vi overridar den gamla metoden som vi ärvde.
        public void move() {
                System.out.println("You moved");

        }

        @Override
        public void turnLeft() {
                System.out.println("You turned left");
        }

        @Override
        public void turnRight() {
                System.out.println("You turned right");
        }
}
