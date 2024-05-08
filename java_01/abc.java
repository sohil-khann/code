import java.util.Scanner;
class StringAssignment
{
    int arr1(int[] arr)
{ int last=0;
      int s2= -1;
    for( int i=0;i<arr.length;i++){
        if(arr[i]==2){
        s2=last;
        last=i;
           
        }


}
    
    return s2;

    }
public static int vowelCount(String str)
{
int c=0;
char a[]=str.toCharArray();
for(int i=0;i<a.length;i++)
{
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
{
c++;
}
} 
System.out.println("vowel= "+c);
return(c);
}

public static void main(String s[])

{
    // Scanner sc=new Scanner(System.in);
    // String str=sc.nextLine();
    StringAssignment obj=new StringAssignment();
    //  vowelCount(str);
    int[] arr={1,2,3,2,5,2,4};
    System.out.println("second last index of the occurence is  : "+obj.arr1(arr));
// vowelCount(new String("i am tarun Chhoker"));
}

}