public class Project246 {

    public static void main(String[] args){

        car toyota1 = new car("prius", "toyota", 2016);

        audi audi1 = new audi("911", "car", 2019, "v12");

        System.out.println(toyota1.getMake());
        System.out.println(audi1.getMake());

    }
}

class car{
    private String model = "";
    private String make = "";
    private int year    = 0;


    car(){

    }

    car(String model, String make, int year ){
        this.model = model;
        this.make = make;
        this.year =year;
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

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
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

    audi(){

    }

    audi(String model, String make, int year, String engine){
        super(model, make, year);
        this.engine = engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
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
