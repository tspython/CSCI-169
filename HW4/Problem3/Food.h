#ifndef FOOD_H
#define FOOD_H

#include <string>
#include <iostream>

class Food {
protected:
    std::string name;

public:
    Food() {
        name = "Food";
    }

    Food(std::string n) {
        name = n;
    }

    std::string getName() {
        return name;
    }

    virtual void prepare() {
        std::cout << "Prepare the " << name << std::endl;
    }
};

#endif

