# HERENCIA

##### Escriba una jerarquia para la clase Persona, Empleado, EmpleadoBaseMasComision, EmpleadoPorConmision, EmpleadoAsalariado y EmpleadoPorHoras.

Las variables de instancia deben estar ocultas

- Use Persona como la superclase de la jerarquia ->
    - 	nombre: String
    - 	apellido: String
    - 	edad: int
    - 	void presentarse()
    - 	boolean esMayorDeEdad()

- Empleado  ->
    - 	ventasBrutas: double
    - 	tarifaComision: double
    - 	numeroDeSeguroSocial: String
    - 	double ingresos()
    - 	String toString()

- EmpleadoPorComision: cobra un salario en funcion la tarifaComision y sus ventas brutas
- EmpleadoBaseMasComision: cumple las mismas regras que empleadoPorComision pero este, ademas, cobra una base que debe ser definida al momento de su creacion
- EmpleadoAsalariado: cobra un salario fijo independientemente de sus ventas, a no ser que sus ventas superen los $10.000, en tal caso, su salario aumenta un 20%
- EmpleadoPorHoras: Independientemente de sus ventas, cobra un salario fijo por horas trabajados, a no ser que sus ventas superen los $10.000, en tal caso, su salario aumenta un 20%