#include <stdio.h>
int main() {
	//Type your code
  	int a,b,c=1;
  	scanf("%d",&a);
  	b=a;
  	while(a!=0){
    	c*=10;
      	a/=10;
    }
  	printf("%d",b*100/c%10);
	return 0;
}