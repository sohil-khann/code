numbers = []

n=int(input("enter the numbers of input : "))
for i in range(n):
    item=int(input("enter the number : "))
    numbers.append(item)


def find_maximum(numbers):
    maximum = numbers[0]  # Assume the first number is the maximum

    for num in numbers[1:]:
        if num > maximum:
            maximum = num

    return maximum
print("greater number is : ",find_maximum(numbers))

