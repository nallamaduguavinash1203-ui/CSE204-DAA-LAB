#include<stdio.h>
#define  LIM  100
int main()
{

int a[LIM],key,low,mid,high,n;
printf("Enter no of elements in your array :\n");
scanf("%d",&n);

printf("Enter elements of the array (in ascending order)\n");
for(int i=0;i<n;i++) 
 {
 printf("Enter the value of  element a[%d] :",i); 
scanf("%d",&a[i]);
}

printf("Enter the element you want to find\n");
scanf("%d",&key);
low=0;high=n-1;

while(low<=high)
  {
    mid=(low+high)/2;
       if(key==a[mid]) 
        
          break;
        
       else if(key>a[mid]) 
           low=mid+1;
       else
            high=mid-1;
}
if(low <= high)
{
         printf("Element %d found at index : %d\n", key, mid);
}
else
{
         printf("Element %d is not found\n", key);
}
return 0;
}
