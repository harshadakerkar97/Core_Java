class EvenOddsum{
	public static void main(String args[]){
		int even=0,odd=0;
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 == 0){
				even+=arr[i];
			}else{
				odd+=arr[i];
			}
		}
		System.out.print("Given array : ");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println("\nSum of even elements : "+even);
		System.out.println("Sum of odd elements : "+odd);
	}
}