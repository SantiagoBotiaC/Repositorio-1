import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuentaAhorros = new Ahorro(1234, "Sebastian", 500000.70, LocalDate.of(2015, Month.JULY, 10), 10);
		Cuenta cuentaCheques = new Cheques(2345, "Sergio", 400000, 5, 7);
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		cuentas.add(cuentaAhorros);
		cuentas.add(cuentaCheques);
		
		for (int i = 0; i < cuentas.size(); i++)
		{
			System.out.println("Cuenta "+ (i+1) + ":\n");
			System.out.println("Numero de cuenta: " + cuentas.get(i).getNumeroDeCuenta() + "\nNombre del Cliente: " + 
			cuentas.get(i).getNombreCliente() + "\nSaldo de la cuenta: " + cuentas.get(i).getSaldo());
			
			if (cuentas.get(i).getClass() == Ahorro.class)
			{
				((Ahorro)cuentaAhorros).depositarInteres(((Ahorro)cuentaAhorros).getPorcentajeInteres());
			}
			
		}
		
		
		
	}

}
