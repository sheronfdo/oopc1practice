
package javaoopc1latestpractice;

public class re_120 extends three_wheel{
    
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
        System.out.println("maked by Bajaj"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void model() {
        System.out.println("model = RE_100"); //To change body of generated methods, choose Tools | Templates.
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
        re_120 h = new re_120();
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
