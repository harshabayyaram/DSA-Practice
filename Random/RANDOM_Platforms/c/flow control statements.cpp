#include<stdio.h>
#include<conio.h>

int main(){
	//flow control stateements
	int a =20;
	int b =10;
	int c =30;
	
	if(b>a){
		printf("b is greater than a \n");
	}else{
		printf("a is greater than b \n");
	}
	
	
	
	if (a>b && a>c){
		printf("a is the greatest");
	}else if(b>a && b>c){
		printf("b is the greatest");
	}else{
		printf("c is the greatest");
	}
	
	
	
	
	
	
	
	getch();
}
