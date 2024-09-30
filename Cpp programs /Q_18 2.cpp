#include <iostream>

using namespace std;

// define a base class bird

class bird {

public:

    // virtual function

    void display()

    {

        cout << "This is display in bird class." << "\n\n";

    }

    void print()

    {

        cout << "This is show in bird class." << "\n\n";

    }

};

// define a child class parrot

class parrot : public bird {

public:

    void display()

    {

        cout << "This is display in parrot class." << "\n\n";

    }

    void print()

    {

        cout << "This is show in parrot class." << "\n\n";

    }

};

int main()

{

    // create a reference of class bird

    bird* brd;

    parrot p;

    brd = &p;

    // this will call the virtual function

    brd->display();

    // this will call the non-virtual function

    brd->print();
}