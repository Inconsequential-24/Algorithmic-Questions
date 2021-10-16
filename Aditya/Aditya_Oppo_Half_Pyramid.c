#include<stdio.h>
#include<conio.h>

int main() {
    int i,j,rows;
    printf("How many rows you want?");
    scanf("%d", &rows);
    for (i = rows-1; i >= 1; i--) {
        for (j = 1; j <= i; j++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}