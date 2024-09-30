//Write a program to illustrate inline function.
#include<iostream>
using namespace std;
class Operations
    {
        public:
        inline int multiply(int a , int b)
        {
            return (a*b);
        }
        inline int subtract(int a,int b)
        {
            return (a-b);
        }
        inline int Add(int a,int b)
        {
            return (a+b);
        }
    };
    int main ()
    {
        Operations  ob1;
        int a,b;
        cout<<"Enter the value of a : ";
        cin>>a;
        cout<<"Enter the value of b : ";
        cin>>b;
        cout<<"Multiply value  = "<<ob1.multiply(a,b)<<endl;
        cout<<"Subtract value  = "<<ob1.subtract(a,b)<<endl;
        cout<<"Addition value  = "<<ob1.Add(a,b)<<endl;
    }   