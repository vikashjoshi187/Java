//Q No. 15
#include <iostream>  
#include <string.h> 
using namespace std; 
  class Demo
  {
    public:

void revstr(char str1[])  
{  
   
    int i, len, temp;  
    len = strlen(str1);  
       cout<<" the length of string : "<<len<<endl;  
       
     
    for (i = 0; i < len/2; i++)  
    {  
         
        temp = str1[i];  
        str1[i] = str1[len - i - 1];  
        str1[len - i - 1] = temp;  
    }  
           cout<<" After reversing the string: "<<str1<<endl;  
 
}  
  };   
    int main()  
    {
        Demo obj;  
        char str[50];
        cout<<" Enter the string: ";  
        gets(str); 
          
        cout<<" \n Before reversing the string: "<< str<<endl;  
          
        
        obj.revstr(str);  
    }  
