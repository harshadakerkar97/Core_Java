class MathDemo{
	int multiply(int a,int b){
		return a*b;
	}
	float multiply(float a,float b,float c){
		return a*b*c;
	}
	int multiply(int arr[]){
		int mul=1;
		for(int i=0;i<arr.length;i++){
			mul*=arr[i];
		}
		return mul;
	}
	double multiply(double a,int b){
		return a*b;
	}
	
}


class MathOp{
	public static void main(String args[]){
		MathDemo m=new MathDemo();
		System.out.println("Two int multiplication : "
				+m.multiply(4,5));
		System.out.println("Three float multiplication : "
				+m.multiply(5.3f,4.5f,5.6f));
		int arr[]={1,2,3,4,5};
		System.out.println("Array multiplication : "
				+m.multiply(arr));
		System.out.println("one double and one int : "
				+m.multiply(4.87D,5));		
	}

}