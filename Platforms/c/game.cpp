#include<stdio.h>
#include<conio.h>

int main(){
	
	char color[3];
	char noun[20];
	char celebrity[20];
	
	printf("enter a color: ");
	scanf("%s", &color);
	
	printf("enter a noun: ");
	scanf("%s", &noun);
	
	printf("enter a celebrity: ");
	scanf("%s", &celebrity);
	
	
	
	printf("roses are %s \n",color);
	printf("%s are blue \n", noun);
	printf("i love %s \n", celebrity);
	
	
	
	
	
	getch();
}
