public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone a = new Iphone();
		a.setBatteryPercentage(99);
		a.setCarrier("T-Mobile");
		a.setRingTone("Zing");
		a.setVersionNumber("8+");
		a.displayInfo();
		a.ring();
		System.out.println(a.ring());
		a.unlock("finger print");
		System.out.println(a.unlock("finger print"));
		
        Galaxy b = new Galaxy();
        b.setBatteryPercentage(100);
        b.setCarrier("AT&T");
        b.setRingTone("Ring Ring Rang!");
        b.setVersionNumber("S9");
        b.displayInfo();
		System.out.println(b.unlock("facial recognition"));
		System.out.println(b.ring());
		
		
		
	}

}