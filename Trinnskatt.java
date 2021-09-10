import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Trinnskatt {

	public static void main(String[] args) {
		String skatt = showInputDialog("Bruttoinntekt:");
		double tall = parseInt(skatt);
		
		double trinnskattProsent1 = 0.017;
		double trinnskattProsent2 = 0.04;
		double trinnskattProsent3 = 0.132;
		double trinnskattProsent4 = 0.162;
		
		System.out.print("Trinnskatt: ");
		
		if (tall <= 184800) {
			System.out.println(tall);
		} else if (tall > 184800 && tall <= 260100) {
			System.out.println(tall * trinnskattProsent1);
		} else if (tall > 260100 && tall <= 651250) {
			System.out.println(tall * trinnskattProsent2);
		} else if (tall > 651250 && tall <= 1021550) {
			System.out.println(tall * trinnskattProsent3);
		} else if(tall > 1021550){
			System.out.println(tall * trinnskattProsent4);
		} 
			
	}

}
