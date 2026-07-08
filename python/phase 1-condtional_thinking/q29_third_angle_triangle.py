"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 29: Take two angles of a triangle and compute the third angle.

Mentor Tips (Python 3.14+):
- The sum of all angles in a triangle is 180. The third angle is 180 - (a1 + a2). Check if input angles are valid (> 0 and sum < 180).
"""

def solve(a1: float, a2: float) -> float:
    # TODO: Implement this method to solve the question
    if a1 <= 0 or a2 <= 0 or (a1 + a2) >= 180:
        return 0.0
    return 180.0 - (a1 + a2)

def main():
    a1 = float(input("Angle 1: "))
    a2 = float(input("Angle 2: "))
    print(f"Third angle: {solve(a1, a2)}")

if __name__ == "__main__":
    main()
