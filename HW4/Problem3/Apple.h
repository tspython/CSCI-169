#ifndef APPLE_H
#define APPLE_H

#include <string>
#include <iostream>
#include <ctime>
#include "Fruit.h"

class Apple : public virtual Fruit
{
publi
    Apple();
    Apple(std::tm r);

    virtual void prepare();
};

Apple::Apple() : Fruit()
{
    name = "Apple";
    ripe = std::time(0);
    std::cout << "Creating Apple" << std::endl;
}

Apple::Apple(std::tm r) 
{
    name = "Apple";
    ripe = r;
    std::cout << "Creating Apple" << std::endl;
}

void Apple::prepare()
{
    std::cout << "Core the " << name << std::endl;
}


#endif

