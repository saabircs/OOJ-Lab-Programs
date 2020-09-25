#include<stdio.h>
float sumaver(int x,int y)
{
	int sum;
	sum = x +y;
	printf("\nSum is %d + %d = %d\n",x,y,sum);
	return sum/2;
}

void printeven(int x,int y)
{
	int i;
	printf("\n\nThe even numbers between %d and %d are: \t",x,y);
	if(y>x)
	{
		for(i=x+1;i<y;i++)
		{
			if(i%2==0)
			{
				printf("%d\t",i);
			}
		}
	}	
	else if(x>y)
	{
		for(i=y+1;i<x;i++)
		{
			if(i%2==0)
			{
				printf("%d\t",i);
			}
		}
	}
	else
	{
		printf("NONE");
	}
	
}

int main()
{
	int a,b,c,x,y;
	float avg;
	
	printf("ENTER ANY THREE NUMBERS\n");
  printf("------------------------\n");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>c && b>c)
	{
		x=a;
		y=b;	
	}
	else if(a>b && c>b)
	{
		x=a;
		y=c;
	}
	else
	{
		x=b;
		y=c;	
	}
	printf("\nThe two greater numbers are '%d' and '%d'\n",x,y);
	
	avg = sumaver(x,y);
	printf("\nAverage of the numbers %d and %d = %.2f",x,y,avg);
	
	printeven(x,y);
	
	return 0;
}
