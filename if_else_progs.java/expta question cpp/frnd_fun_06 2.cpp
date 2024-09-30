#include <iostream>
using namespace std;
class Add{
    int a,b;
    public:
    void input(){
        cout<<"Enter valus of num1 ";
        cin>>a;
        cout<<"Enter the vlaue of num2 ";
        cin>>b;
        }
        friend void add(Add obj);
};
void add(Add obj){
    int sum ;
    sum=obj.a+obj.b;
    cout<<"Sum of the umbers are "<<sum;
}
int main(){
    Add obj;
    obj.input();
    add(obj);

}