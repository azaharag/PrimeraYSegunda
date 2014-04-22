package pruebas;

public class MainPlanetas {

	public static void main(String[] args) {
		Planetas m = new Planetas(500, 500, "Mercurio", 150000, true);
		Planetas v = new Planetas(1402, 20512, "Venus", 212412, false);
		Planetas t = new Planetas(12345, 1231, "Tierra", 29192, true);
		Planetas ma = new Planetas(1221, 24980, "Marte", 9491, true);
		Planetas j = new Planetas(12512, 9690, "Juppiter", 9491, false);
		Planetas s = new Planetas(12312, 65969, "Saturno", 9921, false);
		Planetas u = new Planetas(1109, 98483, "Urano", 9281, true);
		Planetas n = new Planetas(1241, 985981, "Neptuno", 9121, true);
		Planetas p = new Planetas(500, 500, "Plutón", 150000, false);
		
		Planetas [] planetas = new Planetas[9];
		
		planetas[0] = m;
		planetas[1] = v;
		planetas[2] = t;
		planetas[3] = ma;
		planetas[4] = j;
		planetas[5] = s;
		planetas[6]	= u;
		planetas[7] = n;
		planetas[8] = p;
		
		for(int i = 0; i < planetas.length; i++){
			System.out.println(planetas[i]);
		}
	}

}
