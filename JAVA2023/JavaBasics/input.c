// how to take string input in C programming 

#include<stdio.h>

void main() {

	char name[10];
	char ch;
	int i=0;
	while((ch=getchar()) != '\n') {
		name[i] = ch;
		i++;
	}

	printf("%s \n",name);
}
