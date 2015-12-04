import java.util.Map;
import java.util.TreeMap;

public class members extends society {
	public int votes = 0;
	public String members = new String();
	

	public void addVote(String selectedValue){
		members = selectedValue;
		votes =+ 1;
		numofvotes.put(selectedValue, votes);
		System.out.println(numofvotes);	
	}
	

}
