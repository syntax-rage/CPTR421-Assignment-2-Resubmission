/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class CalculatorFactory {
    
    public SquarePattern getFactoryPattern(String factoryPattern){
        
        if (factoryPattern == null) {
            return null;
        }
        
         
        if (factoryPattern.equalsIgnoreCase("Square")) {
            return new SquarePattern();
        }
        
        
        else if (factoryPattern.equalsIgnoreCase("Rectangle")){
            return new RectanglePattern();
        }
        
        
        else if (factoryPattern.equalsIgnoreCase("Circle")) {
            return new CirclePattern();
        }
        
         
        else if (factoryPattern.equalsIgnoreCase("Triangle")) {
            return new TrianglePattern();
            
        }
        
        return null;  
    }
    
}
            