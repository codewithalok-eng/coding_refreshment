"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 43: Take day and month and check if it forms a valid calendar date (ignoring leap years).

Mentor Tips (Python 3.14+):
- Check month boundaries (1-12) and day boundaries based on the month (e.g. 30 vs 31 days, and Feb max 28 days).
"""

def solve(day: int, month: int) -> bool:
    # TODO: Implement this method to solve the question
    if month < 1 or month > 12:
        return False
    if day < 1:
        return False
    if month in [4, 6, 9, 11] and day > 30:
        return False
    if month in [1, 3, 5, 7, 8, 10, 12] and day > 31:
        return False
    if month == 2 and day > 28:
        return False
    return True

def main():
    d = int(input("Day: "))
    m = int(input("Month: "))
    print(f"Valid date: {solve(d, m)}")

if __name__ == "__main__":
    main()
