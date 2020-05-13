/**
 *  <b> AreaTriangolo</b>
 * <p>calcolo:</p>
 * <UL>
 * <LI><p>area</p>
 * <LI><p>perimetro</p>
 * </UL>
 * @author Bello Federico
 */

public class TriangoloArea {
private float base;
private float altezza;
/**
 * costruttore TriangoloArea
 *base altezza
 */
public TriangoloArea(float base,float altezza) {
	this.base=base;
	this.altezza=altezza;
}
/**
*
* @return valore area
*/
public float CalcolaArea() {
	return (base+altezza)/2;
}
//getBase
public float getBase() {
	return base;
}
//setBase
public void setBase(float base) {
	this.base = base;
}
//getAltezza
public float getAltezza() {
	return altezza;
}
//setAltezza
public void setAltezza(float altezza) {
	this.altezza = altezza;
}
/**
*
* @return toString
*/
public String toString() {
	return "TriangoloArea [base=" + base + ", altezza=" + altezza + "]";
}
/**
*
* <p>CLASSE main</p>
*/
public static void main(String[] args) {
	TriangoloArea a=new TriangoloArea(4,3);
	System.out.println(a.CalcolaArea());
	System.out.println(a);
}
}

