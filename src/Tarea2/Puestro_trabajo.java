package Tarea2;

/**
 * Class Puestro_trabajo
 */
public class Puestro_trabajo extends Persona {

  //
  // Fields
  //
  Persona p1;
  private String nombre_puesto;
  private String fecha_inicio;
  private String fecha_fin;
  private int salario;
  
  //
  // Constructors
  //
  public Puestro_trabajo (Persona p1) { };

  public Puestro_trabajo(Persona p1, String nombre_puesto, String fecha_inicio, String fecha_fin, int salario) {
    this.p1 = p1;
    this.nombre_puesto = nombre_puesto;
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
    this.salario = salario;
  }

//
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre_puesto
   * @param newVar the new value of nombre_puesto
   */
  public void setNombre_puesto (String newVar) {
    nombre_puesto = newVar;
  }

  /**
   * Get the value of nombre_puesto
   * @return the value of nombre_puesto
   */
  public String getNombre_puesto () {
    return nombre_puesto;
  }

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (int newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public int getSalario () {
    return salario;
  }

  //
  // Other methods
  //

}
