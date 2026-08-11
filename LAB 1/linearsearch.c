#include<stdio.h>
#define  LIM  100
 int main() 
{
int a[LIM],key,n,j;
printf("Enter no of elements in your array :\n");
scanf("%d",&n);
printf("Enter elements of the array\n");
for(int i=0;i<n;i++) 
                   {
                          printf("Enter the value of  element a[%d] :",i); 
scanf("%d",&a[i]);
}

printf("enter the element you want to find : \n");
scanf("%d",&key);
for( j=0;j<n;j++)
 {
if(key==a[j])
 {
break ;
}
}
if(j<n) 
 printf("Element %d is found at index %d\n",key,j); 

else
printf("Element %d is not found\n",key);
return 0;
}