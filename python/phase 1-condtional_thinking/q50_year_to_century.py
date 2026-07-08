"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 50: Take a year and print the corresponding century (e.g., '19th century', '20th century').

Mentor Tips (Python 3.14+):
- Century can be calculated as: (year - 1) // 100 + 1. Append the correct suffix ('st', 'nd', 'rd', 'th').
"""

def solve(year: int) -> str:
    # TODO: Implement this method to solve the question
    if year <= 0:
        raise ValueError("Year must be a positive integer.")
    century = (year - 1) // 100 + 1
    suffix = "th"
    if century % 10 == 1 and century != 11:
        suffix = "st"
    elif century % 10 == 2 and century != 12:
        suffix = "nd"
    elif century % 10 == 3 and century != 13:
        suffix = "rd"
    return f"{century}{suffix} century"

def main():
    year = int(input("Enter year: "))
    print(f"Century: {solve(year)}")

if __name__ == "__main__":
    main()
