class pattern
{
	public static void main(String[] args) {
	    int n = 4;
	    int m = 4;
		for(int i=0;i<n;i++){
		    for(int j =0;j<m;j++){
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=1;i<=n;i++){
		    for(int j =1;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=n;i>=1;i--){
		    for(int j=1;j<i;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=n-i+1;j++){
		        System.out.print(" *");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		n = 5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		
		for(int i=n;i>=1;i--){
		    for(int j=1;j<i;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=n-i+1;j++){
		        System.out.print(" "+j);
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT");
		int x = 1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(x+" ");
		        x++;
		    }
		    System.out.println("");
		}
		System.out.println("NEXT");
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        if((i+j)%2 == 0){
		            System.out.print("1 ");
		        }
		        else{
		            System.out.print("0 ");
		        }
		    }
		    System.out.println("");
		}
		System.out.println("NEXT");
		n = 4;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    for(int j=1;j<=(n-i)*2;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(" *");
		    }
		    System.out.println("");
		}
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    for(int j=1;j<=(n-i)*2;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(" *");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT : ");
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=(n-i);j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=n;j++){
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		
		System.out.println("NEXT : ");
		n = 5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
		
		System.out.println("NEXT : ");
		n = 4;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=(n-i);j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=(2*i)-1;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=(n-i);j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=(2*i)-1;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
