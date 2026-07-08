"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 27: Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

Mentor Tips (Python 3.14+):
- An amount can be divided into 2000, 500, and 100 bills if it is a multiple of the smallest note denomination (100). i.e. amount % 100 == 0.
"""

def solve(amount: int) -> bool:
    # TODO: Implement this method to solve the question
    return amount % 100 == 0

def main():
    amount = int(input("Amount: "))
    print(f"Evenly divisible: {solve(amount)}")

if __name__ == "__main__":
    main()
