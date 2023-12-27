from math import pi

shape = input()
result = float()

if shape == "square":
    a = float(input())
    result = a * a
elif shape == "rectangle":
    a = float(input())
    b = float(input())
    result = a * b
elif shape == "circle":
    r = float(input())
    result = (r * r) * pi
elif shape == "triangle":
    a = float(input())
    h = float(input())
    result = (a * h) / 2

print(f"{result:.3f}")
