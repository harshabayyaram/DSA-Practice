#include<stdio.h>
#include<conio.h>

int main(){
	// arrays and pointers
	
	int a[10] ={0,1,2,3,4,5,6,7,8,9};
	char c[5] = {'h','e','l','l','o'};
	
	int i=0;
	for(i=0;i<5;i++){
	printf("%c \n",c[i]);
	}
	
	
	
	//pointers
	int z=10;
	int *p=&z;
	printf("address of a: %x \n",p);
	printf("value of a: %d",*p);
	

	
	
	
	
	getch();
}
