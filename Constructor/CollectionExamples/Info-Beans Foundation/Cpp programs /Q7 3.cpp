

#include <iostream>
 using namespace std;
//7. Parametrized constructor
    class ParamA 
    {
        private:
        int b, c;

        public:
        ParamA (int b1, int c1)
        {
         b = b1;
         c = c1;
        }

       int getX ()
       {
        return b;
       }
       
       int getY ()
       {
         return c;
       }
};
  
  int main ()
  {
    ParamA p1(10, 15);

    cout << "p1.b = " << p1. getX() << ", p1.c = " << p1.getY();
    return 0;
  }
