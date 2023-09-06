package pruebas;

public class Main {
	String num1 = "10";
	
	
	public String mayor() {
		try {
			int num2 = Integer.parseInt(num1);
			
			if(num2>=1900 && num2<=2023) {
				num1 = num2 + "";
				return num1;
			}else {
				return "Debe ingresar un año que sea entre el 1900 al 2023";
			}
        } catch (NumberFormatException ex) {
            return "Debe ingresar un caracter numerico";
        }
		
	}
	
	public static void main(String[] args) {
		Main mayor = new Main();
		System.out.println(mayor.mayor());
	}
	
}
