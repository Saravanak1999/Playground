#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  if(a%4!=0 || (a%100==0 && a%400!=0)) printf("Not ");
  printf("Leap year");
  return 0;
}