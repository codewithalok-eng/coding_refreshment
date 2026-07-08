"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 31: Take a character and check if it is a letter, a digit, or neither.

Mentor Tips (Python 3.14+):
- Python: char.isalpha() or char.isdigit(). Java: Character.isLetter() or Character.isDigit().
"""

def solve(char: str) -> str:
    # TODO: Implement this method to solve the question
    return "neither" # or "letter" or "digit"

def main():
    char = input("Char: ")\n    print(f"Classification: {solve(char)}")

if __name__ == "__main__":
    main()
