#include "food.h"

const char* RecommendFood(char firstLetter){
    if (firstLetter == 'a' || firstLetter == 'A') {
        return "apple";
    }
    else if (firstLetter == 'b' || firstLetter == 'B') {
        return "banana";
    }
    else if (firstLetter == 'c' || firstLetter == 'C') {
        return "cake";
    }
    else { return "pizza";
}
}
