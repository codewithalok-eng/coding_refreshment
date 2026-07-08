"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 9: Take a character and check if it's a vowel or consonant.

Mentor Tips (Python 3.14+):
- Check if character (converted to lowercase) is one of 'a', 'e', 'i', 'o', 'u'.
"""

def solve(char: str) -> str:
    # TODO: Implement this method to solve the question
    if char.lower() in ['a', 'e', 'i', 'o', 'u']:
        return "vowel"
    else:  
        return "consonant"

def main():
    char = input("Enter a single letter: ")
    result = solve(char)
    print(f"Result: {result}")

if __name__ == "__main__":
    main()
