public class Backtracking {           // tc=0(n)
    public static void changeArr(int a[],int i,int val){
         // base caseww
         if(i==a.length){
            printArr(a);
            return;
         }
         //recursion
         a[i]=val;
         changeArr(a, i+1, val+1); //function call step
         a[i]=a[i]-2;   // Backtracking step
    }
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        changeArr(a, 0, 1);
        printArr(a);
    }
}
