#include <iostream>
using namespace std;
class complexnum{
int rl,img;
public:
void getdata(){
    cout<<"Enter real and imgnary";
    cin>>rl>>img;
    }
    void putdata(){
        cout<<"\n real =="<<rl<<" imagnary =="<<img;
}
complexnum operator+(complexnum bb){
    complexnum cc;
    cc.rl=rl+bb.rl;
    cc.img=img+bb.img;
    return cc;


}
};
int main(){
    complexnum aa,bb,cc;
    aa.getdata();
    bb.getdata();
    cc=aa+bb;
    aa.putdata();
    bb.putdata();
    cc.putdata();
    return 0;

}