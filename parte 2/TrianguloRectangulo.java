public class TrianguloRectangulo {
int base; // Atributo que define la base de un triangulo rectangulo
int altura; // Atributo que define la altura de un triangulo rectangulo
/**
* Constructor de la clase TrianguloRectangulo
* @param base Parametro que define la base de un triangulo
* rectangulo
* @param altura Parametro que define la altura de un triangulo
* rectangulo
*/
public TrianguloRectangulo(int base, int altura) {
this.base = base;
this.altura = altura;
}
/**
* Método que calcula y devuelve el area de un triangulo rectangulo
* como la base multiplicada por la altura sobre 2
* @return area de un triangulo rectangulo
*/
double calcularArea() {
return (base * altura / 2);
}
/**
* Método que calcula y devuelve el perímetro de un triangulo
* rectangulo como la suma de la base, la altura y la hipotenusa
* @return Perímetro de un triangulo rectangulo
*/
double calcularPerimetro() {
return (base + altura + calcularHipotenusa()); /* Invoca al
método calcular hipotenusa */
}
/**
* Método que calcula y devuelve la hipotenusa de un triángulo
* rectángulo utilizando el teorema de Pitágoras
* @return Hipotenusa de un triángulo rectángulo
*/
double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}
/**
* Método que determina si un triángulo es:
* - Equilatero: si sus tres lados son iguales
* - Escaleno: si sus tres lados son todos diferentes
* - Escaleno: si dos de sus lados son iguales y el otro es diferente de
* los demás
*/
void determinarTipoTriangulo() {
if ((base == altura) && (base == calcularHipotenusa()) && (altura
== calcularHipotenusa()))
System.out.println("Es un triángulo equilátero"); /* Todos suslados son iguales */
else if ((base != altura) && (base != calcularHipotenusa()) &&
(altura != calcularHipotenusa()))
System.out.println("Es un triángulo escaleno"); /* Todos sus
lados son diferentes */
else
System.out.println("Es un triángulo isósceles"); /* De otra
manera, es isósceles */
}
}