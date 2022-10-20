package MultiLevel_Inheritance;

public class Test {

	public static void main(String[] args) {
	Three th = new Three();
	th.print_csk();
	th.print_mi();
	th.print_rcb();
	th.printData();
		
	One o = new Three();
	o.printData();
	}

}
