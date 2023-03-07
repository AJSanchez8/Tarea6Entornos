package Tarea1;

/**
 * Class Tarea1.circulo
 */
public class circulo extends Conica {

  //
  // Fields
  //
  // NO TIENE ATRIBUTO COLOR YA QUE LO HEREDA DE CONICA Y A SU VEZ DE FIGURA
  private float radio;
  private float diametro;
  
  //
  // Constructors
  //
  public circulo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of radio
   * @param newVar the new value of radio
   */
  public void setRadio (float newVar) {
    radio = newVar;
  }

  /**
   * Get the value of radio
   * @return the value of radio
   */
  public float getRadio () {
    return radio;
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
