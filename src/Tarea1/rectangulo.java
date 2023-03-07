package Tarea1;

/**
 * Class Tarea1.rectangulo
 */
public class rectangulo extends Cuadrilatero {

  //
  // Fields
  //

  private String color;
  private float lado_grande;
  private float lado_pequenyo;
  
  //
  // Constructors
  //
  public rectangulo () { };
  
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
   * Set the value of lado_grande
   * @param newVar the new value of lado_grande
   */
  public void setLado_grande (float newVar) {
    lado_grande = newVar;
  }

  /**
   * Get the value of lado_grande
   * @return the value of lado_grande
   */
  public float getLado_grande () {
    return lado_grande;
  }

  /**
   * Set the value of lado_pequenyo
   * @param newVar the new value of lado_pequenyo
   */
  public void setLado_pequenyo (float newVar) {
    lado_pequenyo = newVar;
  }

  /**
   * Get the value of lado_pequenyo
   * @return the value of lado_pequenyo
   */
  public float getLado_pequenyo () {
    return lado_pequenyo;
  }

  //
  // Other methods
  //

}
