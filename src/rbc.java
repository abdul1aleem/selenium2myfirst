
public class rbc extends bank{

	int bank=0;

	void calinterest() {
		
		System.out.println("class method;;;"+ bank);
	}
		
		public static void main(String[] args) {
		
			rbc inobj = new rbc();
			
			inobj.calinterest();
			inobj.calinterestPrent();
			
		}

		public void mortgageCalculatio() {
			// TODO Auto-generated method stub
			
		}
	}

