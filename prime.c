#include<stdio.h>
int main()
{
    int num,i,j;
    printf("enter a number: ");
    scanf("%d",&num);
    for(i=2;i<=num;i++) 
    {
        for(j=2;j<=i;j++)
         {
            if(i%j==0)
            {
                break;
            }      
         }
        
        if(i==j) 
        {
            printf("prime number is : %d\n", i);
        }
    }
}