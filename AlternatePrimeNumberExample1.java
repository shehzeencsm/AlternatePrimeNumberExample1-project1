public class AlternatePrimeNumberExample1  
{     
public static void main(String[] args)    
{   
  //declare variable
int num = 20;    
  // print statement
System.out.print("Alternate prime numbers up to " + num+" are: ");    
printAlternatePrimeNumber(num);   
}   
static int checkPrime(int num)   
{   
int i, flag = 0; 
  // use loop
for(i = 2; i<= num / 2; i++)   
{   
if(num % i == 0)   
{   
flag = 1;   
break;   
}   
}   
if(flag == 0)   
return 1;   
else  
return 0;   
}     
static void printAlternatePrimeNumber(int n)   
{     
int temp = 2;   
for(int num = 2; num <= n-1; num++)   
{     
if (checkPrime(num) == 1)   
{    
if (temp % 2 == 0)   
System.out.print(num + " ");  
temp ++;   
}   
}   
}   
}  
