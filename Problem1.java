public class Problem1 {

	public static void main(String[] args) {
		
	//given
	double eartDiameter = 7600; // measurement in miles
	double sunDiameter = 865000; // measurement in miles
        
	//radius calculation
	double earthRadius = eartDiameter/2;
        double sunRadius = sunDiameter/2;

        // volume of sun and earth using the formula 4 pi r^3/3 where r is the radius
        double earthVolume = 4* Math.PI * Math.pow(earthRadius,3)/3;
        double sunVolume = 4* Math.PI * Math.pow(sunRadius,3)/3;

        // ratio of sun to earth
        double sunToEarthRatio = sunVolume/earthVolume;
 
        System.out.print("The volume of the Earth is "+ earthVolume +" cubic miles, ");
        System.out.print("the volume of the Sun is "+ sunVolume +" cubic miles, ");
        System.out.println("and the ratio of the volume of the Sun to the volume of the Earth is " + sunToEarthRatio + "."); 

	}

}
