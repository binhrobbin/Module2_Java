import java.util.Scanner;

public class Tap_Con {
        public static int nhap(){
            Scanner input= new Scanner(System.in);
            boolean check= false;
            int n=0;
            while(!check){
                System.out.print(" ");
                try{
                    n= input.nextInt();
                    check= true;
                }catch(Exception e){
                    System.out.println("Ban phai nhap so! hay nhap lai...");
                    input.nextLine();
                }
            }
            return (n);
        }
        public static void result(int a[],int k){
            int i;
            System.out.println();
            for(i=1 ; i<=k ; i++){
                System.out.print("  "+a[i]);
            }
        }
        public static void try_backTrack(int a[], int n, int k, int i){
            int j;
            for(j=a[i-1]+1 ; j<=(n-k+i) ; j++){
                a[i]= j;
                if(i== k) result(a,k);
                else try_backTrack(a, n, k, i+1);
            }
        }
        public static void main(String[] args) {
            System.out.println("Nhap n");
            int n= nhap();
            int[] array= new int[n+1];
            int k;
            System.out.println("Liet ke tat ca cac tap con k phan tu cua 1,2,..,"+n+" : ");
            for(k=1 ; k<=n ; k++){
                System.out.println("\n Tap con "+k+" phan tu: ");
                try_backTrack(array,n,k,1);
            }
        }

    }
