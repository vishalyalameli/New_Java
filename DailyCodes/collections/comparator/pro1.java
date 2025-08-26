import java.util.*;
class player{
	String pName ;
	int jerNo;

	player(String pName, int jerNo){
		this.pName = pName;
		this.jerNo = jerNo;

	}

	void disp(){
		System.out.println("player Name: " + pName + "Jersey No \n " + jerNo);

	}

	@Override
	public String toString() {
		return "player Name: " + pName + ", jersey no \n" + jerNo ;
	}

}
class SortByName implements Comparator <player>{
	public int compare(player obj1 , player obj2){
		return obj1.pName.compareTo(obj2.pName);
	}
}

class  TreeSetDemo{
	public static void main(String [ ] args){

		TreeSet<player> ts = new TreeSet<>(new SortByName());

		ts.add(new player("virat", 8));
	        ts.add(new player("Rohit ", 45));
		ts.add(new player("MSD" , 7));
		ts.add(new player("Shubman ", 77));

	         System.out.println(ts);
	}
}


