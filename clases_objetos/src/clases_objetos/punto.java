package clases_objetos;

/**
 * @author Azahara
 *
 */
public class punto {
	static int contador=0;
	double x;
	double y;
	/**
	 * constructor vacio
	 */
	punto()
	{
		x=2;
		y=2*x;
		contador++;
	}
	/**
	 * @param valor
	 * getter de x
	 */
	void setX (double valor)
	{
		x=valor;
	}
	/**
	 * @return
	 */
	double getX()
	{
		return x;
	}
	void setY (double valor)
	{
		y=valor;
	}
	double getY()
	{
		return y;
	}
	/**
	 * @param coordx
	 * primer punto
	 * @param coordy
	 * segundo punto
	 */
	punto (double coordx, double coordy)
	{
		x=coordx;
		y=coordy;
		contador++;
	}
	public String toString()
	{
		return "coordenada x "+x+" coordenada y "+y;
	}
	/*punto pepe (char c)
	{
		switch (c)
		{
		case 'z':	x=0;
					y=0;
				break;
		case 'a': 
		}
	}*/
/*	double calcularDistancia2(punto p1, punto p2)
	{
		p1.x;
		p1.y;
		p2.x;
		p2.y;
		double px, py;
		px=p1.x-p2.x;
		px=px*px;
		py=p1.y-p2.y;
		py=py*py;
		double d;
		d= Math.sqrt(px+py);
		return d;
	}*/
	double calcularDistancia (punto p1, punto p2)
	{
		return (Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())-(p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
	}	

		
}
