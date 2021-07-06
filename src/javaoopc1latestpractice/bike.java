
package javaoopc1latestpractice;

/**
 *
 * @author Jamit
 */
abstract class bike implements vehicle{
    @Override
    public void wheels(){
        System.out.println("wheels = 2");
    }
    
    @Override
    public void seats (){
        System.out.println("Seats = 2");
    }
    
    public void doors(){
        System.out.println("Doors = 0");
    }
    
    
}
