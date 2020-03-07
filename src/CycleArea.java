public class CycleArea implements ISubscriber {
    public CycleArea() {
		// TODO Auto-generated constructor stub
	}

	public double CycleArea(double r){
	   if( r >0){
		double area =3.14*(r*r);
                System.out.println("CycleArea is : " + area);
	   }
		 else 
            {System.out.println("Error : Please,enter number is Integer and begger than Zero.");}
        return 0;
	}

	@Override
	public void notifySubscriber(String input) {

		double r = Double.parseDouble(input);
                 CycleArea(r);

	}

    
    
}
