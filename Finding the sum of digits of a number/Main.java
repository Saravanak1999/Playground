#include <stdio.h>
int main() {
	  int sum=0,a;
  scanf("%d",&a);
  while(a!=0){
  	sum+=a%10;
    a/=10;
  }
  printf("%d",sum);
	return 0;
}