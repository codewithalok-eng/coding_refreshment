"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 34: Take 24-hour time (hours and minutes) and print whether it is AM or PM.

Mentor Tips (Python 3.14+):
- 0 to 11 is AM, 12 to 23 is PM. (Usually 12:00 PM starts noon, 0:00 AM is midnight).
"""

def solve(hours: int, minutes: int) -> str:
    # TODO: Implement this method to solve the question
    if 0 <= hours < 12:
        return "AM"
    elif 12 <= hours < 24:
        return "PM"
    else:
        raise ValueError("Hours must be in the range 0-23.")

def main():
    h = int(input("Hours (0-23): "))
    m = int(input("Minutes (0-59): "))
    print(f"Time: {solve(h, m)}")

if __name__ == "__main__":
    main()
