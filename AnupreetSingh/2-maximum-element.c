#include <stdio.h>
int main()
{
    int n, i, max = 0, a[50];
    printf("\nEnter array size:");
    scanf("%d", &n);

    printf("\nEnter elements:");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    printf("\nMAX IS : %d", max);
    return 0;
}