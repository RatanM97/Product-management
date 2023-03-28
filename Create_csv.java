package Ram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Create_csv {

	public static void main(String[] args) {

try {
	PrintWriter pw= new PrintWriter(new File("C:\\Users\\Ratan\\Desktop\\Adapt.csv"));
	StringBuilder sb=new StringBuilder();
	sb.append("Product_Name");
	sb.append(",");
	sb.append("Product_Price");
	sb.append(",");
	sb.append("Item_Number");
	sb.append(",");
	sb.append("Model_Number");
	sb.append(",");
	sb.append("Product_Category");
	sb.append(",");
	sb.append("Product_Descripton");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Staples Kendall Park");
	sb.append(",");
	sb.append("$249.99");
	sb.append(",");
	sb.append("#24290479");
	sb.append(",");
	sb.append("ST52105");
	sb.append(",");
	sb.append("Double Pedestal Desk");
	sb.append(",");
	sb.append("The Staples Kendall Park double pedestal desk features a spacious workspace with optimal storage for your home or small office");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Union & Scale™ MidMod 60");
	sb.append(",");
	sb.append("$219.99");
	sb.append(",");
	sb.append("#24398973");
	sb.append(",");
	sb.append("UN59685-CC");
	sb.append(",");
	sb.append("Computer and Writing Storage Desk");
	sb.append(",");
	sb.append("Carve out a personal workspace with this storage desk.");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Easy 2 Go Corner");
	sb.append(",");
	sb.append("$94.99");
	sb.append(",");
	sb.append("#24343773");
	sb.append(",");
	sb.append("WE-OF-0152G");
	sb.append(",");
	sb.append("Computer Desk");
	sb.append(",");
	sb.append("Corner computer desk,Laminate, gray finish,30.39\"H x 47.83\"W x 47.83,1-Year Warranty");
	sb.append(",");
	sb.append("\r\n");
	 
	sb.append("Staples Gillespie 62");
	sb.append(",");
	sb.append("$129.99");
	sb.append(",");
	sb.append("#1929202");
	sb.append(",");
	sb.append("28189R-CC");
	sb.append(",");
	sb.append("L Shpaed desk");
	sb.append(",");
	sb.append("Enhance office decor and maximize your work surface with this stylish and functional Gillespie L-shaped desk.");
	sb.append(",");
	sb.append("\r\n");
	 
	sb.append("Staples Kendall Park");
	sb.append(",");
	sb.append("$279.99");
	sb.append(",");
	sb.append("#24290427");
	sb.append(",");
	sb.append("ST52493-CC");
	sb.append(",");
	sb.append("L shaped desk");
	sb.append(",");
	sb.append("Update your small office or home office with the Kendall Park L-Shaped desk. Enjoy ample storage without compromising precious space.");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Easy 2 Go Student ");
	sb.append(",");
	sb.append("$54.99");
	sb.append(",");
	sb.append("#24343774");
	sb.append(",");
	sb.append("WE-OF-0146G");
	sb.append(",");
	sb.append("Desk with Bookcases");
	sb.append(",");
	sb.append("Student desk, Laminated with grey");
	sb.append(",");
	sb.append("\n");
	
	sb.append("Easy 2 Go 48");
	sb.append(",");
	sb.append("$99.99");
	sb.append(",");
	sb.append("#952543");
	sb.append(",");
	sb.append("952543-CC");
	sb.append(",");
	sb.append("Corner Desk");
	sb.append(",");
	sb.append("Enjoy a spacious surface area for computing or off-line tasks with this corner desk.With its clean lines and traditional design,integrates easily into most home or office spaces.");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Whalen Asherton 60");
	sb.append(",");
	sb.append("$249.99");
	sb.append(",");
	sb.append("#2736559");
	sb.append(",");
	sb.append("SPUS-ASHD");
	sb.append(",");
	sb.append("L-Shaped Computer Desk");
	sb.append(",");
	sb.append("Enhance productivity and give your office a modern touch.This Whalen Asherton L desk offers plenty of storage with three built-in drawers.");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Easy 2 Go 36");
	sb.append(",");
	sb.append("$84.99");
	sb.append(",");
	sb.append("#951572");
	sb.append(",");
	sb.append("951572-CC");
	sb.append(",");
	sb.append("corner desk");
	sb.append(",");
	sb.append("Upgrade a home or office corner with this V-shaped computer desk in laminated resort cherry finish. .");
	sb.append(",");
	sb.append("\r\n");
	
	sb.append("Whalen Emergent Gaming 60");
	sb.append(",");
	sb.append("$219.99");
	sb.append(",");
	sb.append("#24308799");
	sb.append(",");
	sb.append("SPUS-EGDB");
	sb.append(",");
	sb.append("laminate computer desk");
	sb.append(",");
	sb.append("Assemble a complete set of gaming gear on this black computer desk.");
	sb.append(",");
	sb.append("\r\n");
	
	
	
	
	pw.write(sb.toString());
	pw.close();
	System.out.println("finished");
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
	}

}
	