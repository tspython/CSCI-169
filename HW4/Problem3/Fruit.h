#ifndef FRUIT_H
#define FRUIT_H

#include <string>
#include <iostream>
#include <ctime>
#include "Food.h"

class Fruit : public virtual Food {
protected:
    std::tm ripe;

public:
    Fruit();
    Fruit(std::tm r, std::string n);

    virtual void ripeTime();
};

Fruit::Fruit() {
    name = "Fruit";
    time_t t = time(0);
    ripe = *localtime(&t);
    std::cout << "Fruit has been created" << std::endl;
}

Fruit::Fruit(std::tm r, std::string n) : Food(n) {
    name = "Fruit";
    ripe = r;
    std::cout << "Fruit has been created" << std::endl;
}

void Fruit::ripeTime() {
    std::cout << asctime(&ripe);
}


#endif

