#include<stdio.h>
int factorial();
int main()
 {
    int n=0;
    //printf("factorial number\n");
    printf("enter a value: ");
    scanf("%d", &n);
    
    factorial(n);
}

int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
    f = f * i;
    }
    printf("%d", f);
}