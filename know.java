public class Main
{
	public static void main(String[] args) {
		String str = "KNOW";
		int n = str.length();
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(str.charAt(j)+" ");
		    }
		    System.out.println();
		    
		}
		for(int i=1;i<n;i++){
		    int x = i;
		    for(int j=1;j<=n-i;j++){
		        System.out.print(str.charAt(x)+" ");
		        x++;
		    }
		    System.out.println();
		}
	}
}
