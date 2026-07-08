"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 28: Check if a number lies within the range [100, 999].

Mentor Tips (Python 3.14+):
- Python permits chained comparisons: 100 <= num <= 999. Java requires: num >= 100 && num <= 999.
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question
    return 100 <= num <= 999

def main():
    num = int(input("Number: "))
    print(f"Within range [100, 999]: {solve(num)}")

if __name__ == "__main__":
    main()
