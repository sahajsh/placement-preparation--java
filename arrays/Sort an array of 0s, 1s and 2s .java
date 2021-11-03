class GFG
{
    public static void sort012(int[] a, int n)
    {
        // codvoid sort012(int a[], int n)
{
    int countzero =0;
    int countone = 0;
    int counttwo = 0;
    for(int i =0;i<a.length;i++){
    if(a[i] == 0){
        countzero++;
    }
    if(a[i]==1){
        countone++;
    }
    if(a[i] ==2){
        counttwo++;
    }
    
    for( i =0;i<countzero;i++){
        a[i] = 0;
    }
    for( i = countzero;i<countzero+countone;i++){
        a[i] = 1;
    }
    for(i =countzero+countone;i<a.length;i++){
        a[i] =2;
    }

} 
    }

}

}
// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Dri
