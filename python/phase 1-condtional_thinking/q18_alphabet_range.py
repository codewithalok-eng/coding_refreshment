"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 18: Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.

Mentor Tips (Python 3.14+):
- You can compare characters directly using '<=' and '>=' (comparison is lexicographical).
"""

def solve(char: str) -> str:
    # TODO: Implement this method to solve the question
    print(f"Char: {char}")
    if 'a' <= char <= 'm':
        return "a-m"
    elif 'n' <= char <= 'z':
        return "n-z"
    else:                           
        return "outside"

def main():
    char = input("Char: ")
    print(f"Range: {solve(char)}")

if __name__ == "__main__":
    main()
