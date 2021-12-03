  public class Pattern  {  
    public static void main(String[] args)  {  
        int rows=9;  
        for(int i=1; i<= rows ; i++)  {  
            for(int j = i; j < rows ; j++)   {  
                System.out.print(" ");  
            }     
            for(int k = 1; k <= (2*i -1) ;k++){  
                if(k==1 || i == rows || k==(2*i-1))   {  
                    System.out.print("*");  
                }  
                else   {  
                    System.out.print(" ");  
                }  
            }  
            System.out.println("");  
        } 
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        int n = 5;
        for(int i=1;i<=n;i++){
            int alpha = 65;
            for(int j=0;j<i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
        // A 
        // B B 
        // C C C 
        // D D D D 
        // E E E E E 
        for(int i=1;i<=n;i++){
            int alpha = 65;
            for(int j=0;j<i;j++){
                System.out.print((char)(alpha+i-1)+" ");
            }
            System.out.println();
        }
        System.out.println();
        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        for(int i=n;i>=1;i--){
            int alpha = 65;
            for(int j=0;j<i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            int alpha = 65;
            for(int j=0;j<i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
        //      A 
        //     A B 
        //    A B C 
        //   A B C D 
        //  A B C D E 
        // A B C D E F
        for(int i=1;i<=n;i++){
            int alpha = 65;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)(alpha+j)+"  ");
            }
            System.out.println();
        }
        // *****
        //  ****
        //   ***
        //    **
        //     *
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * * 
        // * * * * 
        // * * * 
        // * * 
        // *
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //      *
        //     **
        //    ***
        //   ****
        //  *****
        //   ****
        //    ***
        //     **
        //      *
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //    * * * * * 
        //     * * * *
        //      * * *
        //       * *
        //        *
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }  
}  
