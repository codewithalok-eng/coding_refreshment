"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 32: Take a number and print 'Fizz' if divisible by 3, 'Buzz' if divisible by 5, and 'FizzBuzz' if divisible by both.

Mentor Tips (Python 3.14+):
- Check divisibility by both (15) first! Otherwise, divisibility by 3 or 5 will trigger first.
"""

def solve(num: int) -> str:
    # TODO: Implement this method to solve the question
    return str(num) # default

def main():
    num = int(input("Number: "))\n    print(f"Result: {solve(num)}")

if __name__ == "__main__":
    main()
