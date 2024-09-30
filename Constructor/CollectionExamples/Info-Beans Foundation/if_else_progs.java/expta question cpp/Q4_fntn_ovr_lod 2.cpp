#include <iostream>
using namespace std;
class volfun{
    public:
    int volrec(int l, int b, int h)
{
    int vol = l * b * h;
    cout << "The volume of cylinder is ";
    return vol;
}
// volume of cube
int volrec(int s)
{
    int vol = s * s * s;
    return vol;
}
// volume of cylinder
int volrec(int r, int h)
{
    int vol = (3.14 * r * r) * h;
    return vol;
}

};
int volrec(int l, int b, int h)
{
    int vol = l * b * h;
    cout << "The volume of cylinder is ";
    return vol;
}
// volume of cube
int volrec(int s)
{
    int vol = s * s * s;
    return vol;
}
// volume of cylinder
int volrec(int r, int h)
{
    int vol = (3.14 * r * r) * h;
    return vol;
}
int main()
{
    // volume of cuboid
    int l;
    cout << "Enter lenght of cuboid \n";
    cin >> l;
    int b;
    cout << "Enter breath of cuboid \n";
    cin >> b;
    int h;
    cout << "Enter height of cuboid \n";
    cin >> h;
    cout << volrec(l, b, h);

    // volume of cube
    cout << " \nEnter the side od cube \n";
    int s;
    cin >> s;
    cout << "The voume ods cube is ";
    cout << volrec(s);

    // volume of cylinder
    int r, hi;
    cout << "\nEnter the radius of cylinder \n";
    cin >> r;
    cout << "Enter the height of cyliber \n";
    cin >> hi;
    cout << "The volume of cylinder is ";
    cout << volrec(r, hi);

    return 0;
}