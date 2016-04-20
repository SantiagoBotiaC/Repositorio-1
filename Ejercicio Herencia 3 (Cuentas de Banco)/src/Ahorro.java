import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ahorro extends Cuenta{
	protected LocalDate fechaVencimiento;
	protected double porcentajeInteres;
	
	public Ahorro(int numeroDeCuenta, String nombreCliente, double saldo, LocalDate fechaVencimiento, double porcentajeInteres) {
		super(numeroDeCuenta, nombreCliente, saldo);
		this.fechaVencimiento = fechaVencimiento;
		this.porcentajeInteres = porcentajeInteres;
		// TODO Auto-generated constructor stub
	}
	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	public void depositarInteres(double porcentajeInteres)
	{
		if(LocalDateTime.now().getDayOfMonth() == 1)
		{
			this.saldo += (saldo* porcentajeInteres/100);
			System.out.println("El porcentaje de interés se ha depositado a su cuenta");
		}
		else
		{
			System.out.println("El primer día del mes se depositará el porcentaje de interes a su cuenta");
		}
	}
	
	
	public void retirar(int dinero)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate = dateFormat.format(fechaVencimiento);
		if(LocalDateTime.now().getDayOfMonth() == Integer.parseInt(stringDate.substring(2)))
		{
			this.saldo -= dinero;
			System.out.println("Retiro exitoso");
		}
		else
			System.out.println("No hay saldo suficiente en la cuenta");
	}
}
