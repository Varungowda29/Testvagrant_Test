public class Main1 {
	public static void main(String[] args) {
		int[] arr= {1100,900,200,100};
		int[] arr1=new int[4];
		int[] arr2=new int[4];
		String[] arr3= {"Leather wallet","Umbrella","Cigarette","Honey"};
		int maxGst=0;
		int sum=0;
		String product="";
		for(int i=0;i<4;i++) {
			if(arr[i]>500) {
				int a=(arr[i]*5)/100;
				arr1[i]=arr[i]-a;
			}
			else {
				arr1[i]=arr[i];
			}
		}
		for(int i=0;i<4;i++) {
		//System.out.println(arr1[i]);
		arr2[0]=(arr1[0]*18)/100;
		arr2[1]=(arr1[1]*12)/100;
		arr2[2]=(arr1[2]*28)/100;
		arr2[3]=(arr1[3]*0)/100;
		if(arr2[i]>=maxGst) {
			maxGst=arr2[i];
			product=arr3[i];
		}
		}
		for(int j=0;j<4;j++) {
			sum=sum+arr1[j]+arr2[j];
		}
		System.out.println("Maximum gst paid product is "+product+" = "+maxGst);
		System.out.println("Total amount to be paid shopkeeper is = "+sum);
		
		
				
		
	}

	}

