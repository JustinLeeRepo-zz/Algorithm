/*Justin Lee
 *AP Computer Science
 *September 14,2009*/
import javax.swing.*; // allows JOptionPane 
import java.text.*; // allows DecimalFormat 
class Chapter3_25 { 
	public static void main ( String [] args ){ 
		DecimalFormat df = new DecimalFormat ("0.00"); 
		int numberBags; 
		double boxSm, totalCoast, coastLg, coastMed, coastSm, coastBag, boxLg, boxMed; 

		String str = JOptionPane.showInputDialog(null, "Amount of bags ordered") ; 
		numberBags = Integer.parseInt(str); 

		boxLg = Math.floor(numberBags / 20); 
		boxMed = Math.floor((numberBags - (boxLg * 20)) /10); 
		boxSm = Math.ceil((numberBags - (boxLg * 20) - (boxMed * 10)) / 5); 
		coastBag = numberBags * 5.50; 
		coastLg = boxLg * 1.8; 
		coastMed = boxMed * 1.00; 
		coastSm = (boxSm) * 0.60; 
		totalCoast = coastBag + coastLg + coastMed + coastSm; 
		
		System.out.println("Number of Bags Ordered: " + numberBags + " - $" + df.format(coastBag)); 
		System.out.println(" "); 
		System.out.println("Boxes Used:"); 
		System.out.println(" " + (int) boxLg + " Large - $" +df.format(coastLg)); 
		System.out.println(" " + (int) boxMed + " Medium - $"+df.format(coastMed)); 
		System.out.println(" " + (int) boxSm + " Small - $" + df.format(coastSm)); 
		System.out.println(" "); 
		System.out.println("Your total cost is: " + "$" + df.format(totalCoast)); 
		System.exit(0); 

} 
} 
