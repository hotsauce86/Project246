public class Project246 {

    public static void main(String[] args){

        car toyota1 = new car("prius", "toyota", 2016, 20, 140);

        audi audi1 = new audi("911", "car", 2019, 47, 206,"v12",18);

        System.out.println(toyota1.getMake());
       toyota1.timeToTopSpeed();
        System.out.println(audi1.getMake());
        audi1.timeToTopSpeed(101);

    }
}

class carParts{

    int cylinders = 8;


}

class car{
    private String model = "";
    private String make = "";
    private int year    = 0;
    private int accelleration = 0;
    private int topSpeed = 0;


    car(){

    }

    car(String model, String make, int year, int accelleration, int topSpeed ){
        this.model = model;
        this.make = make;
        this.year =year;
        this.accelleration = accelleration;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getMake(){
        return  make;
    }

    public int getYear() {
        return year;
    }

    public int getAccelleration() {
        return accelleration;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAccelleration(int accelleration) {
        this.accelleration = accelleration;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


    public void timeToTopSpeed(){


        int speedAtThisSecond =0;
        int seconds=0;
        while(speedAtThisSecond<topSpeed){
            speedAtThisSecond += accelleration;
            seconds ++;
        }

        System.out.println("Time to hit max speed: " + seconds);
    }
}

/*
    EXAMPLE OF INHERITANCE

    This class inherits the properties of the car class
    and adds some new values "engine", and alters the make
    to always be "audi"
 */
class audi extends car{


    private String make = "Audi";
    private String engine = "V8";
    private int turboBoost = 0;

    audi(){

    }

    audi(String model, String make, int year, int accelleration, int topSpeed, String engine, int turboBoost){
        super(model, make, year, accelleration, topSpeed);
        this.engine = engine;
        this.turboBoost = turboBoost;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }



    public String getEngine() {
        return engine;
    }


    public void setAccelleration(int accelleration, int turboBoost) {
       super.setAccelleration(accelleration+turboBoost);
    }

    //overload the timeToTopSpeed to include a Nos boost calculation

    public void timeToTopSpeed(int nos){

        if(nos >40){
            System.out.println("*BANG*... the engine blew : 0");

        }
        else {
            int speedAtThisSecond = 0;
            int seconds = 0;
            while (speedAtThisSecond < super.getTopSpeed()) {
                speedAtThisSecond += super.getAccelleration() + nos;
                seconds++;
            }

            System.out.println("Time to hit max speed with a turbo: " + seconds);
        }
    }

    /*
            OVERRIDE

            this takes over and rewrites what the normal car class
            takes and returns any object of audi with the make "audi'
         */
    @Override
    public void setMake(String make) {
        this.make = "audi";
    }

    @Override
    public String getMake() {
        return make;
    }


}
