"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 23: Take a 4-digit number and check if the first and last digits are equal.

Mentor Tips (Python 3.14+):
- First digit is num / 1000, last digit is num % 10.
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question
    first_digit = num // 1000 #trims decimal, returns integer
    last_digit = num % 10
    if first_digit == last_digit:
        return True
    return False

def main():
    num = int(input("Enter a 4-digit number: "))
    print(f"First and last equal: {solve(num)}")

if __name__ == "__main__":
    main()
