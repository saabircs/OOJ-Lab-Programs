#include<stdio.h>
int main()
{
int c,a,b,i;
while(1)
{
printf("PRESS ANY NUMBER TO SELECT THE OPERATION :\n");
printf("--------------------------\n");
printf("1 -- Addition\n");
printf("2 -- Subtraction\n");
printf("3 -- Multiplication\n");
printf("4 -- Division\n");
printf("5 -- Modulus\n");
printf("6 -- Greater than  \n");
printf("7 -- Lesser than \n");
printf("8 -- Equals to \n");
printf("9 -- Not equal \n");
printf("10-- Increment\n");
printf("--------------------------\n");

scanf("%d",&i);
printf("You have sucessfully selected an operation!\n");
printf("Now, Enter any two numbers to perform the selected operation:\n");
scanf("%d%d",&a,&b);
switch(i)
{
case 1:printf("%d + %d = %d \n",a,b,a+b);break;
case 2:printf("%d - %d = %d \n",a,b,a-b);break;
case 3:printf("%d x %d = %d \n",a,b,a*b);break;
case 4:printf("%d / %d = %d \n",a,b,a/b);break;
case 5:printf("%d mod %d = %d \n",a,b,a%b);break;
case 6:if(a>b)
{
printf("%d > %d \n",a,b);
}
else
{
printf("%d > %d \n",b,a);
}
break;
case 7:if(a<b)
{
printf("%d < %d \n",a,b);
}
else
{
printf("%d < %d \n",b,a);
}
break;
case 8:if(a==b)
{
printf("%d = %d \n",a,b);
}
else
{
printf("%d != %d \n",b,a);
}
break;
case 9:if(a!=b)
{
printf("%d != %d \n",a,b);
}
else
{
printf("%d = %d \n",b,a);
}
break;
case 10:
printf("%d++ = %d \n",a,a+1);
printf("%d++ =%d \n",b,b+1);
break;
default:printf("Sorry, Wrong Input!\n");
}
printf("To perform the calculation again press '1'\nPress any other key to exit\n");
scanf("%d",&c);
if(c!=1)
{
printf("Program Exited!");
break;
}
}
}
