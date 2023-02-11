#ifndef VEGETABLE_H
#define VEGETABLE_H

#include <string>
#include <ctime>
#include "Food.h"

class Vegetable : public virtual Food {
protected:
    std::tm expiration;

public:
    Vegetable();
    Vegetable(std::string n, std::tm e);

    virtual std::tm expireTime();
};

Vegetable::Vegetable() {
    name = "Vegetable";
    time_t t = time(0);
    expiration = *localtime(&t);
    std::cout << "Vegetable has been created" << std::endl;
}

Vegetable::Vegetable(std::string n, std::tm e) {
    name = n;
    expiration = e;
    std::cout << "Vegetable has been created" << std::endl;
}

std::tm Vegetable::expireTime() {
    return expiration;
}

#endif

