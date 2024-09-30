//To calculate sum and average of two user input integer.
#include<iostream>
using namespace std;
class Sum
{
    public:
        float a,b;
        void getDetails()
        {
            cout<<"Enter the value of a : ";
            cin>>a;
            cout<<"Enter the value of b : ";
            cin>>b;
        }
        void showDetails()
        {
            float c;
            float avg;
            c = a+b;
            avg = (a+b)/2;
            cout<< " sum = "<< c<<endl;
            cout<< " avg = "<<avg<<endl; 
        }
};
int main()
{
    Sum s1;
    s1.getDetails();
    s1.showDetails();

}