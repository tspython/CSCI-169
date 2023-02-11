#ifndef ORANGE_H
#define ORANGE_H

#include <string>
#include <iostream>
#include <ctime>
#include "Fruit.h"

class Orange : public virtual Fruit {
public:
    Orange();
    Orange(std::tm r);

    virtual void prepare();
};

Orange::Orange() {
    name = "Orange";
    time_t t = time(0);
    ripe = *localtime(&t);
    std::cout << "Orange has been created" << std::endl;
}

Orange::Orange(std::tm r) {
    name = "Orange";
    ripe = r;
}

void Orange::prepare() {
    std::cout << "Peel the " << name << std::endl;
}

#endif

