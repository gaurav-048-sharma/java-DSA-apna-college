#include<stdio.h>
int main() {
    int n1 =0,n2=1, n3,i;
    printf("fibonacci series");
    printf("%d %d\t", n1, n2);
    for(i= 2; i<=10; i++) 
    {
        n3=n1+n2;
        printf("%d\n", n3);
        n1=n2;
        n2=n3;
        
    }
}