"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 48: Take an integer (1-9999) and check if the sum of its digits is greater than the product of its digits.

Mentor Tips (Python 3.14+):
- Extract all digits (you can use a loop or convert to string). Sum them up, multiply them, and compare.
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question
    if not (1 <= num <= 9999):
        raise ValueError("Input must be an integer between 1 and 9999.")
    digits = [int(d) for d in str(num)]
    digit_sum = sum(digits)
    digit_product = 1
    for d in digits:
        digit_product *= d
    return digit_sum > digit_product

def main():
    num = int(input("Enter an integer (1-9999): "))
    print(f"Sum > Product: {solve(num)}")

if __name__ == "__main__":
    main()
