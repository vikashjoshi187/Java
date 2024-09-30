
#include <iostream>
//1a. Single Inheritence
using namespace std;


class Info
{
    private :
    int rollno;
    char name[20];
    
    public: 
    void read_details()
    {
      cout << "Enter the rollno : ";
      cin >> rollno;
      cout << "Enter name :";
      cin >> name;
    }
    void print_details()
    {
     cout << "Name : "<< name <<endl << "Rollno : "<< rollno<<endl;
    }
    
};

class Result : public Info
{
    private :
    int m1,m2,m3,m4,m5;
    int total,percentage;
   
    public :
    void read_marks()
    {
        cout<<"Enter the marks :"<<endl;
        cin>>m1>>m2>>m3>>m4>>m5;
    }
    public :
    void print_result()
    {
       int total = m1+m2+m3+m4+m5;
       int percentage = (total*100)/500;
       cout<<"Total marks : "<<total<<endl;
       cout<<"Percentage : "<<percentage<<" % "<<endl;
    }
};

int main()
{
    Result  r;
    r.read_details();
    r.read_marks();
    r.print_details();
    r.print_result();
 

    return 0;
}


