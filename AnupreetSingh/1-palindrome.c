#include<stdio.h>
#include<string.h>
int main(){
    char str[20];
    int len,i,f=0;
    scanf("%s",&str);
    len=strlen(str);
    for(i =0;i<len;i++){
        if(str[i] != str[len-i-1]){
            f=1;
            break;
        }
    }
    if(f){
        printf("String is not palindrome");
    }else{
        printf("String is palindrome");
    }
}