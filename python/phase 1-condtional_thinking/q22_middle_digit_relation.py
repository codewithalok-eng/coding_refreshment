"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 22: Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

Mentor Tips (Python 3.14+):
- Extract three digits. Let middle be d2. Compare d2 against d1 (hundreds) and d3 (units).
"""

def solve(num: int) -> str:
    # TODO: Implement this method to solve the question
    return "neither"

def main():
    num = int(input("Enter a 3-digit number: "))\n    print(f"Middle relation: {solve(num)}")

if __name__ == "__main__":
    main()
