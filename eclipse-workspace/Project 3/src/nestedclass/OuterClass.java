package nestedclass;

public class OuterClass {
	public String outervalue;
	
	InnerClassA innerA = new InnerClassA();
	
	public void outerMethodA() {
		System.out.println("This is from outer method A");
	}
	private class InnerClassA {
		String innerAValue;
		
		private void innerMethodA() {
			System.out.println("This is from inner method A");
			
		}
		private class InnerClassB{
			String innerBValue;
			
		private void innerMethodB() {
				innerA.innerMethodA();
				System.out.println("This is from innerB method");
			}
		
		}
		public static class InnerClassC{
			public String InnerValueC;
			
			public void InnerMethodC() {
				System.out.println("This is from inner method C");
				
			}
			
		}
		
		
	}
	
	

}
