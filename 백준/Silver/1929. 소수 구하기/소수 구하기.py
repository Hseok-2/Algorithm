import sys
import math

a, b = map(int, sys.stdin.readline().split())

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

for num in range(a, b + 1):
    if is_prime(num):
        print(num)
