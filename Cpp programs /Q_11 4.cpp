
#include <iostream> 

using namespace std;
//11.Multilevel inheritence

class Info1
{
    public:
    char name1[20];
 
    void get_data1()
    {
     cout << "Enter 1st Name ";
     cin >> name1;
    }
    
    void print_data1()
    {
     cout << "1. "<<name1<<endl;
    }
    
    
};

class Info2 : public Info1
{
    public:
    char name2[20];
 
    void get_data2()
    {
     cout << "Enter 2nd Name ";
     cin >> name2;
    }
    
    void print_data2()
    {
     cout << "2. "<<name2<<endl;
    }
    
};
class Info3 : public Info2
{
    public:
    char name3[20];
 
    void get_data3()
    {
     cout << "Enter 3rd Name ";
     cin >> name3;
    }
    
    void print_data3()
    {
     cout << "3. "<<name3<<endl;
    }
    
    void decision()
    {
        cout << endl << name1 <<", "<< name2 <<" and "<< name3 << " You all have to work in a group !"<<endl;
    }
};

int main()
{
    Info3  i;
    i.get_data1();
    i.get_data2();
    i.get_data3();
    i.print_data1();
    i.print_data2();
    i.print_data3();
    i.decision();
    

    return 0;
}


