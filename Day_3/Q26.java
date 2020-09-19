class Q26{
	public static void main(String args[]){
		int sum=0;
		int arr[][]=new int[5][];
		int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		for(int i=0;i<5;i++){
			arr[i]=a;
		}
		System.out.println("Given array : ");
		int b[]=new int[5];
		for(int i[]:arr){
			for(int j:i){
				System.out.print(" "+j);
				sum+=j;
			}
			System.out.println("");
		}
		System.out.println("Addition of all elements : "+sum);
	}
}