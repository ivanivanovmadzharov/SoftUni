product = input()
day = input()
number_of_products = float(input())

if day == "Monday" or day == "Tuesday" or day == "Wednesday" or day == "Thursday" or day == "Friday":
    if product == "banana":
        print(f"{(2.5 * number_of_products):.2f}")
    elif product == "apple":
        print(f"{(1.2 * number_of_products):.2f}")
    elif product == "orange":
        print(f"{(0.85 * number_of_products):.2f}")
    elif product == "grapefruit":
        print(f"{(1.45 * number_of_products):.2f}")
    elif product == "kiwi":
        print(f"{(2.7 * number_of_products):.2f}")
    elif product == "pineapple":
        print(f"{(5.5 * number_of_products):.2f}")
    elif product == "grapes":
        print(f"{(3.85 * number_of_products):.2f}")
    else:
        print("error")
elif day == "Saturday" or day == "Sunday":
    if product == "banana":
        print(f"{(2.7 * number_of_products):.2f}")
    elif product == "apple":
        print(f"{(1.25 * number_of_products):.2f}")
    elif product == "orange":
        print(f"{(0.9 * number_of_products):.2f}")
    elif product == "grapefruit":
        print(f"{(1.6 * number_of_products):.2f}")
    elif product == "kiwi":
        print(f"{(3 * number_of_products):.2f}")
    elif product == "pineapple":
        print(f"{(5.6 * number_of_products):.2f}")
    elif product == "grapes":
        print(f"{(4.2 * number_of_products):.2f}")
    else:
        print("error")
else:
    print("error")