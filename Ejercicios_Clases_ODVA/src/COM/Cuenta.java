package COM;

public class Cuenta {
 private String titular;
 private double cantidad;
 
 public Cuenta() {
	 
 }

public Cuenta(String titular, double cantidad) {
	this.titular = titular;
	this.cantidad = cantidad;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getCantidad() {
	return cantidad;
}



public void setCantidad(double cantidad) {
	this.cantidad =cantidad;
}

public void ingresar(double cantidad) {
	if (cantidad >=0) {
		setCantidad(this.cantidad + cantidad);
		System.out.println("La cantidad de dinero en su cuenta es de: " + this.cantidad +" pesos");
	}
}
public void retirar(double cantidad) {
	
	if (this.cantidad- cantidad <= 0 ) {
		setCantidad(0);
	}
	else {
		System.out.println("Usted retiro " + cantidad + " Su saldo actuaal es de " + (this.cantidad-cantidad));
		
	}
		
}
 
@Override
public String toString() {
	return "Cuenta [titular=" + titular + "\nTotalcantidad=" + this.cantidad + "]";
 
}}
