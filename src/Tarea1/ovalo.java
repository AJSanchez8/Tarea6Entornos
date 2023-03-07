package Tarea1;

/**
 * Class Tarea1.ovalo
 */
public class ovalo extends Conica {

  //
  // Fields
  //

  private String color;
  private float diametro;
  
  //
  // Constructors
  //
  public ovalo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of diametro
   * @param newVar the new value of diametro
   */
  public void setDiametro (float newVar) {
    diametro = newVar;
  }

  /**
   * Get the value of diametro
   * @return the value of diametro
   */
  public float getDiametro () {
    return diametro;
  }

  //
  // Other methods
  //

}
