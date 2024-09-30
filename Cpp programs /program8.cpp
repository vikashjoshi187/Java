//Write a program to illustrate copy constructor.
#include<iostream>
using namespace std;
class Employee
{
    int eid;
    int salary;
    string ename;
    public:
        Employee(int x,int y,string z)
        {
            eid = x;
            salary = y;
            ename = z;
        }
        Employee(const Employee &t)
        {
            eid = t.eid;
            salary = t.salary;
            ename = t.ename;
        }
        void show()
        {
            cout<<"Employee id = "<<eid;
            cout<<"Employee salary = "<<salary;
            cout<<"Employee name = "<<ename;
        }
    
};
int main ()
{
    Employee e1(501,50000,"AJAY"),e2(e1);
    e1.show();
    e2.show();
}