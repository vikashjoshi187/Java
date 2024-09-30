// Q no. 12 
#include<iostream>
using namespace std;
 
class A
{
  public:
  A()
    { 
    cout << "a is called" << endl;
    
     }
};
 
class B
{
public:
  B() 
   {
     cout << "b is called" << endl;
   }
};
 
class C: public B, public A  
{
public:
  C()  
  {
     cout << "c is  called" << endl;
  }
};
 
int   main()
{
    C c;
    return 0;
}