package empleado;

/**
 * La clase empleado contiene información de cada empleado
 * @version 25.04
 * @author Laura Nácher, 
 * @see <a href="lauranacher@servidor.com">lauranacher@servidor.com</a>
 */

public class Empleado {
	
		private String nombre; 
		private String apellido; 
		private int edad; 
		private double salario;
		
		/**
		 * Suma un plus de 1994 euros al salario del empleado si el empleado tiene mas de 29 años
		 * @param sueldoPlus cantidad en euros que se suma al salario
		 * @return <ul>  
		 *          <li>true: se suma el plus al sueldo </li>
		 *          <li>false: no se suma el plus al sueldo </li>
		 *          </ul>
		 */
	
		public boolean plus(double sueldoPlus) {
			boolean aumento = false;
			if (edad > 40 && compruebaNombre()) {
				salario += sueldoPlus;
				aumento = true; 
			}
			return aumento; 
		}
		
		/**
		 * Función para comprobar el nombre
		 * @return
		 */
	
		private boolean compruebaNombre() {
			if (nombre.equals("")) { 
				return false;
			}
			return true; 
		}
		
		/**
		 * Constructor por defecto
		 */
		public Empleado() {
		this("", "", 0, 0); 
		}
		
		/**
		 * Constructor con cuatro parámetros
		 * @param nombre  nombre del empleado
		 * @param apellido  apellido del empleado
		 * @param edad  edad del empleado
		 * @param salario  salario del empleado
		 */

		public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad; 
		this.salario = salario;
		} 
}
