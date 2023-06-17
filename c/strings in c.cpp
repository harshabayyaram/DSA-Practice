#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
	char s1[20];
	char s2[20];
	
	gets(s1);
	gets(s2);
	
	
	printf("length of string is %d \n",strlen(s1));
	printf("length of string is %d",strlen(s2));
	printf("concatination os strings is %s \n",strcat(s1,s2));
	printf("lower case of string is %s \n",strlwr(s1));
	printf("upper case of string is %s \n",strupr(s2));
	
	
	
	
	
	getch();
}
