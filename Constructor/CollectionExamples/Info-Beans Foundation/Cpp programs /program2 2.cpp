//Write a program to show the use of class.
#include<iostream>
using namespace std;
class Student{
    public :
    int rno;
    int marks;
    string sname;
    void getData(){
        cout<<"enter the rno :  ";
        cin>>rno;
        cout<<"enter the marks : ";
        cin>>marks;
        cout<<"enter the name : ";
        cin>>sname;
    }
    void showData(){
        cout<<"rno   :   "<<rno<<endl;
        cout<<"marks :   "<<marks<<endl;
        cout<<"name  :   "<<sname<<endl;
    } 
};
int main(){
    Student s1,s2;
    s1.getData();
    s2.getData();

    
    s1.showData();
    s2.showData();
}