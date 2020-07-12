/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksimulation;

/**
 *
 * @author mehed
 */
public class DuckSimulation {

    /**
     * @param args the command line arguments
     */
    
    
    
    public DuckSimulation() {
        Duck mallard = new MallardDuck();
        
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new DuckSimulation();
    }
    
}
