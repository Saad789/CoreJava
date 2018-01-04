class Demo{
	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("SBI:"+ b.getROI());
		
		b = new HDFC();
		System.out.println("HDFC:"+b.getROI());
		
		}

	}


