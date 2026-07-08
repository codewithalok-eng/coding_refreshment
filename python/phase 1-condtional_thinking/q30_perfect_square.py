"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 30: Check whether a number is a perfect square (without using the square root function).

Mentor Tips (Python 3.14+):
- Find an integer i such that i * i == num. You can use a loop from 0 up to num // 2 or use binary search.
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question
    if num < 0:
        return False
    for i in range(num // 2 + 1):
        if i * i == num:
            return True
    return False

def main():
    num = int(input("Number: "))
    print(f"Perfect square: {solve(num)}")

if __name__ == "__main__":
    main()
