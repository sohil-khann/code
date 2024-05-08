def print_diamond(n):
    for i in range(n):
        for j in range(n-i-1):
            print(" ", end="")
        for j in range(2*i+1):
            print(chr(65+j), end="")
        print()
    for i in range(n,0,-1):
        for j in range(n-i-1):
            print(" ", end="")
        for j in range(2*i+1):
            print(chr(65+j), end="")
        print()

print_diamond(5)