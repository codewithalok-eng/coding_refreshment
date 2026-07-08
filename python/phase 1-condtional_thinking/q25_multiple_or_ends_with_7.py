"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 25: Check if a number is a multiple of 7 or ends with 7.

Mentor Tips (Python 3.14+):
- Multiple of 7 if num % 7 == 0. Ends with 7 if num % 10 == 7 (or -7 for negatives).
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question

    if num % 7 == 0 or num % 10 == 7 or num % 10 == -7:
        return True             
    return False

def main():
    num = int(input("Enter a number: "))
    print(f"Multiple of 7 or ends with 7: {solve(num)}")

if __name__ == "__main__":
    main()
