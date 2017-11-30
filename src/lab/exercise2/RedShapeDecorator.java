package lab.exercise2;

/**
 *
 * @author Isaac
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);	
   }

   @Override
   public void draw() {
      super.draw();	       
      addRedBorder();
   }

   private void addRedBorder(){
      System.out.println("Border Color: Red");
   }
}