"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 21: Take a 3-digit number and check if all digits are distinct.

Mentor Tips (Python 3.14+):
- Extract digits using / and % operators. Let d1 = num / 100, d2 = (num / 10) % 10, d3 = num % 10. Check if d1 != d2 and d2 != d3 and d1 != d3.
"""

def solve(num: int) -> bool:
    # TODO: Implement this method to solve the question
    d1 = num // 100
    d2 = (num // 10) % 10
    d3 = num % 10
    return d1 != d2 and d2 != d3 and d1 != d3

def main():
    num = int(input("Enter a 3-digit number: "))
    print(f"Distinct: {solve(num)}")

if __name__ == "__main__":
    main()
