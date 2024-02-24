---

# Sudoku Solver

## Overview

The Sudoku Solver is a program designed to solve Sudoku puzzles efficiently. The program takes an incomplete Sudoku grid as input and employs backtracking to fill in the missing numbers, following the rules of Sudoku. This project is a great tool for Sudoku enthusiasts who want to quickly solve puzzles or verify solutions.

## Features

- **Sudoku Solving:** Automatically solves incomplete Sudoku puzzles.
- **User Input:** Accepts Sudoku puzzles as input.
- **Backtracking Algorithm:** Utilizes a backtracking algorithm to efficiently find solutions.

## Getting Started

### Prerequisites

- C++ compiler
- JVM

## How to Clone

```bash
git clone https://github.com/kashan16/Sudoko_Solver.git
```

### How to Compile

Compile the program using your C++ compiler. For example, using g++:

```bash
g++ SudokuSolver.cpp -o SudokuSolver
```
Compile the program using JVM.

```bash
javac SudokuSolver.java
```


### How to Run

Run the compiled executable:

```bash
./SudokuSolver
```

RUN JAVA CODE

```bash
java SudokuSolver
```


## Usage

Upon running the program, you will be prompted to input the Sudoku puzzle. Use the following format:

```plaintext
5 3 0 | 0 7 0 | 0 0 0
6 0 0 | 1 9 5 | 0 0 0
0 9 8 | 0 0 0 | 0 6 0
---------------------
8 0 0 | 0 6 0 | 0 0 3
4 0 0 | 8 0 3 | 0 0 1
7 0 0 | 0 2 0 | 0 0 6
---------------------
0 6 0 | 0 0 0 | 2 8 0
0 0 0 | 4 1 9 | 0 0 5
0 0 0 | 0 8 0 | 0 7 9
```

Replace the blank spaces with the known numbers, and use '0' for unknowns.

After inputting the puzzle, the program will display the solved Sudoku grid.

## Customization

- **Input Format:** Ensure that your input Sudoku grid follows the specified format.
- **Integration with other programs:** You can integrate the Sudoku Solver as a library into other C++ programs or projects.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to enhance the functionality or address any bugs.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- The backtracking algorithm used in this program is a powerful technique for solving constraint satisfaction problems like Sudoku.

---
