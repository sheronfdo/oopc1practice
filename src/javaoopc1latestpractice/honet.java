
package javaoopc1latestpractice;

public class honet extends bike {

    @Override
    public void engine_size() {
        System.out.println("engine size = 250cc"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void year() {
        System.out.println("year = 2015"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void make() {
        System.out.println("maked by honda"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void model() {
        System.out.println("model = honet"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gear_type() {
        System.out.println("gear type = manual"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fuel_type() {
        System.out.println("fuel type = PATROL"); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        honet h = new honet();
        h.model();
        h.make();
        h.year();
        h.engine_size();
        h.gear_type();
        h.fuel_type();
        h.seats();
        h.wheels();
        h.doors();
    }
}
