//
// Created by Hyunseok Oh on 2019-08-04.
//

#include <iostream>

int main() {
    std::string line;
    std::cin >> line;
    long n = atol(line.c_str());
    std::cout << n * 4 << std::endl;

    return 0;
}
