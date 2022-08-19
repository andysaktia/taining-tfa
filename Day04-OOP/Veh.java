/**
 * Vehicles
 */
public class Veh {

    public static void main(String[] args) {
        Vehicles veh = new Vehicles();
        veh.identify_myself("gerobak", false);
        Bikes bike = new Bikes();
        bike.identify_myself("pedal bike", false, 2);
        Cars car = new Cars();
        car.identify_myself("Sport Cars", true, 4, "V8");
        Buses bus = new Buses();
        bus.identify_myself("Trans Jakarta", true, 4, false);
    }
}

class Vehicles {
    public String name;
    public Boolean with_engine;
    public String status;

    public void identify_myself(String n, Boolean e) {
        this.name = n;
        this.with_engine = e;
        if (this.with_engine == true) {
            this.status = "with engine";
        } else {
            this.status = "no engine";
        }
        System.out.println("Hi I'm Parent of all vehicles, my name is " + name + ", my engine status is: " + status);
    }

}

class Bikes extends Vehicles {
    public int wheel_count;

    public void identify_myself(String n, Boolean e, int w) {
        super.name = n;
        super.with_engine = e;
        this.wheel_count = w;

        if (super.with_engine == true) {
            super.status = "with engine";
        } else {
            super.status = "no engine";
        }
        System.out.println("Hi I'm Bike, my name is " + name + ", my engine status is: " + status + ", I have "
                + wheel_count + " wheel(s)");
    }
}

class Cars extends Vehicles {
    public int wheel_count;
    public String engine_type;

    // @Override
    public void identify_myself(String n, Boolean e, int w, String et) {
        super.name = n;
        super.with_engine = e;
        this.wheel_count = w;
        this.engine_type = et;

        if (super.with_engine == true) {
            super.status = "with engine";
        } else {
            super.status = "no engine";
        }
        System.out.println("Hi I'm Cars, my name is " + name + ", my engine status is: " + status + ", I have "
                + wheel_count + " wheel(s), my engine type: " + engine_type);
    }

}

class Buses extends Vehicles {

    public int wheel_count;
    public Boolean private_bus;
    public String status_private;

    // @Override
    public void identify_myself(String n, Boolean e, int w, Boolean ps) {
        super.name = n;
        super.with_engine = e;
        this.wheel_count = w;
        this.private_bus = ps;

        if (super.with_engine == true) {
            super.status = "with engine";
        } else {
            super.status = "no engine";
        }

        if (this.private_bus == true) {
            this.status_private = "Private Bus";
        } else {
            this.status_private = "Public Bus";
        }
        System.out.println("Hi I'm Bus[" + status_private + "], my name is " + name + ", my engine status is: " + status
                + ", I have " + wheel_count + " wheel(s)");
    }
}