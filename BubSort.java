public class BubSort {

    public static void BSort(int arr[]){

        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void SSort(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        


    }

    public static void main(String[] args) {
        int arr[]={48,5,4,85,21,45,63,78};

        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //BSort(arr);
        SSort(arr);
    }
}
