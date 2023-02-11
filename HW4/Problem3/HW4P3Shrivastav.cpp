
#include <iostream>
#include "Food.h"
#include "Tomato.h"
#include <ctime>
#include <chrono>

int main()
{
    std::tm expiration, ripe;
    expiration.tm_mon = 2;
    expiration.tm_mday = 1;
    expiration.tm_year = 123;
    ripe.tm_mon = 2;
    ripe.tm_mday = 1;
    ripe.tm_year = 123;

    Tomato t(expiration, ripe, "Tomato");

    std::cout << "Name: " << t.getName() << std::endl;
    t.prepare();
    std::time_t expire_time = std::mktime(&expiration);
    std::cout << "Expiration: " << std::asctime(std::localtime(&expire_time));
    std::time_t ripe_time = std::mktime(&ripe);
    std::cout << "Ripe: " << std::asctime(std::localtime(&ripe_time));

    return 0;
}

