//Write a program to show global scope resolution operator and it's features.
#include <iostream>
using namespace std;
class A 
  {
    public:
        void fun();
  };

        void A::fun()
            {  
              cout << "\nThis is a scope resolution operator \n ";
            }

    int main()
        {
           A a1;
           a1.fun();
           return 0;
        }
        