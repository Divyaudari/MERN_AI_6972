import java.util.*;
public class SecongLargest{
public static void main(String args[]){
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
System.out.println(secondLargest(arr));
}
public static int secondLargest(int[] arr){
int largest=-1;
int secondLargest=-1;
int n=arr.length;
for(int i=0;i<n;i++){
if(arr[i]>largest){
secondLargest=largest;
largest=arr[i];
}
else if(arr[i]>secondLargest && arr[i]!=largest){
secondLargest=arr[i];
}
}
return secondLargest;
}
}