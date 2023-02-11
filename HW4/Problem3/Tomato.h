#ifndef TOMATO_H
#define TOMATO_H

#include <string>
#include <ctime>
#include "Fruit.h"
#include "Vegetable.h"

class Tomato : public virtual Vegetable, public virtual Fruit
{
public:
    Tomato();
    Tomato(std::tm e, std::tm r, std::string n);
};

Tomato::Tomato() 
{
    name = "Tomato";
    time_t t = time(0);
    ripe = *localtime(&t);
    expiration = *localtime(&t);
    std::cout << "Tomato is created" << std::endl;
}

Tomato::Tomato(std::tm e, std::tm r, std::string n)
{
    name = n;
    ripe = r;
    expiration = e;
    std::cout << "Tomato is created" << std::endl;
}

#endif

