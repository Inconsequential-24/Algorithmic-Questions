#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
    char input_string[20];
    int i, length;
    int flag = 0;
    printf("Enter a name: ");
    scanf("%s", input_string);
    length = strlen(input_string);
    for(i=0; i < length; i++){
        if(input_string[i] != input_string[length-i-1]){
            flag = 1;
            break;
        }
    }
    if(flag){
        printf("%s is a palindrome", input_string);
    }
    else{
        printf("%s is not a palindrome", input_string);
    }
}
