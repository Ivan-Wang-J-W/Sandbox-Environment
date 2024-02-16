#include <array>
#include <iostream>
#include <ostream>

// declaring a global 3 by 3 matrix
std::array<std::array<char, 3>,3> matrix = {{

{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}}

}; // 9 elements
char player = 'X';
//defining who's turn it is 

void Draw() {
  std::cout<< " Tic Tac Toe V1.0"<< std::endl;
  for (int i =0; i <3; i++)
  {
    for (int j = 0; j < 3; j++) {
      std::cout<<matrix[i][j]<< " "; // this prints the elemenets in the matrixusing 2 for loop
    }
      std::cout<< "\n";// cout statement here to print out like a matrix
    // after printing one first row, it will add a new line and so on
  }
}
// create function for input
void Input(){
  int input;
  //print message 
  std::cout<< "Enter your choice : ";
  std::cin>> input;
  
  if( input ==1){

    std::cout<< " hello";
  }
}
int main() {
  Draw();

  return 0;
}
